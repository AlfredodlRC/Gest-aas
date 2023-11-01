package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

import GUI.Ventanas.Herencia.Panel_salvaguarda_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;

public class Ventana_crear_salvaguarda extends Ventana_crear{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3225550956840590330L;

	private Panel_salvaguarda_manipulacion panel_datos;

	public Ventana_crear_salvaguarda() {
		super();

		elemento = "salvaguarda";
		accion = "crear";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - crear salvaguarda");
		panel_datos = new Panel_salvaguarda_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	public Panel_salvaguarda_manipulacion getPanel_datos() {
		return panel_datos;
	}

	public JComboBox<String> getCb_amenazas() {
		return panel_datos.getCb_amenazas();
	}

	public JSpinner getTb_eficiencia_valor_activo() {
		return panel_datos.getTb_eficiencia_valor_activo();
	}

	public JSpinner getTb_eficiencia_fecuencia_activo() {
		return panel_datos.getTb_eficiencia_fecuencia_activo();
	}

	public JComboBox<String> getCb_activos() {
		return panel_datos.getCb_activos();
	}

	public JSpinner getTb_eficiencia_valor_amenaza() {
		return panel_datos.getTb_eficiencia_valor_amenaza();
	}

	public JSpinner getTb_eficiencia_fecuencia_amenaza() {
		return panel_datos.getTb_eficiencia_fecuencia_amenaza();
	}

	public JButton getBtn_guardar_eficiencia_activo() {
		return panel_datos.getBtn_guardar_eficiencia_activo();
	}

	public JButton getBtn_guardar_eficiencia_amenaza() {
		return panel_datos.getBtn_guardar_eficiencia_amenaza();
	}


}
