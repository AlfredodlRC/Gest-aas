package GUI.Ventanas.Herencia;

import javax.swing.JComboBox;

/**
 * Ventana enfocada a la manipulación de los diferentes elementos
 * hereda de ventana_comun
 */
public class Ventana_manipulacion extends Ventana_comun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3052719473250117820L;

	/**
	 * 
	 */
	protected JComboBox<String> cb_tipo;

	/**
	 * Constructor de la clase
	 */
	public Ventana_manipulacion() {
		super();
		inicializar_componentes_manipulacion();
	}


	/**
	 * Inicialización de los componentes
	 */
	private void inicializar_componentes_manipulacion() {
		
		cb_tipo = new JComboBox<String>();
		cb_tipo.setBounds(70,20,260,30);
		add(cb_tipo);

	}
	
	
}
