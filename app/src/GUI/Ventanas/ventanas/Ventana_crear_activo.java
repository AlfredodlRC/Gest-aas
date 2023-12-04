package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import GUI.Controladores.Controlador_acciones_crear_activo;
import GUI.Ventanas.Herencia.Panel_activo_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;

public class Ventana_crear_activo extends Ventana_crear {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6745262481224451116L;
	
	private Panel_activo_manipulacion panel_datos;

	DefaultListModel<String> modelo_activos_disponibles_inferiores = new DefaultListModel<>();
	DefaultListModel<String> modelo_activos_disponibles_superiores = new DefaultListModel<>();
	DefaultListModel<String> modelo_activos_inferiores = new DefaultListModel<>();
	DefaultListModel<String> modelo_activos_superiores = new DefaultListModel<>();

	Activo_pojo activo;
	
	public Ventana_crear_activo() {
		super();
		
		elemento = "activo";
		accion = "crear";

		activo = new Activo_pojo();
		
		establecer_componentes_creacion();

		setTitle("Gestor AAS - crear activo");
		
	}
	
	private void establecer_componentes_creacion() {

		btn_accion.setText(accion);

		panel_datos = new Panel_activo_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
		
		this.getActivos_disponibles_inferiores().setModel(modelo_activos_disponibles_inferiores);
		this.getActivos_disponibles_superiores().setModel(modelo_activos_disponibles_superiores);
		this.getActivos_inferiores().setModel(modelo_activos_inferiores);
		this.getActivos_superiores().setModel(modelo_activos_superiores);

	}
	
	public void establecerManejador(Controlador_acciones_crear_activo manejador) {
		btn_accion.addActionListener(manejador);
		btn_cancelar.addActionListener(manejador);
		panel_datos.getBtn_agregar_activo_inferior().addActionListener(manejador);
		panel_datos.getBtn_agregar_activo_superior().addActionListener(manejador);
		panel_datos.getBtn_desagregar_activo_inferior().addActionListener(manejador);
		panel_datos.getBtn_desagregar_activo_superior().addActionListener(manejador);
		panel_datos.getBtn_aceptar_activo_inferior().addActionListener(manejador);
		panel_datos.getBtn_aceptar_activo_superior().addActionListener(manejador);
		panel_datos.getBtn_cancelar_activo_inferior().addActionListener(manejador);
		panel_datos.getBtn_cancelar_activo_superior().addActionListener(manejador);
	}
	
	public void cargar_datos() {
		//Activo_pojo activo = new Activo_pojo();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format( activo.getFecha_creacion().getTime());
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		cargar_lista_datos();
		
		tb_codigo.setText("Introduzca un código");
		tb_nombre.setText("Introduzca un nombre");		
		tb_descripcion.setText("Introduzca una descripción");
		tb_fecha.setText(texto_fecha);
		
		panel_datos.getTb_economico().setValue(5.00);
	}
		
	public void cargar_lista_datos() {
		this.cb_tipo.removeAllItems();
		for(String elemento: Principal.logica.coger_lista_tipo_activos()) {
			this.cb_tipo.addItem(elemento); 
		}

		this.panel_datos.getNivel_valor().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_escala_valor()) {
			this.panel_datos.getNivel_valor().addItem(elemento); 
		}

