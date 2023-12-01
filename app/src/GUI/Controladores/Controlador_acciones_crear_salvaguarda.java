package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_salvaguarda;
import aplicacion.Principal;

public class Controlador_acciones_crear_salvaguarda implements ActionListener, ItemListener  {

	private Ventana_crear_salvaguarda ventana;

	public Controlador_acciones_crear_salvaguarda(Ventana_crear_salvaguarda ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_crear_salvaguarda();}
		if (e.getSource() == ventana.getBtn_accion()) { crear_salvaguarda(); }
		if (e.getSource() == ventana.getBtn_guardar_eficiencia_activo()) { guardar_eficiencia_activo(); }
		if (e.getSource() == ventana.getBtn_guardar_eficiencia_amenaza()) { guargar_eficiencia_amenaza(); }
		if (e.getSource() == ventana.getBtn_eliminar_eficiencia_activo()) { eliminar_eficiencia_activo();}
		if (e.getSource() == ventana.getBtn_eliminar_eficiencia_amenaza()) { eliminar_eficiencia_amenaza(); }
		
	}

	private void crear_salvaguarda() {
		String resultado_crear = "";

			resultado_crear = Principal.logica.crear_salvaguarda(ventana.getSalvaguarda());
	
		if (resultado_crear.isEmpty() == true) {
			Principal.gestor_ventanas.desactivar_ventana_crear_salvaguarda();
		} else {
			JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_crear,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
		}
	}
	private void guardar_eficiencia_activo() { }
	private void guargar_eficiencia_amenaza() { }
	private void eliminar_eficiencia_activo() { }
	private void eliminar_eficiencia_amenaza() { }

	
}
