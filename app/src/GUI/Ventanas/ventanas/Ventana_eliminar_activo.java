package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.JTextField;

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

		elemento = "activo";
		accion = "eliminar";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar activo");
		panel_datos = new Panel_activo_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	public JList<String> getActivos_superiores() {
		return panel_datos.getActivos_superiores();
	}

	public JList<String> getActivos_inferiores() {
		return panel_datos.getActivos_inferiores();
	}

	public JTextField getTb_valor_repercutido() {
		return panel_datos.getTb_valor_repercutido();
	}

	public JTextField getTb_valor_acumulado() {
		return panel_datos.getTb_valor_acumulado();
	}	
	
	public JTextField getNivel_valor() {
		return panel_datos.getNivel_valor();
	}

	public JTextField getCriterio_1() {
		return panel_datos.getCriterio_1();
	}

	public JTextField getCriterio_2() {
		return panel_datos.getCriterio_2();
	}

	public JTextField getCriterio_3() {
		return panel_datos.getCriterio_3();
	}

	public JTextField getCriterio_4() {
		return panel_datos.getCriterio_4();
	}

	public JTextField getCriterio_5() {
		return panel_datos.getCriterio_5();
	}

	public JTextField getCriterio_6() {
		return panel_datos.getCriterio_6();
	}

	public JTextField getCriterio_7() {
		return panel_datos.getCriterio_7();
	}

	public JTextField getCriterio_8() {
		return panel_datos.getCriterio_8();
	}

	public JTextField getCriterio_9() {
		return panel_datos.getCriterio_9();
	}

	public JTextField getCriterio_10() {
		return panel_datos.getCriterio_10();
	}

	public JTextField getCriterio_11() {
		return panel_datos.getCriterio_11();
	}

	public JTextField getCriterio_12() {
		return panel_datos.getCriterio_12();
	}

	public JTextField getCriterio_13() {
		return panel_datos.getCriterio_13();
	}


}
