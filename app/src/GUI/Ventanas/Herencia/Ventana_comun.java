package GUI.Ventanas.Herencia;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

public class Ventana_comun extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4304796865813473200L;
	
	protected String elemento;
	protected String accion;
	
	private JLabel lbl_tipo,lbl_codigo,lbl_nombe,lbl_descripcion,lbl_fecha;
	private JTextField tb_codigo,tb_nombre;
	private JTextArea tb_descripcion;
	private JSpinner tb_fecha;
	private JButton btn_cancelar;
	protected JButton btn_accion;
	
	public Ventana_comun() {
		setTitle("Gestor AAS - Ventana ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(920, 550);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);

	}

	private void inicializarComponentes() {
				
		elemento = "";
		accion = "";

		lbl_tipo = new JLabel("Tipo");
		lbl_tipo.setBounds(10,20,60,30);
		add(lbl_tipo);
		
		
		lbl_codigo = new JLabel("Código");
		lbl_codigo.setBounds(10,50,60,30);
		add(lbl_codigo);
		
		lbl_nombe = new JLabel("Nombre");
		lbl_nombe.setBounds(10,80,60,30);
		add(lbl_nombe);
		
		lbl_fecha = new JLabel("fecha");
		lbl_fecha.setBounds(10,110,60,30);
		add(lbl_fecha);
		
		lbl_descripcion = new JLabel("Descripción");
		lbl_descripcion.setBounds(260,20,70,30);
		add(lbl_descripcion);

		tb_codigo = new JTextField();
		tb_codigo.setBounds(70,50,160,30);
		add(tb_codigo);

		
		tb_nombre = new JTextField();
		tb_nombre.setBounds(70,80,160,30);
		add(tb_nombre);

		
		tb_fecha = new JSpinner();
		tb_fecha.setBounds(70,110,160,30);
		
		Calendar calendar = Calendar.getInstance();
        Date inicio = calendar.getTime();
        calendar.add(Calendar.YEAR, -100);
        Date fechaAnterior = calendar.getTime();
        calendar.add(Calendar.YEAR, 120);
        Date fechaPosterior = calendar.getTime();
        SpinnerDateModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);
        
        tb_fecha.setModel(fechaModel);
        tb_fecha.setEditor(new JSpinner.DateEditor(tb_fecha, "dd/MM/yyyy"));
		
		
		add(tb_fecha);
		
		tb_descripcion = new JTextArea();
		tb_descripcion.setBounds(260,50,620,90);
		add(tb_descripcion);
		
		btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setBounds(50,450,100,50);
		add(btn_cancelar);
		
		btn_accion = new JButton("Accion");
		btn_accion.setBounds(750,450,100,50);
		add(btn_accion);
		
	}

	public JTextField getTb_codigo() {
		return tb_codigo;
	}

	public void setTb_codigo(JTextField tb_codigo) {
		this.tb_codigo = tb_codigo;
	}

	public JTextField getTb_nombre() {
		return tb_nombre;
	}

	public void setTb_nombre(JTextField tb_nombre) {
		this.tb_nombre = tb_nombre;
	}

	public JTextArea getTb_descripcion() {
		return tb_descripcion;
	}

	public void setTb_descripcion(JTextArea tb_descripcion) {
		this.tb_descripcion = tb_descripcion;
	}

	public JSpinner getTb_fecha() {
		return tb_fecha;
	}

	public void setTb_fecha(JSpinner tb_fecha) {
		this.tb_fecha = tb_fecha;
	}

	public JButton getBtn_cancelar() {
		return btn_cancelar;
	}

	public void setBtn_cancelar(JButton btn_cancelar) {
		this.btn_cancelar = btn_cancelar;
	}

	public JButton getBtn_accion() {
		return btn_accion;
	}

	public void setBtn_accion(JButton btn_accion) {
		this.btn_accion = btn_accion;
	}
	
	
	
}
