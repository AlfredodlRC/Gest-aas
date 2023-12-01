package base_datos;

import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Criterio;
import datos.POJOS.Database_pojo;
import datos.POJOS.Escala;
import datos.POJOS.Relacion_activos;
import datos.POJOS.Salvaguarda_pojo;
import datos.POJOS.Tipo_elemento;

public class Gestor_BBDD {

	private CRUD_Activos acciones_activos;
	private CRUD_Amenazas acciones_amenazas;
	private CRUD_Salvaguardas acciones_salvaguardas;
	
	private Database base_datos;

	public Gestor_BBDD() {
		super();
		acciones_activos = new CRUD_Activos();
		acciones_amenazas = new CRUD_Amenazas();
		acciones_salvaguardas = new CRUD_Salvaguardas();
		base_datos = new Database();
	}
	
	//Función para probar la conexión a la base de datos
	public boolean probar_base_datos() {
		boolean resultado;
	
		resultado = base_datos.probar_conexion();
	
		return resultado;
	}
	
	public boolean probar_base_datos(Database_pojo datos_nueva_bbdd) {
		boolean resultado = false;
		
		Database base_datos_prueba = new Database(datos_nueva_bbdd);
		
		resultado = base_datos_prueba.probar_conexion();

		return resultado;
	}
	
	public String cambiar_datos_conexion_bbdd(Database_pojo datos_nueva_bbdd) {
		String resultado = "";
		
		this.base_datos.setDatos_bbdd(datos_nueva_bbdd);
		
		return resultado;
	}

	public Database_pojo getDatos_bbdd() {
		return base_datos.getDatos_bbdd();
	}

	public List<String> coger_lista_activos_tipo_amenaza(String codigo) {
		List<String> resultado = new ArrayList<String>();
		List<Activo_pojo> lista;
		lista = acciones_activos.cargar_lista_activos();
		//lista = acciones_activos.cargar_lista_activos_por_tipo_amenaza(codigo);
		for (Activo_pojo elemento: lista) {
			resultado.add("("+elemento.getCodigo()+") " + elemento.getNombre());
		}
		
		return resultado;
	}
	
	public List<Criterio> coger_todos_criterios() {
		
		List<Criterio> resultado = null;
		
		resultado = acciones_activos.cargar_criterios();
		
		return resultado;
	}
	
	public List<Escala> coger_todas_escalas() {
		List<Escala> resultado = null;
		
		resultado = acciones_activos.cargar_escalas();
		
		return resultado;
	}
	
	public List<Activo_pojo> coger_lista_activos() {
		List<Activo_pojo> resultado = null;
		
		resultado = acciones_activos.cargar_lista_activos();
		
		return resultado;
	}
	
	public List<Amenaza_pojo> coger_lista_amenazas() {
		List<Amenaza_pojo>resultado = null;
		
		resultado = acciones_amenazas.cargar_lista_amenazas();
		
		return resultado;
	}
	public List<Salvaguarda_pojo> coger_listas_salvaguardas() {
		List<Salvaguarda_pojo> resultado = null;
		
		resultado = acciones_salvaguardas.cargar_lista_salvaguardas();
		
		return resultado;
	}
	
	public List<Tipo_elemento> coger_lista_tipo_activos() {
		List<Tipo_elemento> resultado = null;
		
		resultado = acciones_activos.cargar_lista_tipo_activos();
		
		return resultado;
	}
	
	public List<Relacion_activos> coger_lista_relaciones_activos() {
		List<Relacion_activos> resultado = null;
		
		resultado = acciones_activos.cargar_relaciones_activos();
		
		return resultado;
	}
	
	public List<Tipo_elemento> coger_lista_tipo_amenazas() {
		List<Tipo_elemento> resultado = null;
	
		resultado = acciones_amenazas.cargar_lista_tipo_amenazas();
		
		return resultado;

	}
	
	public List<Tipo_elemento> coger_lista_tipo_salvaguardas() {
		List<Tipo_elemento> resultado = null;
		
		resultado = acciones_salvaguardas.cargar_lista_tipo_salvaguardas();
		
		return resultado;
	}
	
	public Activo_pojo coger_activo(String codigo) {
		Activo_pojo resultado = null;
		System.out.println(codigo);
		resultado = acciones_activos.cargar_activo_codigo(codigo);
		
		return resultado;
	}
	
	public Amenaza_pojo coger_amenaza(String codigo) {
		Amenaza_pojo resultado = null;
		
		resultado = acciones_amenazas.cargar_amenaza_codigo(codigo);
		
		return resultado;
	}
	
	public Salvaguarda_pojo coger_salvaguarda(String codigo) {
		Salvaguarda_pojo resultado = null;
		
		resultado = acciones_salvaguardas.cargar_salvaguarda_codigo(codigo);
		return resultado;
	}
	
	public String crear_activo(Activo_pojo activo_nuevo) {
		String resultado = "";
		
		resultado = acciones_activos.crear_activo(activo_nuevo);
		
		return resultado;
	}
	
	public String modificar_activo(String codigo_original,Activo_pojo activo_modificado) {
		String resultado = "";
		
		resultado = acciones_activos.modificar_activo(codigo_original,activo_modificado);
		
		return resultado;
	}
	
	public String eliminar_activo(String codigo) {
		String resultado = "";
		
		
		resultado = acciones_activos.eliminar_activo(codigo);
		
		return resultado;
	}
	
	public String crear_amenaza(Amenaza_pojo amenaza) {
		String resultado = "";
		
		resultado = acciones_amenazas.crear_amenaza(amenaza);
				
		return resultado;
	}
	
	public String modificar_amenaza(Amenaza_pojo amenaza_modificado,String codigo_original) {
		String resultado = "";

		resultado = acciones_amenazas.modificar_amenaza(codigo_original, amenaza_modificado);
		
		return resultado;
	}	
	
	public String eliminar_amenaza(String codigo) {
		String resultado = "";

		resultado = acciones_amenazas.eliminar_amenaza(codigo);
		
		return resultado;
	}

	
	public String crear_salvaguarda(Salvaguarda_pojo salvaguarda) {
		String resultado = "";
		
		resultado = acciones_salvaguardas.crear_salvaguarda(salvaguarda);
				
		return resultado;
	}
	
	public String modificar_amenaza(Salvaguarda_pojo salvaguarda_modificado,String codigo_original) {
		String resultado = "";

		resultado = acciones_salvaguardas.modificar_salvaguarda(codigo_original, salvaguarda_modificado);
		
		return resultado;
	}	
	
	public String eliminar_salvaguarda(String codigo) {
		String resultado = "";

		resultado = acciones_salvaguardas.eliminar_salvaguarda(codigo);
		
		return resultado;
	}

	
}
