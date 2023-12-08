package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_modificar_amenaza;
import aplicacion.Principal;
import datos.POJOS.Degradacion_amenaza_pojo;
import datos.POJOS.Eficiencia_amenaza_pojo;

/**
 * 
 */
public class Controlador_acciones_modificar_amenaza implements ActionListener {

	/**
	 * 
	 */
	private Ventana_modificar_amenaza ventana;
	
	/**
	 * 
	 */
	public Controlador_acciones_modificar_amenaza(Ventana_modificar_amenaza ventana_modificar_amenaza) {
		super();
		this.ventana = ventana_modificar_amenaza;
		System.out.println("++``dfdsaf");
	}

	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		if (e.getSource() == ventana.getBtn_cancelar()) { 
			Principal.gestor_ventanas.desactivar_ventana_modificar_amenaza();
		}
		if (e.getSource() == ventana.getBtn_accion()) {
			modificar_amenaza();
		}
		if (e.getSource() == ventana.getBtn_valorar_degradacion()) {
			anyadir_degradacion();
		}
		if (e.getSource() == ventana.getBtn_quitar_degradacion()) {
			eliminar_degradacion();
		}
		if (e.getSource() == ventana.getBtn_valorar_eficiencia()) {
			anyadir_eficiencia();			
		}
		if (e.getSource() == ventana.getBtn_quitar_eficiencia()) {
			eliminar_eficiencia();
		}	
	}
	
	/**
	 * 
	 */
	private void modificar_amenaza() {
		String resultado_modificar;

		resultado_modificar = Principal.logica.modificar_amenaza_actual(ventana.getAmenaza(),ventana.getCodigo_original());
		
		if (resultado_modificar.isEmpty() == true) {
			Principal.logica.recoger_datos();
			Principal.gestor_ventanas.desactivar_ventana_modificar_amenaza();
		} else {
			JOptionPane.showMessageDialog(null,"Se ha producido el error :"+resultado_modificar,"Error al modificar activo", JOptionPane.ERROR_MESSAGE);	
		}
		
	}
	
	/**
	 * 
	 */
	private void anyadir_degradacion() {
		
		Degradacion_amenaza_pojo degradacion;
		
		if(ventana.getActivos().getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null,"No se ha selecionado un activo","Activo no selecionado", JOptionPane.WARNING_MESSAGE);	
			return;			
		}
		
		degradacion = new Degradacion_amenaza_pojo();
		
		degradacion.setActivo(ventana.getActivos().getSelectedValue());
		degradacion.setDegradacion_valor((Double) ventana.getTb_degradacion_valor().getValue());
		degradacion.setFrecuencia_degradacion((Double) ventana.getTb_degradacion_fecuencia().getValue());
		
		ventana.getAmenaza_actual().getDegradaciones().add(degradacion);
		
		ventana.get_tabla_degradaciones().addRow(new Object[] { ventana.getActivos().getSelectedValue()
				,ventana.getTb_degradacion_valor().getValue(),ventana.getTb_degradacion_fecuencia().getValue()});
		
		for(DefaultListModel<String> modelo: ventana.get_datos_activos_salvaguarda()) {
			modelo.addElement(ventana.getActivos().getSelectedValue());
		}
		
		ventana.get_datos_activos().removeElement(ventana.getActivos().getSelectedValue());
	}
	
	/**
	 * 
	 */
	private void eliminar_degradacion() {
		int fila_seleccionada;
		int i;
		int indice_tabla = -1;
		Degradacion_amenaza_pojo degradacion = null;
		
		fila_seleccionada = ventana.getDegradaciones().getSelectedRow(); 
		if(fila_seleccionada == -1) {
			JOptionPane.showMessageDialog(null,"No se ha selecionado una degradación","Degradación no selecionada", JOptionPane.WARNING_MESSAGE);	
			return;			
		}
		
		for(Degradacion_amenaza_pojo elemento: ventana.getAmenaza_actual().getDegradaciones()) {
			if (elemento.getActivo() == (String) ventana.get_tabla_degradaciones().getValueAt(fila_seleccionada, 0)) {
				degradacion = elemento;
			}
		}
		if (degradacion != null) {
			ventana.getAmenaza_actual().getDegradaciones().remove(degradacion);
		}
		
		ventana.get_datos_activos().addElement((String) ventana.get_tabla_degradaciones().getValueAt(fila_seleccionada, 0));
		for(i=0; i < ventana.get_tabla_eficiencias().getRowCount(); i++) {
			if ((String) ventana.get_tabla_eficiencias().getValueAt(i,1) == (String) ventana.get_tabla_degradaciones().getValueAt(fila_seleccionada, 0)) {
				indice_tabla = i;
			}
		}
		if (indice_tabla > -1) {
			ventana.get_tabla_eficiencias().removeRow(indice_tabla);
		}		
		
		ventana.get_tabla_degradaciones().removeRow(fila_seleccionada);

	
	}

	/**
	 * 
	 */
	private void anyadir_eficiencia() { 
		int indice_salvaguarda;
		int indice_activo;
		Eficiencia_amenaza_pojo eficiencia;

		indice_salvaguarda = ventana.getSalvaguardas().getSelectedIndex();
		indice_activo = ventana.getActivos_salvaguardas().getSelectedIndex();

		if (indice_salvaguarda == -1) {
			JOptionPane.showMessageDialog(null,"No se ha selecionado una salvaguarda","Salvaguarda no selecionada", JOptionPane.WARNING_MESSAGE);	
			return;			
		}
		if (indice_activo == -1) {
			JOptionPane.showMessageDialog(null,"No se ha selecionado un activo con degradación","Activo no selecionado", JOptionPane.WARNING_MESSAGE);	
			return;			
		}

		eficiencia = new Eficiencia_amenaza_pojo();
		eficiencia.setActivo(ventana.getActivos_salvaguardas().getSelectedValue());
		eficiencia.setSalvaguarda(ventana.getSalvaguardas().getSelectedValue());
		eficiencia.setEficiencia_valor((Double) ventana.getTb_eficiencia_valor().getValue());
		eficiencia.setEficiencia_frecuencia((Double) ventana.getTb_eficiencia_fecuencia().getValue());
		
		ventana.getAmenaza_actual().getEficiencias().add(eficiencia);
		
		ventana.get_tabla_eficiencias().addRow(new Object[] { ventana.getSalvaguardas().getSelectedValue(),ventana.getActivos_salvaguardas().getSelectedValue()
				,ventana.getTb_eficiencia_valor().getValue(),ventana.getTb_eficiencia_fecuencia().getValue()});
		ventana.get_datos_activos_salvaguarda().get(indice_salvaguarda).remove(indice_activo);
		
	}			
	
	/**
	 * 
	 */
	private void eliminar_eficiencia() {
		int fila_seleccionada;
		int indice;
		int i;
		Eficiencia_amenaza_pojo eficiencia = null;
		
		fila_seleccionada = ventana.getEficiencias().getSelectedRow(); 
		if(fila_seleccionada == -1) {
			JOptionPane.showMessageDialog(null,"No se ha selecionado una eficiencia","Eficiencia no selecionada", JOptionPane.WARNING_MESSAGE);	
			return;			
		}
		
		for(Eficiencia_amenaza_pojo elemento: ventana.getAmenaza_actual().getEficiencias()) {
			if (elemento.getActivo() == (String) ventana.get_tabla_eficiencias().getValueAt(fila_seleccionada, 1)) {
				if (elemento.getSalvaguarda() == (String) ventana.get_tabla_eficiencias().getValueAt(fila_seleccionada, 0)) {
					eficiencia = elemento;
				}
			}
		}
		
		if (eficiencia != null) {
			ventana.getAmenaza_actual().getEficiencias().remove(eficiencia);
		}

		// Agregar a la lista de activos de la salvaguarda
		for (i=0; i < ventana.get_datos_salvaguardas().getSize();i++) {
			if (ventana.get_datos_salvaguardas().get(i) == (String) ventana.get_tabla_eficiencias().getValueAt(fila_seleccionada, 0)) {
				ventana.get_datos_activos_salvaguarda().get(i).addElement((String) ventana.get_tabla_eficiencias().getValueAt(i, 1));
			}
			
		}

		//Quitar de la tabla eficiencias
		ventana.get_tabla_eficiencias().removeRow(ventana.getEficiencias().getSelectedRow());

		
	}

}
