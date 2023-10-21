package GUI.Ventanas;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import GUI.Controladores.Controlador_principal;

public class Ventana_principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JMenuBar menu_principal;
    private JMenu menu_archivo,menu_activos,menu_amenazas,menu_salvaguardas,menu_BBDD,menu_usuario;
    private JMenuItem submenu_importar,submenu_salir;
    private JMenuItem submenu_listar_activo,submenu_listar_amenaza,submenu_listar_salvaguarda;
    private JMenuItem submenu_ver_activo,submenu_ver_amenaza,submenu_ver_salvaguarda;
    private JMenuItem submenu_crear_activo,submenu_crear_amenaza,submenu_crear_salvaguarda;
    private JMenuItem submenu_modificar_activo,submenu_modificar_amenaza,submenu_modificar_salvaguarda;
    private JMenuItem submenu_eliminar_activo,submenu_eliminar_amenaza,submenu_eliminar_salvaguarda;
    private JMenuItem submenu_configuracion_BBDD,probar_conexion_BBDD;
	private JMenuItem submenu_login,submenu_logout;
	
	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	private void inicializarComponentes() {
		menu_principal = new JMenuBar();
        setJMenuBar(menu_principal);
        
        // Menu archivo
        menu_archivo = new JMenu("Archivo");
        menu_archivo.setFont(new Font("Roboto", Font.BOLD, 14));
        menu_principal.add(menu_archivo);
        
        crear_submenu(menu_archivo,submenu_importar,"Importar");
        // submenu_importar = new JMenuItem("Importar");
        // menu_archivo.add(submenu_importar);
        crear_submenu(menu_archivo,submenu_salir,"Salir");
        // submenu_salir = new JMenuItem("Salir");
        // menu_archivo.add(submenu_salir);
 
        // Menu activos
        menu_activos = new JMenu("Activos");
        menu_principal.add(menu_activos);
        
        crear_submenu(menu_activos,submenu_listar_activo,"listar");
        crear_submenu(menu_activos,submenu_ver_activo,"Ver");
        crear_submenu(menu_activos,submenu_crear_activo,"Crear");
        crear_submenu(menu_activos,submenu_modificar_activo,"Modificar");
        crear_submenu(menu_activos,submenu_eliminar_activo,"Eliminar");
        
        // Menu amenazas
        menu_amenazas = new JMenu("Amenazas");
        menu_principal.add(menu_amenazas);
        
        crear_submenu(menu_amenazas,submenu_listar_amenaza,"Listar");
        crear_submenu(menu_amenazas,submenu_ver_amenaza,"Ver");
        crear_submenu(menu_amenazas,submenu_crear_amenaza,"Crear");
        crear_submenu(menu_amenazas,submenu_modificar_amenaza,"Modificar");
        crear_submenu(menu_amenazas,submenu_eliminar_amenaza,"Eliminar");
        
        // Menu salvaguardas
        menu_salvaguardas = new JMenu("Salvaguardas");
        menu_principal.add(menu_salvaguardas);

        crear_submenu(menu_salvaguardas,submenu_listar_salvaguarda,"Listar");
        crear_submenu(menu_salvaguardas,submenu_ver_salvaguarda,"Ver");
        crear_submenu(menu_salvaguardas,submenu_crear_salvaguarda,"Crear");
        crear_submenu(menu_salvaguardas,submenu_modificar_salvaguarda,"Modificar");
        crear_submenu(menu_salvaguardas,submenu_eliminar_salvaguarda,"Eliminar");
        
        // Menu base de datos
        menu_BBDD = new JMenu("BBDD");
        menu_principal.add(menu_BBDD);

        crear_submenu(menu_BBDD,submenu_configuracion_BBDD,"Configuración");
        crear_submenu(menu_BBDD,probar_conexion_BBDD,"Probar Conexión");
        
        // Menu usuarios
        menu_usuario = new JMenu("Usuario");
        menu_principal.add(menu_usuario);
        crear_submenu(menu_usuario,submenu_login,"Login");
        crear_submenu(menu_usuario,submenu_logout,"Logout");
 
	}
	
	public void establecerManejador(Controlador_principal manejador) {
	    submenu_importar.addActionListener(manejador);
	    submenu_salir.addActionListener(manejador);
	    submenu_listar_activo.addActionListener(manejador);
	    submenu_listar_amenaza.addActionListener(manejador);
	    submenu_listar_salvaguarda.addActionListener(manejador);
	    submenu_ver_activo.addActionListener(manejador);
	    submenu_ver_amenaza.addActionListener(manejador);
	    submenu_ver_salvaguarda.addActionListener(manejador);
	    submenu_crear_activo.addActionListener(manejador);
	    submenu_crear_amenaza.addActionListener(manejador);
	    submenu_crear_salvaguarda.addActionListener(manejador);
	    submenu_modificar_activo.addActionListener(manejador);
	    submenu_modificar_amenaza.addActionListener(manejador);
	    submenu_modificar_salvaguarda.addActionListener(manejador);
	    submenu_eliminar_activo.addActionListener(manejador);
	    submenu_eliminar_amenaza.addActionListener(manejador);
	    submenu_eliminar_salvaguarda.addActionListener(manejador);
	    submenu_configuracion_BBDD.addActionListener(manejador);
	    probar_conexion_BBDD.addActionListener(manejador);
	    }
	
	private void crear_submenu(JMenu menu, JMenuItem elemento, String texto) {
		elemento = new JMenuItem(texto);
		elemento.setFont(new Font("Roboto", Font.BOLD, 14));
		menu.add(elemento);		
	}

	public JMenuItem getSubmenu_importar() {
		return submenu_importar;
	}

	public JMenuItem getSubmenu_salir() {
		return submenu_salir;
	}

	public JMenuItem getSubmenu_listar_activo() {
		return submenu_listar_activo;
	}

	public JMenuItem getSubmenu_listar_amenaza() {
		return submenu_listar_amenaza;
	}

	public JMenuItem getSubmenu_listar_salvaguarda() {
		return submenu_listar_salvaguarda;
	}

	public JMenuItem getSubmenu_ver_activo() {
		return submenu_ver_activo;
	}

	public JMenuItem getSubmenu_ver_amenaza() {
		return submenu_ver_amenaza;
	}

	public JMenuItem getSubmenu_ver_salvaguarda() {
		return submenu_ver_salvaguarda;
	}

	public JMenuItem getSubmenu_crear_activo() {
		return submenu_crear_activo;
	}

	public JMenuItem getSubmenu_crear_amenaza() {
		return submenu_crear_amenaza;
	}

	public JMenuItem getSubmenu_crear_salvaguarda() {
		return submenu_crear_salvaguarda;
	}

	public JMenuItem getSubmenu_modificar_activo() {
		return submenu_modificar_activo;
	}

	public JMenuItem getSubmenu_modificar_amenaza() {
		return submenu_modificar_amenaza;
	}

	public JMenuItem getSubmenu_modificar_salvaguarda() {
		return submenu_modificar_salvaguarda;
	}

	public JMenuItem getSubmenu_eliminar_activo() {
		return submenu_eliminar_activo;
	}

	public JMenuItem getSubmenu_eliminar_amenaza() {
		return submenu_eliminar_amenaza;
	}

	public JMenuItem getSubmenu_eliminar_salvaguarda() {
		return submenu_eliminar_salvaguarda;
	}

	public JMenuItem getSubmenu_configuracion_BBDD() {
		return submenu_configuracion_BBDD;
	}

	public JMenuItem getSubmenu_login() {
		return submenu_login;
	}

	public JMenuItem getSubmenu_logout() {
		return submenu_logout;
	}
	

}