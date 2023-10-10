package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.Ventanas.Ventana_principal;

public class Controlador_principal implements ActionListener {
	private Ventana_principal ventana;
	public Controlador_principal(Ventana_principal ventana) {
	this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getSubmenu_importar()) { importar(); }
		if (e.getSource() == ventana.getSubmenu_salir()) { salir(); }
		if (e.getSource() == ventana.getSubmenu_listar_activo()) { listar_activo(); }
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
	}

	private void importar() { }
	
	private void salir() { }
	private void listar_activo() { }
	private void listar_amenaza() { }
	private void listar_salvaguarda() { }
	private void ver_activo() { }
	private void ver_amenaza() { }
	private void ver_salvaguarda() { }
	private void crear_activo() { }
	private void crear_amenaza() { }
	private void crear_salvaguarda() { }
	private void modificar_activo() { }
	private void modificar_amenaza() { }
	private void modificar_salvaguarda() { }
	private void eliminar_activo() { }
	private void eliminar_amenaza() { }
	private void eliminar_salvaguarda() { }
	private void configuracion_BBDD() { }

}

