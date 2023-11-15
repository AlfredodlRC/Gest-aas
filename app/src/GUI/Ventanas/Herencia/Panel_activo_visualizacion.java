package GUI.Ventanas.Herencia;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Panel_activo_visualizacion extends Panel_activo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4754313472310009701L;

	protected JTextField tb_economico;
	protected JTextField nivel_valor;
	protected JTextField criterio_1;
	protected JTextField criterio_2;
	protected JTextField criterio_3;
	protected JTextField criterio_4;
	protected JTextField criterio_5;
	protected JTextField criterio_6;
	protected JTextField criterio_7;
	protected JTextField criterio_8;
	protected JTextField criterio_9;
	protected JTextField criterio_10;
	protected JTextField criterio_11;
	protected JTextField criterio_12;
	protected JTextField criterio_13;
	
	public Panel_activo_visualizacion() {
		super();
		
		establecer_componentes_visualizacion();
	}
	
	private void establecer_componentes_visualizacion() {

		
		Dimension lbl_tamanyo = new Dimension(100,30);
		Dimension crit_tamanyo = new Dimension(300,30);
		Point pos_criterio_1 = new Point(110,10);
		Point pos_criterio_2 = new Point(110,45);
		Point pos_criterio_3 = new Point(110,80);
		Point pos_criterio_4 = new Point(110,115);
		Point pos_criterio_5 = new Point(110,150);
		Point pos_criterio_6 = new Point(110,185);
		Point pos_criterio_7 = new Point(510,10);
		Point pos_criterio_8 = new Point(510,45);
		Point pos_criterio_9 = new Point(510,80);
		Point pos_criterio_10 = new Point(510,115);
		Point pos_criterio_11 = new Point(510,150);
		Point pos_criterio_12 = new Point(510,185);
		Point pos_criterio_13 = new Point(510,220);

		this.activos_disponibles_superiores.setBounds(20, 20, 400, 230);
		this.activos_disponibles_inferiores.setBounds(20, 20, 400, 230);
		
		tb_economico = new JTextField();
		tb_economico.setSize(lbl_tamanyo);
		tb_economico.setLocation(10,120);
		panel_tab_Valoracion.add(tb_economico);

		nivel_valor = new JTextField();
		nivel_valor.setSize(lbl_tamanyo);
		nivel_valor.setLocation(120,180);
		panel_tab_Valoracion.add(nivel_valor);

		criterio_1 = new JTextField();
		criterio_1.setSize(crit_tamanyo);
		criterio_1.setLocation(pos_criterio_1);
		panel_tab_Criterios.add(criterio_1);

		criterio_2 = new JTextField();
		criterio_2.setSize(crit_tamanyo);
		criterio_2.setLocation(pos_criterio_2);
		panel_tab_Criterios.add(criterio_2);

		criterio_3 = new JTextField();
		criterio_3.setSize(crit_tamanyo);
		criterio_3.setLocation(pos_criterio_3);
		panel_tab_Criterios.add(criterio_3);

		criterio_4 = new JTextField();
		criterio_4.setSize(crit_tamanyo);
		criterio_4.setLocation(pos_criterio_4);
		panel_tab_Criterios.add(criterio_4);

		criterio_5 = new JTextField();
		criterio_5.setSize(crit_tamanyo);
		criterio_5.setLocation(pos_criterio_5);
		panel_tab_Criterios.add(criterio_5);

		criterio_6 = new JTextField();
		criterio_6.setSize(crit_tamanyo);
		criterio_6.setLocation(pos_criterio_6);
		panel_tab_Criterios.add(criterio_6);

		criterio_7 = new JTextField();
		criterio_7.setSize(crit_tamanyo);
		criterio_7.setLocation(pos_criterio_7);
		panel_tab_Criterios.add(criterio_7);

		criterio_8 = new JTextField();
		criterio_8.setSize(crit_tamanyo);
		criterio_8.setLocation(pos_criterio_8);
		panel_tab_Criterios.add(criterio_8);

		criterio_9 = new JTextField();
		criterio_9.setSize(crit_tamanyo);
		criterio_9.setLocation(pos_criterio_9);
		panel_tab_Criterios.add(criterio_9);

		criterio_10 = new JTextField();
		criterio_10.setSize(crit_tamanyo);
		criterio_10.setLocation(pos_criterio_10);
		panel_tab_Criterios.add(criterio_10);

		criterio_11 = new JTextField();
		criterio_11.setSize(crit_tamanyo);
		criterio_11.setLocation(pos_criterio_11);
		panel_tab_Criterios.add(criterio_11);

		criterio_12 = new JTextField();
		criterio_12.setSize(crit_tamanyo);
		criterio_12.setLocation(pos_criterio_12);
		panel_tab_Criterios.add(criterio_12);

		criterio_13 = new JTextField();
		criterio_13.setSize(crit_tamanyo);
		criterio_13.setLocation(pos_criterio_13);
		panel_tab_Criterios.add(criterio_13);

	}

	public JTextField getTb_economico() {
		return tb_economico;
	}

	public JTextField getNivel_valor() {
		return nivel_valor;
	}

	public JTextField getCriterio_1() {
		return criterio_1;
	}

	public JTextField getCriterio_2() {
		return criterio_2;
	}

	public JTextField getCriterio_3() {
		return criterio_3;
	}

	public JTextField getCriterio_4() {
		return criterio_4;
	}

	public JTextField getCriterio_5() {
		return criterio_5;
	}

	public JTextField getCriterio_6() {
		return criterio_6;
	}

	public JTextField getCriterio_7() {
		return criterio_7;
	}

	public JTextField getCriterio_8() {
		return criterio_8;
	}

	public JTextField getCriterio_9() {
		return criterio_9;
	}

	public JTextField getCriterio_10() {
		return criterio_10;
	}

	public JTextField getCriterio_11() {
		return criterio_11;
	}

	public JTextField getCriterio_12() {
		return criterio_12;
	}

	public JTextField getCriterio_13() {
		return criterio_13;
	}

}
