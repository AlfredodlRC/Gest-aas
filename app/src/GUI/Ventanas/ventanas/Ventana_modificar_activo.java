package GUI.Ventanas.ventanas;

import java.awt.Color;

import GUI.Ventanas.Herencia.Panel_activo_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;

public class Ventana_modificar_activo extends Ventana_modificar {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8916131888468125891L;
	
	private Panel_activo_manipulacion panel_datos;

	public Ventana_modificar_activo() {
		super();
		setTitle("Gestor AAS - manipular activo");
		panel_datos = new Panel_activo_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}


}
