package GUI.Ventanas.Herencia;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Ventana_visualizacion extends Ventana_comun {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6168427870920433751L;

	private JTextField tb_tipo;

	public Ventana_visualizacion() {
		super();
		inicializar_componentes_visualizacion();
	}
	
	private void inicializar_componentes_visualizacion() {
		
		tb_tipo = new JTextField();
		tb_tipo.setBounds(70,20,160,30);
		add(tb_tipo);
		


	}
	

}
