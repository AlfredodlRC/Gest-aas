package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import GUI.Ventanas.ventanas.Ventana_ver_amenaza;
import aplicacion.Principal;

public class Controlador_acciones_ver_amenaza  implements ActionListener {

	Ventana_ver_amenaza ventana;

	public Controlador_acciones_ver_amenaza(Ventana_ver_amenaza ventana_ver_amenaza) {
		super();
		this.ventana = ventana_ver_amenaza;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_ver_amenaza(); }
		if (e.getSource() == ventana.getBtn_accion()) { Principal.gestor_ventanas.desactivar_ventana_ver_amenaza(); }
		
	}
	
	 
}
