package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Ventanas.Herencia.Panel_amenaza_visualizacion;
import GUI.Ventanas.Herencia.Ventana_mostrar;

public class Ventana_ver_amenaza extends Ventana_mostrar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4696678356938295045L;
	
	private Panel_amenaza_visualizacion panel_datos;

	public Ventana_ver_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "ver";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - ver amenaza");
		panel_datos = new Panel_amenaza_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	public JList<String> getActivos_afectados() {
		return panel_datos.getActivos_afectados();
	}

	public JSpinner getTb_degradacion_valor() {
		return panel_datos.getTb_degradacion_valor();
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return panel_datos.getTb_degradacion_fecuencia();
	}

	public JList<String> getSalvaguardas_afectan() {
		return panel_datos.getSalvaguardas_afectan();
	}

	public JSpinner getTb_eficiencia_valor() {
		return panel_datos.getTb_eficiencia_valor();
	}

	public JSpinner getTb_eficiencia_fecuencia() {
		return panel_datos.getTb_eficiencia_fecuencia();
	}

	   

}
