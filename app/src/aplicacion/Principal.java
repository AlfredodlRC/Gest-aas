package aplicacion;

import java.util.List;

import javax.swing.JOptionPane;

import GUI.Controladores.Gestor_ventanas;
import Logica_negocio.Logica_de_negocio;
import base_datos.Database;
import base_datos.Gestor_BBDD;



/** Descripción de la clase Principal
*  
* Clase principal que sirve de entrada a la aplicaci&ocuten.
* 
*/
public class Principal {

	public static Gestor_ventanas gestor_ventanas;
	public static Gestor_BBDD gestor_base_datos;
	public static Logica_de_negocio logica;
	
	public static void main(String[] args) {
		
		
		boolean existe_conexion;
		
		Database base_datos = new Database();
		
		existe_conexion = base_datos.probar_conexion();
		if (existe_conexion == false) {
			JOptionPane.showMessageDialog(null,"Existe un fallo al conextarse a la base de datos.\nPor favor llame al servicio técnico","Fallo en la conexión", JOptionPane.ERROR_MESSAGE);
			return;
		}

		System.out.println("Saludos");

		gestor_base_datos = new Gestor_BBDD();

		logica = new Logica_de_negocio();

		gestor_ventanas = new Gestor_ventanas();
	}

}
