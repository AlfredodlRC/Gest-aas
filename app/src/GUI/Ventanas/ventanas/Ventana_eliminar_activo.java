package GUI.Ventanas.ventanas;

import java.awt.Color;

import GUI.Ventanas.Herencia.Panel_activo_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;

public class Ventana_eliminar_activo extends Ventana_eliminar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5960536906610090156L;
	
	private Panel_activo_visualizacion panel_datos;

	public Ventana_eliminar_activo() {
		super();
		setTitle("Gestor AAS - eliminar activo");
		panel_datos = new Panel_activo_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	
}
