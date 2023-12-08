package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_eliminar_amenaza;
import GUI.Ventanas.Herencia.Panel_amenaza_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;
import aplicacion.Principal;
import datos.POJOS.Amenaza_pojo;

/**
 * 
 */
public class Ventana_eliminar_amenaza extends Ventana_eliminar {

	/**
	 *  Clase destinada a mostrar los datos de la amenaza actual
	 *  Es una clase hija de Ventana_eliminar
	 */
	private static final long serialVersionUID = 8091236811833234491L;
	
	/**
	 * Panel que contiene los componentes con los valores especificos de la amenaza
	 */
	private Panel_amenaza_visualizacion panel_datos;

	/**
	 * Constructor de la clase
	 */
	public Ventana_eliminar_amenaza() {
		super();
		
		elemento = "amenaza";
		accion = "eliminar";
		
		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar amenaza");
		panel_datos = new Panel_amenaza_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_eliminar_amenaza manejador) {		
	    btn_cancelar.addActionListener(manejador);
	    btn_accion.addActionListener(manejador);
	}

	/**
	 * Función encargada de recoger los datos de la amenaza actual
	 */
	public void cargar_amenaza() {
		Amenaza_pojo amenaza = Principal.logica.get_amenaza_actual();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format( amenaza.getFecha_creacion().getTime());
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		tb_codigo.setText(amenaza.getCodigo());
		tb_nombre.setText(amenaza.getNombre());		
		tb_descripcion.setText(amenaza.getDescripcion());
		tb_fecha.setText(texto_fecha);
		tb_tipo.setText(amenaza.getTipo());
	}

	public JList<String> getActivos_afectados() {
		return panel_datos.getActivos();
	}

	public JSpinner getTb_degradacion_valor() {
		return panel_datos.getTb_degradacion_valor();
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return panel_datos.getTb_degradacion_fecuencia();
	}

	public JList<String> getSalvaguardas_afectan() {
		return panel_datos.getSalvaguardas();
	}

	public JSpinner getTb_eficiencia_valor() {
		return panel_datos.getTb_eficiencia_valor();
	}

	public JSpinner getTb_eficiencia_fecuencia() {
		return panel_datos.getTb_eficiencia_fecuencia();
	}


}
