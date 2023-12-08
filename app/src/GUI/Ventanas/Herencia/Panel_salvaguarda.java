package GUI.Ventanas.Herencia;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;


/**
 * Panel con los elementos comunes de los datos especificos de las salvaguardas
 */
	
public class Panel_salvaguarda extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9045387874155335520L;
	
	/**
	 * Panel para contener las diferentes pestañas de los datos
	 */
	private JTabbedPane panel_tabulador;
	
	/**
	 * Pestaña con los elementos de las efeciencias por activos
	 */
	protected JComponent panel_tab_activos;
	
	/**
	 * lista de activos afectados por la eficiencias
	 */
	protected JList<String> activos_afectados;
	
	/**
	 * lista de amenazas relacionados con el activo seleccionado por activos_afectados
	 */
	private JList<String> cb_amenazas;
	
	/**
	 * Componente que contiene el grado de la eficiencia para el valor de la degradación
	 */
	protected JSpinner tb_eficiencia_valor_activo;
	
	/**
	 * Componente que contiene el grado de la eficiencia para la frecuenccia de la degradación
	 */
	protected JSpinner tb_eficiencia_fecuencia_activo;
	
	/**
	 * 
	 */
	private JLabel lbl_eficiencia_valor_activo, lbl_eficiencia_fecuencia_activo,lbl_amenazas;
	
	/**
	 * Pestaña con los elementos de las efeciencias por amenaza
	 */
	protected JComponent panel_tab_amenazas;
	
	/**
	 * lista de amenazas afectadas por la eficiencias
	 */
	protected JList<String> amenazas_afectan;
	
	/**
	 * lista de activos relacionados con el activo seleccionado por activos_afectados
	 */
	private JList<String> cb_activos; 
	
	/**
	 * lista de amenazas relacionados con el activo seleccionado por activos_afectados
	 */
	protected JSpinner tb_eficiencia_valor_amenaza;
	
	/**
	 * Componente que contiene el grado de la eficiencia para la frecuenccia de la degradación
	 */
	protected JSpinner tb_eficiencia_fecuencia_amenaza;
	
	/**
	 * 
	 */
	private JLabel lbl_eficiencia_valor_amenaza, lbl_eficiencia_fecuencia_amenaza,lbl_activos;
	
	/**
	 * 
	 */
	public Panel_salvaguarda() {
		super(new GridLayout(1, 1));
		setSize(890,295);
		inicializar_componentes();
	}
	
	/**
	 * 
	 */
	private void inicializar_componentes() {

		Dimension tb_tamanyo = new Dimension(150,30);
		Dimension lb_tamanyo = new Dimension(150,230);
		Dimension lbl_tamanyo = new Dimension(140,30);

		SpinnerNumberModel spnrModelo1 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo2 = new SpinnerNumberModel(0,0,200000000,0.05);
		SpinnerNumberModel spnrModelo3 = new SpinnerNumberModel(0,0,100,0.05);
		SpinnerNumberModel spnrModelo4 = new SpinnerNumberModel(0,0,100,0.05);
		
		// Panel tabulador
		panel_tabulador = new JTabbedPane();
        add(panel_tabulador);

        /*
         * 
         * Panel de activos y sus componentes
         * 
         */
        panel_tab_activos = new JPanel();
        panel_tab_activos.setLayout(null);
        panel_tabulador.addTab("Activos", null, panel_tab_activos,
                "Agregar eficiciencias de los activos");
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_1);

    	activos_afectados = new JList<String>();
    	activos_afectados.setSize(lb_tamanyo);
    	activos_afectados.setLocation(10,20);
    	panel_tab_activos.add(activos_afectados);
		
    	lbl_amenazas = new JLabel("Amenazas:");
    	lbl_amenazas.setSize(lbl_tamanyo);
    	lbl_amenazas.setLocation(210,0);
		panel_tab_activos.add(lbl_amenazas);

		cb_amenazas = new JList<String>();
    	cb_amenazas.setSize(lb_tamanyo);
    	cb_amenazas.setLocation(210,35);
    	panel_tab_activos.add(cb_amenazas);
    	
    	lbl_eficiencia_valor_activo = new JLabel("Eficiencia valor:");
    	lbl_eficiencia_valor_activo.setSize(lbl_tamanyo);
    	lbl_eficiencia_valor_activo.setLocation(520,90);
		panel_tab_activos.add(lbl_eficiencia_valor_activo);

    	tb_eficiencia_valor_activo = new JSpinner();
    	tb_eficiencia_valor_activo.setSize(tb_tamanyo);
    	tb_eficiencia_valor_activo.setLocation(680,90);
    	tb_eficiencia_valor_activo.setModel(spnrModelo1);
    	panel_tab_activos.add(tb_eficiencia_valor_activo);

    	lbl_eficiencia_fecuencia_activo= new JLabel("Eficiencia frecuencia:");
		lbl_eficiencia_fecuencia_activo.setSize(lbl_tamanyo);
		lbl_eficiencia_fecuencia_activo.setLocation(520,130);
		panel_tab_activos.add(lbl_eficiencia_fecuencia_activo);

		tb_eficiencia_fecuencia_activo = new JSpinner();
		tb_eficiencia_fecuencia_activo.setSize(tb_tamanyo);
		tb_eficiencia_fecuencia_activo.setLocation(680,130);
		tb_eficiencia_fecuencia_activo.setModel(spnrModelo2);
		panel_tab_activos.add(tb_eficiencia_fecuencia_activo);


        /*
         * 
         * Panel de amenazas y sus componentes
         * 
         */
		panel_tab_amenazas = new JPanel();
		panel_tab_amenazas.setLayout(null);
        panel_tabulador.addTab("Amenazas", null, panel_tab_amenazas,
                "Agregar eficiciencias de las amenaza");
        panel_tabulador.setMnemonicAt(1, KeyEvent.VK_2);

        amenazas_afectan = new JList<String>();
        amenazas_afectan.setSize(lb_tamanyo);
        amenazas_afectan.setLocation(10,20);
        panel_tab_amenazas.add(amenazas_afectan);

    	lbl_activos = new JLabel("Activos:");
    	lbl_activos.setSize(lbl_tamanyo);
    	lbl_activos.setLocation(210,0);
    	panel_tab_amenazas.add(lbl_activos);

		cb_activos = new JList<String>();
    	cb_activos.setSize(lb_tamanyo);
    	cb_activos.setLocation(210,35);
    	panel_tab_amenazas.add(cb_activos);
        
    	lbl_eficiencia_valor_amenaza = new JLabel("Eficiencia valor:");
    	lbl_eficiencia_valor_amenaza.setSize(lbl_tamanyo);
    	lbl_eficiencia_valor_amenaza.setLocation(520,90);
    	panel_tab_amenazas.add(lbl_eficiencia_valor_amenaza);

    	tb_eficiencia_valor_amenaza = new JSpinner();
    	tb_eficiencia_valor_amenaza.setSize(tb_tamanyo);
    	tb_eficiencia_valor_amenaza.setLocation(680,90);
    	tb_eficiencia_valor_amenaza.setModel(spnrModelo3);
    	panel_tab_amenazas.add(tb_eficiencia_valor_amenaza);

    	lbl_eficiencia_fecuencia_amenaza = new JLabel("Eficiencia frecuencia:");
		lbl_eficiencia_fecuencia_amenaza.setSize(lbl_tamanyo);
		lbl_eficiencia_fecuencia_amenaza.setLocation(520,130);
		panel_tab_amenazas.add(lbl_eficiencia_fecuencia_amenaza);

		tb_eficiencia_fecuencia_amenaza = new JSpinner();
		tb_eficiencia_fecuencia_amenaza.setSize(tb_tamanyo);
		tb_eficiencia_fecuencia_amenaza.setLocation(680,130);
		tb_eficiencia_fecuencia_amenaza.setModel(spnrModelo4);
		panel_tab_amenazas.add(tb_eficiencia_fecuencia_amenaza);

	}
	
	/**
	 * 
	 */
	public JList<String> getCb_amenazas() {
		return cb_amenazas;
	}
	
	/**
	 * 
	 */
	public JSpinner getTb_eficiencia_valor_activo() {
		return tb_eficiencia_valor_activo;
	}
	
	/**
	 * 
	 */
	public JSpinner getTb_eficiencia_fecuencia_activo() {
		return tb_eficiencia_fecuencia_activo;
	}
	
	/**
	 * 
	 */
	public JList<String> getCb_activos() {
		return cb_activos;
	}
	
	/**
	 * 
	 */
	public JSpinner getTb_eficiencia_valor_amenaza() {
		return tb_eficiencia_valor_amenaza;
	}
	
	/**
	 * 
	 */
	public JSpinner getTb_eficiencia_fecuencia_amenaza() {
		return tb_eficiencia_fecuencia_amenaza;
	}


	
	
}
