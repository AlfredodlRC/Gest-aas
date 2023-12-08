package GUI.Ventanas.Herencia;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * Clase para poder visualizar los datos especificos de las amenazas
 * Hereda de la clase panel_activo
 */
public class Panel_amenaza_visualizacion extends Panel_amenaza {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1786535583471231155L;

	/**
	 * Constructor de la clase 
	 */
	public Panel_amenaza_visualizacion() {
		super();
		inicializar_componentes_visualizacion();
	}

	/**
	 * Función para inicializar los componentes propios del panel 
	 */
	private void inicializar_componentes_visualizacion() {
		
		lbl_degradacion_valor.setLocation(400,70);
		
		tb_degradacion_valor.setLocation(550,70);
		tb_degradacion_valor.setEnabled(false);
		
		lbl_degradacion_fecuencia.setLocation(400,150);
		
		tb_degradacion_fecuencia.setLocation(550,150);
		tb_degradacion_fecuencia.setEnabled(false);
		
    	lbl_eficiencia_valor.setLocation(550,40);
		
		tb_eficiencia_valor.setLocation(550,70);
		tb_eficiencia_valor.setEnabled(false);

		lbl_eficiencia_fecuencia.setLocation(550,120);
		
		tb_eficiencia_fecuencia.setLocation(550,150);
		tb_eficiencia_fecuencia.setEnabled(false);

	}
}
