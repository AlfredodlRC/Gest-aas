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

import GUI.Controladores.Controlador_acciones_modificar_activo;
import GUI.Ventanas.Herencia.Panel_activo_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Relacion_activos;

/**
 *  Clase destinada a modificar los datos del activo actual
 *  Es una clase hija de Ventana_modificar
 */
public class Ventana_modificar_activo extends Ventana_modificar {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8916131888468125891L;
	
	/**
	 * Panel que contiene los componentes con los valores especificos del activo
	 */
	private Panel_activo_manipulacion panel_datos;

	/**
	 * 
	 */
	private String codigo_original;

	/**
	 * 
	 */
	private DefaultListModel<String> modelo_activos_disponibles_inferiores = new DefaultListModel<>();

	/**
	 * 
	 */
	private DefaultListModel<String> modelo_activos_disponibles_superiores = new DefaultListModel<>();

	/**
	 * 
	 */
	private DefaultListModel<String> modelo_activos_inferiores = new DefaultListModel<>();

	/**
	 * 
	 */
	private DefaultListModel<String> modelo_activos_superiores = new DefaultListModel<>();

	/**
	 * 
	 */
	private Activo_pojo activo;

	/**
	 * Constructor de la clase
	 */
	public Ventana_modificar_activo() {
		super();

		elemento = "activo";
		accion = "modificar";
		
		codigo_original = Principal.logica.get_activo_actual().getCodigo();

		activo = new Activo_pojo();

		
		btn_accion.setText(accion);

		setTitle("Gestor AAS - manipular activo");
		panel_datos = new Panel_activo_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
		

		this.getActivos_disponibles_inferiores().setModel(modelo_activos_disponibles_inferiores);
		this.getActivos_disponibles_superiores().setModel(modelo_activos_disponibles_superiores);
		this.getActivos_inferiores().setModel(modelo_activos_inferiores);
		this.getActivos_superiores().setModel(modelo_activos_superiores);

	}

	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_modificar_activo manejador) {
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
	
	/**
	 * Función encargada de recoger los datos del activo actual
	 */
	public void cargar_datos() {

		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		cargar_lista_datos();
		
		tb_codigo.setText(Principal.logica.get_activo_actual().getCodigo());
		tb_nombre.setText(Principal.logica.get_activo_actual().getNombre());		
		tb_descripcion.setText(Principal.logica.get_activo_actual().getDescripcion());
		texto_fecha = fmt.format(Principal.logica.get_activo_actual().getFecha_creacion().getTime());
		tb_fecha.setText(texto_fecha);
		
		panel_datos.getTb_economico().setValue(Principal.logica.get_activo_actual().getValor_economico());
		System.out.println(Principal.logica.get_activo_actual().getTipo());
	}
		
	/**
	 * 
	 */
	public void cargar_lista_datos() {

		this.cb_tipo.removeAllItems();
		for(String elemento: Principal.logica.coger_lista_tipo_activos()) {
			this.cb_tipo.addItem(elemento);
			if (elemento.contains("("+Principal.logica.get_activo_actual().getTipo()+")") == true) {
				this.cb_tipo.setSelectedItem(elemento);
			}
		}

		this.panel_datos.getNivel_valor().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_escala_valor()) {
			this.panel_datos.getNivel_valor().addItem(elemento); 
			if (elemento.contains(") "+Principal.logica.get_activo_actual().getNivel_valoracion()) == true) {
				this.panel_datos.getNivel_valor().setSelectedItem(elemento);
			}
		}

		this.getCriterio_1().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("pi")) {
			this.getCriterio_1().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_pi()) == true) {
				this.panel_datos.getCriterio_1().setSelectedItem(elemento);
			}
		}

		this.getCriterio_2().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("lpo")) {
			this.getCriterio_2().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_lpo()) == true) {
				this.panel_datos.getCriterio_2().setSelectedItem(elemento);
			}
		}

		this.getCriterio_3().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("si")) {
			this.getCriterio_3().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_si()) == true) {
				this.panel_datos.getCriterio_3().setSelectedItem(elemento);
				
			}
		}

		this.getCriterio_4().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("cei")) {
			this.getCriterio_4().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_cei()) == true) {
				this.panel_datos.getCriterio_4().setSelectedItem(elemento);
			}
		}

		this.getCriterio_5().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("da")) {
			this.getCriterio_5().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_da()) == true) {
				this.panel_datos.getCriterio_5().setSelectedItem(elemento);
			}
		}

		this.getCriterio_6().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("po")) {
			this.getCriterio_6().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_po()) == true) {
				this.panel_datos.getCriterio_6().setSelectedItem(elemento);
			}
		}

		this.getCriterio_7().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("olm")) {
			this.getCriterio_7().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_olm()) == true) {
				this.panel_datos.getCriterio_7().setSelectedItem(elemento);
			}
		}

		this.getCriterio_8().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("adm")) {
			this.getCriterio_8().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_adm()) == true) {
				this.panel_datos.getCriterio_8().setSelectedItem(elemento);
			}
		}
		
		this.getCriterio_9().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("lg")) {
			this.getCriterio_9().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_lg()) == true) {
				this.panel_datos.getCriterio_9().setSelectedItem(elemento);
			}
		}

		this.getCriterio_10().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("crm")) {
			this.getCriterio_10().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_crm()) == true) {
				this.panel_datos.getCriterio_10().setSelectedItem(elemento);
			}
		}

		this.getCriterio_11().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("rto")) {
			this.getCriterio_11().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_rto()) == true) {
				this.panel_datos.getCriterio_11().setSelectedItem(elemento);
			}

		}

		this.getCriterio_12().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("ibl nat")) {
			this.getCriterio_12().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_ibl_national()) == true) {
				System.out.println(elemento);
				this.panel_datos.getCriterio_12().setSelectedItem(elemento);
			}

		}

		this.getCriterio_13().removeAllItems();
		for(String elemento: Principal.logica.coger_lista_criterio("ibl ue")) {
			this.getCriterio_13().addItem(elemento);
			if (elemento.contains(Principal.logica.get_activo_actual().getCriterio_ibl_ue()) == true) {
				this.panel_datos.getCriterio_13().setSelectedItem(elemento);
			}
		}
		
		
		String codigo_activo = Principal.logica.get_activo_actual().getCodigo();

		modelo_activos_superiores.clear();
		modelo_activos_inferiores.clear();
		modelo_activos_disponibles_inferiores.clear();
		modelo_activos_disponibles_superiores.clear();
		this.getActivo_actual().getLista_activos_superiores().clear();
		this.getActivo_actual().getLista_activos_inferiores().clear();
		
		for(Relacion_activos elemento: Principal.logica.coger_lista_relaciones_activos()) {
			if (elemento.getActivo_superior().equalsIgnoreCase(codigo_activo) == true) {
				for(String activo_elemento: Principal.logica.coger_lista_activos()) {
					if (activo_elemento.contains('(' + elemento.getActivo_superior() + ')') == true) {
						modelo_activos_inferiores.addElement('(' + elemento.getActivo_inferior() + ')');
						this.getActivo_actual().getLista_activos_inferiores().add(elemento);
					}
				}
			}
			if (elemento.getActivo_inferior().equalsIgnoreCase(codigo_activo) == true) {
				for(String activo_elemento: Principal.logica.coger_lista_activos()) {
					if (activo_elemento.contains('(' + elemento.getActivo_inferior() + ')') == true) {
						modelo_activos_superiores.addElement('(' + elemento.getActivo_superior() + ')');
						this.getActivo_actual().getLista_activos_superiores().add(elemento);
					}
				}
			}
			if (elemento.getActivo_superior().equalsIgnoreCase(codigo_activo) == false && 
				elemento.getActivo_inferior().equalsIgnoreCase(codigo_activo) == false) {
				modelo_activos_disponibles_inferiores.addElement('(' + elemento.getActivo_superior() + ')');
				modelo_activos_disponibles_superiores.addElement('(' + elemento.getActivo_superior() + ')');
			}				
			
			
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

	public String getCodigo_original() {
		return codigo_original;
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

	/**
	 * Función que devuelve el estado actual del activo de la ventana
	 */
	public Activo_pojo getActivo_actual() {
		return activo;
	}
	
	/**
	 * Función que devuelve el activo de la ventana con todos los datos
	 */
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
