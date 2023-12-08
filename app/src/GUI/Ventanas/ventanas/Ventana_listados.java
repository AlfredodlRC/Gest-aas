package GUI.Ventanas.ventanas;


import java.awt.HeadlessException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.Controladores.Controlador_acciones_listado;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Salvaguarda_pojo;

/**
 *  Clase destinada a mostrar el listado de los diferentes elementos.
 */
public class Ventana_listados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4612569392974314759L;

	/**
	 * Elemento gráfico que muestra el listado de los elementos
	 */
	private JTable tabla_listado;

	/**
	 * Botón cuya funcionalidad es cerrar la ventana
	 */
	private JButton btn_cerrar;
	
	/**
	 *  Cadena de texto que determina el tipo de elemento a mostrar 
	 */
	private String elemento;
	
	/**
	 * Tabla que cotiene los datos a mostrar
	 */
	DefaultTableModel tabla_datos = new DefaultTableModel();
	
	/**
	 * Constructor genérico de la clase
	 */
	public Ventana_listados() {
		
		super();
		elemento = "";
		tabla_datos = new DefaultTableModel();
		
		inicializar_ventana();
		inicializarComponentes();
		cargar_datos();
		
	}
	
	/**
	 *  Constructor especificando el tipo de elemento a mostrar
	 */
	public Ventana_listados(String elemento) {
		
		super();
		this.elemento = elemento;
		tabla_datos = new DefaultTableModel();

		inicializar_ventana();
		inicializarComponentes();
		cargar_datos();
	
	}

	/**
	 * Función que establece las caracteristicas de la ventana
	 */
	private void inicializar_ventana() {

		setTitle("Gestor AAS - Listado de " + elemento + "s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		
	}
	
	/**
	 * Función encargada de inicializar los componentes gráficos de la ventana
	 */
	private void inicializarComponentes() {
		
		tabla_datos = new DefaultTableModel();
		
		tabla_listado = new JTable(tabla_datos);
		tabla_listado.setBounds(10, 10, 860, 400);
		tabla_listado.setEnabled(false);
		
		// Este panel sirve para mostrar las cabecera y que el elemento JTable posea un scroll 
		JScrollPane sc = new JScrollPane(tabla_listado);
		sc.setBounds(10, 10, 860, 400);
		
		add(sc);
		
		btn_cerrar = new JButton("Cerrar");
		btn_cerrar.setBounds(770, 420, 100, 30);
		add(btn_cerrar);
		
	}

	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_listado manejador) {
		this.btn_cerrar.addActionListener(manejador);
	}

	/**
	 *  Función encargada de recoger los datos para la tabla
	 */
	public void cargar_datos() {
		
		String patron_fecha = "dd-MM-yyyy HH:mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patron_fecha);

		System.out.println("Listado " + elemento + "s");

		// columnas comunes a todas los elementos
		tabla_datos.addColumn("Código");
		tabla_datos.addColumn("Nombre");
		tabla_datos.addColumn("Tipo");
		tabla_datos.addColumn("fecha");
		tabla_datos.addColumn("Descripción");
		
		switch (this.elemento) {
		case "activo":
			// columnas espeficicas de los activos
			tabla_datos.addColumn("Valoración");
			tabla_datos.addColumn("Valor");
			tabla_datos.addColumn("V. acumulado");
			tabla_datos.addColumn("V. repercutido");
			// carga en la tabla de los datos de los activos
			for(Activo_pojo elemento:Principal.logica.coger_lista_datos_activos()) {
				tabla_datos.addRow(new Object[] { 
						elemento.getCodigo(),elemento.getNombre(),elemento.getTipo(),
						simpleDateFormat.format(elemento.getFecha_creacion()),elemento.getDescripcion(),
						elemento.getNivel_valoracion(),elemento.getValor_economico(),elemento.getValor_acumulado(),elemento.getValor_repercutido()
						});
			}
			break;
		case "amenaza":
			// columnas espeficicas de las amenazas
			tabla_datos.addColumn("Nº activos");
			tabla_datos.addColumn("Nº salvaguardas");
			// carga en la tabla de los datos de las amenazas
			for(Amenaza_pojo elemento:Principal.logica.coger_lista_datos_amenazas()) {
				tabla_datos.addRow(new Object[] { 
						elemento.getCodigo(),elemento.getNombre(),elemento.getTipo(),
						simpleDateFormat.format(elemento.getFecha_creacion()),elemento.getDescripcion(),
						});
			}
			break;
		case "salvaguarda":
			// columnas espeficicas de las salvaguardas
			tabla_datos.addColumn("Nº activos");
			tabla_datos.addColumn("Nº amenazas");
			// carga en la tabla de los datos de las salvaguardas
			for(Salvaguarda_pojo elemento:Principal.logica.coger_lista_datos_salvaguardas()) {
				tabla_datos.addRow(new Object[] { 
						elemento.getCodigo(),elemento.getNombre(),elemento.getTipo(),
						simpleDateFormat.format(elemento.getFecha_creacion()),elemento.getDescripcion(),
						});
			}
			break;

		default:
			break;
		}
	}

	public JTable getTabla_listado() {
		return tabla_listado;
	}


	public JButton getBtn_cerrar() {
		return btn_cerrar;
	}


	public String getElemento() {
		return elemento;
	}


	public void setTabla_listado(JTable tabla_listado) {
		this.tabla_listado = tabla_listado;
	}


	
	public void setBtn_cerrar(JButton btn_cerrar) {
		this.btn_cerrar = btn_cerrar;
	}


	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	

	
}
