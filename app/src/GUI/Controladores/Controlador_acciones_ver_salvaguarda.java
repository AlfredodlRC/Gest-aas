package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import GUI.Ventanas.ventanas.Ventana_ver_salvaguarda;
import aplicacion.Principal;

public class Controlador_acciones_ver_salvaguarda implements ActionListener, ItemListener  {

	private Ventana_ver_salvaguarda ventana;

	public Controlador_acciones_ver_salvaguarda(Ventana_ver_salvaguarda ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ventana.getBtn_accion()) { Principal.gestor_ventanas.desactivar_ventana_ver_salvaguarda();}
		if(e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_ver_salvaguarda();}
		
	}
	
	

}
