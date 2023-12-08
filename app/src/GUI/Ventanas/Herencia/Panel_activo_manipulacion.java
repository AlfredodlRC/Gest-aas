package GUI.Ventanas.Herencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 * Clase para poder manipular los datos especificos de los activos
 * Hereda de la clase panel_activo
 */
public class Panel_activo_manipulacion extends Panel_activo {

	/**
	 * 
	 */
	 private static final long serialVersionUID = 2117005529478291727L;

	/**
	 * Componente para modificar el valor económico del activo
	 */
	private JSpinner tb_economico;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel de valoración del activo
	 */
	private JComboBox<String> nivel_valor;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_1;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_2;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_3;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_4;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_5;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_6;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_7;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_8;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_9;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_10;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_11;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_12;
	
	/**
	 * Componente tipo combobox para poder seleccionar el nivel del criterio
	 */
	private JComboBox<String> criterio_13;

	
	/**
	 * Componente tipo lista que muestra los activos superiores 
	 */
	private JList<String> activos_superiores;
	
	/**
	 * Componente tipo boton para mostrar el panel para agregar un activo como activo superior del actual 
	 */
	private JButton btn_agregar_activo_superior;
	
	/**
	 * Componente tipo boton para quitar un activo como activo superior del actual
	 */
	private JButton btn_desagregar_activo_superior;
	
	/**
	 * Componente tipo panel para aceptar un activo como superior del actual y su grado de relación
	 */
	private JPanel panel_aceptacion_activo_superior;
	
	/**
	 * Componente tipo numérico para determinar el grado de relación del activo a determinar como activo superior del actual
	 */
	private JSpinner tb_grado_superior;
	
	/**
	 * Componente tipo boton para aceptar un activo como activo superior del actual
	 */
	private JButton btn_aceptar_activo_superior;
	
	/**
	 * Componente tipo boton para cancelar la agregación de un activo como activo superior del actual
	 */
	private JButton btn_cancelar_activo_superior;
	
	/**
	 * Componente tipo lista que muestra los activos inferiores 
	 */
	private JList<String> activos_inferiores;
	
	/**
	 * Componente tipo boton para mostrar el panel para agregar un activo como activo superior del actual 
	 */
	private JButton btn_agregar_activo_inferior;

	/**
	 * Componente tipo boton para quitar un activo como activo inferior del actual
	 */
	private JButton btn_desagregar_activo_inferior;

	/**
	 * Componente tipo panel para aceptar un activo como inferior del actual y su grado de relación
	 */
	private JPanel panel_aceptacion_activo_inferior;
	
	/**
	 * Componente tipo numérico para determinar el grado de relación del activo a determinar como activo inferior del actual
	 */
	private JSpinner tb_grado_inferior;
	
	/**
	 * Componente tipo boton para aceptar un activo como activo inferior del actual
	 */
	private JButton btn_aceptar_activo_inferior;
	
	/**
	 * Componente tipo boton para cancelar la agregación de un activo como activo inferior del actual
	 */
	private JButton btn_cancelar_activo_inferior;

	
	/**
	 * Constructor de la clase
	 */
	public Panel_activo_manipulacion() {
		super();
		establecer_componentes_manipulacion();
	}
	
