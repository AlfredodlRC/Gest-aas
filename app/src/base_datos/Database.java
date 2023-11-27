package base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Database_pojo;

public class Database {

	private Database_pojo datos_bbdd;

	private String cadena_conexion;

	private int numero_filas_afectadas;
	
	private String mensaje_error;

	public Database() {
		super();

		datos_bbdd = new Database_pojo();
		
		cadena_conexion = "jdbc:mysql://" +datos_bbdd.getHost() + "/" + datos_bbdd.getBase_datos();
	}

	
	
	public Database(Database_pojo datos_bbdd) {
		super();

		this.datos_bbdd = datos_bbdd;
		
		cadena_conexion = "jdbc:mysql://" +datos_bbdd.getHost() + "/" + datos_bbdd.getBase_datos();
	}



	public Database_pojo getDatos_bbdd() {
		return datos_bbdd;
	}

	public void setDatos_bbdd(Database_pojo datos_bbdd) {
		this.datos_bbdd = datos_bbdd;
	}


	private Connection crear_conexion() {

		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(cadena_conexion,datos_bbdd.getUsuario(),datos_bbdd.getContrasenya());
		} catch (SQLException e) {
			System.out.println("No se pudo crear una conexión con la base de datos");
			this.mensaje_error = "No se pudo crear una conexión con la base de datos:" + e.getMessage();
		}
		
		return conexion;
	}
	
	private boolean cerrar_conexion(Connection conexion) {
		boolean resultado;
		
		this.mensaje_error ="";
		
		try {
			conexion.close();
			resultado = true;
		} catch (SQLException e) {
			resultado = false;
			this.mensaje_error = "Error al cerrar la conexión: " + e.getMessage();
			e.printStackTrace();
		}
		
		return resultado;
	}
	
	public boolean probar_conexion() {
		boolean resultado = true;
		Connection conexion = crear_conexion();
		
		if (conexion == null) {
			resultado = false;
		} else {
			resultado = cerrar_conexion(conexion);
		}
		
		return resultado;
	}
	
	public List<List<String>> realizar_lectura(String sql) {
		List<List<String>> resultado = new ArrayList<List<String>>();
		List<String> fila;
		Connection conexion_lectura;
		Integer numero_columnas;
		Integer i;
		
		this.mensaje_error = "";
		
		conexion_lectura = crear_conexion();
		
		try {
			PreparedStatement ps = conexion_lectura.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			System.out.println();
			
			while(rs.next()){
				fila = new ArrayList<String>();
				numero_columnas = rs.getMetaData().getColumnCount();
				for(i=0; i<numero_columnas;i++) {
					fila.add(rs.getString(i+1));				
				}
				resultado.add(fila);
				
			}
		} catch (SQLException e) {
			System.out.println("Error al ejecutar lectura");
			this.mensaje_error = "Error al ejecutar lectura: " + e.getMessage();
			e.printStackTrace();
		}
		
		cerrar_conexion(conexion_lectura);

		return resultado;
	}

	public boolean realizar_creacion(String sql) {
		boolean resultado;
		Connection conexion_creacion;
		PreparedStatement ps;
		
		this.mensaje_error = "";
		
		numero_filas_afectadas = 0;

		conexion_creacion = crear_conexion();

		try {
			ps = conexion_creacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error al insertar: ");
			this.mensaje_error = "Error al insertar: " + e.getMessage();
						resultado = false;
			e.printStackTrace();
		}

		cerrar_conexion(conexion_creacion);

		return resultado;
	}
	
	public int realizar_modificacion(String sql) {
		int resultado;
		Connection conexion_modificacion;
		PreparedStatement ps;
		
		this.mensaje_error = "";
		
		numero_filas_afectadas = 0;

		conexion_modificacion = crear_conexion();

		try {
			ps = conexion_modificacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = numero_filas_afectadas;
		} catch (SQLException e) {
			System.out.println("Error al modificar: ");
			this.mensaje_error = "Error al modificar: " + e.getMessage();
			resultado = -1;
			e.printStackTrace();
		}

		cerrar_conexion(conexion_modificacion);
		
		return resultado;
	}
	
	public boolean realizar_eliminacion(String sql) {
		boolean resultado;
		Connection conexion_eliminacion;
		PreparedStatement ps;

		this.mensaje_error = "";
		
		numero_filas_afectadas = 0;

		conexion_eliminacion = crear_conexion();

		try {
			ps = conexion_eliminacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error al eliminar: ");
			this.mensaje_error = "Error al eliminar: " + e.getMessage();
			resultado = false;
			e.printStackTrace();
		}

		cerrar_conexion(conexion_eliminacion);

		return resultado;
	}
	
	public boolean realizar_lote(List<String> lista_sql) {
		boolean resultado;
		Connection conexion_lote;
		PreparedStatement ps;
		boolean resultado_sql;


		conexion_lote = crear_conexion();
		try {
			conexion_lote.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.mensaje_error = "";
				
		try {
			for(String elemento: lista_sql) {
				System.out.println(elemento);
				ps = conexion_lote.prepareStatement(elemento);
				resultado_sql = ps.execute();
			}
			conexion_lote.commit();
			resultado = true;
		} catch (SQLException e) {
			try {
				conexion_lote.rollback();
			} catch (SQLException e1) {
				System.out.println("Error al ejecutar el lote: ");
				this.mensaje_error = "Error al ejecutar el lote" + e1.getMessage();		
				e1.printStackTrace();
			}
			resultado = false;
			System.out.println("Error al ejecutar el lote: ");
			this.mensaje_error = "Error al ejecutar el lote" + e.getMessage();
			e.printStackTrace();
		}

		cerrar_conexion(conexion_lote);

		return resultado;
	}
	
	
	
}
