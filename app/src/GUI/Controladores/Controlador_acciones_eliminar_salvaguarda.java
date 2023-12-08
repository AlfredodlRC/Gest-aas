package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_eliminar_salvaguarda;
import aplicacion.Principal;

/**
 * 
 */
public class Controlador_acciones_eliminar_salvaguarda implements ActionListener, ItemListener  {

	/**
	 * 
	 */
	private Ventana_eliminar_salvaguarda ventana;

	/**
	 * 
	 */
	public Controlador_acciones_eliminar_salvaguarda(Ventana_eliminar_salvaguarda ventana) {
		super();
		this.ventana = ventana;
	}

	/**
	 * 
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_eliminar;
		
		if(e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_eliminar_salvaguarda();}
		if(e.getSource() == ventana.getBtn_accion()) { 
			resultado_eliminar = Principal.logica.eliminar_salvaguarda_actual();
			if (resultado_eliminar.isEmpty() == true) {
				Principal.logica.recoger_datos();
				Principal.gestor_ventanas.desactivar_ventana_eliminar_salvaguarda();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_eliminar,"Error al eliminar salvagarda", JOptionPane.ERROR_MESSAGE);	
			}
		}
		
	}

	
}