	/**
	 * 
	 */
	public void establecer_componentes_manipulacion() {
		
		Dimension lbl_tamanyo = new Dimension(100,30);
		Dimension crit_tamanyo = new Dimension(190,30);
		Dimension btn_tamanyo = new Dimension(150,30);
		Dimension cb_tamanyo = new Dimension(200,30);
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

		SpinnerNumberModel spnrModelo1 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo2 = new SpinnerNumberModel(0.5,0,1,0.05);
		SpinnerNumberModel spnrModelo3 = new SpinnerNumberModel(0.5,0,1,0.05);
		
		tb_economico = new JSpinner();
		tb_economico.setSize(lbl_tamanyo);
		tb_economico.setLocation(10,120);
		tb_economico.setModel(spnrModelo1);
		panel_tab_Valoracion.add(tb_economico);

		nivel_valor = new JComboBox<String>();
		nivel_valor.setSize(cb_tamanyo);
		nivel_valor.setLocation(120,180);
		panel_tab_Valoracion.add(nivel_valor);

		criterio_1 = new JComboBox<String>();
		criterio_1.setSize(crit_tamanyo);
		criterio_1.setLocation(pos_criterio_1);
		panel_tab_Criterios.add(criterio_1);

		criterio_2 = new JComboBox<String>();
		criterio_2.setSize(crit_tamanyo);
		criterio_2.setLocation(pos_criterio_2);
		panel_tab_Criterios.add(criterio_2);

		criterio_3 = new JComboBox<String>();
		criterio_3.setSize(crit_tamanyo);
		criterio_3.setLocation(pos_criterio_3);
		panel_tab_Criterios.add(criterio_3);

		criterio_4 = new JComboBox<String>();
		criterio_4.setSize(crit_tamanyo);
		criterio_4.setLocation(pos_criterio_4);
		panel_tab_Criterios.add(criterio_4);

		criterio_5 = new JComboBox<String>();
		criterio_5.setSize(crit_tamanyo);
		criterio_5.setLocation(pos_criterio_5);
		panel_tab_Criterios.add(criterio_5);

		criterio_6 = new JComboBox<String>();
		criterio_6.setSize(crit_tamanyo);
		criterio_6.setLocation(pos_criterio_6);
		panel_tab_Criterios.add(criterio_6);

		criterio_7 = new JComboBox<String>();
		criterio_7.setSize(crit_tamanyo);
		criterio_7.setLocation(pos_criterio_7);
		panel_tab_Criterios.add(criterio_7);

		criterio_8 = new JComboBox<String>();
		criterio_8.setSize(crit_tamanyo);
		criterio_8.setLocation(pos_criterio_8);
		panel_tab_Criterios.add(criterio_8);

		criterio_9 = new JComboBox<String>();
		criterio_9.setSize(crit_tamanyo);
		criterio_9.setLocation(pos_criterio_9);
		panel_tab_Criterios.add(criterio_9);

		criterio_10 = new JComboBox<String>();
		criterio_10.setSize(crit_tamanyo);
		criterio_10.setLocation(pos_criterio_10);
		panel_tab_Criterios.add(criterio_10);

		criterio_11 = new JComboBox<String>();
		criterio_11.setSize(crit_tamanyo);
		criterio_11.setLocation(pos_criterio_11);
		panel_tab_Criterios.add(criterio_11);

		criterio_12 = new JComboBox<String>();
		criterio_12.setSize(crit_tamanyo);
		criterio_12.setLocation(pos_criterio_12);
		panel_tab_Criterios.add(criterio_12);

		criterio_13 = new JComboBox<String>();
		criterio_13.setSize(crit_tamanyo);
		criterio_13.setLocation(pos_criterio_13);
		panel_tab_Criterios.add(criterio_13);
		
		
		activos_superiores = new JList<String>();
		activos_superiores.setBounds(620, 50, 200, 200);
		panel_tab_Activos_superiores.add(activos_superiores);
		
		btn_agregar_activo_superior = new JButton("Agregar ->");
		btn_agregar_activo_superior.setSize(btn_tamanyo);
		btn_agregar_activo_superior.setLocation(250,100);
		panel_tab_Activos_superiores.add(btn_agregar_activo_superior);
		
		btn_desagregar_activo_superior = new JButton("<- Desagregar");
		btn_desagregar_activo_superior.setSize(btn_tamanyo);
		btn_desagregar_activo_superior.setLocation(380,180);
		panel_tab_Activos_superiores.add(btn_desagregar_activo_superior);
			
		
		panel_aceptacion_activo_superior = new JPanel();
		panel_aceptacion_activo_superior.setBounds(420, 50, 180, 120);
		panel_aceptacion_activo_superior.setBackground(Color.LIGHT_GRAY);
		panel_aceptacion_activo_superior.setLayout(null);
		panel_aceptacion_activo_superior.setVisible(false);

		panel_tab_Activos_superiores.add(panel_aceptacion_activo_superior);
			
		tb_grado_superior = new JSpinner();
		tb_grado_superior.setSize(btn_tamanyo);
		tb_grado_superior.setLocation(15,10);
		tb_grado_superior.setModel(spnrModelo2);
		panel_aceptacion_activo_superior.add(tb_grado_superior);

		btn_cancelar_activo_superior = new JButton("Cancelar");
		btn_cancelar_activo_superior.setSize(btn_tamanyo);
		btn_cancelar_activo_superior.setLocation(15,50);
		panel_aceptacion_activo_superior.add(btn_cancelar_activo_superior);

		btn_aceptar_activo_superior = new JButton("Aceptar");
		btn_aceptar_activo_superior.setSize(btn_tamanyo);
		btn_aceptar_activo_superior.setLocation(15,85);
		panel_aceptacion_activo_superior.add(btn_aceptar_activo_superior);

		activos_inferiores = new JList<String>();
		activos_inferiores.setBounds(620, 50, 200, 200);
		panel_tab_Activos_inferiores.add(activos_inferiores);
		
		btn_agregar_activo_inferior = new JButton("Agregar ->");
		btn_agregar_activo_inferior.setSize(btn_tamanyo);
		btn_agregar_activo_inferior.setLocation(250,100);
		panel_tab_Activos_inferiores.add(btn_agregar_activo_inferior);
		
		btn_desagregar_activo_inferior = new JButton("<- Desagregar");
		btn_desagregar_activo_inferior.setSize(btn_tamanyo);
		btn_desagregar_activo_inferior.setLocation(380,180);
		panel_tab_Activos_inferiores.add(btn_desagregar_activo_inferior);

		
		panel_aceptacion_activo_inferior = new JPanel();
		panel_aceptacion_activo_inferior.setBounds(420, 50, 180, 120);
		panel_aceptacion_activo_inferior.setBackground(Color.LIGHT_GRAY);
		panel_aceptacion_activo_inferior.setLayout(null);
		panel_aceptacion_activo_inferior.setVisible(false);

		panel_tab_Activos_inferiores.add(panel_aceptacion_activo_inferior);
			
		tb_grado_inferior = new JSpinner();
		tb_grado_inferior.setSize(btn_tamanyo);
		tb_grado_inferior.setLocation(15,10);
		tb_grado_inferior.setModel(spnrModelo3);
		panel_aceptacion_activo_inferior.add(tb_grado_inferior);

		btn_cancelar_activo_inferior = new JButton("Cancelar");
		btn_cancelar_activo_inferior.setSize(btn_tamanyo);
		btn_cancelar_activo_inferior.setLocation(15,50);
		panel_aceptacion_activo_inferior.add(btn_cancelar_activo_inferior);

		btn_aceptar_activo_inferior = new JButton("Aceptar");
		btn_aceptar_activo_inferior.setSize(btn_tamanyo);
		btn_aceptar_activo_inferior.setLocation(15,85);
		panel_aceptacion_activo_inferior.add(btn_aceptar_activo_inferior);

		
	}

