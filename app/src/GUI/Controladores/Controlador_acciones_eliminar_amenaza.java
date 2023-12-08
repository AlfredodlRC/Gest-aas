package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_eliminar_amenaza;
import aplicacion.Principal;

/**
 * 
 */
public class Controlador_acciones_eliminar_amenaza implements ActionListener {

	/**
	 * 
	 */
	Ventana_eliminar_amenaza ventana;

	/**
	 * 
	 */
	public Controlador_acciones_eliminar_amenaza(Ventana_eliminar_amenaza ventana) {
		super();
		this.ventana = ventana;
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_eliminar;
		System.out.println(e.getSource());
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_eliminar_amenaza(); }
		if (e.getSource() == ventana.getBtn_accion()) { 
			resultado_eliminar = Principal.logica.eliminar_amenaza_actual();
			if (resultado_eliminar.isEmpty() == true) {
				Principal.logica.recoger_datos();
				Principal.gestor_ventanas.desactivar_ventana_eliminar_amenaza();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_eliminar,"Error al eliminar activo", JOptionPane.ERROR_MESSAGE);	
			}
		}
		
	}
	
}
