package GUI.Ventanas.Herencia;

import javax.swing.JSpinner;

/**
 * 
 */
public class Panel_salvaguarda_visualizacion extends Panel_salvaguarda {

	/**
	 * 
	 */
	private static final long serialVersionUID = 715862162154481295L;

	
	/**
	 * 
	 */
	public Panel_salvaguarda_visualizacion() {
		super();
		inicializar_componentes_visualizacion();
	}

	
	/**
	 * 
	 */
	private void inicializar_componentes_visualizacion(){
		
		tb_eficiencia_valor_activo.setEnabled(false);
		tb_eficiencia_fecuencia_activo.setEnabled(false);

		tb_eficiencia_valor_amenaza.setEnabled(false);
		tb_eficiencia_fecuencia_amenaza.setEnabled(false);
	}
	
}
