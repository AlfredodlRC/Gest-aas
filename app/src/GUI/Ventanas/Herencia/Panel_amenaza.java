package GUI.Ventanas.Herencia;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

public class Panel_amenaza extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8619224390809051069L;

	protected JTabbedPane panel_tabulador;
	
	protected JComponent panel_tab_activos;
	protected JList<String> activos;
	protected JLabel lbl_degradacion_valor;

	protected JLabel lbl_degradacion_fecuencia;
	protected JSpinner tb_degradacion_valor;
	protected JSpinner tb_degradacion_fecuencia;
	
	protected JComponent panel_tab_salvalguardas;
	protected JList<String> salvaguardas;
	protected JLabel lbl_eficiencia_valor;

	protected JLabel lbl_eficiencia_fecuencia;
	protected JSpinner tb_eficiencia_valor;
	protected JSpinner tb_eficiencia_fecuencia;

	protected JComponent panel_tab_degradaciones;
	protected JTable degradaciones;

	protected JComponent panel_tab_eficiencias;
	protected JTable eficiencias;

	private JList<String> activos_salvaguardas;
	private JLabel lblactivos_salvaguardas;


	public Panel_amenaza() {

		super(new GridLayout(1, 1));
		setSize(890,295);
		inicializar_componentes();
         
	}
	
	private void inicializar_componentes() {

		Dimension tb_tamanyo = new Dimension(200,30);
		Dimension lb_tamanyo = new Dimension(200,230);
		Dimension lbl_tamanyo = new Dimension(170,30);

		SpinnerNumberModel spnrModelo1 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo2 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo3 = new SpinnerNumberModel(0,0,100,0.05);
		SpinnerNumberModel spnrModelo4 = new SpinnerNumberModel(0,0,100,0.05);
		
		// Panel tabulador
		panel_tabulador = new JTabbedPane();
        /*
         * 
         * Panel de activos y sus componentes
         * 
         */
        panel_tab_activos = new JPanel();
        panel_tab_activos.setLayout(null);
        panel_tabulador.addTab("Activos", null, panel_tab_activos,
                "Agregar degradaciones de los activos");

    	activos = new JList<String>();
    	activos.setSize(lb_tamanyo);
    	activos.setLocation(10,20);
    	panel_tab_activos.add(activos);
		
		lbl_degradacion_valor = new JLabel("Degradación del valor:");
		lbl_degradacion_valor.setSize(lbl_tamanyo);
		lbl_degradacion_valor.setLocation(400,90);
		panel_tab_activos.add(lbl_degradacion_valor);
		
		tb_degradacion_valor = new JSpinner();
		tb_degradacion_valor.setSize(tb_tamanyo);
		tb_degradacion_valor.setLocation(550,90);
		tb_degradacion_valor.setModel(spnrModelo1);
		panel_tab_activos.add(tb_degradacion_valor);
		
		lbl_degradacion_fecuencia = new JLabel("Frecuencia:");
		lbl_degradacion_fecuencia.setSize(lbl_tamanyo);
		lbl_degradacion_fecuencia.setLocation(400,130);
		panel_tab_activos.add(lbl_degradacion_fecuencia);
		
		tb_degradacion_fecuencia = new JSpinner();
		tb_degradacion_fecuencia.setSize(tb_tamanyo);
		tb_degradacion_fecuencia.setLocation(550,130);
		tb_degradacion_fecuencia.setModel(spnrModelo2);
		panel_tab_activos.add(tb_degradacion_fecuencia);
		
        
        /*
         * 
         * Panel de salvaguardas y sus componentes
         * 
         */
        panel_tab_salvalguardas = new JPanel();
        panel_tab_salvalguardas.setLayout(null);
        panel_tabulador.addTab("Salvaguardas", null, panel_tab_salvalguardas,
                "Relacionar salvaguardas y su eficiencia sobre la amenaza");

        salvaguardas = new JList<String>();
        salvaguardas.setSize(lb_tamanyo);
        salvaguardas.setLocation(10,20);
        panel_tab_salvalguardas.add(salvaguardas);

    	lbl_eficiencia_valor = new JLabel("Eficiencia del valor:");
    	lbl_eficiencia_valor.setSize(lbl_tamanyo);
    	lbl_eficiencia_valor.setLocation(550,20);
		panel_tab_salvalguardas.add(lbl_eficiencia_valor);
		
		tb_eficiencia_valor = new JSpinner();
		tb_eficiencia_valor.setSize(tb_tamanyo);
		tb_eficiencia_valor.setLocation(550,60);
		tb_eficiencia_valor.setModel(spnrModelo3);
		panel_tab_salvalguardas.add(tb_eficiencia_valor);
		
		lbl_eficiencia_fecuencia = new JLabel("Eficiencia de la Frecuencia:");
		lbl_eficiencia_fecuencia.setSize(lbl_tamanyo);
		lbl_eficiencia_fecuencia.setLocation(550,100);
		panel_tab_salvalguardas.add(lbl_eficiencia_fecuencia);
		
		tb_eficiencia_fecuencia = new JSpinner();
		tb_eficiencia_fecuencia.setSize(tb_tamanyo);
		tb_eficiencia_fecuencia.setLocation(550,140);
		tb_eficiencia_fecuencia.setModel(spnrModelo4);
		panel_tab_salvalguardas.add(tb_eficiencia_fecuencia);
		        
		activos_salvaguardas = new JList<String>();
		activos_salvaguardas.setSize(lb_tamanyo);
		activos_salvaguardas.setLocation(260,50);
        panel_tab_salvalguardas.add(activos_salvaguardas);

        lblactivos_salvaguardas = new JLabel("Activos");
        lblactivos_salvaguardas.setSize(lbl_tamanyo);
        lblactivos_salvaguardas.setLocation(260,10);
		panel_tab_salvalguardas.add(lblactivos_salvaguardas);


    	/*
         * 
         */
        add(panel_tabulador);

        
        
	}

	public JList<String> getActivos() {
		return activos;
	}

	public JSpinner getTb_degradacion_valor() {
		return tb_degradacion_valor;
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return tb_degradacion_fecuencia;
	}

	public JList<String> getSalvaguardas() {
		return salvaguardas;
	}


	public JSpinner getTb_eficiencia_valor() {
		return tb_eficiencia_valor;
	}

	public JSpinner getTb_eficiencia_fecuencia() {
		return tb_eficiencia_fecuencia;
	}

	public JTable getDegradaciones() {
		return degradaciones;
	}

	public JTable getEficiencias() {
		return eficiencias;
	}

	public JList<String> getActivos_salvaguardas() {
		return activos_salvaguardas;
	}



	   

}
