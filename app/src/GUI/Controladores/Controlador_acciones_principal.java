package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_crear_activo;
import GUI.Ventanas.ventanas.Ventana_crear_amenaza;
import GUI.Ventanas.ventanas.Ventana_crear_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_eliminar_activo;
import GUI.Ventanas.ventanas.Ventana_eliminar_amenaza;
import GUI.Ventanas.ventanas.Ventana_eliminar_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_listados;
import GUI.Ventanas.ventanas.Ventana_modificar_activo;
import GUI.Ventanas.ventanas.Ventana_modificar_amenaza;
import GUI.Ventanas.ventanas.Ventana_modificar_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_principal;
import GUI.Ventanas.ventanas.Ventana_ver_activo;
import GUI.Ventanas.ventanas.Ventana_ver_amenaza;
import GUI.Ventanas.ventanas.Ventana_ver_salvaguarda;
import aplicacion.Principal;

public class Controlador_acciones_principal implements ActionListener {
	
	private Ventana_principal ventana;
	
	public Controlador_acciones_principal(Ventana_principal ventana) {
		this.ventana = ventana;
	}
	
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
		
		if (e.getSource() == ventana.getCB_cod_activo()) {
			Principal.logica.set_activo_actual(ventana.getCB_cod_activo().getSelectedItem().toString());
		}
		if (e.getSource() == ventana.getCB_cod_amenaza()) {
			Principal.logica.set_amenaza_actual(ventana.getCB_cod_amenaza().getSelectedItem().toString());		
		}
		if (e.getSource() == ventana.getCB_cod_salvaguarda()) {
			Principal.logica.set_salvaguarda_actual(ventana.getCB_cod_salvaguarda().getSelectedItem().toString());
		}
	}

	
	private void importar() { }
	
	private void salir() { 
		ventana.dispose();
	}
	
	private void configuracion_BBDD() {
		Principal.gestor_ventanas.activar_ventana_configuracion_bbdd();
	}

	private void probar_conexion_BBDD() { 
		boolean resultado;
		
		resultado = Principal.gestor_base_datos.probar_base_datos();
		
		if (resultado == true) {
			JOptionPane.showMessageDialog(null,"La conexión a la base de datos es correcta.","Conexión existente", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,"Existe un fallo al conectarse a la base de datos.","Fallo en la conexión", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void login() { }
	private void logout() { }

}

