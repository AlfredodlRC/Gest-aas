package aplicacion;

import java.util.List;

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
		
		System.out.println("Saludos");
		logica = new Logica_de_negocio(); 
		gestor_base_datos = new Gestor_BBDD();
		gestor_ventanas = new Gestor_ventanas();
	}

}
