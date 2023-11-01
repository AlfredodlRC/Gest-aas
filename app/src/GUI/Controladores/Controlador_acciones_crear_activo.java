package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import GUI.Ventanas.ventanas.Ventana_crear_activo;
import GUI.Ventanas.ventanas.Ventana_principal;

public class Controlador_acciones_crear_activo implements ActionListener, ItemListener {
	
	private Ventana_crear_activo ventana;
	
	public Controlador_acciones_crear_activo(Ventana_crear_activo ventana) {
		this.ventana = ventana;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
