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

public class Ventana_listados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4612569392974314759L;

	private JTable tabla_listado;
	private JButton btn_cerrar;
	
	private String elemento;
	
	DefaultTableModel tabla_datos = new DefaultTableModel();
	
	public Ventana_listados() {
		
		super();
		elemento = "";
		tabla_datos = new DefaultTableModel();
		inicializar_ventana();
		inicializarComponentes();
		cargar_datos();
		
	}
	
	
	public Ventana_listados(String elemento) throws HeadlessException {
		
		super();
		this.elemento = elemento;
		tabla_datos = new DefaultTableModel();

		inicializar_ventana();
		inicializarComponentes();
		cargar_datos();
	
	}


	private void inicializar_ventana() {

		setTitle("Gestor AAS - Listado de " + elemento + "s");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		
	}
	
	private void inicializarComponentes() {
		tabla_datos = new DefaultTableModel();
		
		tabla_listado = new JTable(tabla_datos);
		tabla_listado.setBounds(10, 10, 860, 400);
		tabla_listado.setEnabled(false);
		
		JScrollPane sc = new JScrollPane(tabla_listado);
		sc.setBounds(10, 10, 860, 400);
		
		add(sc);
		
		btn_cerrar = new JButton("Cerrar");
		btn_cerrar.setBounds(770, 420, 100, 30);
		add(btn_cerrar);
		
	}

	public void establecerManejador(Controlador_acciones_listado manejador) {
		this.btn_cerrar.addActionListener(manejador);
	}

	public void cargar_datos() {
		
		String patron_fecha = "dd-MM-yyyy HH:mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patron_fecha);
		
		tabla_datos.addColumn("Código");
		tabla_datos.addColumn("Nombre");
		tabla_datos.addColumn("Tipo");
		tabla_datos.addColumn("fecha");
		tabla_datos.addColumn("Descripción");
		
		//tabla_datos.insertRow(0, new Object[] { "CSS" });
		switch (this.elemento) {
		case "activo":
			tabla_datos.addColumn("Valoración");
			tabla_datos.addColumn("Valor");
			tabla_datos.addColumn("V. acumulado");
			tabla_datos.addColumn("V. repercutido");
			System.out.println("Listado activos");
			for(Activo_pojo elemento:Principal.logica.coger_lista_datos_activos()) {
				tabla_datos.addRow(new Object[] { 
						elemento.getCodigo(),elemento.getNombre(),elemento.getTipo(),
						simpleDateFormat.format(elemento.getFecha_creacion()),elemento.getDescripcion(),
						elemento.getNivel_valoracion(),elemento.getValor_economico(),elemento.getValor_acumulado(),elemento.getValor_repercutido()
						});
			}
			break;
		case "amenaza":
			tabla_datos.addColumn("Nº activos");
			tabla_datos.addColumn("Nº salvaguardas");
			System.out.println("Listado amenazas");
			for(Amenaza_pojo elemento:Principal.logica.coger_lista_datos_amenazas()) {
				tabla_datos.addRow(new Object[] { 
						elemento.getCodigo(),elemento.getNombre(),elemento.getTipo(),
						simpleDateFormat.format(elemento.getFecha_creacion()),elemento.getDescripcion(),
						});
			}
			break;
		case "salvaguarda":
			tabla_datos.addColumn("Nº activos");
			tabla_datos.addColumn("Nº amenazas");
			System.out.println("Listado salvaguardas");
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
