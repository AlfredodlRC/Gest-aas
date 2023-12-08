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

/**
 *  Clase para la gestión de la base de datos.
 */
public class Gestor_BBDD {

	/**
	 * Objeto que realiza las acciones sobre los activos
	 */
	private CRUD_Activos acciones_activos;

	/**
	 * Objeto que realiza las acciones sobre las amenazas
	 */
	private CRUD_Amenazas acciones_amenazas;

	/**
	 * Objeto que realiza las acciones sobre las salvaguardas
	 */
	private CRUD_Salvaguardas acciones_salvaguardas;

	/**
	 * Objeto que se conectará a la base de datos
	 */
	private Database base_datos;

	/**
	 * Constructor de la clase
	 */
	public Gestor_BBDD() {
		super();
		acciones_activos = new CRUD_Activos();
		acciones_amenazas = new CRUD_Amenazas();
		acciones_salvaguardas = new CRUD_Salvaguardas();
		base_datos = new Database();
	}
	
	/**
	 * Se prueba la conexión con los datos de conexión actuales
	 */
	public boolean probar_base_datos() {
		boolean resultado;
	
		resultado = base_datos.probar_conexion();
	
		return resultado;
	}

	/**
	 * Se prueba la conexión con los datos de conexión facilitados
	 */
	public boolean probar_base_datos(Database_pojo datos_nueva_bbdd) {
		boolean resultado = false;
		
		Database base_datos_prueba = new Database(datos_nueva_bbdd);
		
		resultado = base_datos_prueba.probar_conexion();

		return resultado;
	}
	
	/**
	 * se cambia los datos de conexión de la base de datos
	 */
	public String cambiar_datos_conexion_bbdd(Database_pojo datos_nueva_bbdd) {
		String resultado = "";
		
		this.base_datos.setDatos_bbdd(datos_nueva_bbdd);
		
		return resultado;
	}

	/**
	 * Devuelve los datos de conexión de la base de datos
	 */
	public Database_pojo getDatos_bbdd() {
		return base_datos.getDatos_bbdd();
	}

	/**
	 * Función para recoger activos según tipo de amenaza 
	 */
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

	/**
	 * Función para recoger los criterios
	 */
	public List<Criterio> coger_todos_criterios() {
		
		List<Criterio> resultado = null;
		
		resultado = acciones_activos.cargar_criterios();
		
		return resultado;
	}
	
	/**
	 * Función para recoger las escalas 
	 */
	public List<Escala> coger_todas_escalas() {
		List<Escala> resultado = null;
		
		resultado = acciones_activos.cargar_escalas();
		
		return resultado;
	}
	
	/**
	 *  Función para recoger los activos
	 */
	public List<Activo_pojo> coger_lista_activos() {
		List<Activo_pojo> resultado = null;
		
		resultado = acciones_activos.cargar_lista_activos();
		
		return resultado;
	}
	
	/**
	 * Función para recoger las amenazas
	 */
	public List<Amenaza_pojo> coger_lista_amenazas() {
		List<Amenaza_pojo>resultado = null;
		
		resultado = acciones_amenazas.cargar_lista_amenazas();
		
		return resultado;
	}

	/**
	 * Función para recoger las salvaguardas
	 */
	public List<Salvaguarda_pojo> coger_listas_salvaguardas() {
		List<Salvaguarda_pojo> resultado = null;
		
		resultado = acciones_salvaguardas.cargar_lista_salvaguardas();
		
		return resultado;
	}
	
	/**
	 *  Función para recoger los tipos de activos 
	 */
	public List<Tipo_elemento> coger_lista_tipo_activos() {
		List<Tipo_elemento> resultado = null;
		
		resultado = acciones_activos.cargar_lista_tipo_activos();
		
		return resultado;
	}

	/**
	 *  Función para recoger las relaciones entre activos
	 */
	public List<Relacion_activos> coger_lista_relaciones_activos() {
		List<Relacion_activos> resultado = null;
		
		resultado = acciones_activos.cargar_relaciones_activos();
		
		return resultado;
	}

