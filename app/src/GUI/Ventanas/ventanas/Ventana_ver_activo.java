package GUI.Ventanas.ventanas;

import java.awt.Color;

import GUI.Ventanas.Herencia.Panel_activo_visualizacion;
import GUI.Ventanas.Herencia.Ventana_mostrar;

public class Ventana_ver_activo extends Ventana_mostrar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5497666672167069220L;
	
	private Panel_activo_visualizacion panel_datos;
	
	public Ventana_ver_activo() {
		super();
		setTitle("Gestor AAS - ver activo");
		panel_datos = new Panel_activo_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	
}
