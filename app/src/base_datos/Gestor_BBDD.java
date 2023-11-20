package base_datos;

import javax.swing.JOptionPane;

import datos.POJOS.Database_pojo;

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

	
}
