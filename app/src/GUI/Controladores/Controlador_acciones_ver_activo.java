package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Ventanas.ventanas.Ventana_ver_activo;
import aplicacion.Principal;

/**
 * 
 */
public class Controlador_acciones_ver_activo implements ActionListener {

	/**
	 * 
	 */
	private Ventana_ver_activo ventana;

	/**
	 * 
	 */
	public Controlador_acciones_ver_activo(Ventana_ver_activo ventana) {
		super();
		this.ventana = ventana;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_ver_activo(); }
		if (e.getSource() == ventana.getBtn_accion()) { Principal.gestor_ventanas.desactivar_ventana_ver_activo(); }
	}


	
	
}
