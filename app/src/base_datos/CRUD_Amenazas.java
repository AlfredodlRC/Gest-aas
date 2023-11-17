package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Tipo_elemento;

public class CRUD_Amenazas {

	public CRUD_Amenazas() {
		super();
	}
			
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
	
	public String crear_amenaza(Amenaza_pojo amenaza) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_pk;
		String sql_degradacion;
		String sql_amenaza;
		boolean resultado_creacion;
		
		List<List<String>> pks;
		String pk_amenaza;
		String pk_degradacion;
		
		sql_pk = "select max(pk)+1 from amenaza;";			
		pks = base_datos.realizar_lectura(sql_pk);
		pk_amenaza = pks.get(0).get(0);
		
		sql_pk = "select max(pk)+1 from degradacion;";			
		pks = base_datos.realizar_lectura(sql_pk);
		pk_degradacion = pks.get(0).get(0);

		sql_amenaza = "INSERT INTO amenaza (PK,cod,nombre,descripcion,fk_tipo,fecha_creacion) VALUES ("
				+ pk_amenaza + ",'"
				+ amenaza.getCodigo() + "','"
				+ amenaza.getNombre() + "','"
				+ amenaza.getDescripcion() + "',"
				+ "(select pk from tipo_amenaza where cod='" + amenaza.getTipo() + "')"
				+ ",current_timestamp());";
		System.out.println(sql_amenaza);
		sql_degradacion = "";

		
		resultado_creacion = base_datos.realizar_creacion(sql_amenaza);
		//resultado_creacion = base_datos.realizar_creacion(sql_degradacion);
		
		
		return resultado;
	}

	public String modificar_amenaza(String codigo,Amenaza_pojo amenaza) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_amenaza;
		String sql_pk;
		String pk_amenaza;
		List<List<String>> pks;
		boolean resultado_modificacion = true;

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
	
	public String eliminar_amenaza(String codigo) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_activo;
		boolean resultado_consulta;


		sql_activo = "DELETE FROM amenaza WHERE cod='"+codigo+"';";
		System.out.println(sql_activo);
		resultado_consulta = base_datos.realizar_eliminacion(sql_activo);

		return resultado;
	}

}
