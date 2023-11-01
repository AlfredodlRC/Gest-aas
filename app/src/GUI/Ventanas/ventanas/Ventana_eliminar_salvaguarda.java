package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JSpinner;

import GUI.Ventanas.Herencia.Panel_activo_visualizacion;
import GUI.Ventanas.Herencia.Panel_salvaguarda_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;

public class Ventana_eliminar_salvaguarda extends Ventana_eliminar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8642468843067228697L;

	private Panel_salvaguarda_visualizacion panel_datos;

	public Ventana_eliminar_salvaguarda() {
		super();

		elemento = "salvaguarda";
		accion = "eliminar";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar salvaguarda");
		panel_datos = new Panel_salvaguarda_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
				
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
	
}
