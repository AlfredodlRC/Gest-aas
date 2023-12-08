package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import aplicacion.Principal;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Degradacion_amenaza_pojo;
import datos.POJOS.Eficiencia_amenaza_pojo;
import datos.POJOS.Eficiencia_pojo;
import datos.POJOS.Tipo_elemento;

/**
 * Clase encargada para las operaciones de creación, lectura, actualización y
 * eliminación de las amenazas
 */
public class CRUD_Amenazas {

	/**
 	* Constructor de la clase
 	*/
	public CRUD_Amenazas() {
		super();
	}
			
	/**
	 *  Función para cargar una lista de las amenazas
 	*/
	public List<Amenaza_pojo> cargar_lista_amenazas() {
		List<Amenaza_pojo> resultado = new ArrayList<Amenaza_pojo>();

		Database base_datos = new Database();
		List<List<String>> activos;
		String sql;
		Amenaza_pojo amenaza;
		Date fecha = null;

		sql ="SELECT amenaza.cod,amenaza.nombre,amenaza.descripcion,amenaza.Fecha_creacion,tipo_amenaza.cod as tipo FROM amenaza JOIN tipo_amenaza ON amenaza.fk_tipo=tipo_amenaza.pk;";

		activos = base_datos.realizar_lectura(sql);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);

		for(List<String> fila: activos) {
			System.out.println(fila);
			amenaza = new Amenaza_pojo();
			amenaza.setCodigo(fila.get(0));
			amenaza.setNombre(fila.get(1));
			amenaza.setDescripcion(fila.get(2));
			amenaza.setTipo(fila.get(4));				
			try {
				fecha = formatter.parse(String.valueOf(fila.get(3)).replace("T", " "));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			amenaza.setFecha_creacion(fecha);
			resultado.add(amenaza);
		}

		return resultado;

	}
	
	/**
	 * Función para cargar una amenaza a partir de un código de amenaza
 	*/
	public Amenaza_pojo cargar_amenaza_codigo(String codigo) {
		
		Amenaza_pojo resultado = new Amenaza_pojo();
		Database base_datos = new Database();
		List<List<String>> amenazas;
		String sql;
		Date fecha;

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
		Date fecha_amenaza = new Date();

		sql = "SELECT amenaza.cod,amenaza.nombre,amenaza.descripcion,amenaza.fecha_creacion,tipo_amenaza.cod ";
		sql += "FROM amenaza JOIN tipo_amenaza ON amenaza.fk_tipo=tipo_amenaza.pk WHERE amenaza.cod='"+codigo+"';"; 

		amenazas = base_datos.realizar_lectura(sql);
		if (amenazas.size() > 0) {
			resultado.setCodigo(amenazas.get(0).get(0));
			resultado.setNombre(amenazas.get(0).get(1));
			resultado.setDescripcion(amenazas.get(0).get(2));
			try {
				fecha_amenaza = formatter.parse(amenazas.get(0).get(3).replace("T", " "));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			fecha = new Date();
			fecha.setTime(fecha_amenaza.getTime());
			resultado.setTipo(amenazas.get(0).get(4));				
			resultado.setFecha_creacion(fecha);			
		}
		
		return resultado;
	}

	/**
	 * Función para cargar una lista con los tipos de amenazas
 	*/
	public List<Tipo_elemento> cargar_lista_tipo_amenazas() {
		
		List<Tipo_elemento> resultado = new ArrayList<Tipo_elemento>();

		Database base_datos = new Database();
		List<List<String>> tipo_amenazas;
		String sql;
		Tipo_elemento tipo_activo;

		
		sql = "select cod,nombre from tipo_amenaza;";
		
		tipo_amenazas = base_datos.realizar_lectura(sql);
		
		for(List<String> fila: tipo_amenazas) {
			tipo_activo = new Tipo_elemento();
			tipo_activo.setCodigo(fila.get(0));
			tipo_activo.setNombre(fila.get(1));
			resultado.add(tipo_activo);
		}
		return resultado;

	}
	
	/**
 	* Función para crear una amenaza y las degradacines y eficiencias asociadas a esta amenaza 
 	*/
	public String crear_amenaza(Amenaza_pojo amenaza) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_pk;
		boolean resultado_creacion;
		
		List<List<String>> pks;
		String pk_amenaza;
		int pk_degradacion;
		int pk_eficiencia;
		List<String> sqls = new ArrayList<String>();
		String sql;
		
		sql_pk = "select max(pk)+1 from amenaza;";			
		pks = base_datos.realizar_lectura(sql_pk);
		if (pks.get(0).get(0) != null) {
			pk_amenaza = pks.get(0).get(0); 
		} else {
			pk_amenaza = "1";
		}
		
		sql_pk = "select max(pk)+1 from degradacion;";			
		pks = base_datos.realizar_lectura(sql_pk);
		if (pks.get(0).get(0) != null) {
			pk_degradacion = Integer.valueOf(pks.get(0).get(0));
		} else {
			pk_degradacion = 1;
		}
		
		sql_pk = "select max(pk)+1 from eficiencia;";			
		pks = base_datos.realizar_lectura(sql_pk);
		if (pks.get(0).get(0) != null) {
			pk_eficiencia = Integer.valueOf(pks.get(0).get(0));
		} else {
			pk_eficiencia = 1;
		}
		

		sql = "INSERT INTO amenaza (PK,cod,nombre,descripcion,fk_tipo,fecha_creacion) VALUES (" + pk_amenaza + ",'";
		sql	+= amenaza.getCodigo() + "','" + amenaza.getNombre() + "','" + amenaza.getDescripcion() + "',";
		sql += "(select pk from tipo_amenaza where cod='" + amenaza.getTipo() + "'),current_timestamp());";
		
		resultado_creacion = base_datos.realizar_creacion(sql);

		for(Degradacion_amenaza_pojo elemento: amenaza.getDegradaciones()) {
			sql = "INSERT INTO degradacion";
			sql += "(PK,fecha_creacion,grado,probabilidad,fk_activo,fk_amenaza) VALUES (";
			sql += pk_degradacion + ",current_timestamp()," + elemento.getDegradacion_valor() + "," + elemento.getFrecuencia_degradacion();
			sql += ",(select pk from activo where cod='";
			sql += Principal.logica.coger_codigo_nombre(elemento.getActivo()) + "')," + pk_amenaza + ");";
			sqls.add(sql);
			pk_degradacion++;
		}
		System.out.println("crud"+amenaza.getEficiencias());
		for(Eficiencia_amenaza_pojo elemento: amenaza.getEficiencias()) {
			sql = "INSERT INTO eficiencia "
					+ "(PK,fecha_creacion,eficiencia_valor,eficiencia_frecuencia,fk_degradacion,fk_salvaguarda) VALUES ("
					+ pk_eficiencia + ",current_timestamp(),"
					+ elemento.getEficiencia_valor() + ","
					+ elemento.getEficiencia_frecuencia() + ","
					+ "(select pk from activo where cod='";
					sql += Principal.logica.coger_codigo_nombre(elemento.getActivo()) + "'),"
					+ "(select pk from salvaguarda where cod='" + Principal.logica.coger_codigo_nombre(elemento.getSalvaguarda()) + "'));";
			sqls.add(sql);
		}
		resultado_creacion = base_datos.realizar_lote(sqls);

		
		
		return resultado;
	}

