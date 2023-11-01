package GUI.Ventanas.Herencia;

import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Panel_activo_visualizacion extends Panel_activo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4754313472310009701L;

	private JTextField tb_economico;
	private JTextField nivel_valor;
	private JTextField criterio_1;
	private JTextField criterio_2;
	private JTextField criterio_3;
	private JTextField criterio_4;
	private JTextField criterio_5;
	private JTextField criterio_6;
	private JTextField criterio_7;
	private JTextField criterio_8;
	private JTextField criterio_9;
	private JTextField criterio_10;
	private JTextField criterio_11;
	private JTextField criterio_12;
	private JTextField criterio_13;
	
	public Panel_activo_visualizacion() {
		super();
		
		establecer_componentes_visualizacion();
	}
	
	private void establecer_componentes_visualizacion() {

		Dimension lbl_tamanyo = new Dimension(100,30);
		
		this.activos_superiores.setSize(350, 120);
		this.activos_inferiores.setSize(350, 120);
		
		tb_economico = new JTextField();
		tb_economico.setSize(lbl_tamanyo);
		tb_economico.setLocation(10,50);
		add(tb_economico);

		nivel_valor = new JTextField();
		nivel_valor.setSize(lbl_tamanyo);
		nivel_valor.setLocation(10,110);
		add(nivel_valor);

		criterio_1 = new JTextField();
		criterio_1.setSize(lbl_tamanyo);
		criterio_1.setLocation(120,50);
		add(criterio_1);

		criterio_2 = new JTextField();
		criterio_2.setSize(lbl_tamanyo);
		criterio_2.setLocation(230,50);
		add(criterio_2);

		criterio_3 = new JTextField();
		criterio_3.setSize(lbl_tamanyo);
		criterio_3.setLocation(340,50);
		add(criterio_3);

		criterio_4 = new JTextField();
		criterio_4.setSize(lbl_tamanyo);
		criterio_4.setLocation(450,50);
		add(criterio_4);

		criterio_5 = new JTextField();
		criterio_5.setSize(lbl_tamanyo);
		criterio_5.setLocation(560,50);
		add(criterio_5);

		criterio_6 = new JTextField();
		criterio_6.setSize(lbl_tamanyo);
		criterio_6.setLocation(670,50);
		add(criterio_6);

		criterio_7 = new JTextField();
		criterio_7.setSize(lbl_tamanyo);
		criterio_7.setLocation(780,50);
		add(criterio_7);

		criterio_8 = new JTextField();
		criterio_8.setSize(lbl_tamanyo);
		criterio_8.setLocation(170,110);
		add(criterio_8);

		criterio_9 = new JTextField();
		criterio_9.setSize(lbl_tamanyo);
		criterio_9.setLocation(280,110);
		add(criterio_9);

		criterio_10 = new JTextField();
		criterio_10.setSize(lbl_tamanyo);
		criterio_10.setLocation(390,110);
		add(criterio_10);

		criterio_11 = new JTextField();
		criterio_11.setSize(lbl_tamanyo);
		criterio_11.setLocation(500,110);
		add(criterio_11);

		criterio_12 = new JTextField();
		criterio_12.setSize(lbl_tamanyo);
		criterio_12.setLocation(610,110);
		add(criterio_12);

		criterio_13 = new JTextField();
		criterio_13.setSize(lbl_tamanyo);
		criterio_13.setLocation(720,110);
		add(criterio_13);

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
