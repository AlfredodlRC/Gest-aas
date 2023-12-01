package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_eliminar_salvaguarda;
import GUI.Ventanas.Herencia.Panel_salvaguarda_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;
import aplicacion.Principal;

public class Ventana_eliminar_salvaguarda extends Ventana_eliminar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8642468843067228697L;

	private Panel_salvaguarda_visualizacion panel_datos;

	public Ventana_eliminar_salvaguarda() {
		super();

		elemento = "salvaguarda";
		accion = "eliminar";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar salvaguarda");
		panel_datos = new Panel_salvaguarda_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
				
	}
	
	public void establecerManejador(Controlador_acciones_eliminar_salvaguarda manejador) {
		this.btn_accion.addActionListener(manejador);
		this.btn_cancelar.addActionListener(manejador);
	}
	
	public void cargar_salvaguarda() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format(Principal.logica.get_salvaguarda_actual().getFecha_creacion().getTime());

		this.tb_tipo.setText(Principal.logica.get_salvaguarda_actual().getCodigo());
		this.tb_nombre.setText(Principal.logica.get_salvaguarda_actual().getNombre());
		this.tb_codigo.setText(Principal.logica.get_salvaguarda_actual().getCodigo());
		this.tb_descripcion.setText(Principal.logica.get_salvaguarda_actual().getDescripcion());
		this.tb_fecha.setText(texto_fecha);
		
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
	
}
