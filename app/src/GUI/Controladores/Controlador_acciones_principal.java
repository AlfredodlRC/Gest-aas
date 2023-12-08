package GUI.Controladores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import GUI.Ventanas.ventanas.Ventana_principal;
import aplicacion.Principal;

/**
 * 
 */
public class Controlador_acciones_principal implements ActionListener, ListSelectionListener {
	
	/**
	 * 
	 */
	private Ventana_principal ventana;
	
	/**
	 * 
	 */
	public Controlador_acciones_principal(Ventana_principal ventana) {
		this.ventana = ventana;
	}
	
	/**
	 * 
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource() == ventana.getCB_cod_activo()) {
			if (ventana.getCB_cod_activo().getSelectedValue() != null) {
				Principal.logica.set_activo_actual(ventana.getCB_cod_activo().getSelectedValue().toString());
			}
		}
		if (e.getSource() == ventana.getCB_cod_amenaza()) {
			if (ventana.getCB_cod_amenaza().getSelectedValue() != null) {
				Principal.logica.set_amenaza_actual(ventana.getCB_cod_amenaza().getSelectedValue().toString());
			}
		}
		if (e.getSource() == ventana.getCB_cod_salvaguarda()) {
			if (ventana.getCB_cod_salvaguarda().getSelectedValue() != null) {
				Principal.logica.set_salvaguarda_actual(ventana.getCB_cod_salvaguarda().getSelectedValue().toString());
			}
		}

		
	}


	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ventana.getSubmenu_importar()) { importar(); }
		if (e.getSource() == ventana.getSubmenu_salir()) { salir(); }
		if (e.getSource() == ventana.getSubmenu_listar_activo()) {
			Principal.gestor_ventanas.activar_ventana_listado_activos();
		}
		if (e.getSource() == ventana.getSubmenu_listar_amenaza()) { 
			Principal.gestor_ventanas.activar_ventada_listado_amenaza();
		}
		if (e.getSource() == ventana.getSubmenu_listar_salvaguarda()) { 
			Principal.gestor_ventanas.activar_ventada_listado_salvaguarda();
		}
		if (e.getSource() == ventana.getSubmenu_ver_activo()) { 
			Principal.gestor_ventanas.activar_ventana_ver_activo();
		}
		if (e.getSource() == ventana.getSubmenu_ver_amenaza()) { 
			Principal.gestor_ventanas.activar_ventana_ver_amenaza();
		}
		if (e.getSource() == ventana.getSubmenu_ver_salvaguarda()) { 
			Principal.gestor_ventanas.activar_ventana_ver_salvaguarda();
		}
		if (e.getSource() == ventana.getSubmenu_crear_activo()) { 
			Principal.gestor_ventanas.activar_ventana_crear_activo();
		}
		if (e.getSource() == ventana.getSubmenu_crear_amenaza()) { 
			Principal.gestor_ventanas.activar_ventana_crear_amenaza();
		}
		if (e.getSource() == ventana.getSubmenu_crear_salvaguarda()) {
			Principal.gestor_ventanas.activar_ventana_crear_salvaguarda();
		}
		if (e.getSource() == ventana.getSubmenu_modificar_activo()) { 
			Principal.gestor_ventanas.activar_ventana_modificar_activo();
		}
		if (e.getSource() == ventana.getSubmenu_modificar_amenaza()) { 
			Principal.gestor_ventanas.activar_ventana_modificar_amenaza();
		}
		if (e.getSource() == ventana.getSubmenu_modificar_salvaguarda()) { 
			Principal.gestor_ventanas.activar_ventana_modificar_salvaguarda();
		}
		if (e.getSource() == ventana.getSubmenu_eliminar_activo()) { 
			Principal.gestor_ventanas.activar_ventana_eliminar_activo();
		}
		if (e.getSource() == ventana.getSubmenu_eliminar_amenaza()) { 
			Principal.gestor_ventanas.activar_ventana_eliminar_amenaza();
		}
		if (e.getSource() == ventana.getSubmenu_eliminar_salvaguarda()) { 
			Principal.gestor_ventanas.activar_ventana_eliminar_salvaguarda();
		}
		if (e.getSource() == ventana.getSubmenu_configuracion_BBDD()) { configuracion_BBDD(); }
		if (e.getSource() == ventana.getSubmenu_probar_conexion_BBDD()) { probar_conexion_BBDD(); }
		if (e.getSource() == ventana.getSubmenu_login()) { login(); }
		if (e.getSource() == ventana.getSubmenu_logout()) { logout(); }
		
	}

	
	/**
	 * 
	 */
	private void importar() { }
	
	/**
	 * 
	 */
	private void salir() { 
		ventana.dispose();
	}
	
	/**
	 * 
	 */
	private void configuracion_BBDD() {
		Principal.gestor_ventanas.activar_ventana_configuracion_bbdd();
	}

	/**
	 * 
	 */
	private void probar_conexion_BBDD() { 
		boolean resultado;
		
		resultado = Principal.gestor_base_datos.probar_base_datos();
		
		if (resultado == true) {
			JOptionPane.showMessageDialog(null,"La conexión a la base de datos es correcta.","Conexión existente", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,"Existe un fallo al conectarse a la base de datos.","Fallo en la conexión", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * 
	 */
	private void login() { }
	
/**
 * 
 */
	private void logout() { }

}

