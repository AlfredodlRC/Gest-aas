package GUI.Ventanas.ventanas;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import GUI.Controladores.Controlador_acciones_configuraccion_bbdd;
import aplicacion.Principal;

public class Ventana_configuracion_bbdd  extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6206877642304986025L;

	
	JLabel lblhost,lblpuerto,lblnombre_base_datos,lblusuario,lblcontrasenya,lblcontrasenya_repetida;
	JTextField tbhost,tbpuerto,tbnombre_base_datos,tbusuario;
	JPasswordField tbcontrasenya,tbcontrasenya_repetida;
	JButton btncancelar,btnaceptar;

	public Ventana_configuracion_bbdd() {
		super();
		 
		setTitle("Gestor AAS - Ventana configuración ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(400, 450);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);

	}
	
	private void inicializarComponentes() {
		lblhost = new JLabel("Host:");
		lblhost.setBounds(20, 10, 150,30);
		add(lblhost);
		lblpuerto = new JLabel("Número de puerto:");
		lblpuerto.setBounds(20, 50, 150,30);
		add(lblpuerto);
		lblnombre_base_datos = new JLabel("Nombre base de datos:");
		lblnombre_base_datos.setBounds(20, 90, 150,30);
		add(lblnombre_base_datos);
		lblusuario = new JLabel("Nombre de usuario:");
		lblusuario.setBounds(20, 130, 150,30);
		add(lblusuario);
		lblcontrasenya = new JLabel("Contraseña:");
		lblcontrasenya.setBounds(20, 170, 150,30);
		add(lblcontrasenya);
		lblcontrasenya_repetida = new JLabel("Contraseña repetida:");
		lblcontrasenya_repetida.setBounds(20, 210, 150,30);
		add(lblcontrasenya_repetida);
		tbhost = new JTextField();
		tbhost.setBounds(170, 10, 200,30);
		add(tbhost);
		tbpuerto = new JTextField();
		tbpuerto.setBounds(170, 50, 200,30);
		add(tbpuerto);
		tbnombre_base_datos = new JTextField();
		tbnombre_base_datos.setBounds(170, 90, 200,30);
		add(tbnombre_base_datos);
		tbusuario = new JTextField();
		tbusuario.setBounds(170, 130, 200,30);
		add(tbusuario);
		tbcontrasenya = new JPasswordField();
		tbcontrasenya.setBounds(170, 170, 200,30);
		add(tbcontrasenya);
		tbcontrasenya_repetida = new JPasswordField();
		tbcontrasenya_repetida.setBounds(170, 210, 200,30);
		add(tbcontrasenya_repetida);
		btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(20, 280, 150,50);
		add(btncancelar);
		btnaceptar = new JButton("Aceptar");
		btnaceptar.setBounds(190, 280, 150,50);
		add(btnaceptar);
	}

	public void establecerManejador(Controlador_acciones_configuraccion_bbdd manejador) {
		btnaceptar.addActionListener(manejador);
		btncancelar.addActionListener(manejador);
	}
	
	public void cargar_datos() {
		
		tbhost.setText(Principal.gestor_base_datos.getDatos_bbdd().getHost());
		tbpuerto.setText(Principal.gestor_base_datos.getDatos_bbdd().getPuerto());
		tbnombre_base_datos.setText(Principal.gestor_base_datos.getDatos_bbdd().getBase_datos());
		tbusuario.setText(Principal.gestor_base_datos.getDatos_bbdd().getUsuario());
		tbcontrasenya.setText(Principal.gestor_base_datos.getDatos_bbdd().getContrasenya());
		tbcontrasenya_repetida.setText(Principal.gestor_base_datos.getDatos_bbdd().getContrasenya());
	}

	public JTextField getTbhost() {
		return tbhost;
	}

	public JTextField getTbpuerto() {
		return tbpuerto;
	}

	public JTextField getTbnombre_base_datos() {
		return tbnombre_base_datos;
	}

	public JTextField getTbusuario() {
		return tbusuario;
	}

	public JPasswordField getTbcontrasenya() {
		return tbcontrasenya;
	}

	public JPasswordField getTbcontrasenya_repetida() {
		return tbcontrasenya_repetida;
	}

	public JButton getBtncancelar() {
		return btncancelar;
	}

	public JButton getBtnaceptar() {
		return btnaceptar;
	}

	public void setTbhost(JTextField tbhost) {
		this.tbhost = tbhost;
	}

	public void setTbpuerto(JTextField tbpuerto) {
		this.tbpuerto = tbpuerto;
	}

	public void setTbnombre_base_datos(JTextField tbnombre_base_datos) {
		this.tbnombre_base_datos = tbnombre_base_datos;
	}

	public void setTbusuario(JTextField tbusuario) {
		this.tbusuario = tbusuario;
	}

	public void setTbcontrasenya(JPasswordField tbcontrasenya) {
		this.tbcontrasenya = tbcontrasenya;
	}

	public void setTbcontrasenya_repetida(JPasswordField tbcontrasenya_repetida) {
		this.tbcontrasenya_repetida = tbcontrasenya_repetida;
	}

	public void setBtncancelar(JButton btncancelar) {
		this.btncancelar = btncancelar;
	}

	public void setBtnaceptar(JButton btnaceptar) {
		this.btnaceptar = btnaceptar;
	}


}
