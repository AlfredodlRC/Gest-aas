package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_activo;
import GUI.Ventanas.ventanas.Ventana_principal;
import aplicacion.Principal;

public class Controlador_acciones_crear_activo implements ActionListener, ItemListener {
	
	private Ventana_crear_activo ventana;
	
	public Controlador_acciones_crear_activo(Ventana_crear_activo ventana) {
		this.ventana = ventana;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_crear;
		
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_crear_activo(); }
		if (e.getSource() == ventana.getBtn_accion()) { 
			resultado_crear = Principal.logica.crear_activo(ventana.getActivo());
			if (resultado_crear.isEmpty() == true) {
				Principal.gestor_ventanas.desactivar_ventana_crear_activo();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_crear,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
			}
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
