package GUI.Ventanas.Herencia;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class Panel_activo_manipulacion extends Panel_activo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2117005529478291727L;

	private JSpinner tb_economico;
	private JComboBox<String> nivel_valor;
	private JComboBox<String> criterio_1;
	private JComboBox<String> criterio_2;
	private JComboBox<String> criterio_3;
	private JComboBox<String> criterio_4;
	private JComboBox<String> criterio_5;
	private JComboBox<String> criterio_6;
	private JComboBox<String> criterio_7;
	private JComboBox<String> criterio_8;
	private JComboBox<String> criterio_9;
	private JComboBox<String> criterio_10;
	private JComboBox<String> criterio_11;
	private JComboBox<String> criterio_12;
	private JComboBox<String> criterio_13;

	
	private JList<String> activos_superiores;
	private JButton btn_agregar_activo_superior;
	private JButton btn_desagregar_activo_superior;
		
	private JList<String> activos_inferiores;
	private JButton btn_agregar_activo_inferior;
	private JButton btn_desagregar_activo_inferior;

	
	public Panel_activo_manipulacion() {
		super();
		establecer_componentes_manipulacion();
	}
	
	public void establecer_componentes_manipulacion() {
		Dimension lbl_tamanyo = new Dimension(100,30);
		Dimension btn_tamanyo = new Dimension(150,30);
		SpinnerNumberModel spnrModelo = new SpinnerNumberModel(0,0,200000000,0.05);
		
		tb_economico = new JSpinner();
		tb_economico.setSize(lbl_tamanyo);
		tb_economico.setLocation(10,50);
		tb_economico.setModel(spnrModelo);
		panel_tab_Valoracion.add(tb_economico);

		nivel_valor = new JComboBox<String>();
		nivel_valor.setSize(lbl_tamanyo);
		nivel_valor.setLocation(10,110);
		panel_tab_Valoracion.add(nivel_valor);

		criterio_1 = new JComboBox<String>();
		criterio_1.setSize(lbl_tamanyo);
		criterio_1.setLocation(120,50);
		panel_tab_Criterios.add(criterio_1);

		criterio_2 = new JComboBox<String>();
		criterio_2.setSize(lbl_tamanyo);
		criterio_2.setLocation(230,50);
		panel_tab_Criterios.add(criterio_2);

		criterio_3 = new JComboBox<String>();
		criterio_3.setSize(lbl_tamanyo);
		criterio_3.setLocation(340,50);
		panel_tab_Criterios.add(criterio_3);

		criterio_4 = new JComboBox<String>();
		criterio_4.setSize(lbl_tamanyo);
		criterio_4.setLocation(450,50);
		panel_tab_Criterios.add(criterio_4);

		criterio_5 = new JComboBox<String>();
		criterio_5.setSize(lbl_tamanyo);
		criterio_5.setLocation(560,50);
		panel_tab_Criterios.add(criterio_5);

		criterio_6 = new JComboBox<String>();
		criterio_6.setSize(lbl_tamanyo);
		criterio_6.setLocation(670,50);
		panel_tab_Criterios.add(criterio_6);

		criterio_7 = new JComboBox<String>();
		criterio_7.setSize(lbl_tamanyo);
		criterio_7.setLocation(780,50);
		panel_tab_Criterios.add(criterio_7);

		criterio_8 = new JComboBox<String>();
		criterio_8.setSize(lbl_tamanyo);
		criterio_8.setLocation(170,110);
		panel_tab_Criterios.add(criterio_8);

		criterio_9 = new JComboBox<String>();
		criterio_9.setSize(lbl_tamanyo);
		criterio_9.setLocation(280,110);
		panel_tab_Criterios.add(criterio_9);

		criterio_10 = new JComboBox<String>();
		criterio_10.setSize(lbl_tamanyo);
		criterio_10.setLocation(390,110);
		panel_tab_Criterios.add(criterio_10);

		criterio_11 = new JComboBox<String>();
		criterio_11.setSize(lbl_tamanyo);
		criterio_11.setLocation(500,110);
		panel_tab_Criterios.add(criterio_11);

		criterio_12 = new JComboBox<String>();
		criterio_12.setSize(lbl_tamanyo);
		criterio_12.setLocation(610,110);
		panel_tab_Criterios.add(criterio_12);

		criterio_13 = new JComboBox<String>();
		criterio_13.setSize(lbl_tamanyo);
		criterio_13.setLocation(720,110);
		panel_tab_Criterios.add(criterio_13);
		
		
		activos_superiores = new JList<String>();
		activos_superiores.setBounds(620, 50, 200, 200);
		panel_tab_Activos_superiores.add(activos_superiores);
		
		btn_agregar_activo_superior = new JButton("Agregar ->");
		btn_agregar_activo_superior.setSize(btn_tamanyo);
		btn_agregar_activo_superior.setLocation(300,100);
		panel_tab_Activos_superiores.add(btn_agregar_activo_superior);
		
		btn_desagregar_activo_superior = new JButton("<- Desagregar");
		btn_desagregar_activo_superior.setSize(btn_tamanyo);
		btn_desagregar_activo_superior.setLocation(380,180);
		panel_tab_Activos_superiores.add(btn_desagregar_activo_superior);
			
		activos_inferiores = new JList<String>();
		activos_inferiores.setBounds(620, 50, 200, 200);
		panel_tab_Activos_inferiores.add(activos_inferiores);
		
		btn_agregar_activo_inferior = new JButton("Agregar ->");
		btn_agregar_activo_inferior.setSize(btn_tamanyo);
		btn_agregar_activo_inferior.setLocation(300,100);
		panel_tab_Activos_inferiores.add(btn_agregar_activo_inferior);
		
		btn_desagregar_activo_inferior = new JButton("<- Desagregar");
		btn_desagregar_activo_inferior.setSize(btn_tamanyo);
		btn_desagregar_activo_inferior.setLocation(380,180);
		panel_tab_Activos_inferiores.add(btn_desagregar_activo_inferior);

	}

	public JSpinner getTb_economico() {
		return tb_economico;
	}

	public JComboBox<String> getNivel_valor() {
		return nivel_valor;
	}

	public JComboBox<String> getCriterio_1() {
		return criterio_1;
	}

	public JComboBox<String> getCriterio_2() {
		return criterio_2;
	}

	public JComboBox<String> getCriterio_3() {
		return criterio_3;
	}

	public JComboBox<String> getCriterio_4() {
		return criterio_4;
	}

	public JComboBox<String> getCriterio_5() {
		return criterio_5;
	}

	public JComboBox<String> getCriterio_6() {
		return criterio_6;
	}

	public JComboBox<String> getCriterio_7() {
		return criterio_7;
	}

	public JComboBox<String> getCriterio_8() {
		return criterio_8;
	}

	public JComboBox<String> getCriterio_9() {
		return criterio_9;
	}

	public JComboBox<String> getCriterio_10() {
		return criterio_10;
	}

	public JComboBox<String> getCriterio_11() {
		return criterio_11;
	}

	public JComboBox<String> getCriterio_12() {
		return criterio_12;
	}

	public JComboBox<String> getCriterio_13() {
		return criterio_13;
	}

	public JList<String> get_activos_superiores() {
		return activos_superiores;
	}

	public JButton getBtn_agregar_activo_superior() {
		return btn_agregar_activo_superior;
	}

	public JButton getBtn_desagregar_activo_superior() {
		return btn_desagregar_activo_superior;
	}

	public JList<String> get_activos_inferiores() {
		return activos_inferiores;
	}

	public JButton getBtn_agregar_activo_inferior() {
		return btn_agregar_activo_inferior;
	}

	public JButton getBtn_desagregar_activo_inferior() {
		return btn_desagregar_activo_inferior;
	}
	

}
