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
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;

public class Panel_amenaza extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8619224390809051069L;

	private JTabbedPane panel_tabulador;
	
	protected JComponent panel_tab_activos;
	protected JList<String> activos_afectados;
	protected JLabel lbl_degradacion_valor;

	protected JLabel lbl_degradacion_fecuencia;
	protected JSpinner tb_degradacion_valor;
	protected JSpinner tb_degradacion_fecuencia;
	
	protected JComponent panel_tab_salvalguardas;
	protected JList<String> salvaguardas_afectan;
	protected JLabel lbl_eficiencia_valor;

	protected JLabel lbl_eficiencia_fecuencia;
	protected JSpinner tb_eficiencia_valor;
	protected JSpinner tb_eficiencia_fecuencia;
	
	public Panel_amenaza() {

		super(new GridLayout(1, 1));
		setSize(890,295);
		inicializar_componentes();
         
	}
	
	private void inicializar_componentes() {

		Dimension tb_tamanyo = new Dimension(300,30);
		Dimension lb_tamanyo = new Dimension(350,230);
		Dimension lbl_tamanyo = new Dimension(200,30);

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
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_1);

    	activos_afectados = new JList<String>();
    	activos_afectados.setSize(lb_tamanyo);
    	activos_afectados.setLocation(10,20);
    	panel_tab_activos.add(activos_afectados);
		
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
        panel_tabulador.setMnemonicAt(1, KeyEvent.VK_2);

        salvaguardas_afectan = new JList<String>();
        salvaguardas_afectan.setSize(lb_tamanyo);
        salvaguardas_afectan.setLocation(10,20);
        panel_tab_salvalguardas.add(salvaguardas_afectan);

    	lbl_eficiencia_valor = new JLabel("Eficiencia del valor:");
    	lbl_eficiencia_valor.setSize(lbl_tamanyo);
    	lbl_eficiencia_valor.setLocation(390,90);
		panel_tab_salvalguardas.add(lbl_eficiencia_valor);
		
		tb_eficiencia_valor = new JSpinner();
		tb_eficiencia_valor.setSize(tb_tamanyo);
		tb_eficiencia_valor.setLocation(550,90);
		tb_eficiencia_valor.setModel(spnrModelo3);
		panel_tab_salvalguardas.add(tb_eficiencia_valor);
		
		lbl_eficiencia_fecuencia = new JLabel("Eficiencia de la Frecuencia:");
		lbl_eficiencia_fecuencia.setSize(lbl_tamanyo);
		lbl_eficiencia_fecuencia.setLocation(390,130);
		panel_tab_salvalguardas.add(lbl_eficiencia_fecuencia);
		
		tb_eficiencia_fecuencia = new JSpinner();
		tb_eficiencia_fecuencia.setSize(tb_tamanyo);
		tb_eficiencia_fecuencia.setLocation(550,130);
		tb_eficiencia_fecuencia.setModel(spnrModelo4);
		panel_tab_salvalguardas.add(tb_eficiencia_fecuencia);
		        
        add(panel_tabulador);
                
	}

	public JList<String> getActivos_afectados() {
		return activos_afectados;
	}

	public JSpinner getTb_degradacion_valor() {
		return tb_degradacion_valor;
	}

	public JSpinner getTb_degradacion_fecuencia() {
		return tb_degradacion_fecuencia;
	}

	public JList<String> getSalvaguardas_afectan() {
		return salvaguardas_afectan;
	}

	public JSpinner getTb_eficiencia_valor() {
		return tb_eficiencia_valor;
	}

	public JSpinner getTb_eficiencia_fecuencia() {
		return tb_eficiencia_fecuencia;
	}

	   

}