	/**
	 *  Función para recoger los tipos de amenazas
	 */
	public List<Tipo_elemento> coger_lista_tipo_amenazas() {
		List<Tipo_elemento> resultado = null;
	
		resultado = acciones_amenazas.cargar_lista_tipo_amenazas();
		
		return resultado;

	}

	/**
	 *  Función para recoger los tipos de salvaguardas
	 */
	public List<Tipo_elemento> coger_lista_tipo_salvaguardas() {
		List<Tipo_elemento> resultado = null;
		
		resultado = acciones_salvaguardas.cargar_lista_tipo_salvaguardas();
		
		return resultado;
	}

	/**
	 *  Función para recoger un activo a partir de un código de activo
	 */
	public Activo_pojo coger_activo(String codigo) {
		Activo_pojo resultado = null;

		resultado = acciones_activos.cargar_activo_codigo(codigo);

		return resultado;
	}

	/**
	 *  Función para recoger una amenaza a partir de un códgo de amenaza
	 */
	public Amenaza_pojo coger_amenaza(String codigo) {
		Amenaza_pojo resultado = null;
		
		resultado = acciones_amenazas.cargar_amenaza_codigo(codigo);
		
		return resultado;
	}

	/**
	 *  Función para recoger a partir de un código de salvaguarda
	 */
	public Salvaguarda_pojo coger_salvaguarda(String codigo) {
		Salvaguarda_pojo resultado = null;
		
		resultado = acciones_salvaguardas.cargar_salvaguarda_codigo(codigo);
		return resultado;
	}

	/**
	 *   Se crea un activo
	 */
	public String crear_activo(Activo_pojo activo_nuevo) {
		String resultado = "";
		
		resultado = acciones_activos.crear_activo(activo_nuevo);
		
		return resultado;
	}

	/**
	 * Se modifica un activo
	 */
	public String modificar_activo(String codigo_original,Activo_pojo activo_modificado) {
		String resultado = "";
		
		resultado = acciones_activos.modificar_activo(codigo_original,activo_modificado);
		
		return resultado;
	}

	/**
	 * Se elimina un activo
	 */
	public String eliminar_activo(String codigo) {
		String resultado = "";
		
		
		resultado = acciones_activos.eliminar_activo(codigo);
		
		return resultado;
	}

	/**
	 * Se crea una amenaza
	 */
	public String crear_amenaza(Amenaza_pojo amenaza) {
		String resultado = "";
		
		resultado = acciones_amenazas.crear_amenaza(amenaza);
				
		return resultado;
	}

	/**
	 * Se modifica una amenaza
	 */
	public String modificar_amenaza(Amenaza_pojo amenaza_modificado,String codigo_original) {
		String resultado = "";

		resultado = acciones_amenazas.modificar_amenaza(codigo_original, amenaza_modificado);
		
		return resultado;
	}	

	/**
	 * Se elimina una amenaza
	 */
	public String eliminar_amenaza(String codigo) {
		String resultado = "";

		resultado = acciones_amenazas.eliminar_amenaza(codigo);
		
		return resultado;
	}

	/**
	 * Se crea una salvaguarda
	 */
	public String crear_salvaguarda(Salvaguarda_pojo salvaguarda) {
		String resultado = "";
		
		resultado = acciones_salvaguardas.crear_salvaguarda(salvaguarda);
				
		return resultado;
	}

	/**
	 * Se modifica una amenaza
	 */
	public String modificar_amenaza(Salvaguarda_pojo salvaguarda_modificado,String codigo_original) {
		String resultado = "";

		resultado = acciones_salvaguardas.modificar_salvaguarda(codigo_original, salvaguarda_modificado);
		
		return resultado;
	}	

	/**
	 * Seelimina una salvaguarda
	 */
	public String eliminar_salvaguarda(String codigo) {
		String resultado = "";

		resultado = acciones_salvaguardas.eliminar_salvaguarda(codigo);
		
		return resultado;
	}
	
}
