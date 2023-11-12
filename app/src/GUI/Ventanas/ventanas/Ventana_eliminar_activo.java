package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.JList;
import javax.swing.JTextField;

import GUI.Controladores.Controlador_acciones_eliminar_activo;
import GUI.Controladores.Controlador_acciones_ver_activo;
import GUI.Ventanas.Herencia.Panel_activo_visualizacion;
import GUI.Ventanas.Herencia.Ventana_eliminar;
import aplicacion.Principal;
import datos.POJOS.Activo_pojo;

public class Ventana_eliminar_activo extends Ventana_eliminar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5960536906610090156L;
	
	private Panel_activo_visualizacion panel_datos;

	public Ventana_eliminar_activo() {
		super();

		elemento = "activo";
		accion = "eliminar";

		btn_accion.setText(accion);

		setTitle("Gestor AAS - eliminar activo");
		panel_datos = new Panel_activo_visualizacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	public void establecerManejador(Controlador_acciones_eliminar_activo manejador) {
	    btn_cancelar.addActionListener(manejador);
	    btn_accion.addActionListener(manejador);
	}

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
