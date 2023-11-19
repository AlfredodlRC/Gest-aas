package GUI.Ventanas.Herencia;

import java.awt.Dimension;

import javax.swing.JButton;

public class Panel_salvaguarda_manipulacion extends Panel_salvaguarda {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5906802367485612349L;

	private JButton btn_guardar_eficiencia_activo;
	private JButton btn_guardar_eficiencia_amenaza;
	private JButton btn_eliminar_eficiencia_activo;
	private JButton btn_eliminar_eficiencia_amenaza;

	
	public Panel_salvaguarda_manipulacion() {
		super();
		inicializar_componentes_manipulacion();
	}

	private void inicializar_componentes_manipulacion() {
	
		Dimension btn_tamanyo = new Dimension(100,50);

		btn_guardar_eficiencia_activo = new JButton("Almacenar");
		btn_guardar_eficiencia_activo.setSize(btn_tamanyo);
		btn_guardar_eficiencia_activo.setLocation(700,180);
		panel_tab_activos.add(btn_guardar_eficiencia_activo);

		btn_eliminar_eficiencia_activo = new JButton("Eliminar");
		btn_eliminar_eficiencia_activo.setSize(btn_tamanyo);
		btn_eliminar_eficiencia_activo.setLocation(500,180);
		panel_tab_activos.add(btn_eliminar_eficiencia_activo);

		btn_guardar_eficiencia_amenaza = new JButton("Eliminar");
		btn_guardar_eficiencia_amenaza.setSize(btn_tamanyo);
		btn_guardar_eficiencia_amenaza.setLocation(500,180);
		panel_tab_salvalguardas.add(btn_guardar_eficiencia_amenaza);

		btn_eliminar_eficiencia_amenaza = new JButton("Almacenar");
		btn_eliminar_eficiencia_amenaza.setSize(btn_tamanyo);
		btn_eliminar_eficiencia_amenaza.setLocation(700,180);
		panel_tab_salvalguardas.add(btn_eliminar_eficiencia_amenaza);


	}

	public JButton getBtn_guardar_eficiencia_activo() {
		return btn_guardar_eficiencia_activo;
	}

	public JButton getBtn_guardar_eficiencia_amenaza() {
		return btn_guardar_eficiencia_amenaza;
	}

	public JButton getBtn_eliminar_eficiencia_activo() {
		return btn_eliminar_eficiencia_activo;
	}

	public JButton getBtn_eliminar_eficiencia_amenaza() {
		return btn_eliminar_eficiencia_amenaza;
	}

	
}
