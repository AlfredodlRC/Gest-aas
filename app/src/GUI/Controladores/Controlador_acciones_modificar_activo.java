package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_modificar_activo;
import aplicacion.Principal;
import datos.POJOS.Relacion_activos;

public class Controlador_acciones_modificar_activo implements ActionListener, ItemListener {

	private Ventana_modificar_activo ventana;

	public Controlador_acciones_modificar_activo(Ventana_modificar_activo ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String resultado_modificar;
		
		if (e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_modificar_activo();
		}
		if (e.getSource() == ventana.getBtn_accion()) { 
			modificar_activo();
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
		
	}	
	
	private void modificar_activo() {

		String resultado_modificar;
		
		resultado_modificar = Principal.logica.modificar_activo_actual(ventana.getActivo(),ventana.getCodigo_original());
		
		if (resultado_modificar.isEmpty() == true) {
			Principal.logica.recoger_datos();
			Principal.gestor_ventanas.desactivar_ventana_modificar_activo();
		} else {
			JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_modificar,"Error al modificar activo", JOptionPane.ERROR_MESSAGE);	
		}
		
	}
	
	private void agregar_activo_inferior() { 
		String valor;
		int indice = -1;

		indice = ventana.getActivos_disponibles_inferiores().getSelectedIndex();
		
		if (indice == -1) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		ventana.get_panel_confirmacion_activo_inferior().setVisible(true);
	}

	private void desagregar_activo_inferior() {
		String valor;
		int indice_seleccionado;
		int indice = -1;

		indice_seleccionado = ventana.getActivos_inferiores().getSelectedIndex();

		if (indice_seleccionado == -1) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		valor = ventana.getModelo_activos_inferiores().elementAt(indice_seleccionado);
		
		for(Relacion_activos elemento: ventana.getActivo_actual().getLista_activos_inferiores()) {
			if (elemento.getActivo_inferior() == valor) {
				indice = ventana.getActivo_actual().getLista_activos_inferiores().indexOf(elemento);
			}
		}
		
		if (indice > -1) {
			ventana.getActivo_actual().getLista_activos_inferiores().remove(indice);
		}
		
		ventana.getModelo_activos_inferiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().addElement(valor);
		ventana.getModelo_activos_disponibles_superiores().addElement(valor);

		ventana.get_panel_confirmacion_activo_inferior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
	}
	
	private void agregar_activo_superior() { 
		String valor;
		int indice = -1;
		
		indice = ventana.getActivos_disponibles_superiores().getSelectedIndex();
		
		if (indice == -1) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		ventana.get_panel_confirmacion_activo_superior().setVisible(true);
	}
	
	private void desagregar_activo_superior() {
		String valor;
		int indice_seleccionado;
		int indice = -1;

		indice_seleccionado = ventana.getActivos_superiores().getSelectedIndex();

		if (indice_seleccionado == -1) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}


		valor = ventana.getModelo_activos_superiores().elementAt(indice_seleccionado);
		
		
		for(Relacion_activos elemento: ventana.getActivo_actual().getLista_activos_superiores()) {
			System.out.println(valor+"---"+elemento.getActivo_inferior());
			System.out.println(elemento.getActivo_superior().contains(valor));
			System.out.println(valor.contains(elemento.getActivo_superior()));
			System.out.println(elemento.getActivo_superior().equalsIgnoreCase(valor));
			System.out.println(valor.equalsIgnoreCase('('+elemento.getActivo_superior()+')'));
			System.out.println(valor == '('+elemento.getActivo_superior()+')');
			System.out.println(elemento.getActivo_superior().contentEquals(valor));
			if (elemento.getActivo_superior().contains(valor) == true) {
				indice = ventana.getActivo_actual().getLista_activos_superiores().indexOf(elemento);
			}
		}
		System.out.println(indice);
		if (indice > -1) {
			ventana.getActivo_actual().getLista_activos_superiores().remove(indice);
		}

		ventana.getModelo_activos_superiores().removeElement(valor);
		ventana.getModelo_activos_disponibles_inferiores().addElement(valor);
		ventana.getModelo_activos_disponibles_superiores().addElement(valor);
		
		ventana.get_panel_confirmacion_activo_superior().setVisible(false);
		ventana.getTB_grado_inferior().setValue(0.5);
		
	}
	
	private void aceptar_activo_inferior() {
		String valor;
		Relacion_activos nueva_relacion;
		int indice_seleccionado;

		indice_seleccionado = ventana.getActivos_disponibles_inferiores().getSelectedIndex();
		valor = ventana.getModelo_activos_disponibles_inferiores().elementAt(indice_seleccionado);
		System.out.println(valor);

		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		nueva_relacion = new Relacion_activos();
		nueva_relacion.setActivo_inferior(valor);
		nueva_relacion.setActivo_superior(null);
		nueva_relacion.setGrado((Double) ventana.getTB_grado_inferior().getValue());
		ventana.getActivo_actual().getLista_activos_inferiores().add(nueva_relacion);

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
		int indice_seleccionado;

		indice_seleccionado = ventana.getActivos_disponibles_superiores().getSelectedIndex();
		valor = ventana.getModelo_activos_disponibles_superiores().elementAt(indice_seleccionado);
		System.out.println(valor);


		valor = ventana.getActivos_disponibles_superiores().getSelectedValue();
		
		if (valor == null) {
			JOptionPane.showMessageDialog(null,"No se has eleccionado un elemento","Error al agregar activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		nueva_relacion = new Relacion_activos();
		nueva_relacion.setActivo_inferior(null);
		nueva_relacion.setActivo_superior(valor);
		System.out.println(valor);
		nueva_relacion.setGrado((Double) ventana.getTB_grado_superior().getValue());
		ventana.getActivo_actual().getLista_activos_superiores().add(nueva_relacion);

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
