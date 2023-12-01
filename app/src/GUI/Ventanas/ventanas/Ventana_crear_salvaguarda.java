package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_crear_salvaguarda;
import GUI.Ventanas.Herencia.Panel_salvaguarda_manipulacion;
import GUI.Ventanas.Herencia.Ventana_crear;
import aplicacion.Principal;
import datos.POJOS.Salvaguarda_pojo;

public class Ventana_crear_salvaguarda extends Ventana_crear{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3225550956840590330L;

	private Panel_salvaguarda_manipulacion panel_datos;

	private Salvaguarda_pojo salvaguarda;
	
	public Ventana_crear_salvaguarda() {
		super();

		elemento = "salvaguarda";
		accion = "crear";

		salvaguarda= new Salvaguarda_pojo();
		
		btn_accion.setText(accion);

		setTitle("Gestor AAS - crear salvaguarda");
		panel_datos = new Panel_salvaguarda_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}
	
	public void establecerManejador(Controlador_acciones_crear_salvaguarda manejador) {
		btn_accion.addActionListener(manejador);
		btn_cancelar.addActionListener(manejador);
		panel_datos.getBtn_guardar_eficiencia_activo().addActionListener(manejador);
		panel_datos.getBtn_guardar_eficiencia_amenaza().addActionListener(manejador);
		
	}
	
	public void cargar_datos() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format(salvaguarda.getFecha_creacion().getTime());
		
		cargar_lista_datos();
		
		tb_codigo.setText("Introduzca un código");
		tb_nombre.setText("Introduzca un nombre");		
		tb_descripcion.setText("Introduzca una descripción");
		tb_fecha.setText(texto_fecha);
		
	}
		
	public void cargar_lista_datos() {
		this.cb_tipo.removeAllItems();

		for(String elemento: Principal.logica.coger_lista_tipo_salvaguardas()) {
			this.cb_tipo.addItem(elemento); 
		}

	}

	public Panel_salvaguarda_manipulacion getPanel_datos() {
		return panel_datos;
	}

	public JList<String> getCb_amenazas() {
		return panel_datos.getCb_amenazas();
	}

	public JSpinner getTb_eficiencia_valor_activo() {
		return panel_datos.getTb_eficiencia_valor_activo();
	}

	public JSpinner getTb_eficiencia_fecuencia_activo() {
		return panel_datos.getTb_eficiencia_fecuencia_activo();
	}

	public JList<String> getCb_activos() {
		return panel_datos.getCb_activos();
	}

	public JSpinner getTb_eficiencia_valor_amenaza() {
		return panel_datos.getTb_eficiencia_valor_amenaza();
	}

	public JSpinner getTb_eficiencia_fecuencia_amenaza() {
		return panel_datos.getTb_eficiencia_fecuencia_amenaza();
	}

	public JButton getBtn_guardar_eficiencia_activo() {
		return panel_datos.getBtn_guardar_eficiencia_activo();
	}

	public JButton getBtn_guardar_eficiencia_amenaza() {
		return panel_datos.getBtn_guardar_eficiencia_amenaza();
	}

	public JButton getBtn_eliminar_eficiencia_activo() {
		return panel_datos.getBtn_guardar_eficiencia_activo();
	}

	public JButton getBtn_eliminar_eficiencia_amenaza() {
		return panel_datos.getBtn_guardar_eficiencia_amenaza();
	}

	public Salvaguarda_pojo getSalvaguarda_actual() {
		return salvaguarda;
	}

	public Salvaguarda_pojo getSalvaguarda() {
		String texto_cb;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());
		salvaguarda.setTipo(texto_cb);
		salvaguarda.setCodigo(this.getTb_codigo().getText());
		salvaguarda.setNombre(this.getTb_nombre().getText());
		salvaguarda.setDescripcion(this.getTb_descripcion().getText());
		try {
			salvaguarda.setFecha_creacion(formato.parse(this.getTb_fecha().getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salvaguarda;
	}


	

}
