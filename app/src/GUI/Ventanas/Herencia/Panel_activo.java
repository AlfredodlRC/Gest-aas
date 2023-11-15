package GUI.Ventanas.Herencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_activo extends JPanel {


	private static final long serialVersionUID = 346860977012883873L;
	
	private JTabbedPane panel_tabulador;
	
	protected JComponent panel_tab_Valoracion;
	protected JComponent panel_tab_Criterios;
	protected JComponent panel_tab_Activos_superiores;
	protected JComponent panel_tab_Activos_inferiores;


	private JLabel lbl_valor_economico,lbl_valor_nivel_valor;
	private JLabel lbl_criterio_1;
	private JLabel lbl_criterio_2;
	private JLabel lbl_criterio_3;
	private JLabel lbl_criterio_4;
	private JLabel lbl_criterio_5;
	private JLabel lbl_criterio_6;
	private JLabel lbl_criterio_7;
	private JLabel lbl_criterio_8;
	private JLabel lbl_criterio_9;
	private JLabel lbl_criterio_10;
	private JLabel lbl_criterio_11;
	private JLabel lbl_criterio_12;
	private JLabel lbl_criterio_13;
	private JLabel lbl_valor_repercutido;
	private JLabel lbl_valor_acumulado;
	protected JList<String> activos_disponibles_superiores;
	protected JList<String> activos_disponibles_inferiores;
	private JTextField tb_valor_repercutido,tb_valor_acumulado;

	
	public Panel_activo() {
		super(new GridLayout(1, 1));
		setSize(890,295);
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		Dimension lbl_tamanyo = new Dimension(100,30);
		Point pos_criterio_1 = new Point(10,10);
		Point pos_criterio_2 = new Point(10,45);
		Point pos_criterio_3 = new Point(10,80);
		Point pos_criterio_4 = new Point(10,115);
		Point pos_criterio_5 = new Point(10,150);
		Point pos_criterio_6 = new Point(10,185);
		Point pos_criterio_7 = new Point(410,10);
		Point pos_criterio_8 = new Point(410,45);
		Point pos_criterio_9 = new Point(410,80);
		Point pos_criterio_10 = new Point(410,115);
		Point pos_criterio_11 = new Point(410,150);
		Point pos_criterio_12 = new Point(410,185);
		Point pos_criterio_13 = new Point(410,220);
		
		panel_tabulador = new JTabbedPane();

		panel_tab_Valoracion = new JPanel();
		panel_tab_Valoracion.setLayout(null);
        panel_tabulador.addTab("Valor", null, panel_tab_Valoracion,
                "Agregar degradaciones de los activos");
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_1);

        panel_tab_Criterios = new JPanel();
		panel_tab_Criterios.setLayout(null);
        panel_tabulador.addTab("Criterios", null, panel_tab_Criterios,
                "Agregar degradaciones de los activos");
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_2);

        panel_tab_Activos_superiores = new JPanel();
        panel_tab_Activos_superiores.setLayout(null);
        panel_tabulador.addTab("Activos superiores", null, panel_tab_Activos_superiores,
                "Agregar degradaciones de los activos");
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_3);

        panel_tab_Activos_inferiores = new JPanel();
        panel_tab_Activos_inferiores.setLayout(null);
        panel_tabulador.addTab("Activos inferiores", null, panel_tab_Activos_inferiores,
                "Agregar degradaciones de los activos");
        panel_tabulador.setMnemonicAt(0, KeyEvent.VK_4);



		lbl_valor_economico = new JLabel("Valor económico");
		lbl_valor_economico.setSize(lbl_tamanyo);
		lbl_valor_economico.setLocation(10,80);
		panel_tab_Valoracion.add(lbl_valor_economico);
		
		lbl_valor_nivel_valor = new JLabel("Nivel valoración");
		lbl_valor_nivel_valor.setSize(lbl_tamanyo);
		lbl_valor_nivel_valor.setLocation(10,180);
		panel_tab_Valoracion.add(lbl_valor_nivel_valor);
		
		lbl_valor_repercutido = new JLabel("Repercutido");
		lbl_valor_repercutido.setSize(lbl_tamanyo);
		lbl_valor_repercutido.setLocation(210,80);
		panel_tab_Valoracion.add(lbl_valor_repercutido);
		
		lbl_valor_acumulado = new JLabel("Acumulado");
		lbl_valor_acumulado.setSize(lbl_tamanyo);
		lbl_valor_acumulado.setLocation(410,80);
		panel_tab_Valoracion.add(lbl_valor_acumulado);
		
		tb_valor_repercutido = new JTextField();
		tb_valor_repercutido.setSize(lbl_tamanyo);
		tb_valor_repercutido.setLocation(210,120);
		panel_tab_Valoracion.add(tb_valor_repercutido);

		tb_valor_acumulado = new JTextField();
		tb_valor_acumulado.setSize(lbl_tamanyo);
		tb_valor_acumulado.setLocation(410,120);
		panel_tab_Valoracion.add(tb_valor_acumulado);

		lbl_criterio_1 = new JLabel("carácter personal");
		lbl_criterio_1.setSize(lbl_tamanyo);
		lbl_criterio_1.setLocation(pos_criterio_1);
		lbl_criterio_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_1);
		lbl_criterio_2 = new JLabel("obligación legal");
		lbl_criterio_2.setSize(lbl_tamanyo);
		lbl_criterio_2.setLocation(pos_criterio_2);
		lbl_criterio_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_2);
		lbl_criterio_3 = new JLabel("seguridad");
		lbl_criterio_3.setSize(lbl_tamanyo);
		lbl_criterio_3.setLocation(pos_criterio_3);
		lbl_criterio_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_3);
		lbl_criterio_4 = new JLabel("comercial");
		lbl_criterio_4.setSize(lbl_tamanyo);
		lbl_criterio_4.setLocation(pos_criterio_4);
		lbl_criterio_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_4);
		lbl_criterio_5 = new JLabel("int. servicio");
		lbl_criterio_5.setSize(lbl_tamanyo);
		lbl_criterio_5.setLocation(pos_criterio_5);
		lbl_criterio_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_5);
		lbl_criterio_6 = new JLabel("orden público");
		lbl_criterio_6.setSize(lbl_tamanyo);
		lbl_criterio_6.setLocation(pos_criterio_6);
		lbl_criterio_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_6);
		lbl_criterio_7 = new JLabel("operaciones");
		lbl_criterio_7.setSize(lbl_tamanyo);
		lbl_criterio_7.setLocation(pos_criterio_7);
		lbl_criterio_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_7);
		lbl_criterio_8 = new JLabel("admin. y gestión");
		lbl_criterio_8.setSize(lbl_tamanyo);
		lbl_criterio_8.setLocation(pos_criterio_8);
		lbl_criterio_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_8);
		lbl_criterio_9 = new JLabel("reputación");
		lbl_criterio_9.setSize(lbl_tamanyo);
		lbl_criterio_9.setLocation(pos_criterio_9);
		lbl_criterio_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_9);
		lbl_criterio_10 = new JLabel("delitos");
		lbl_criterio_10.setSize(lbl_tamanyo);
		lbl_criterio_10.setLocation(pos_criterio_10);
		lbl_criterio_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_10);
		lbl_criterio_11 = new JLabel("t. recuperación");
		lbl_criterio_11.setSize(lbl_tamanyo);
		lbl_criterio_11.setLocation(pos_criterio_11);
		lbl_criterio_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_11);
		lbl_criterio_12 = new JLabel("info nacional");
		lbl_criterio_12.setSize(lbl_tamanyo);
		lbl_criterio_12.setLocation(pos_criterio_12);
		lbl_criterio_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_12);
		lbl_criterio_13 = new JLabel("info UE");
		lbl_criterio_13.setSize(lbl_tamanyo);
		lbl_criterio_13.setLocation(pos_criterio_13);
		lbl_criterio_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tab_Criterios.add(lbl_criterio_13);
		
		activos_disponibles_superiores = new JList<String>();
		activos_disponibles_superiores.setBounds(20, 50, 200, 200);
		activos_disponibles_superiores.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		panel_tab_Activos_superiores.add(activos_disponibles_superiores);
		
		activos_disponibles_inferiores = new JList<String>();
		activos_disponibles_inferiores.setBounds(20, 50, 200, 200);
		activos_disponibles_inferiores.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		panel_tab_Activos_inferiores.add(activos_disponibles_inferiores);
		
        add(panel_tabulador);
	}

	public JList<String> getActivos_disponibles_superiores() {
		return activos_disponibles_superiores;
	}

	public JList<String> getActivos_disponibles_inferiores() {
		return activos_disponibles_inferiores;
	}

	public JTextField getTb_valor_repercutido() {
		return tb_valor_repercutido;
	}

	public JTextField getTb_valor_acumulado() {
		return tb_valor_acumulado;
	}	
	
}
