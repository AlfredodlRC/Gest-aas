package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_modificar_amenaza;
import GUI.Ventanas.Herencia.Panel_amenaza_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Salvaguarda_pojo;

public class Ventana_modificar_amenaza extends Ventana_modificar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2110111460465951492L;
	
	private Panel_amenaza_manipulacion panel_datos;

	private String codigo_original;
	
	Amenaza_pojo amenaza;
	
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
	}

	public void establecerManejador(Controlador_acciones_modificar_amenaza manejador) {
		btn_accion.addActionListener(manejador);
		btn_cancelar.addActionListener(manejador);
	}
	

	public void cargar_datos() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		cargar_lista_datos();
		
		tb_codigo.setText(Principal.logica.get_amenaza_actual().getCodigo());
		tb_nombre.setText(Principal.logica.get_amenaza_actual().getNombre());		
		tb_descripcion.setText(Principal.logica.get_amenaza_actual().getDescripcion());
		texto_fecha = fmt.format(Principal.logica.get_amenaza_actual().getFecha_creacion().getTime());
		tb_fecha.setText(texto_fecha);
		
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
	
	public JList<String> getActivos_afectados() {
		return panel_datos.getActivos_afectados();
	}

	public JSpinner getTb_degradacion_valor() {
		return panel_datos.getTb_degradacion_valor();
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return panel_datos.getTb_degradacion_fecuencia();
	}

	public JList<String> getSalvaguardas_afectan() {
		return panel_datos.getSalvaguardas_afectan();
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

	public JComboBox<String> getCb_activos() {
		return panel_datos.getCb_activos();
	}

	public JButton getBtn_valorar_eficiencia() {
		return panel_datos.getBtn_valorar_degradacion();
	}

	public JComboBox<String> getCb_salvaguardas() {
		return panel_datos.getCb_salvaguardas();
	}

	public String getCodigo_original() {
		return codigo_original;
	}

	public Amenaza_pojo getAmenaza_vacio() {
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
