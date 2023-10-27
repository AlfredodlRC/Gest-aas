package GUI.Ventanas.ventanas;

import java.awt.Color;

import GUI.Ventanas.Herencia.Panel_activo_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;

public class Ventana_crear_activo extends Ventana_crear {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6745262481224451116L;
	
	private Panel_activo_manipulacion panel_datos;
	
	public Ventana_crear_activo() {
		super();
		setTitle("Gestor AAS - crear activo");
		panel_datos = new Panel_activo_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
		
	}
	
	

}
