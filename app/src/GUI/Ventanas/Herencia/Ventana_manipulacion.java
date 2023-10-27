package GUI.Ventanas.Herencia;

import javax.swing.JComboBox;

public class Ventana_manipulacion extends Ventana_comun {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3052719473250117820L;
	
	private JComboBox<String> cb_tipo;

	public Ventana_manipulacion() {
		super();
		inicializar_componentes_manipulacion();
	}


	private void inicializar_componentes_manipulacion() {
		
		cb_tipo = new JComboBox<String>();
		cb_tipo.setBounds(70,20,160,30);
		add(cb_tipo);

	}
	
	
}
