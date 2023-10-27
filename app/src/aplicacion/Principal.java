package aplicacion;

/** Descripción de la clase Principal
*  
* Clase principal que sirve de entrada a la aplicaci&ocuten.
* 
*/
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Saludos");
		GUI.Ventanas.ventanas.Ventana_principal miVentana = new GUI.Ventanas.ventanas.Ventana_principal();
		GUI.Controladores.Controlador_acciones_principal manejador = new GUI.Controladores.Controlador_acciones_principal(miVentana);
		miVentana.establecerManejador(manejador);
	}

}
