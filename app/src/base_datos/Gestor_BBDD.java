package base_datos;

public class Gestor_BBDD {

	private CRUD_Activos acciones_activos;
	private CRUD_Amenazas acciones_amenazas;
	private CRUD_Salvaguardas acciones_salvaguardas;
	private Database acceso_bbdd;
	
	public Gestor_BBDD() {
		super();
		acciones_activos = new CRUD_Activos();
		acciones_amenazas = new CRUD_Amenazas();
		acciones_salvaguardas = new CRUD_Salvaguardas();
		acceso_bbdd = new Database();
	}
	
	public boolean probar_conexion() {
		boolean resultado = true;
		
		return resultado;
	}

	
}
