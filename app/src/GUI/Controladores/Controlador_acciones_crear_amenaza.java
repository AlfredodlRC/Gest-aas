package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_amenaza;
import aplicacion.Principal;

public class Controlador_acciones_crear_amenaza implements ActionListener, ItemListener {

	private Ventana_crear_amenaza ventana;
	
	

	public Controlador_acciones_crear_amenaza(Ventana_crear_amenaza ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_crear_amenaza();
		}
		if (e.getSource() == ventana.getBtn_accion()) { 
			crear_amenaza();
		}

	}

	private void crear_amenaza() {
		String resultado_crear = "";

			resultado_crear = Principal.logica.crear_amenaza(ventana.getAmenaza());
	
		if (resultado_crear.isEmpty() == true) {
			Principal.gestor_ventanas.desactivar_ventana_crear_amenaza();
		} else {
			JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_crear,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
		}
	}
}
