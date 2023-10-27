package GUI.Ventanas.Herencia;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
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

	
	private JComboBox<String> cb_activo_superior;
	private JButton btn_agregar_activo_superior;
	private JButton btn_desagregar_activo_superior;
		
	private JComboBox<String> cb_activo_inferior;
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
		add(tb_economico);

		nivel_valor = new JComboBox<String>();
		nivel_valor.setSize(lbl_tamanyo);
		nivel_valor.setLocation(10,110);
		add(nivel_valor);

		criterio_1 = new JComboBox<String>();
		criterio_1.setSize(lbl_tamanyo);
		criterio_1.setLocation(120,50);
		add(criterio_1);

		criterio_2 = new JComboBox<String>();
		criterio_2.setSize(lbl_tamanyo);
		criterio_2.setLocation(230,50);
		add(criterio_2);

		criterio_3 = new JComboBox<String>();
		criterio_3.setSize(lbl_tamanyo);
		criterio_3.setLocation(340,50);
		add(criterio_3);

		criterio_4 = new JComboBox<String>();
		criterio_4.setSize(lbl_tamanyo);
		criterio_4.setLocation(450,50);
		add(criterio_4);

		criterio_5 = new JComboBox<String>();
		criterio_5.setSize(lbl_tamanyo);
		criterio_5.setLocation(560,50);
		add(criterio_5);

		criterio_6 = new JComboBox<String>();
		criterio_6.setSize(lbl_tamanyo);
		criterio_6.setLocation(670,50);
		add(criterio_6);

		criterio_7 = new JComboBox<String>();
		criterio_7.setSize(lbl_tamanyo);
		criterio_7.setLocation(780,50);
		add(criterio_7);

		criterio_8 = new JComboBox<String>();
		criterio_8.setSize(lbl_tamanyo);
		criterio_8.setLocation(170,110);
		add(criterio_8);

		criterio_9 = new JComboBox<String>();
		criterio_9.setSize(lbl_tamanyo);
		criterio_9.setLocation(280,110);
		add(criterio_9);

		criterio_10 = new JComboBox<String>();
		criterio_10.setSize(lbl_tamanyo);
		criterio_10.setLocation(390,110);
		add(criterio_10);

		criterio_11 = new JComboBox<String>();
		criterio_11.setSize(lbl_tamanyo);
		criterio_11.setLocation(500,110);
		add(criterio_11);

		criterio_12 = new JComboBox<String>();
		criterio_12.setSize(lbl_tamanyo);
		criterio_12.setLocation(610,110);
		add(criterio_12);

		criterio_13 = new JComboBox<String>();
		criterio_13.setSize(lbl_tamanyo);
		criterio_13.setLocation(720,110);
		add(criterio_13);
		
		
		cb_activo_superior = new JComboBox<String>();
		cb_activo_superior.setSize(btn_tamanyo);
		cb_activo_superior.setLocation(330,170);
		add(cb_activo_superior);
		
		btn_agregar_activo_superior = new JButton("Agregar");
		btn_agregar_activo_superior.setSize(btn_tamanyo);
		btn_agregar_activo_superior.setLocation(330,205);
		add(btn_agregar_activo_superior);
		
		btn_desagregar_activo_superior = new JButton("Desagregar");
		btn_desagregar_activo_superior.setSize(btn_tamanyo);
		btn_desagregar_activo_superior.setLocation(330,240);
		add(btn_desagregar_activo_superior);
			
		cb_activo_inferior = new JComboBox<String>();
		cb_activo_inferior.setSize(btn_tamanyo);
		cb_activo_inferior.setLocation(720,170);
		add(cb_activo_inferior);
		
		btn_agregar_activo_inferior = new JButton("Agregar");
		btn_agregar_activo_inferior.setSize(btn_tamanyo);
		btn_agregar_activo_inferior.setLocation(720,205);
		add(btn_agregar_activo_inferior);
		
		btn_desagregar_activo_inferior = new JButton("Desagregar");
		btn_desagregar_activo_inferior.setSize(btn_tamanyo);
		btn_desagregar_activo_inferior.setLocation(720,240);
		add(btn_desagregar_activo_inferior);

	}
	

}
