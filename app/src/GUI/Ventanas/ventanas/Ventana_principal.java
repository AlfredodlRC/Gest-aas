package GUI.Ventanas.ventanas;

import java.awt.Font;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


import GUI.Controladores.Controlador_acciones_principal;
import aplicacion.Principal;

/**
 * 
 */
public class Ventana_principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * 
	 */
	private JMenuBar menu_principal;
    
	/**
	 * 
	 */
	private JMenu menu_archivo,menu_activos,menu_amenazas,menu_salvaguardas,menu_BBDD,menu_usuario;
    
	/**
	 * 
	 */
	private JMenuItem submenu_importar,submenu_salir;
    
	/**
	 * 
	 */
	private JMenuItem submenu_listar_activo,submenu_listar_amenaza,submenu_listar_salvaguarda;
    
	/**
	 * 
	 */
	private JMenuItem submenu_ver_activo,submenu_ver_amenaza,submenu_ver_salvaguarda;
    
	/**
	 * 
	 */
	private JMenuItem submenu_crear_activo,submenu_crear_amenaza,submenu_crear_salvaguarda;
    
	/**
	 * 
	 */
	private JMenuItem submenu_modificar_activo,submenu_modificar_amenaza,submenu_modificar_salvaguarda;
    
	/**
	 * 
	 */
	private JMenuItem submenu_eliminar_activo,submenu_eliminar_amenaza,submenu_eliminar_salvaguarda;
    
	/**
	 * 
	 */
	private JMenuItem submenu_configuracion_BBDD,submenu_probar_conexion_BBDD;
	
	/**
	 * 
	 */
	private JMenuItem submenu_login,submenu_logout;
	
	/**
	 * 
	 */
	private JLabel label_cod_activo,label_cod_amenaza,label_cod_salvaguarda;
	
	/**
	 * 
	 */
	private JList<String> cb_cod_activo,cb_cod_amenaza,cb_cod_salvaguarda;
	
	/**
	 * 
	 */
	private DefaultListModel<String> activos;
	
	/**
	 * 
	 */
	private DefaultListModel<String> amenazas;
	
	/**
	 * 
	 */
	private DefaultListModel<String> salvaguardas;
	
	/**
	 * Constructor de la clase
	 */
	public Ventana_principal() {
		
		setTitle("Gestor AAS - Ventana principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		recoger_datos();
		setVisible(true);
	}
	
	/**
	 * Función que inicializa los componentes de la pantalla 
	 */
	private void inicializarComponentes() {
		
		menu_principal = new JMenuBar();
        setJMenuBar(menu_principal);
               
        
        // Menu archivo
        menu_archivo = new JMenu("Archivo");
        menu_archivo.setFont(new Font("Roboto", Font.BOLD, 14));
        menu_principal.add(menu_archivo);
        
        //crear_submenu(menu_archivo,submenu_importar,"Importar");
        submenu_importar = new JMenuItem("Importar");
        menu_archivo.add(submenu_importar);
        //crear_submenu(menu_archivo,submenu_salir,"Salir");
        submenu_salir = new JMenuItem("Salir");
        menu_archivo.add(submenu_salir);
 
        // Menu activos
        menu_activos = new JMenu("Activos");
        menu_principal.add(menu_activos);
        
        submenu_listar_activo = new JMenuItem("listar");
        menu_activos.add(submenu_listar_activo);
        configurar_submenu(submenu_listar_activo);
        submenu_ver_activo = new JMenuItem("Ver");
        menu_activos.add(submenu_ver_activo);
        configurar_submenu(submenu_ver_activo);
        submenu_crear_activo = new JMenuItem("Crear");
        menu_activos.add(submenu_crear_activo);
        configurar_submenu(submenu_crear_activo);
        submenu_modificar_activo = new JMenuItem("Modificar");
        menu_activos.add(submenu_modificar_activo);
        configurar_submenu(submenu_modificar_activo);
        submenu_eliminar_activo = new JMenuItem("Eliminar");
        menu_activos.add(submenu_eliminar_activo);
        configurar_submenu(submenu_eliminar_activo);
        
        // Menu amenazas
        menu_amenazas = new JMenu("Amenazas");
        menu_principal.add(menu_amenazas);
        
        submenu_listar_amenaza = new JMenuItem("Listar");
        menu_amenazas.add(submenu_listar_amenaza);
        configurar_submenu(submenu_listar_amenaza);
        
        submenu_ver_amenaza = new JMenuItem("Ver");
        menu_amenazas.add(submenu_ver_amenaza);
        configurar_submenu(submenu_ver_amenaza);
        
        submenu_crear_amenaza = new JMenuItem("Crear");
        menu_amenazas.add(submenu_crear_amenaza);
        configurar_submenu(submenu_crear_amenaza);
        
        submenu_modificar_amenaza = new JMenuItem("Modificar");
        menu_amenazas.add(submenu_modificar_amenaza);
        configurar_submenu(submenu_modificar_amenaza);
        
        submenu_eliminar_amenaza = new JMenuItem("Eliminar");
        menu_amenazas.add(submenu_eliminar_amenaza);
        configurar_submenu(submenu_eliminar_amenaza);
        
        // Menu salvaguardas
        menu_salvaguardas = new JMenu("Salvaguardas");
        menu_principal.add(menu_salvaguardas);

        submenu_listar_salvaguarda = new JMenuItem("Listar");
        menu_salvaguardas.add(submenu_listar_salvaguarda);
        configurar_submenu(submenu_listar_salvaguarda);
        
        submenu_ver_salvaguarda = new JMenuItem("Ver");
        menu_salvaguardas.add(submenu_ver_salvaguarda);
        configurar_submenu(submenu_ver_salvaguarda);
        
        submenu_crear_salvaguarda = new JMenuItem("Crear");
        menu_salvaguardas.add(submenu_crear_salvaguarda);
        configurar_submenu(submenu_crear_salvaguarda);
        
        submenu_modificar_salvaguarda = new JMenuItem("Modificar");
        menu_salvaguardas.add(submenu_modificar_salvaguarda);
        configurar_submenu(submenu_modificar_salvaguarda);
        
        submenu_eliminar_salvaguarda = new JMenuItem("Eliminar");
        menu_salvaguardas.add(submenu_eliminar_salvaguarda);
        configurar_submenu(submenu_eliminar_salvaguarda);
        
        // Menu base de datos
        menu_BBDD = new JMenu("BBDD");
        menu_principal.add(menu_BBDD);

        submenu_configuracion_BBDD = new JMenuItem("Configuración");
        menu_BBDD.add(submenu_configuracion_BBDD);
        configurar_submenu(submenu_configuracion_BBDD);
        
  		submenu_probar_conexion_BBDD = new JMenuItem("Probar Conexión");
        menu_BBDD.add(submenu_probar_conexion_BBDD);
        configurar_submenu(submenu_probar_conexion_BBDD);
        
        // Menu usuarios
        menu_usuario = new JMenu("Usuario");
        menu_principal.add(menu_usuario);
        
        submenu_login = new JMenu("Login");
        menu_usuario.add(submenu_login);
        configurar_submenu(submenu_login);
        
        submenu_logout = new JMenu("Logout");
        menu_usuario.add(submenu_logout);
        configurar_submenu(submenu_logout);
 
        
        // elementos de códigos
        
        label_cod_activo = new JLabel("Activos");
        label_cod_activo.setBounds(100,10,100,30);
        add(label_cod_activo);
        
        label_cod_amenaza = new JLabel("Amenazas");
        label_cod_amenaza.setBounds(385,10,100,30);
        add(label_cod_amenaza);

        label_cod_salvaguarda = new JLabel("Salvaguardas");
        label_cod_salvaguarda.setBounds(670,10,100,30);
        add(label_cod_salvaguarda);
        
        activos = new DefaultListModel<String>();
        
        cb_cod_activo = new JList<String>();
        cb_cod_activo.setBounds(50,50,200,300);
        cb_cod_activo.setModel(activos);
        add(cb_cod_activo);
        
        amenazas = new DefaultListModel<String>();

        cb_cod_amenaza = new JList<String>();
        cb_cod_amenaza.setBounds(335,50,200,300);
        cb_cod_amenaza.setModel(amenazas);
        add(cb_cod_amenaza);

        salvaguardas = new DefaultListModel<String>();

        cb_cod_salvaguarda = new JList<String>();
        cb_cod_salvaguarda.setBounds(620,50,200,300);
        cb_cod_salvaguarda.setModel(salvaguardas);
        add(cb_cod_salvaguarda);
	}
	
	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_principal manejador) {
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
	    submenu_probar_conexion_BBDD.addActionListener(manejador);
	    submenu_login.addActionListener(manejador);
	    submenu_logout.addActionListener(manejador);
	    cb_cod_activo.addListSelectionListener(manejador);
	    cb_cod_amenaza.addListSelectionListener(manejador);
	    cb_cod_salvaguarda.addListSelectionListener(manejador);
	}
	
	/**
	 * Función encargada de coger los datos.
	 */
	public void recoger_datos() {

		establecer_activos();

		establecer_amenazas();
		
		establecer_salvaguardas();
		
	}
	
	/**
	 * Función que carga la lista de activos
	 */
	public void establecer_activos() {
		
		List<String> lista_activos = Principal.logica.coger_lista_activos();

		activos.clear();
		for (String elemento: lista_activos) {
			activos.addElement(elemento);
		}
		
		if (activos.size() > 0) {
			cb_cod_activo.setSelectedIndex(0);
			Principal.logica.set_activo_actual(getCB_cod_activo().getSelectedValue());
		}
	}
	
	/**
	 * Función que carga la lista de amenazas 
	 */
	public void establecer_amenazas() {
		
		List<String> lista_amenazas = Principal.logica.coger_lista_amenazas();
		
		amenazas.clear();
		for(String elemento: lista_amenazas) {
			amenazas.addElement(elemento);
		}
		if (amenazas.size() > 0) {
			cb_cod_amenaza.setSelectedIndex(0);
			Principal.logica.set_amenaza_actual(getCB_cod_amenaza().getSelectedValue());
		}
			
	}
	
	/**
	 * Función que carga la lista de salvaguardas
	 */
	public void establecer_salvaguardas() {

		List<String> lista_salvaguardas = Principal.logica.coger_lista_salvaguardas();
		
		salvaguardas.clear();
		
		for(String elemento: lista_salvaguardas) {
			salvaguardas.addElement(elemento);
		}
		
		if (salvaguardas.size() > 0) {
			cb_cod_salvaguarda.setSelectedIndex(0);
			Principal.logica.set_salvaguarda_actual(getCB_cod_salvaguarda().getSelectedValue());
		}
		

	}

	/**
	 * Función que configura graficamente los submenus
	 * @param elemento
	 */
	private void configurar_submenu(JMenuItem elemento) {
		elemento.setFont(new Font("Roboto", Font.BOLD, 18));
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

	public JMenuItem getSubmenu_probar_conexion_BBDD() {
		return submenu_probar_conexion_BBDD;
	}

	public JMenuItem getSubmenu_login() {
		return submenu_login;
	}

	public JMenuItem getSubmenu_logout() {
		return submenu_logout;
	}

	public JList<String> getCB_cod_activo() {
		return cb_cod_activo;
	}

	public JList<String> getCB_cod_amenaza() {
		return cb_cod_amenaza;
	}

	public JList<String> getCB_cod_salvaguarda() {
		return cb_cod_salvaguarda;
	}
	

}