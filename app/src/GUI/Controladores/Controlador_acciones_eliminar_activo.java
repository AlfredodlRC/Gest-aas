package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_eliminar_activo;
import aplicacion.Principal;

/**
 * 
 */
public class Controlador_acciones_eliminar_activo implements ActionListener {

	/**
	 * 
	 */
	private Ventana_eliminar_activo ventana;

	/**
	 * 
	 */
	public Controlador_acciones_eliminar_activo(Ventana_eliminar_activo ventana) {
		super();
		this.ventana = ventana;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_eliminar;
		
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_eliminar_activo(); }
		if (e.getSource() == ventana.getBtn_accion()) { 
			resultado_eliminar = Principal.logica.eliminar_activo_actual();
			if (resultado_eliminar.isEmpty() == true) {
				Principal.logica.recoger_datos();
				Principal.gestor_ventanas.desactivar_ventana_eliminar_activo();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_eliminar,"Error al eliminar activo", JOptionPane.ERROR_MESSAGE);	
			}
		}
		
	}


}
