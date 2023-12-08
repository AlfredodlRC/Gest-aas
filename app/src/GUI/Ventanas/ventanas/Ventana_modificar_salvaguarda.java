package GUI.Ventanas.ventanas;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;

import GUI.Controladores.Controlador_acciones_modificar_salvaguarda;
import GUI.Ventanas.Herencia.Panel_salvaguarda_manipulacion;
import GUI.Ventanas.Herencia.Ventana_modificar;
import aplicacion.Principal;
import datos.POJOS.Salvaguarda_pojo;

/**
 *  Clase destinada a mostrar los datos de la salvaguarda actual
 *  Es una clase hija de Ventana_modificar
 */
public class Ventana_modificar_salvaguarda extends Ventana_modificar {

	/**
	 *  Clase destinada a modificar los datos de la salvaguarda actual
 	 *  Es una clase hija de Ventana_modificar
	 */
	private static final long serialVersionUID = -3158964126972151032L;

	/**
	 * Panel que contiene los componentes con los valores especificos de la salvaguarda
	 */
	private Panel_salvaguarda_manipulacion panel_datos;

	/**
	 * Objecto salvaguarda local.
	 */
	Salvaguarda_pojo salvaguarda;
	
	/**
	 * Código inicial de la salvaguarda
	 */
	private String codigo_original;

	/**
	 *  Constructor de la clase
	 */
	public Ventana_modificar_salvaguarda() {
		super();

		elemento = "salvaguarda";
		accion = "modificar";

		codigo_original = Principal.logica.get_salvaguarda_actual().getCodigo();
		
		salvaguarda = new Salvaguarda_pojo();

		btn_accion.setText(accion);

		setTitle("Gestor AAS - modificar salvaguarda");
		panel_datos = new Panel_salvaguarda_manipulacion();
		panel_datos.setLocation(5, 150);
		panel_datos.setBackground(Color.LIGHT_GRAY);
		add(panel_datos);
	}

	/**
	 * Función pública destinada a establecer el manejador que controlará las acciones de la ventana.
	 */
	public void establecerManejador(Controlador_acciones_modificar_salvaguarda manejador) {
		this.btn_accion.addActionListener(manejador);
		this.btn_cancelar.addActionListener(manejador);
	}
	
	/**
	 * Función encargada de recoger los datos de la salvaguarda actual
	 */
	public void cargar_datos() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		String texto_fecha;
		texto_fecha = fmt.format(Principal.logica.get_salvaguarda_actual().getFecha_creacion().getTime());

		cargar_lista_datos();

		this.tb_nombre.setText(Principal.logica.get_salvaguarda_actual().getNombre());
		this.tb_codigo.setText(Principal.logica.get_salvaguarda_actual().getCodigo());
		this.tb_descripcion.setText(Principal.logica.get_salvaguarda_actual().getDescripcion());
		this.tb_fecha.setText(texto_fecha);
		
	}
	
	/**
	 * Función encargada de recoger las listas de datos de la salvaguarda actual
	 */
	public void cargar_lista_datos() {
		this.cb_tipo.removeAllItems();

		for(String elemento: Principal.logica.coger_lista_tipo_salvaguardas()) {
			this.cb_tipo.addItem(elemento); 
		if (elemento.contains("("+Principal.logica.get_salvaguarda_actual().getTipo()+")") == true) {
				this.cb_tipo.setSelectedItem(elemento);
			}
		}

	}

	public JList<String> getCb_amenazas() {
		return panel_datos.getCb_amenazas();
	}

	public JSpinner getTb_eficiencia_valor_activo() {
		return panel_datos.getTb_eficiencia_valor_activo();
	}

	public JSpinner getTb_eficiencia_fecuencia_activo() {
		return panel_datos.getTb_eficiencia_fecuencia_activo();
	}

	public JList<String> getCb_activos() {
		return panel_datos.getCb_activos();
	}

	public JSpinner getTb_eficiencia_valor_amenaza() {
		return panel_datos.getTb_eficiencia_valor_amenaza();
	}

	public JSpinner getTb_eficiencia_fecuencia_amenaza() {
		return panel_datos.getTb_eficiencia_fecuencia_amenaza();
	}

	public JButton getBtn_guardar_eficiencia_activo() {
		return panel_datos.getBtn_guardar_eficiencia_activo();
	}

	public JButton getBtn_guardar_eficiencia_amenaza() {
		return panel_datos.getBtn_guardar_eficiencia_amenaza();
	}
	
	public JButton getBtn_eliminar_eficiencia_activo() {
		return panel_datos.getBtn_eliminar_eficiencia_activo();
	}

	public JButton getBtn_eliminar_eficiencia_amenaza() {
		return panel_datos.getBtn_eliminar_eficiencia_amenaza();
	}
	
	public Salvaguarda_pojo getSalvaguarda_actual() {
		return salvaguarda;
	}

	public String getCodigo_original() {
		return codigo_original;
	}

	public Salvaguarda_pojo getSalvaguarda_vacio() {
		return salvaguarda;
	}

	public Salvaguarda_pojo getSalvaguarda() {
		String texto_cb;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		texto_cb = Principal.logica.coger_codigo_nombre((String) this.cb_tipo.getSelectedItem());
		salvaguarda.setTipo(texto_cb);
		salvaguarda.setCodigo(this.getTb_codigo().getText());
		salvaguarda.setNombre(this.getTb_nombre().getText());
		salvaguarda.setDescripcion(this.getTb_descripcion().getText());
		try {
			salvaguarda.setFecha_creacion(formato.parse(this.getTb_fecha().getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salvaguarda;
	}

}
