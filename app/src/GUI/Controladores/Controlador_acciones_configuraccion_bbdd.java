package GUI.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_configuracion_bbdd;
import aplicacion.Principal;
import datos.POJOS.Database_pojo;

public class Controlador_acciones_configuraccion_bbdd  implements ActionListener{

	private Ventana_configuracion_bbdd ventana;

	public Controlador_acciones_configuraccion_bbdd(Ventana_configuracion_bbdd ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtnaceptar()) { cambiar_datos_bbdd();}
		if (e.getSource() == ventana.getBtncancelar()) { Principal.gestor_ventanas.desactivar_ventana_configuracion_bbdd(); }
	}
	
	private void cambiar_datos_bbdd() {
		String host, puerto, base_datos, usuario, contrasenya;
				
		Database_pojo datos_nueva_bbdd;
		boolean prueba;
		boolean contrasenyas_iguales;
		boolean cambio = false;
		
		host = ventana.getTbhost().getText();
		puerto = ventana.getTbpuerto().getText();
		base_datos = ventana.getTbnombre_base_datos().getText();
		usuario = ventana.getTbusuario().getText();
		contrasenya = String.valueOf(ventana.getTbcontrasenya().getPassword());
		
		contrasenyas_iguales = comprobar_contrasenyas(ventana.getTbcontrasenya().getPassword(),ventana.getTbcontrasenya_repetida().getPassword());
		
		if (contrasenyas_iguales == false) {
			JOptionPane.showMessageDialog(null,"Las contrasenyas no coinciden.","Fallo en las contrasenyas", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		datos_nueva_bbdd = new Database_pojo();
		datos_nueva_bbdd.setHost(host);
		datos_nueva_bbdd.setPuerto(puerto);
		datos_nueva_bbdd.setBase_datos(base_datos);
		datos_nueva_bbdd.setUsuario(usuario);
		datos_nueva_bbdd.setContrasenya(contrasenya);
		
		prueba = Principal.gestor_base_datos.probar_base_datos(datos_nueva_bbdd);
		
		if (prueba == true) {
			//JOptionPane.showMessageDialog(null,"La conexión a la nueva base de datos es correcta.","Conexión existente", JOptionPane.INFORMATION_MESSAGE);
			int res = JOptionPane.showConfirmDialog(null, "¿Desea cambiar los datos de la base de datos?",
					"Confirmación cambio datos BBDD", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (res == JOptionPane.YES_OPTION) {
				Principal.gestor_base_datos.cambiar_datos_conexion_bbdd(datos_nueva_bbdd);
				System.out.println("Se ha cambiado los datos de la BBDD.");
				cambio = true;
			}
		} else {
			JOptionPane.showMessageDialog(null,"Existe un fallo al conectarse a la base de datos.","Fallo en la conexión", JOptionPane.ERROR_MESSAGE);
		}
		
		if (cambio == true) {
			Principal.gestor_ventanas.desactivar_ventana_configuracion_bbdd();
			Principal.gestor_ventanas.recargar_lista_activos();
		}
		
	}
	private boolean comprobar_contrasenyas(char[] contrasenya_1,char[] contrasenya_2 ) {
		boolean resultado = true;
		int i;
		if (contrasenya_1.length != contrasenya_2.length) {
			resultado = false;
		} else {
			for(i=0;i<contrasenya_1.length;i++) {
				if (contrasenya_1[i] != contrasenya_2[i]) {
					resultado = false;					
				} 
			} 
		}
		return resultado;
	}
	
	
}
