package GUI.Ventanas.Herencia;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Clase común a las ventanas de visualización de los elementos
 */
public class Ventana_visualizacion extends Ventana_comun {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6168427870920433751L;

	/**
	 * 
	 */
	protected JTextField tb_tipo;

	/**
	 * Constructor de la clase
	 */
	public Ventana_visualizacion() {
		super();
		inicializar_componentes_visualizacion();
	}
	
	/**
	 * Inicialización de los componentes de la ventan
	 */
	private void inicializar_componentes_visualizacion() {
		
		tb_tipo = new JTextField();
		tb_tipo.setBounds(70,20,260,30);
		add(tb_tipo);
		


	}
	

}
