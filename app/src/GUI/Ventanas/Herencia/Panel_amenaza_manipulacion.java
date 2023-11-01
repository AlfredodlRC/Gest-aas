package GUI.Ventanas.Herencia;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;

public class Panel_amenaza_manipulacion extends Panel_amenaza {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3279920129695670780L;

	private JButton btn_valorar_degradacion;
	private JComboBox<String> cb_activos;

	private JButton btn_valorar_eficiencia;
	private JComboBox<String> cb_salvaguardas;

	public Panel_amenaza_manipulacion() {
		super();
		inicializar_componentes_manipulacion();
	}

	private void inicializar_componentes_manipulacion() {
		Dimension tb_tamanyo = new Dimension(300,30);
		Dimension lb_tamanyo = new Dimension(350,230);
		Dimension lbl_tamanyo = new Dimension(200,30);

		SpinnerNumberModel spnrModelo1 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo2 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo3 = new SpinnerNumberModel(0,0,100,0.05);
		SpinnerNumberModel spnrModelo4 = new SpinnerNumberModel(0,0,100,0.05);
		
        /*
         * 
         * Panel de activos y sus componentes
         * 
         */

		
		btn_valorar_degradacion = new JButton("Agregar degradación");
		btn_valorar_degradacion.setSize(tb_tamanyo);
		btn_valorar_degradacion.setLocation(550,170);
		panel_tab_activos.add(btn_valorar_degradacion);
		
		cb_activos = new JComboBox<String>();
		cb_activos.setSize(tb_tamanyo);
		cb_activos.setLocation(550,50);
		panel_tab_activos.add(cb_activos);
        

        
        /*
         * 
         * Panel de salvaguardas y sus componentes
         * 
         */

    	btn_valorar_eficiencia = new JButton("Agregar eficiencia");
    	btn_valorar_eficiencia.setSize(tb_tamanyo);
    	btn_valorar_eficiencia.setLocation(550,170);
    	panel_tab_salvalguardas.add(btn_valorar_eficiencia);
		
		cb_salvaguardas = new JComboBox<String>();
		cb_salvaguardas.setSize(tb_tamanyo);
		cb_salvaguardas.setLocation(550,50);
		panel_tab_salvalguardas.add(cb_salvaguardas);

	}

	public JButton getBtn_valorar_degradacion() {
		return btn_valorar_degradacion;
	}

	public JComboBox<String> getCb_activos() {
		return cb_activos;
	}

	public JButton getBtn_valorar_eficiencia() {
		return btn_valorar_eficiencia;
	}

	public JComboBox<String> getCb_salvaguardas() {
		return cb_salvaguardas;
	}


}
