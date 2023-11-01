package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JMenuItem;

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
		if (e.getSource() == ventana.getSubmenu_listar_amenaza()) { listar_amenaza(); }
		if (e.getSource() == ventana.getSubmenu_listar_salvaguarda()) { listar_salvaguarda(); }
		if (e.getSource() == ventana.getSubmenu_ver_activo()) { ver_activo(); }
		if (e.getSource() == ventana.getSubmenu_ver_amenaza()) { ver_amenaza(); }
		if (e.getSource() == ventana.getSubmenu_ver_salvaguarda()) { ver_salvaguarda(); }
		if (e.getSource() == ventana.getSubmenu_crear_activo()) { crear_activo(); }
		if (e.getSource() == ventana.getSubmenu_crear_amenaza()) { crear_amenaza();}
		if (e.getSource() == ventana.getSubmenu_crear_salvaguarda()) { crear_salvaguarda(); }
		if (e.getSource() == ventana.getSubmenu_modificar_activo()) { modificar_activo(); }
		if (e.getSource() == ventana.getSubmenu_modificar_amenaza()) { modificar_amenaza(); }
		if (e.getSource() == ventana.getSubmenu_modificar_salvaguarda()) { modificar_salvaguarda(); }
		if (e.getSource() == ventana.getSubmenu_eliminar_activo()) { eliminar_activo(); }
		if (e.getSource() == ventana.getSubmenu_eliminar_amenaza()) { eliminar_amenaza(); }
		if (e.getSource() == ventana.getSubmenu_eliminar_salvaguarda()) { eliminar_salvaguarda(); }
		if (e.getSource() == ventana.getSubmenu_configuracion_BBDD()) { configuracion_BBDD(); }
		if (e.getSource() == ventana.getSubmenu_probar_conexion_BBDD()) { probar_conexion_BBDD(); }
		if (e.getSource() == ventana.getSubmenu_login()) { login(); }
		if (e.getSource() == ventana.getSubmenu_logout()) { logout(); }
	}

	private void importar() { }
	
	private void salir() { }
	private void listar_activo() { 
		Ventana_listados ventana_lista_activos;
		ventana_lista_activos = new Ventana_listados("activo");
	}
	private void listar_amenaza() { 
		Ventana_listados ventana_lista_amenazas;
		ventana_lista_amenazas = new Ventana_listados("amenaza");
	}
	private void listar_salvaguarda() {
		Ventana_listados ventana_lista_salvaguardas;
		ventana_lista_salvaguardas = new Ventana_listados("salvaguarda");
	}
	private void ver_activo() { 
		Ventana_ver_activo ventana_ver_activo;
		ventana_ver_activo = new Ventana_ver_activo();
	}
	private void ver_amenaza() { 
		Ventana_ver_amenaza ventana_ver_amenaza;
		ventana_ver_amenaza = new Ventana_ver_amenaza();
	}
	private void ver_salvaguarda() {
		Ventana_ver_salvaguarda ventana_ver_salvaguarda;
		ventana_ver_salvaguarda = new Ventana_ver_salvaguarda();
	}
	private void crear_activo() {
		Ventana_crear_activo ventana_crear_activo;
		ventana_crear_activo = new Ventana_crear_activo();
	}
	private void crear_amenaza() {
		Ventana_crear_amenaza ventana_crear_amenaza;
		ventana_crear_amenaza = new Ventana_crear_amenaza();
	}
	private void crear_salvaguarda() {
		Ventana_crear_salvaguarda ventana_crear_salvaguarda;
		ventana_crear_salvaguarda = new Ventana_crear_salvaguarda();		
	}
	private void modificar_activo() {
		Ventana_modificar_activo ventana_modificar_activo;
		ventana_modificar_activo = new Ventana_modificar_activo();		
	}
	private void modificar_amenaza() {
		Ventana_modificar_amenaza ventana_modificar_amenaza;
		ventana_modificar_amenaza = new Ventana_modificar_amenaza();		
	}
	private void modificar_salvaguarda() {
		Ventana_modificar_salvaguarda ventana_modificar_salvaguarda;
		ventana_modificar_salvaguarda = new Ventana_modificar_salvaguarda();		
	}
	private void eliminar_activo() {
		Ventana_eliminar_activo ventana_eliminar_activo;
		ventana_eliminar_activo = new Ventana_eliminar_activo();		
	}
	private void eliminar_amenaza() {
		Ventana_eliminar_amenaza ventana_eliminar_samenaza;
		ventana_eliminar_samenaza = new Ventana_eliminar_amenaza();		
	}
	private void eliminar_salvaguarda() {
		Ventana_eliminar_salvaguarda ventana_eliminar_salvaguarda;
		ventana_eliminar_salvaguarda = new Ventana_eliminar_salvaguarda();		
	}
	
	
	
	
	
	private void configuracion_BBDD() { }
	private void probar_conexion_BBDD() { }
	private void login() { }
	private void logout() { }

}

