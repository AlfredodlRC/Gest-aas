package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_crear_amenaza;
import GUI.Ventanas.Herencia.Panel_amenaza_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;

public class Ventana_crear_amenaza extends Ventana_crear {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146255165341114903L;
	
	private Panel_amenaza_manipulacion panel_datos;
	
	public Ventana_crear_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "crear";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - crear amenaza");
		panel_datos = new Panel_amenaza_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);		
	}
	
	public void establecerManejador(Controlador_acciones_crear_amenaza manejador) {
		this.btn_accion.addActionListener(manejador);
		this.btn_cancelar.addActionListener(manejador);
		this.panel_datos.getBtn_valorar_degradacion().addActionListener(manejador);
		this.panel_datos.getBtn_valorar_eficiencia().addActionListener(manejador);
	}
	
	public void cargar_datos() {
		Activo_pojo activo = new Activo_pojo();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format( activo.getFecha_creacion().getTime());
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		cargar_lista_datos();
		
		tb_codigo.setText("Introduzca un código");
		tb_nombre.setText("Introduzca un nombre");		
		tb_descripcion.setText("Introduzca una descripción");
		tb_fecha.setText(texto_fecha);
	}
	
	public void cargar_lista_datos() {
		this.cb_tipo.removeAllItems();
		for(String elemento: Principal.logica.coger_lista_tipo_amenazas()) {
			this.cb_tipo.addItem(elemento); 
		}
		
	}
	
	public Amenaza_pojo getAmenaza() {
		Amenaza_pojo amenaza = new Amenaza_pojo();
		SimpleDateFormat formato;
		String texto_cb;
		
		formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		System.out.println(this.cb_tipo.getSelectedItem());
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());
		System.out.println();

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
		System.out.println(amenaza);
		return amenaza;
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


}
