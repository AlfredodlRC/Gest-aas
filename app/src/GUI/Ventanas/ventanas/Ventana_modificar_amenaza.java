package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.Controladores.Controlador_acciones_modificar_amenaza;
import GUI.Ventanas.Herencia.Panel_amenaza_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;
import aplicacion.Principal;
import datos.POJOS.Amenaza_pojo;

public class Ventana_modificar_amenaza extends Ventana_modificar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2110111460465951492L;
	
	private Panel_amenaza_manipulacion panel_datos;

	private String codigo_original;
	
	private Amenaza_pojo amenaza;
	
	private DefaultListModel<String> dlm_activos; 
	private DefaultListModel<String> dlm_salvaguardas; 
	private List<DefaultListModel<String>> lista_dlm_activos_salvaguardas; 
	private DefaultTableModel tabla_degradaciones;
	private DefaultTableModel tabla_eficiencias;
	
	public Ventana_modificar_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "modificar";
		
		codigo_original = Principal.logica.get_amenaza_actual().getCodigo();
		
		amenaza = new Amenaza_pojo();
		
		btn_accion.setText(accion);

		setTitle("Gestor AAS - manipular amenaza");
		panel_datos = new Panel_amenaza_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
		
		cargar_datos();

		this.getActivos().setModel(dlm_activos);
		this.getSalvaguardas().setModel(dlm_salvaguardas);		
		//this.panel_datos.getActivos_salvaguardas().setModel(lista_dlm_activos_salvaguardas.get(0));
		
		this.getActivos().setSelectedIndex(0);
		this.getSalvaguardas().setSelectedIndex(0);		
		this.getActivos_salvaguardas().setSelectedIndex(0);

		this.getDegradaciones().setModel(tabla_degradaciones);
		this.getEficiencias().setModel(tabla_eficiencias);

	}

	
	public void establecerManejador(Controlador_acciones_modificar_amenaza manejador) {
		btn_accion.addActionListener(manejador);
		btn_cancelar.addActionListener(manejador);
	}
	

	public void cargar_datos() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format(Principal.logica.get_amenaza_actual().getFecha_creacion().getTime());

		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		dlm_activos = new DefaultListModel<String>();
		dlm_salvaguardas = new DefaultListModel<String>(); 
		lista_dlm_activos_salvaguardas = new ArrayList<DefaultListModel<String>>(); 
		tabla_degradaciones = new DefaultTableModel();
		tabla_eficiencias = new DefaultTableModel();
		
		cargar_lista_datos();
		
		tb_codigo.setText(Principal.logica.get_amenaza_actual().getCodigo());
		tb_nombre.setText(Principal.logica.get_amenaza_actual().getNombre());		
		tb_descripcion.setText(Principal.logica.get_amenaza_actual().getDescripcion());
		tb_fecha.setText(texto_fecha);
		System.out.println();

		
		System.out.println(Principal.logica.get_amenaza_actual().getTipo());

	}
	
	public void cargar_lista_datos() {

		this.cb_tipo.removeAllItems();
		for(String elemento: Principal.logica.coger_lista_tipo_amenazas()) {
			this.cb_tipo.addItem(elemento);
			if (elemento.contains("("+Principal.logica.get_amenaza_actual().getTipo()+")") == true) {
				this.cb_tipo.setSelectedItem(elemento);
			}
		}
		
	}
	
	public JTable getDegradaciones() {
		return panel_datos.getDegradaciones();
	}
	
	public JList<String> getActivos_salvaguardas() {
		return panel_datos.getActivos_salvaguardas();
	}

	public JTable getEficiencias() {
		return panel_datos.getEficiencias();
	}

	public JList<String> getActivos() {
		return panel_datos.getActivos();
	}

	public JSpinner getTb_degradacion_valor() {
		return panel_datos.getTb_degradacion_valor();
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return panel_datos.getTb_degradacion_fecuencia();
	}

	public JList<String> getSalvaguardas() {
		return panel_datos.getSalvaguardas();
	}

	public JSpinner getTb_eficiencia_valor() {
		return panel_datos.getTb_eficiencia_valor();
	}

	public JSpinner getTb_eficiencia_fecuencia() {
		return panel_datos.getTb_eficiencia_fecuencia();
	}
	
	public JButton getBtn_valorar_degradacion() {
		return panel_datos.getBtn_valorar_degradacion();
	}

	public JButton getBtn_valorar_eficiencia() {
		return panel_datos.getBtn_valorar_degradacion();
	}

	public JButton getBtn_quitar_degradacion() {
		return panel_datos.getBtn_quitar_degradacion();
	}

	public JButton getBtn_quitar_eficiencia() {
		return panel_datos.getBtn_quitar_degradacion();
	}

	
	public String getCodigo_original() {
		return codigo_original;
	}

	public DefaultListModel<String> get_datos_activos() {
		return this.dlm_activos;
	}
	
	public DefaultListModel<String> get_datos_salvaguardas() {
		return this.dlm_salvaguardas;
	}
	
	public DefaultTableModel get_tabla_degradaciones() {
		return this.tabla_degradaciones;
	}
	
	public DefaultTableModel get_tabla_eficiencias() {
		return this.tabla_eficiencias;
	}

	public List<DefaultListModel<String>> get_datos_activos_salvaguarda() {
		return lista_dlm_activos_salvaguardas;
	}


	
	public Amenaza_pojo getAmenaza_actual() {
		return amenaza;
	}
	
	public Amenaza_pojo getAmenaza() {
	
		String texto_cb = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		if (this.cb_tipo.getSelectedIndex()>-1) {
			texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());
		} else {
			texto_cb = Principal.logica.get_amenaza_actual().getTipo();
		}
		
		amenaza.setTipo(texto_cb);
		amenaza.setCodigo(this.getTb_codigo().getText());
		amenaza.setNombre(this.getTb_nombre().getText());
		amenaza.setDescripcion(this.getTb_descripcion().getText());
		
		try {
			amenaza.setFecha_creacion(formato.parse(this.getTb_fecha().getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amenaza;
	}
	
}
