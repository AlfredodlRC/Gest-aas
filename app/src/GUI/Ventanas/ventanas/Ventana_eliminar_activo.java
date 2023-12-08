package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

import GUI.Controladores.Controlador_acciones_eliminar_activo;
import GUI.Ventanas.Herencia.Panel_activo_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Relacion_activos;

/**
 *  Clase destinada a mostrar los datos del activo actual
 *  Es una clase hija de Ventana_eliminar
 */
public class Ventana_eliminar_activo extends Ventana_eliminar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5960536906610090156L;
	
	/**
	 * Panel que contiene los componentes con los valores especificos del activo
	 */
	private Panel_activo_visualizacion panel_datos;

	/**
	 * 
	 */
	DefaultListModel<String> modelo_activos_inferiores = new DefaultListModel<>();

	/**
	 * 
	 */
	DefaultListModel<String> modelo_activos_superiores = new DefaultListModel<>();

	/**
	 * Constructor de la clase
	 */
	public Ventana_eliminar_activo() {
		super();

		elemento = "activo";
		accion = "eliminar";

		establecerComponentes();
		
	}

	/**
	 * Función pública destinada a establecer los componentes de la ventana.
	 */
	private void establecerComponentes() {
		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar activo");
		panel_datos = new Panel_activo_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
		
		this.tb_codigo.setEnabled(false);
		this.tb_descripcion.setEnabled(false);
		this.tb_nombre.setEnabled(false);
		this.tb_tipo.setEnabled(false);
		this.tb_fecha.setEnabled(false);
		this.panel_datos.getTb_economico().setEnabled(false);
		this.panel_datos.getTb_valor_acumulado().setEnabled(false);
		this.panel_datos.getTb_valor_repercutido().setEnabled(false);
		this.panel_datos.getNivel_valor().setEnabled(false);
		this.panel_datos.getCriterio_1().setEnabled(false);
		this.panel_datos.getCriterio_2().setEnabled(false);
		this.panel_datos.getCriterio_3().setEnabled(false);
		this.panel_datos.getCriterio_4().setEnabled(false);
		this.panel_datos.getCriterio_5().setEnabled(false);
		this.panel_datos.getCriterio_6().setEnabled(false);
		this.panel_datos.getCriterio_7().setEnabled(false);
		this.panel_datos.getCriterio_8().setEnabled(false);
		this.panel_datos.getCriterio_9().setEnabled(false);
		this.panel_datos.getCriterio_10().setEnabled(false);
		this.panel_datos.getCriterio_11().setEnabled(false);
		this.panel_datos.getCriterio_12().setEnabled(false);
		this.panel_datos.getCriterio_13().setEnabled(false);
		
	}

	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_eliminar_activo manejador) {
	    btn_cancelar.addActionListener(manejador);
	    btn_accion.addActionListener(manejador);
	}

	/**
	 * Función encargada de recoger los datos del activo actual
	 */
	public void cargar_activo() {
		Activo_pojo activo = Principal.logica.get_activo_actual();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format( activo.getFecha_creacion().getTime());
		System.out.println("cargando activo actual"+Principal.logica.get_activo_actual() );
		
		tb_codigo.setText(activo.getCodigo());
		tb_nombre.setText(activo.getNombre());		
		tb_descripcion.setText(activo.getDescripcion());
		tb_fecha.setText(texto_fecha);
		tb_tipo.setText(activo.getTipo());
		panel_datos.getTb_economico().setText(activo.getValor_economico().toString());
		panel_datos.getNivel_valor().setText(activo.getNivel_valoracion());
		panel_datos.getCriterio_1().setText(activo.getCriterio_pi());
		panel_datos.getCriterio_2().setText(activo.getCriterio_lpo());
		panel_datos.getCriterio_3().setText(activo.getCriterio_si());
		panel_datos.getCriterio_4().setText(activo.getCriterio_cei());
		panel_datos.getCriterio_5().setText(activo.getCriterio_da());
		panel_datos.getCriterio_6().setText(activo.getCriterio_po());
		panel_datos.getCriterio_7().setText(activo.getCriterio_olm());
		panel_datos.getCriterio_8().setText(activo.getCriterio_adm());
		panel_datos.getCriterio_9().setText(activo.getCriterio_lg());
		panel_datos.getCriterio_10().setText(activo.getCriterio_crm());
		panel_datos.getCriterio_11().setText(activo.getCriterio_rto());
		panel_datos.getCriterio_12().setText(activo.getCriterio_ibl_national());
		panel_datos.getCriterio_13().setText(activo.getCriterio_ibl_ue());
			
		panel_datos.getActivos_disponibles_superiores().setModel(modelo_activos_superiores);
		panel_datos.getActivos_disponibles_inferiores().setModel(modelo_activos_inferiores);

		
		for (Relacion_activos elemento: Principal.logica.coger_lista_relaciones_activos()) {
			if (activo.getCodigo().contains(elemento.getActivo_inferior())) {
				modelo_activos_superiores.addElement(elemento.getActivo_superior() + " - grado: " + (elemento.getGrado()*100) + "%");
			}
			if (activo.getCodigo().contains(elemento.getActivo_superior())) {
				modelo_activos_inferiores.addElement(elemento.getActivo_inferior() + " - grado: " + (elemento.getGrado()*100) + "%");
			}
			System.out.println(elemento.getActivo_superior()+" -- " + activo.getCodigo());
			System.out.println(elemento.getActivo_inferior()+" -- " + activo.getCodigo());
		}


	}

	public JTextField getTb_valor_repercutido() {
		return panel_datos.getTb_valor_repercutido();
	}

	public JTextField getTb_valor_acumulado() {
		return panel_datos.getTb_valor_acumulado();
	}	
	
	public JTextField getNivel_valor() {
		return panel_datos.getNivel_valor();
	}

	public JTextField getCriterio_1() {
		return panel_datos.getCriterio_1();
	}

	public JTextField getCriterio_2() {
		return panel_datos.getCriterio_2();
	}

	public JTextField getCriterio_3() {
		return panel_datos.getCriterio_3();
	}

	public JTextField getCriterio_4() {
		return panel_datos.getCriterio_4();
	}

	public JTextField getCriterio_5() {
		return panel_datos.getCriterio_5();
	}

	public JTextField getCriterio_6() {
		return panel_datos.getCriterio_6();
	}

	public JTextField getCriterio_7() {
		return panel_datos.getCriterio_7();
	}

	public JTextField getCriterio_8() {
		return panel_datos.getCriterio_8();
	}

	public JTextField getCriterio_9() {
		return panel_datos.getCriterio_9();
	}

	public JTextField getCriterio_10() {
		return panel_datos.getCriterio_10();
	}

	public JTextField getCriterio_11() {
		return panel_datos.getCriterio_11();
	}

	public JTextField getCriterio_12() {
		return panel_datos.getCriterio_12();
	}

	public JTextField getCriterio_13() {
		return panel_datos.getCriterio_13();
	}

	public JList<String> getActivos_disponibles_inferiores() {
		return panel_datos.getActivos_disponibles_inferiores();
	}
	
	public JList<String> getActivos_inferiores() {
		return panel_datos.getActivos_disponibles_inferiores();
	}
	

}
