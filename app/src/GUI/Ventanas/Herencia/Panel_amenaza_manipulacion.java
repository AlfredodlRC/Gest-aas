package GUI.Ventanas.Herencia;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

/**
 * Clase para poder manipular los datos especificos de las amenazas
 * Hereda de la clase panel_activo
 */
public class Panel_amenaza_manipulacion extends Panel_amenaza {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3279920129695670780L;
	
	/**
	 * Componente tipo botón para agregar la valoración de la degradación de la amenaza sobre un activo
	 */
	private JButton btn_valorar_degradacion;
	
	/**
	 * Componente tipo botón para quitar la valoración de la degradación de la amenaza sobre un activo
	 */
	private JButton btn_quitar_degradacion;
	
	/**
	 * Componente tipo botón para agregar la valoración de la eficiencia de una salvaguarda sobre la amenaza
	 */
	private JButton btn_valorar_eficiencia;
	
	/**
	 * Componente tipo botón para quitar la valoración de la eficiencia de una salvaguarda sobre la amenaza
	 */
	private JButton btn_quitar_eficiencia;
	
	/**
	 * Constructor de la clase
	 */
	public Panel_amenaza_manipulacion() {
		super();
		inicializar_componentes_manipulacion();
	}
	
	/**
	 * Función para inicializar los componentes propios del panel 
	 */
	private void inicializar_componentes_manipulacion() {
		Dimension btn_tamanyo = new Dimension(200,30);
		Point posicion_valorar = new Point(550,200);
		Point posicion_quitar = new Point(650,60);
		Dimension lb_tamanyo = new Dimension(200,200);	
		
		//Dimension lb_tamanyo = new Dimension(200,230);
		Dimension lbl_tamanyo = new Dimension(170,30);
		Dimension tbl_tamanyo = new Dimension(600,240);

		JScrollPane sc_degradaciones;
		JScrollPane sc_eficiencias;
		

		//SpinnerNumberModel spnrModelo1 = new SpinnerNumberModel(0,0,200000000,0.05);
		//SpinnerNumberModel spnrModelo2 = new SpinnerNumberModel(0,0,200000000,0.05);
		//SpinnerNumberModel spnrModelo3 = new SpinnerNumberModel(0,0,100,0.05);
		//SpinnerNumberModel spnrModelo4 = new SpinnerNumberModel(0,0,100,0.05);
		
		
        /*
         * 
         * Panel de degradaciones y sus componentes
         * 
         */

        panel_tab_degradaciones = new JPanel();
        panel_tab_degradaciones.setLayout(null);
        panel_tabulador.addTab("Degradaciones", null, panel_tab_degradaciones,
                "Lista de degradaciones que produce la amenaza");

        degradaciones = new JTable();
    	degradaciones.setSize(tbl_tamanyo);
    	degradaciones.setLocation(10,20);
		
    	sc_degradaciones = new JScrollPane(degradaciones);
    	sc_degradaciones.setSize(tbl_tamanyo);
    	sc_degradaciones.setLocation(10,20);

    	panel_tab_degradaciones.add(sc_degradaciones);
        /*
         * 
         * Panel de eficiencias y sus componentes
         * 
         */

        panel_tab_eficiencias = new JPanel();
        panel_tab_eficiencias.setLayout(null);
        panel_tabulador.addTab("Eficiencias", null, panel_tab_eficiencias,
                "Lista de eficiencias que afectan a la amenaza");

        eficiencias = new JTable();
    	eficiencias.setSize(tbl_tamanyo);
    	eficiencias.setLocation(10,20);

    	sc_eficiencias = new JScrollPane(eficiencias);
    	sc_eficiencias.setSize(tbl_tamanyo);
    	sc_eficiencias.setLocation(10,20);
    	
    	panel_tab_eficiencias.add(sc_eficiencias);

		
		
		
		
		
		
		btn_valorar_degradacion = new JButton("Agregar degradación");
		btn_valorar_degradacion.setSize(btn_tamanyo);
		btn_valorar_degradacion.setLocation(posicion_valorar);
		panel_tab_activos.add(btn_valorar_degradacion);

    	btn_valorar_eficiencia = new JButton("Agregar eficiencia");
    	btn_valorar_eficiencia.setSize(btn_tamanyo);
    	btn_valorar_eficiencia.setLocation(posicion_valorar);
    	panel_tab_salvalguardas.add(btn_valorar_eficiencia);

		btn_quitar_degradacion = new JButton("Quitar degradación");
		btn_quitar_degradacion.setSize(btn_tamanyo);
		btn_quitar_degradacion.setLocation(posicion_quitar);
		panel_tab_degradaciones.add(btn_quitar_degradacion);

		btn_quitar_eficiencia = new JButton("Quitar eficiencia");
		btn_quitar_eficiencia.setSize(btn_tamanyo);
		btn_quitar_eficiencia.setLocation(posicion_quitar);
		panel_tab_eficiencias.add(btn_quitar_eficiencia);




}
	
	/**
	 * 
	 */
	public JButton getBtn_valorar_degradacion() {
		return btn_valorar_degradacion;
	}
	
	/**
	 * 
	 */
	public JButton getBtn_valorar_eficiencia() {
		return btn_valorar_eficiencia;
	}
	
	/**
	 * 
	 */
	public JButton getBtn_quitar_degradacion() {
		return btn_quitar_degradacion;
	}
	
	/**
	 * 
	 */
	public JButton getBtn_quitar_eficiencia() {
		return btn_quitar_eficiencia;
	}

	
}
