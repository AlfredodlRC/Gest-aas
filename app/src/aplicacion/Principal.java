package aplicacion;


import javax.swing.JOptionPane;

import GUI.Controladores.Gestor_ventanas;
import Logica_negocio.Logica_de_negocio;
import base_datos.Gestor_BBDD;



/** 
*  
* Clase principal que sirve de entrada a la aplicacion.
* 
* Clase contenedora de la función main de la aplicación
* 
*/
public class Principal {

	/**
	 *  Objeto que gestiona el sistema de ventanas de la aplicación
	 *  Este objeto se encarga de mostrar y ocultar las distintas ventanas que conforma
	 *  la interfaz de la aplicación 
	 */
	public static Gestor_ventanas gestor_ventanas;
	
	/**
	 * Objeto que gestiona todo lo relacionado con el acceso a la base de datos.
	 */
	public static Gestor_BBDD gestor_base_datos;

	/**
	 * Objecto que contiene la lógica de negocio de la aplicación.
	 * Se encarga de conectar las diferentes ventanas de la aplicación con la base de datos
	 * También posee un objeto que sirve para contener diferentes datos para evitar accesos a
	 * la base de datos. 
	 */
	public static Logica_de_negocio logica;
	
	/**
	 * Función de entrada del programa
	 * 
	 * Está función comprueba si existe conexion  a la base de datos,(desactivado)
	 * si está existe se ejecutará el gestor del sistema de ventanas y
	 * la lógica del negocio
	 * 
	 *  @param args opciones introducidas en la linea de comando.
	 */
	public static void main(String[] args) {
				
		boolean existe_conexion;
		/*
		gestor_base_datos = new Gestor_BBDD();
		
		existe_conexion = gestor_base_datos.probar_base_datos();
		
		if (existe_conexion == false) {
			JOptionPane.showMessageDialog(null,"Existe un fallo al conextarse a la base de datos.\nPor favor llame al servicio técnico","Fallo en la conexión", JOptionPane.ERROR_MESSAGE);
			return;
		}
		 */
		System.out.println("Saludos");

		gestor_base_datos = new Gestor_BBDD();

		logica = new Logica_de_negocio();

		gestor_ventanas = new Gestor_ventanas();
	}

}
