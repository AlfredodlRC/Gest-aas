package GUI.Ventanas.Herencia;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Ventana_listados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4612569392974314759L;

	private JTable tabla_listado;
	private JButton btn_ver,btn_modificar,btn_eliminar,btn_cerrar;
	
	public Ventana_listados() {
		setTitle("Gestor AAS - Listado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);

	}

	private void inicializarComponentes() {
		tabla_listado = new JTable();
		tabla_listado.setBounds(10, 10, 860, 400);
		add(tabla_listado);
		
		btn_ver = new JButton("Ver");
		btn_ver.setBounds(410, 420, 100, 30);
		add(btn_ver);
		
		btn_modificar = new JButton("Modificar");
		btn_modificar.setBounds(550, 420, 100, 30);
		add(btn_modificar);
		
		btn_eliminar = new JButton("Eliminar");
		btn_eliminar.setBounds(10, 420, 100, 30);
		add(btn_eliminar);
		
		btn_cerrar = new JButton("Cerrar");
		btn_cerrar.setBounds(770, 420, 100, 30);
		add(btn_cerrar);
		
	}

	
	
}
