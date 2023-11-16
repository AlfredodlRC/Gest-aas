package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_amenaza;
import GUI.Ventanas.ventanas.Ventana_modificar_amenaza;
import aplicacion.Principal;

public class Controlador_acciones_modificar_amenaza implements ActionListener {

	private Ventana_modificar_amenaza ventana;

	
	
	public Controlador_acciones_modificar_amenaza(Ventana_modificar_amenaza ventana_modificar_amenaza) {
		super();
		this.ventana = ventana_modificar_amenaza;
		System.out.println("++``dfdsaf");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_modificar;
		System.out.println(e.getSource());
		if (e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_modificar_amenaza();
		}
		if (e.getSource() == ventana.getBtn_accion()) { 
			resultado_modificar = Principal.logica.modificar_amenaza_actual(ventana.getAmenaza(),ventana.getCodigo_original());
			if (resultado_modificar.isEmpty() == true) {
				Principal.gestor_ventanas.desactivar_ventana_modificar_amenaza();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_modificar,"Error al modificar activo", JOptionPane.ERROR_MESSAGE);	
			}
		}
		
	}
	
}
