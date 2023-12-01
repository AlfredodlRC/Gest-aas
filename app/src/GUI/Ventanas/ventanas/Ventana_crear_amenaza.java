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

import GUI.Controladores.Controlador_acciones_crear_amenaza;
import GUI.Ventanas.Herencia.Panel_amenaza_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;
import aplicacion.Principal;
import datos.POJOS.Amenaza_pojo;

public class Ventana_crear_amenaza extends Ventana_crear {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146255165341114903L;
	
	private Panel_amenaza_manipulacion panel_datos;
	
	private Amenaza_pojo amenaza;

	private DefaultListModel<String> dlm_activos; 
	private DefaultListModel<String> dlm_salvaguardas; 
	private List<DefaultListModel<String>> lista_dlm_activos_salvaguardas; 
	private DefaultTableModel tabla_degradaciones;
	private DefaultTableModel tabla_eficiencias;


	public Ventana_crear_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "crear";
		
		amenaza= new Amenaza_pojo();


		btn_accion.setText(accion);

		setTitle("Gestor AAS - crear amenaza");
		panel_datos = new Panel_amenaza_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);		

		dlm_activos = new DefaultListModel<String>(); 
		dlm_salvaguardas = new DefaultListModel<String>(); 
		lista_dlm_activos_salvaguardas = new ArrayList<DefaultListModel<String>>();
		
		tabla_degradaciones = new DefaultTableModel();
		tabla_eficiencias = new DefaultTableModel();
		
		cargar_datos();

		this.getActivos().setModel(dlm_activos);
		this.getSalvaguardas().setModel(dlm_salvaguardas);
		if (lista_dlm_activos_salvaguardas.size()>0) {
			this.panel_datos.getActivos_salvaguardas().setModel(lista_dlm_activos_salvaguardas.get(0));
		}
		
		this.getActivos().setSelectedIndex(0);
		this.getSalvaguardas().setSelectedIndex(0);		
		this.getActivos_salvaguardas().setSelectedIndex(0);

		this.getDegradaciones().setModel(tabla_degradaciones);
		this.getEficiencias().setModel(tabla_eficiencias);

		

}
	
	public void establecerManejador(Controlador_acciones_crear_amenaza manejador) {
		this.btn_accion.addActionListener(manejador);
		this.btn_cancelar.addActionListener(manejador);
		this.panel_datos.getBtn_valorar_degradacion().addActionListener(manejador);
		this.panel_datos.getBtn_valorar_eficiencia().addActionListener(manejador);
		this.panel_datos.getBtn_quitar_degradacion().addActionListener(manejador);
		this.panel_datos.getBtn_quitar_eficiencia().addActionListener(manejador);
		this.getSalvaguardas().addListSelectionListener(manejador);
	}
	
	public void cargar_datos() {
		Amenaza_pojo amenaza = new Amenaza_pojo();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format(amenaza.getFecha_creacion().getTime());
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		cargar_lista_datos();
		
		tb_codigo.setText("Introduzca un código");
		tb_nombre.setText("Introduzca un nombre");		
		tb_descripcion.setText("Introduzca una descripción");
		tb_fecha.setText(texto_fecha);
		
	}
	
	public void cargar_lista_datos() {
		String codigo;
		List<String> lista_activos;
		List<String> lista_salvaguardas;
		DefaultListModel<String> nuevo_dlm; 

		
		this.cb_tipo.removeAllItems();
		for(String elemento: Principal.logica.coger_lista_tipo_amenazas()) {
			this.cb_tipo.addItem(elemento); 
		}
		this.cb_tipo.setSelectedIndex(0);
		
		//dlm_activos = new DefaultListModel<String>();
		dlm_activos.removeAllElements();
		codigo = Principal.logica.coger_codigo_nombre(this.cb_tipo.getSelectedItem().toString());
		lista_activos = Principal.gestor_base_datos.coger_lista_activos_tipo_amenaza(codigo);
		for(String elemento: lista_activos) {
			dlm_activos.addElement(elemento);
		}

		//dlm_salvaguardas = new DefaultListModel<String>();
		dlm_salvaguardas.removeAllElements();
		lista_salvaguardas = Principal.logica.coger_lista_salvaguardas();
		for(String elemento: lista_salvaguardas) {
			dlm_salvaguardas.addElement(elemento);
	
		}
		// lista de dlm de activos -salvaguarda
		lista_dlm_activos_salvaguardas.clear();
		for(String elemento_salvaguardas: lista_salvaguardas) {
			nuevo_dlm = new DefaultListModel<String>();
			lista_dlm_activos_salvaguardas.add(nuevo_dlm);
		}
		
		
		if (this.tabla_degradaciones.getColumnCount()==0) {
			this.tabla_degradaciones.addColumn("activo");
			this.tabla_degradaciones.addColumn("degradación");
			this.tabla_degradaciones.addColumn("frecuencia");
		} else {
			this.getDegradaciones().removeAll();
			while (this.tabla_degradaciones.getRowCount()>0) {
				this.tabla_degradaciones.removeRow(0);
			}
		}

		if (this.tabla_eficiencias.getColumnCount()==0) {
			this.tabla_eficiencias.addColumn("salvaguarda");
			this.tabla_eficiencias.addColumn("activo");
			this.tabla_eficiencias.addColumn("eficiencia");
			this.tabla_eficiencias.addColumn("efic. frecuencia");
		} else {
			this.getEficiencias().removeAll();
			while (this.tabla_eficiencias.getRowCount()>0) {
				this.tabla_eficiencias.removeRow(0);
			}
		}
		this.amenaza.getDegradaciones().clear();
		this.amenaza.getEficiencias().clear();
		

	}

	public Amenaza_pojo getAmenaza_actual() {
		return amenaza;
	}
	
	public Amenaza_pojo getAmenaza() {
		SimpleDateFormat formato;
		String texto_cb;
		
		formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		System.out.println(this.cb_tipo.getSelectedItem());
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());

		System.out.println(texto_cb);
		amenaza.setTipo(texto_cb);
		amenaza.setCodigo(tb_codigo.getText());
		amenaza.setNombre(tb_nombre.getText());
		amenaza.setDescripcion(tb_descripcion.getText());
		try {
			amenaza.setFecha_creacion(formato.parse(this.getTb_fecha().getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amenaza;
	}

	public JList<String> getActivos() {
		return panel_datos.getActivos();
	}

	public JList<String> getSalvaguardas() {
		return panel_datos.getSalvaguardas();
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


	public JSpinner getTb_degradacion_valor() {
		return panel_datos.getTb_degradacion_valor();
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return panel_datos.getTb_degradacion_fecuencia();
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
		return panel_datos.getBtn_valorar_eficiencia();
	}

	public JButton getBtn_quitar_degradacion() {
		return panel_datos.getBtn_quitar_degradacion();
	}

	public JButton getBtn_quitar_eficiencia() {
		return panel_datos.getBtn_quitar_eficiencia();
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

}
