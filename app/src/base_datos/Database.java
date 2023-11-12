package base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private String host;
	private String base_datos;
	private String usuario;
	private String contrasenya;
	private String cadena_conexion;

	int numero_filas_afectadas;

	public Database() {
		super();
		host = "localhost";
		base_datos = "gestor_activos_amenazas_salvaguardas";
		usuario = "root";
		contrasenya = "Alfredo";
		cadena_conexion = "jdbc:mysql://" + host + "/" +   base_datos;
	}
	
	private Connection crear_conexion() {

		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(cadena_conexion,usuario,contrasenya);
		} catch (SQLException e) {
			System.out.println("No se pudo crear una conexión con la base de datos");
		}
		
		return conexion;
	}
	
	public List<List<String>> realizar_lectura(String sql) {
		List<List<String>> resultado = new ArrayList<List<String>>();
		List<String> fila;
		Connection conexion_lectura;
		Integer numero_columnas;
		Integer i;
		
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
			e.printStackTrace();
		}
		
		try {
			conexion_lectura.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public boolean realizar_creacion(String sql) {
		boolean resultado;
		Connection conexion_creacion;
		PreparedStatement ps;
		
		numero_filas_afectadas = 0;

		conexion_creacion = crear_conexion();

		try {
			ps = conexion_creacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error al insertar: ");
			resultado = false;
			e.printStackTrace();
		}

		try {
			conexion_creacion.close();
		} catch (SQLException e) {
			resultado = false;
			e.printStackTrace();
		}

		return resultado;
	}
	
	public boolean realizar_modificacion(String sql) {
		boolean resultado;
		Connection conexion_modificacion;
		PreparedStatement ps;
		
		numero_filas_afectadas = 0;

		conexion_modificacion = crear_conexion();

		try {
			ps = conexion_modificacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error al modificar: ");
			resultado = false;
			e.printStackTrace();
		}

		try {
			conexion_modificacion.close();
		} catch (SQLException e) {
			resultado = false;
			e.printStackTrace();
		}

		return resultado;
	}
	
	public boolean realizar_eliminacion(String sql) {
		boolean resultado;
		Connection conexion_eliminacion;
		PreparedStatement ps;

		numero_filas_afectadas = 0;

		conexion_eliminacion = crear_conexion();

		try {
			ps = conexion_eliminacion.prepareStatement(sql);
			numero_filas_afectadas = ps.executeUpdate();
			resultado = true;
		} catch (SQLException e) {
			System.out.println("Error al eliminar: ");
			resultado = false;
			e.printStackTrace();
		}

		try {
			conexion_eliminacion.close();
		} catch (SQLException e) {
			resultado = false;
			e.printStackTrace();
		}

		return resultado;
	}
	
	
	
}
