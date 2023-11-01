package aplicacion;

import GUI.Controladores.Controlador_acciones_principal;
import GUI.Controladores.Gestor_ventanas;
import GUI.Ventanas.ventanas.Ventana_principal;

/** Descripción de la clase Principal
*  
* Clase principal que sirve de entrada a la aplicaci&ocuten.
* 
*/
public class Principal {

	public static Gestor_ventanas gestor_ventanas;
	
	public static void main(String[] args) {
		
		System.out.println("Saludos");
		/*
		Ventana_principal miVentana = new GUI.Ventanas.ventanas.Ventana_principal();
		Controlador_acciones_principal manejador = new GUI.Controladores.Controlador_acciones_principal(miVentana);
		miVentana.establecerManejador(manejador);
		*/
		gestor_ventanas = new Gestor_ventanas();
	}

}
