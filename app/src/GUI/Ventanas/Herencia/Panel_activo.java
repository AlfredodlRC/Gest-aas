package GUI.Ventanas.Herencia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_activo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 346860977012883873L;
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
	private JLabel lbl_activos_superiores;
	private JLabel lbl_activos_inferiores;
	protected JList<String> activos_superiores;
	protected JList<String> activos_inferiores;
	private JTextField tb_valor_repercutido,tb_valor_acumulado;

	
	public Panel_activo() {
		super();
		setSize(890,295);
		setLayout(null);
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		Dimension lbl_tamanyo = new Dimension(100,30);
		
		lbl_valor_economico = new JLabel("Valor económico");
		lbl_valor_economico.setSize(lbl_tamanyo);
		lbl_valor_economico.setLocation(10,20);
		add(lbl_valor_economico);
		lbl_valor_nivel_valor = new JLabel("Nivel valoración");
		lbl_valor_nivel_valor.setSize(lbl_tamanyo);
		lbl_valor_nivel_valor.setLocation(10,80);
		add(lbl_valor_nivel_valor);
		lbl_valor_repercutido = new JLabel("Repercutido");
		lbl_valor_repercutido.setSize(lbl_tamanyo);
		lbl_valor_repercutido.setLocation(10,140);
		add(lbl_valor_repercutido);
		lbl_valor_acumulado = new JLabel("Acumulado");
		lbl_valor_acumulado.setSize(lbl_tamanyo);
		lbl_valor_acumulado.setLocation(10,200);
		add(lbl_valor_acumulado);
		
		tb_valor_repercutido = new JTextField();
		tb_valor_repercutido.setSize(lbl_tamanyo);
		tb_valor_repercutido.setLocation(10,170);
		add(tb_valor_repercutido);

		tb_valor_acumulado = new JTextField();
		tb_valor_acumulado.setSize(lbl_tamanyo);
		tb_valor_acumulado.setLocation(10,230);
		add(tb_valor_acumulado);

		lbl_criterio_1 = new JLabel("carácter personal");
		lbl_criterio_1.setSize(lbl_tamanyo);
		lbl_criterio_1.setLocation(120,20);
		lbl_criterio_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_1);
		lbl_criterio_2 = new JLabel("obligación legal");
		lbl_criterio_2.setSize(lbl_tamanyo);
		lbl_criterio_2.setLocation(230,20);
		lbl_criterio_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_2);
		lbl_criterio_3 = new JLabel("seguridad");
		lbl_criterio_3.setSize(lbl_tamanyo);
		lbl_criterio_3.setLocation(340,20);
		lbl_criterio_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_3);
		lbl_criterio_4 = new JLabel("comercial");
		lbl_criterio_4.setSize(lbl_tamanyo);
		lbl_criterio_4.setLocation(450,20);
		lbl_criterio_4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_4);
		lbl_criterio_5 = new JLabel("int. servicio");
		lbl_criterio_5.setSize(lbl_tamanyo);
		lbl_criterio_5.setLocation(560,20);
		lbl_criterio_5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_5);
		lbl_criterio_6 = new JLabel("orden público");
		lbl_criterio_6.setSize(lbl_tamanyo);
		lbl_criterio_6.setLocation(670,20);
		lbl_criterio_6.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_6);
		lbl_criterio_7 = new JLabel("operaciones");
		lbl_criterio_7.setSize(lbl_tamanyo);
		lbl_criterio_7.setLocation(780,20);
		lbl_criterio_7.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_7);
		lbl_criterio_8 = new JLabel("admin. y gestión");
		lbl_criterio_8.setSize(lbl_tamanyo);
		lbl_criterio_8.setLocation(170,80);
		lbl_criterio_8.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_8);
		lbl_criterio_9 = new JLabel("reputación");
		lbl_criterio_9.setSize(lbl_tamanyo);
		lbl_criterio_9.setLocation(280,80);
		lbl_criterio_9.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_9);
		lbl_criterio_10 = new JLabel("delitos");
		lbl_criterio_10.setSize(lbl_tamanyo);
		lbl_criterio_10.setLocation(390,80);
		lbl_criterio_10.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_10);
		lbl_criterio_11 = new JLabel("t. recuperación");
		lbl_criterio_11.setSize(lbl_tamanyo);
		lbl_criterio_11.setLocation(500,80);
		lbl_criterio_11.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_11);
		lbl_criterio_12 = new JLabel("info nacional");
		lbl_criterio_12.setSize(lbl_tamanyo);
		lbl_criterio_12.setLocation(610,80);
		lbl_criterio_12.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_12);
		lbl_criterio_13 = new JLabel("info UE");
		lbl_criterio_13.setSize(lbl_tamanyo);
		lbl_criterio_13.setLocation(720,80);
		lbl_criterio_13.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_criterio_13);
		
		lbl_activos_superiores = new JLabel("activos superiores");
		lbl_activos_superiores.setSize(300,80);
		lbl_activos_superiores.setLocation(20,110);
		lbl_activos_superiores.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_activos_superiores);
		
		lbl_activos_inferiores = new JLabel("activos inferiores");
		lbl_activos_inferiores.setSize(300,80);
		lbl_activos_inferiores.setLocation(400,110);
		lbl_activos_inferiores.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbl_activos_inferiores);

		activos_superiores = new JList<String>();
		activos_superiores.setBounds(120, 170, 200, 120);
		activos_superiores.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		add(activos_superiores);
		
		activos_inferiores = new JList<String>();
		activos_inferiores.setBounds(500, 170, 200, 120);
		activos_inferiores.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		add(activos_inferiores);
	}

	public JList<String> getActivos_superiores() {
		return activos_superiores;
	}

	public JList<String> getActivos_inferiores() {
		return activos_inferiores;
	}

	public JTextField getTb_valor_repercutido() {
		return tb_valor_repercutido;
	}

	public JTextField getTb_valor_acumulado() {
		return tb_valor_acumulado;
	}	
	
}
