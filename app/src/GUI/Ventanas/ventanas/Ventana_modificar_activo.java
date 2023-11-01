package GUI.Ventanas.ventanas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;

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

		elemento = "activo";
		accion = "modificar";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - manipular activo");
		panel_datos = new Panel_activo_manipulacion();
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
	
	public JSpinner getTb_economico() {
		return panel_datos.getTb_economico();
	}

	public JComboBox<String> getNivel_valor() {
		return panel_datos.getNivel_valor();
	}

	public JComboBox<String> getCriterio_1() {
		return panel_datos.getCriterio_1();
	}

	public JComboBox<String> getCriterio_2() {
		return panel_datos.getCriterio_2();
	}

	public JComboBox<String> getCriterio_3() {
		return panel_datos.getCriterio_3();
	}

	public JComboBox<String> getCriterio_4() {
		return panel_datos.getCriterio_4();
	}

	public JComboBox<String> getCriterio_5() {
		return panel_datos.getCriterio_5();
	}

	public JComboBox<String> getCriterio_6() {
		return panel_datos.getCriterio_6();
	}

	public JComboBox<String> getCriterio_7() {
		return panel_datos.getCriterio_7();
	}

	public JComboBox<String> getCriterio_8() {
		return panel_datos.getCriterio_8();
	}

	public JComboBox<String> getCriterio_9() {
		return panel_datos.getCriterio_9();
	}

	public JComboBox<String> getCriterio_10() {
		return panel_datos.getCriterio_10();
	}

	public JComboBox<String> getCriterio_11() {
		return panel_datos.getCriterio_11();
	}

	public JComboBox<String> getCriterio_12() {
		return panel_datos.getCriterio_12();
	}

	public JComboBox<String> getCriterio_13() {
		return panel_datos.getCriterio_13();
	}

	public JComboBox<String> getCb_activo_superior() {
		return panel_datos.getCb_activo_superior();
	}

	public JButton getBtn_agregar_activo_superior() {
		return panel_datos.getBtn_agregar_activo_superior();
	}

	public JButton getBtn_desagregar_activo_superior() {
		return panel_datos.getBtn_desagregar_activo_superior();
	}

	public JComboBox<String> getCb_activo_inferior() {
		return panel_datos.getCb_activo_inferior();
	}

	public JButton getBtn_agregar_activo_inferior() {
		return panel_datos.getBtn_agregar_activo_inferior();
	}

	public JButton getBtn_desagregar_activo_inferior() {
		return panel_datos.getBtn_desagregar_activo_inferior();
	}
	

}
