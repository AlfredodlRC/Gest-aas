package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Salvaguarda_pojo;
import datos.POJOS.Tipo_elemento;

public class CRUD_Salvaguardas {

	public CRUD_Salvaguardas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Salvaguarda_pojo> cargar_lista_salvaguardas() {
		
		List<Salvaguarda_pojo> resultado = new ArrayList<Salvaguarda_pojo>();

		Database base_datos = new Database();
		List<List<String>> activos;
		String sql;
		Salvaguarda_pojo salvaguarda;


		sql ="SELECT salvaguarda.cod,salvaguarda.nombre,salvaguarda.descripcion,salvaguarda.Fecha_creacion,tipo_salvaguarda.cod as tipo FROM salvaguarda JOIN tipo_salvaguarda ON salvaguarda.fk_tipo=tipo_salvaguarda.pk;";

		activos = base_datos.realizar_lectura(sql);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
		Date fecha = new Date();

		for(List<String> fila: activos) {
			salvaguarda = new Salvaguarda_pojo();
			salvaguarda.setCodigo(fila.get(0));
			salvaguarda.setNombre(fila.get(1));
			salvaguarda.setDescripcion(fila.get(2));
			salvaguarda.setTipo(fila.get(4));				
			try {
				fecha = formatter.parse(fila.get(3).replace("T", " "));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			salvaguarda.setFecha_creacion(fecha);
			resultado.add(salvaguarda);
		}

		return resultado;

	}

	public List<Tipo_elemento> cargar_lista_tipo_salvaguardas() {
		
		List<Tipo_elemento> resultado = new ArrayList<Tipo_elemento>();

		Database base_datos = new Database();
		List<List<String>> tipo_activos;
		String sql;
		Tipo_elemento tipo_activo;

		
		sql = "select cod,nombre from tipo_salvaguarda;";
		
		tipo_activos = base_datos.realizar_lectura(sql);
		for(List<String> fila: tipo_activos) {
			tipo_activo = new Tipo_elemento();
			tipo_activo.setCodigo(fila.get(0));
			tipo_activo.setNombre(fila.get(1));
			resultado.add(tipo_activo);
		}
		return resultado;

	}
	

	public Salvaguarda_pojo cargar_salvaguarda_codigo(String codigo) {
		
		Salvaguarda_pojo resultado = new Salvaguarda_pojo();
		Database base_datos = new Database();
		List<List<String>> activos;
		String sql;
		Date fecha;

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
		Date fecha_activo = new Date();

		sql = "SELECT salvaguarda.cod, salvaguarda.nombre, salvaguarda.descripcion, salvaguarda.fecha_creacion, salvaguarda.cod ";
		sql += "FROM salvaguarda JOIN tipo_salvaguarda ON salvaguarda.fk_tipo=tipo_salvaguarda.pk "; 
		sql += " WHERE salvaguarda.cod LIKE '" + codigo + "';";

		activos = base_datos.realizar_lectura(sql);
		if (activos.size() > 0) {
			resultado.setCodigo(activos.get(0).get(0));
			resultado.setNombre(activos.get(0).get(1));
			resultado.setDescripcion(activos.get(0).get(2));
			try {
				fecha_activo = formatter.parse(activos.get(0).get(3).replace("T", " "));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fecha = new Date();
			fecha.setTime(fecha_activo.getTime());
			resultado.setTipo(activos.get(0).get(4));				
			resultado.setFecha_creacion(fecha);
			
		}
		
		return resultado;
	}

	public String crear_salvaguarda(Salvaguarda_pojo salvaguarda) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_pk;
		List<List<String>> pks;
		String pk_salvaguarda;
		String sql_salvaguarda ;

		sql_pk = "select max(pk)+1 from salvaguarda;";			
		pks = base_datos.realizar_lectura(sql_pk);
		pk_salvaguarda = pks.get(0).get(0);
		

		sql_salvaguarda = "INSERT INTO salvaguarda (PK,cod,nombre,descripcion,fk_tipo,fecha_creacion) VALUE (";
		sql_salvaguarda += pk_salvaguarda + ",'" + salvaguarda.getCodigo() + "','" + salvaguarda.getNombre() + "','"; 
		sql_salvaguarda += salvaguarda.getDescripcion() + "',(select pk from tipo_salvaguarda where cod='" + salvaguarda.getTipo();  
				sql_salvaguarda += "'),current_timestamp());";
		System.out.println(sql_salvaguarda);
		return resultado;
	}
	
	public String modificar_salvaguarda(String codigo, Salvaguarda_pojo salvaguarda) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_salvaguarda;
		int resultado_modificacion;
		List<List<String>> pks;
		String pk_salvaguarda;
		String sql_pk;
		
		sql_pk = "select pk from salvaguarda where cod='" + codigo + "';";			
		pks = base_datos.realizar_lectura(sql_pk);
		pk_salvaguarda = pks.get(0).get(0);
		sql_salvaguarda = "UPDATE salvaguarda SET "
				+ "cod ='" + salvaguarda.getCodigo() + "', "
				+ "nombre ='" + salvaguarda.getNombre() + "', "
				+ "descripcion ='" + salvaguarda.getDescripcion() + "', "
				+ "fk_tipo = (select pk from tipo_salvaguarda where cod='" + salvaguarda.getTipo() + "') "
				+ "WHERE PK = " + pk_salvaguarda + ";";
		System.out.println(sql_salvaguarda);
		resultado_modificacion = base_datos.realizar_modificacion(sql_salvaguarda);

		return resultado;
	}

	public String eliminar_salvaguarda(String codigo) {
		String resultado = "";
		Database base_datos = new Database();
		String sql_salvaguarda;
		boolean resultado_consulta;
		sql_salvaguarda = "DELETE FROM salvaguarda WHERE cod='"+codigo+"';";
		System.out.println(sql_salvaguarda);
		resultado_consulta = base_datos.realizar_eliminacion(sql_salvaguarda);
		return resultado;
	}
	
}