		this.getCriterio_1().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("pi")) {
			this.getCriterio_1().addItem(elemento);
		}

		this.getCriterio_2().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("lpo")) {
			this.getCriterio_2().addItem(elemento);
		}

		this.getCriterio_3().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("si")) {
			this.getCriterio_3().addItem(elemento);
		}

		this.getCriterio_4().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("cei")) {
			this.getCriterio_4().addItem(elemento);
		}

		this.getCriterio_5().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("da")) {
			this.getCriterio_5().addItem(elemento);
		}

		this.getCriterio_6().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("po")) {
			this.getCriterio_6().addItem(elemento);
		}

		this.getCriterio_7().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("olm")) {
			this.getCriterio_7().addItem(elemento);
		}

		this.getCriterio_8().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("adm")) {
			this.getCriterio_8().addItem(elemento);
		}
		
		this.getCriterio_9().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("lg")) {
			this.getCriterio_9().addItem(elemento);
		}

		this.getCriterio_10().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("crm")) {
			this.getCriterio_10().addItem(elemento);
		}

		this.getCriterio_11().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("rto")) {
			this.getCriterio_11().addItem(elemento);
		}

		this.getCriterio_12().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("ibl nat")) {
			this.getCriterio_12().addItem(elemento);
		}

		this.getCriterio_13().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("ibl ue")) {
			this.getCriterio_13().addItem(elemento);
		}
			
		System.out.println(Principal.logica.coger_lista_activos());
		for(String elemento: Principal.logica.coger_lista_activos()) {
			modelo_activos_disponibles_inferiores.addElement(elemento);
			modelo_activos_disponibles_superiores.addElement(elemento);
		}

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

	public JList<String> getActivos_disponibles_inferiores() {
		return panel_datos.getActivos_disponibles_inferiores();
	}
	
	public JList<String> getActivos_disponibles_superiores() {
		return panel_datos.getActivos_disponibles_superiores();
	}
	
	public JList<String> getActivos_inferiores() {
		return panel_datos.get_activos_inferiores();
	}
	
	public JList<String> getActivos_superiores() {
		return panel_datos.get_activos_superiores();
	}
	
	public JButton getBtn_agregar_activo_superior() {
		return panel_datos.getBtn_agregar_activo_superior();
	}

	public JButton getBtn_desagregar_activo_superior() {
		return panel_datos.getBtn_desagregar_activo_superior();
	}
	
	public JButton getBtn_agregar_activo_inferior() {
		return panel_datos.getBtn_agregar_activo_inferior();
	}

	public JButton getBtn_desagregar_activo_inferior() {
		return panel_datos.getBtn_desagregar_activo_inferior();
	}

	public JSpinner getTB_grado_superior() {
		return panel_datos.getTb_grado_superior();
	}
	
	public JSpinner getTB_grado_inferior() {
		return panel_datos.getTb_grado_inferior();
	}
	
	public JButton getBtn_aceptar_activo_inferior() {
		return panel_datos.getBtn_aceptar_activo_inferior();
	}

	public JButton getBtn_cancelar_activo_inferior() {
		return panel_datos.getBtn_cancelar_activo_inferior();
	}
	
	public JButton getBtn_aceptar_activo_superior() {
		return panel_datos.getBtn_aceptar_activo_superior();
	}

	public JButton getBtn_cancelar_activo_superior() {
		return panel_datos.getBtn_cancelar_activo_superior();
	}
	
	public JPanel get_panel_confirmacion_activo_superior() {
		return panel_datos.get_panel_confirmacion_activo_superior();
	}
	
	public JPanel get_panel_confirmacion_activo_inferior() {
		return panel_datos.get_panel_confirmacion_activo_inferior();
	}


	public DefaultListModel<String> getModelo_activos_disponibles_inferiores() {
		return modelo_activos_disponibles_inferiores;
	}

	public DefaultListModel<String> getModelo_activos_disponibles_superiores() {
		return modelo_activos_disponibles_superiores;
	}

	public DefaultListModel<String> getModelo_activos_inferiores() {
		return modelo_activos_inferiores;
	}

	public DefaultListModel<String> getModelo_activos_superiores() {
		return modelo_activos_superiores;
	}

	public Activo_pojo getActivo_actual() {
		return activo;
	}
	
	public Activo_pojo getActivo() {
		
		String texto_cb;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());
		activo.setTipo(texto_cb);
		activo.setCodigo(this.getTb_codigo().getText());
		activo.setNombre(this.getTb_nombre().getText());
		activo.setDescripcion(this.getTb_descripcion().getText());
		activo.setValor_economico((Double) this.getTb_economico().getValue());
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getNivel_valor().getSelectedItem());
		activo.setNivel_valoracion(texto_cb);
		try {
			activo.setFecha_creacion(formato.parse(this.getTb_fecha().getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_8().getSelectedItem());
		activo.setCriterio_adm(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_4().getSelectedItem());
		activo.setCriterio_cei(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_10().getSelectedItem());
		activo.setCriterio_crm(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_5().getSelectedItem());
		activo.setCriterio_da(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_12().getSelectedItem());
		activo.setCriterio_ibl_national(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_13().getSelectedItem());
		activo.setCriterio_ibl_ue(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_9().getSelectedItem());
		activo.setCriterio_lg(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_2().getSelectedItem());
		activo.setCriterio_lpo(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_7().getSelectedItem());
		activo.setCriterio_olm(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_1().getSelectedItem());
		activo.setCriterio_pi(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_6().getSelectedItem());
		activo.setCriterio_po(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_11().getSelectedItem());
		activo.setCriterio_rto(texto_cb);
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.getCriterio_3().getSelectedItem());
		activo.setCriterio_si(texto_cb);
		
		return activo;
	}

}
