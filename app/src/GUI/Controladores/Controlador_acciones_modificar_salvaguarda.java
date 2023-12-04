package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_modificar_salvaguarda;
import aplicacion.Principal;

public class Controlador_acciones_modificar_salvaguarda implements ActionListener, ItemListener  {

	private Ventana_modificar_salvaguarda ventana;

	public Controlador_acciones_modificar_salvaguarda(Ventana_modificar_salvaguarda ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtn_cancelar()) { Principal.gestor_ventanas.desactivar_ventana_modificar_salvaguarda();}
		if (e.getSource() == ventana.getBtn_accion()) { modificar_salvaguarda(); }
		if (e.getSource() == ventana.getBtn_guardar_eficiencia_activo()) { guardar_eficiencia_activo(); }
		if (e.getSource() == ventana.getBtn_guardar_eficiencia_amenaza()) { guargar_eficiencia_amenaza(); }
		if (e.getSource() == ventana.getBtn_eliminar_eficiencia_activo()) { eliminar_eficiencia_activo();}
		if (e.getSource() == ventana.getBtn_eliminar_eficiencia_amenaza()) { eliminar_eficiencia_amenaza(); }
		
	}

	private void modificar_salvaguarda() { 
		String resultado_crear = "";

		resultado_crear = Principal.logica.modificar_salvaguarda_actual(ventana.getCodigo_original(), ventana.getSalvaguarda());

		if (resultado_crear.isEmpty() == true) {
			Principal.logica.recoger_datos();
			Principal.gestor_ventanas.desactivar_ventana_modificar_salvaguarda();
		} else {
			JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_crear,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
		}
	}
	private void guardar_eficiencia_activo() { }
	private void guargar_eficiencia_amenaza() { }
	private void eliminar_eficiencia_activo() { }
	private void eliminar_eficiencia_amenaza() { }
	
}
