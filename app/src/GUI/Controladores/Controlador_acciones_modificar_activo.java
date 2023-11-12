package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_modificar_activo;
import aplicacion.Principal;

public class Controlador_acciones_modificar_activo implements ActionListener, ItemListener {

	private Ventana_modificar_activo ventana;

	public Controlador_acciones_modificar_activo(Ventana_modificar_activo ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_modificar;
		
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_modificar_activo(); }
		if (e.getSource() == ventana.getBtn_accion()) { 
			resultado_modificar = Principal.logica.modificar_activo_actual(ventana.getActivo(),ventana.getCodigo_original());
			if (resultado_modificar.isEmpty() == true) {
				Principal.gestor_ventanas.desactivar_ventana_modificar_activo();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_modificar,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
			}
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}	
	

}
