package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_activo;
import GUI.Ventanas.ventanas.Ventana_principal;
import aplicacion.Principal;
import datos.POJOS.Relacion_activos;

public class Controlador_acciones_crear_activo implements ActionListener, ItemListener {
	
	private Ventana_crear_activo ventana;
	
	public Controlador_acciones_crear_activo(Ventana_crear_activo ventana) {
		this.ventana = ventana;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_crear;
		
		if (e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_crear_activo();
		}
		if (e.getSource() == ventana.getBtn_accion()) { 
			crear_activo();
		}
		if (e.getSource() == ventana.getBtn_agregar_activo_inferior()) {
			agregar_activo_inferior();
		}
		if (e.getSource() == ventana.getBtn_desagregar_activo_inferior()) {
			desagregar_activo_inferior();
		}
		if (e.getSource() == ventana.getBtn_agregar_activo_superior()) { 
			agregar_activo_superior();
		}
		if (e.getSource() == ventana.getBtn_desagregar_activo_superior()) {
			desagregar_activo_superior();
		}
		if (e.getSource() == ventana.getBtn_aceptar_activo_inferior()) {
			aceptar_activo_inferior();
		}
		if (e.getSource() == ventana.getBtn_cancelar_activo_inferior()) {
			cancelar_activo_inferior();
		}
		if (e.getSource() == ventana.getBtn_aceptar_activo_superior()) {
			aceptar_activo_superior();
		}
		if (e.getSource() == ventana.getBtn_cancelar_activo_superior()) {
			cancelar_activo_superior();
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	private void crear_activo() {
		
		String resultado_crear = "";

  			resultado_crear = Principal.logica.crear_activo(ventana.getActivo());
		
			if (resultado_crear.isEmpty() == true) {
				Principal.gestor_ventanas.desactivar_ventana_crear_activo();
			} else {
				JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_crear,"Error al crear activo", JOptionPane.ERROR_MESSAGE);	
			}
			
	}

	private void agregar_activo_inferior() { 
		ventana.get_panel_confirmacion_activo_inferior().setVisible(true);
	}

	private void desagregar_activo_inferior() {
		String valor;
		int indice = -1;

		valor = ventana.getActivos_inferiores().getSelectedValue();
		
		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		for(Relacion_activos elemento: ventana.getActivo_vacio().getLista_activos_inferiores()) {
			if (elemento.getActivo_inferior() == valor) {
				indice = ventana.getActivo_vacio().getLista_activos_inferiores().indexOf(elemento);
			}
		}
		ventana.getActivo_vacio().getLista_activos_superiores().remove(indice);

		ventana.getModelo_activos_inferiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().addElement(valor);
		ventana.getModelo_activos_disponibles_superiores().addElement(valor);

		ventana.get_panel_confirmacion_activo_inferior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
	}
	
	private void agregar_activo_superior() { 
		ventana.get_panel_confirmacion_activo_superior().setVisible(true);
	}
	
	private void desagregar_activo_superior() {
		String valor;
		int indice = -1;
		
		valor = ventana.getActivos_superiores().getSelectedValue();
		
		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		for(Relacion_activos elemento: ventana.getActivo_vacio().getLista_activos_superiores()) {
			if (elemento.getActivo_inferior() == valor) {
				indice = ventana.getActivo_vacio().getLista_activos_superiores().indexOf(elemento);
			}
		}
		ventana.getActivo_vacio().getLista_activos_superiores().remove(indice);


		ventana.getModelo_activos_superiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().addElement(valor);
		ventana.getModelo_activos_disponibles_superiores().addElement(valor);
		
		ventana.get_panel_confirmacion_activo_superior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
		
	}
	
	private void aceptar_activo_inferior() {
		String valor;
		Relacion_activos nueva_relacion;
		
		valor = ventana.getActivos_disponibles_inferiores().getSelectedValue();
		
		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		nueva_relacion = new Relacion_activos();
		nueva_relacion.setActivo_inferior(valor);
		nueva_relacion.setActivo_superior(null);
		nueva_relacion.setGrado((Double) ventana.getTB_grado_inferior().getValue());
		ventana.getActivo_vacio().getLista_activos_inferiores().add(nueva_relacion);

		ventana.getModelo_activos_inferiores().addElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_superiores().removeElement(valor);

		ventana.get_panel_confirmacion_activo_inferior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
	}
	
	private void cancelar_activo_inferior() {
		ventana.get_panel_confirmacion_activo_inferior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
	}
	
	private void aceptar_activo_superior() {
		
		String valor;
		Relacion_activos nueva_relacion;
		
		valor = ventana.getActivos_disponibles_superiores().getSelectedValue();
		
		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		nueva_relacion = new Relacion_activos();
		nueva_relacion.setActivo_inferior(null);
		nueva_relacion.setActivo_superior(valor);
		nueva_relacion.setGrado((Double) ventana.getTB_grado_superior().getValue());
		ventana.getActivo_vacio().getLista_activos_superiores().add(nueva_relacion);

		ventana.getModelo_activos_superiores().addElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_superiores().removeElement(valor);

		ventana.get_panel_confirmacion_activo_superior().setVisible(false);
		ventana.getTB_grado_superior().setValue(0.5);
	}
	
	private void cancelar_activo_superior() {
		ventana.get_panel_confirmacion_activo_superior().setVisible(false);
		ventana.getTB_grado_superior().setValue(0.5);
	}

	
	
	
}
