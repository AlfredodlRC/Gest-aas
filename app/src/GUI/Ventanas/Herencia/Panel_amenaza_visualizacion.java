package GUI.Ventanas.Herencia;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class Panel_amenaza_visualizacion extends Panel_amenaza {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1786535583471231155L;

	
	public Panel_amenaza_visualizacion() {
		super();
		inicializar_componentes_visualizacion();
	}

	private void inicializar_componentes_visualizacion() {
		
		lbl_degradacion_valor.setLocation(400,70);
		
		tb_degradacion_valor.setLocation(550,70);
		tb_degradacion_valor.setEnabled(false);
		
		lbl_degradacion_fecuencia.setLocation(400,150);
		
		tb_degradacion_fecuencia.setLocation(550,150);
		tb_degradacion_fecuencia.setEnabled(false);
		
    	lbl_eficiencia_valor.setLocation(390,70);
		
		tb_eficiencia_valor.setLocation(550,70);
		tb_eficiencia_valor.setEnabled(false);

		lbl_eficiencia_fecuencia.setLocation(390,150);
		
		tb_eficiencia_fecuencia.setLocation(550,150);
		tb_eficiencia_fecuencia.setEnabled(false);

	}
}
