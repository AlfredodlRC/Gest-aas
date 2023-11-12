package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_listados;
import aplicacion.Principal;

public class Controlador_acciones_listado implements ActionListener{

	private Ventana_listados ventana;

	
	public Controlador_acciones_listado(Ventana_listados ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtn_cerrar()) {
			switch (ventana.getElemento()) {
			case "activo":
				Principal.gestor_ventanas.desactivar_ventana_listado_activos();
				break;
			case "amenaza":
				Principal.gestor_ventanas.desactivar_ventana_listado_amenaza();
				break;
			case "salvaguarda":
				Principal.gestor_ventanas.desactivar_ventana_listado_salvaguarda();
				break;
			default:
				break;
			}

		}

	}

	
}