	/**
	 * 
	 */
	public JSpinner getTb_economico() {
		return tb_economico;
	}

	/**
	 * 
	 */
	public JComboBox<String> getNivel_valor() {
		return nivel_valor;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_1() {
		return criterio_1;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_2() {
		return criterio_2;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_3() {
		return criterio_3;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_4() {
		return criterio_4;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_5() {
		return criterio_5;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_6() {
		return criterio_6;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_7() {
		return criterio_7;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_8() {
		return criterio_8;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_9() {
		return criterio_9;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_10() {
		return criterio_10;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_11() {
		return criterio_11;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_12() {
		return criterio_12;
	}

	/**
	 * 
	 */
	public JComboBox<String> getCriterio_13() {
		return criterio_13;
	}

	/**
	 * 
	 */
	public JList<String> get_activos_superiores() {
		return activos_superiores;
	}

	/**
	 * 
	 */
	public JButton getBtn_agregar_activo_superior() {
		return btn_agregar_activo_superior;
	}

	/**
	 * 
	 */
	public JButton getBtn_desagregar_activo_superior() {
		return btn_desagregar_activo_superior;
	}

	/**
	 * 
	 */
	public JList<String> get_activos_inferiores() {
		return activos_inferiores;
	}

	/**
	 * 
	 */
	public JButton getBtn_agregar_activo_inferior() {
		return btn_agregar_activo_inferior;
	}

	/**
	 * 
	 */
	public JButton getBtn_desagregar_activo_inferior() {
		return btn_desagregar_activo_inferior;
	}

	/**
	 * 
	 */
	public JSpinner getTb_grado_superior() {
		return tb_grado_superior;
	}

	/**
	 * 
	 */
	public JButton getBtn_aceptar_activo_superior() {
		return btn_aceptar_activo_superior;
	}

	/**
	 * 
	 */
	public JButton getBtn_cancelar_activo_superior() {
		return btn_cancelar_activo_superior;
	}

	/**
	 * 
	 */
	public JSpinner getTb_grado_inferior() {
		return tb_grado_inferior;
	}

	/**
	 * 
	 */
	public JButton getBtn_aceptar_activo_inferior() {
		return btn_aceptar_activo_inferior;
	}

	/**
	 * 
	 */
	public JButton getBtn_cancelar_activo_inferior() {
		return btn_cancelar_activo_inferior;
	}
	
	/**
	 * 
	 */
	public JPanel get_panel_confirmacion_activo_superior() {
		return panel_aceptacion_activo_superior;
	}
	
	/**
	 * 
	 */
	public JPanel get_panel_confirmacion_activo_inferior() {
		return panel_aceptacion_activo_inferior;
	}

}