	/**
 	* Función para modificar una amenaza y las degradacines y eficiencias asociadas a esta amenaza 
 	*/
	public String modificar_amenaza(String codigo,Amenaza_pojo amenaza) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_amenaza;
		String sql_pk;
		String pk_amenaza;
		List<List<String>> pks;
		int resultado_modificacion;

		sql_pk = "select pk from amenaza where cod='" + codigo + "';";			
		pks = base_datos.realizar_lectura(sql_pk);
		pk_amenaza = pks.get(0).get(0);
		
		sql_amenaza = "UPDATE amenaza SET "
				+ "cod = '" + amenaza.getCodigo() + "', "
				+ "nombre = '" + amenaza.getNombre() + "', "
				+ "descripcion = '" + amenaza.getDescripcion() + "', "
				+ "fk_tipo = (select pk from tipo_amenaza where cod='" + amenaza.getTipo() + "') "
				+ "WHERE PK = "+pk_amenaza+";";

		System.out.println(sql_amenaza);
		resultado_modificacion = base_datos.realizar_modificacion(sql_amenaza);
		
		return resultado;
	}
	
	/**
 	* Función para eliminar una amenaza y las degradacines y eficiencias asociadas a esta amenaza 
 	*/
	public String eliminar_amenaza(String codigo) {
		String resultado = "";
		Database base_datos = new Database();
		String sql;
		boolean resultado_consulta;
		List<String> sqls = new ArrayList<String>();

		sql ="DELETE FROM eficiencia where fk_degradacion in (select pk from degradacion where fk_amenaza in ";
		sql += "(select pk from amenaza where cod = '" + codigo + "'));";
		sqls.add(sql);
		sql = "DELETE FROM degradacion where fk_amenaza in (select pk from amenaza where cod='" + codigo + "');";
		sqls.add(sql);
		sql = "DELETE FROM amenaza WHERE cod='"+codigo+"';";
		sqls.add(sql);
		
		resultado_consulta = base_datos.realizar_lote(sqls);

		return resultado;
	}

}
