package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Ventanas.Herencia.Panel_activo_manipulacion;
import GUI.Ventanas.Herencia.Panel_amenaza_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;

public class Ventana_modificar_amenaza extends Ventana_modificar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2110111460465951492L;
	
	private Panel_amenaza_manipulacion panel_datos;

	public Ventana_modificar_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "modificar";
		
		btn_accion.setText(accion);

		setTitle("Gestor AAS - manipular amenaza");
		panel_datos = new Panel_amenaza_manipulacion();
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
	
	public JButton getBtn_valorar_degradacion() {
		return panel_datos.getBtn_valorar_degradacion();
	}

	public JComboBox<String> getCb_activos() {
		return panel_datos.getCb_activos();
	}

	public JButton getBtn_valorar_eficiencia() {
		return panel_datos.getBtn_valorar_degradacion();
	}

	public JComboBox<String> getCb_salvaguardas() {
		return panel_datos.getCb_salvaguardas();
	}

}
