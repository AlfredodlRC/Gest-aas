package GUI.Controladores;

import GUI.Ventanas.ventanas.Ventana_principal;
import GUI.Ventanas.ventanas.Ventana_listados;

import javax.swing.JOptionPane;

import GUI.Ventanas.ventanas.Ventana_configuracion_bbdd;
import GUI.Ventanas.ventanas.Ventana_crear_activo;
import GUI.Ventanas.ventanas.Ventana_crear_amenaza;
import GUI.Ventanas.ventanas.Ventana_crear_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_eliminar_activo;
import GUI.Ventanas.ventanas.Ventana_eliminar_amenaza;
import GUI.Ventanas.ventanas.Ventana_eliminar_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_modificar_activo;
import GUI.Ventanas.ventanas.Ventana_modificar_amenaza;
import GUI.Ventanas.ventanas.Ventana_modificar_salvaguarda;
import GUI.Ventanas.ventanas.Ventana_ver_activo;
import GUI.Ventanas.ventanas.Ventana_ver_amenaza;
import GUI.Ventanas.ventanas.Ventana_ver_salvaguarda;
import aplicacion.Principal;

public class Gestor_ventanas {

	private Ventana_principal ventana_principal;
	private Controlador_acciones_principal manejador_principal;

	private Ventana_listados ventana_listado_activos;
	
	private Ventana_ver_activo ventana_ver_activo;
	private Ventana_crear_activo ventana_crear_activo;
	private Ventana_modificar_activo ventana_modificar_activo;
	private Ventana_eliminar_activo ventana_eliminar_activo;
	
	private Controlador_acciones_listado manejador_listado_activo;
	private Controlador_acciones_crear_activo manejador_crear_activo;
	private Controlador_acciones_ver_activo manejador_ver_activo;
	private Controlador_acciones_eliminar_activo manejador_eliminar_activo;
	private Controlador_acciones_modificar_activo manejador_modificar_activo;
	
	private Ventana_listados ventana_listado_amenaza;
	private Ventana_ver_amenaza ventana_ver_amenaza;
	private Ventana_crear_amenaza ventana_crear_amenaza;
	private Ventana_modificar_amenaza ventana_modificar_amenaza;
	private Ventana_eliminar_amenaza ventana_eliminar_amenaza;

	private Controlador_acciones_listado manejador_listado_amenaza; 
	private Controlador_acciones_ver_amenaza manejador_ver_amenaza;
	private Controlador_acciones_crear_amenaza manejador_crear_amenaza;
	private Controlador_acciones_modificar_amenaza manejador_modificar_amenaza;
	private Controlador_acciones_eliminar_amenaza manejador_eliminar_amenaza;
	
	private Ventana_listados ventana_listado_salvaguarda;
	private Ventana_ver_salvaguarda ventana_ver_salvaguarda;
	private Ventana_crear_salvaguarda ventana_crear_salvaguarda;
	private Ventana_modificar_salvaguarda ventana_modificar_salvaguarda;
	private Ventana_eliminar_salvaguarda ventana_eliminar_salvaguarda;
	
	private Controlador_acciones_listado manejador_listado_salvaguarda; 
	private Controlador_acciones_ver_salvaguarda manejador_ver_salvaguarda;
	private Controlador_acciones_crear_salvaguarda manejador_crear_salvaguarda;
	private Controlador_acciones_modificar_salvaguarda manejador_modificar_salvaguarda;
	private Controlador_acciones_eliminar_salvaguarda manejador_eliminar_salvaguarda;

	
	private Ventana_configuracion_bbdd ventana_configuracion_bbdd;
	private Controlador_acciones_configuraccion_bbdd manejador_configuraccion_bbdd;
	
	public Gestor_ventanas() {
		super();
		activar_ventana_principal();
	}

	public void activar_ventana_principal() {
		if (ventana_principal == null) {
			ventana_principal = new GUI.Ventanas.ventanas.Ventana_principal();
			manejador_principal = new GUI.Controladores.Controlador_acciones_principal(ventana_principal);
			ventana_principal.establecerManejador(manejador_principal);
		} else {
			ventana_principal.toFront();
		}
		
	}
	
	public void recargar_lista_activos() {
		ventana_principal.establecer_activos();
	}

	public void recargar_lista_amenazas() {
		ventana_principal.establecer_amenazas();
	}

	public void recargar_lista_salvaguardas() {
		ventana_principal.establecer_salvaguardas();
	}


	public void activar_ventana_listado_activos() {

		ventana_listado_activos = new Ventana_listados("activo");
		manejador_listado_activo = new Controlador_acciones_listado(ventana_listado_activos);
		ventana_listado_activos.establecerManejador(manejador_listado_activo);
	}

	public void desactivar_ventana_listado_activos() {
		ventana_listado_activos.setVisible(false);
	}
	

	public void activar_ventana_ver_activo() {
		if (Principal.logica.get_activo_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún activo","Sin activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana ver activo");
		if (ventana_ver_activo == null) {
			ventana_ver_activo = new Ventana_ver_activo();
			manejador_ver_activo = new Controlador_acciones_ver_activo(ventana_ver_activo);
			ventana_ver_activo.establecerManejador(manejador_ver_activo);
		} else {
			ventana_ver_activo.toFront();
		}	
		ventana_ver_activo.setVisible(true);
		ventana_ver_activo.cargar_activo();
	}

	public void desactivar_ventana_ver_activo() {
		ventana_ver_activo.setVisible(false);
	}

	public void activar_ventana_crear_activo() {
		System.out.println("activar ventana crear activo");
		if (ventana_crear_activo == null) {
			ventana_crear_activo = new Ventana_crear_activo();
			manejador_crear_activo = new Controlador_acciones_crear_activo(ventana_crear_activo);
			ventana_crear_activo.establecerManejador(manejador_crear_activo);
		} else {
			ventana_crear_activo.toFront();
		}	
		ventana_crear_activo.setVisible(true);
		ventana_crear_activo.cargar_datos();
	}

	public void desactivar_ventana_crear_activo() {
		ventana_crear_activo.setVisible(false);
	}

	public void activar_ventana_modificar_activo() {
		if (Principal.logica.get_activo_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún activo","Sin activo", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana modificar activo");
		if (ventana_modificar_activo == null) {
			ventana_modificar_activo = new Ventana_modificar_activo();
			manejador_modificar_activo = new Controlador_acciones_modificar_activo(ventana_modificar_activo);
			ventana_modificar_activo.establecerManejador(manejador_modificar_activo);
		} else {
			ventana_modificar_activo.toFront();
		}	
		ventana_modificar_activo.setVisible(true);
		ventana_modificar_activo.cargar_datos();
	}

	public void desactivar_ventana_modificar_activo() {
		ventana_modificar_activo.setVisible(false);
	}

	public void activar_ventana_eliminar_activo() {
		if (Principal.logica.get_activo_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna salvaguarda","Sin salvaguarda", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana eliminar activo");
		if (ventana_eliminar_activo == null) {
			ventana_eliminar_activo = new Ventana_eliminar_activo();
			manejador_eliminar_activo = new Controlador_acciones_eliminar_activo(ventana_eliminar_activo);
			ventana_eliminar_activo.establecerManejador(manejador_eliminar_activo);
		} else {
			ventana_eliminar_activo.toFront();
		}	
		ventana_eliminar_activo.setVisible(true);
		ventana_eliminar_activo.cargar_activo();
	}

	public void desactivar_ventana_eliminar_activo() {
		ventana_eliminar_activo.setVisible(false);
	}


	public void activar_ventada_listado_amenaza() {
		ventana_listado_amenaza = new Ventana_listados("amenaza");
		manejador_listado_amenaza = new Controlador_acciones_listado(ventana_listado_amenaza);
		ventana_listado_amenaza.establecerManejador(manejador_listado_amenaza);
	}

	public void desactivar_ventana_listado_amenaza() {
		ventana_listado_amenaza.setVisible(false);
	}
	

	public void activar_ventana_ver_amenaza() {
		if (Principal.logica.get_amenaza_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna amenaza","Sin amenaza", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana ver amenaza");
		if (ventana_ver_amenaza == null) {
			ventana_ver_amenaza = new Ventana_ver_amenaza();
			manejador_ver_amenaza = new Controlador_acciones_ver_amenaza(ventana_ver_amenaza);
			ventana_ver_amenaza.establecerManejador(manejador_ver_amenaza);
		} else {
			ventana_ver_amenaza.toFront();
		}	
		ventana_ver_amenaza.setVisible(true);
		ventana_ver_amenaza.cargar_amenaza();
	}

	public void desactivar_ventana_ver_amenaza() {
		System.out.println("desactivar ventana ver amenaza");
		ventana_ver_amenaza.setVisible(false);
	}
	
	public void activar_ventana_crear_amenaza() {
			System.out.println("activar ventana crear activo");
			if (ventana_crear_amenaza == null) {
				ventana_crear_amenaza = new Ventana_crear_amenaza();
				manejador_crear_amenaza = new Controlador_acciones_crear_amenaza(ventana_crear_amenaza);
				ventana_crear_amenaza.establecerManejador(manejador_crear_amenaza);
			} else {
				ventana_crear_amenaza.toFront();
			}	
			ventana_crear_amenaza.setVisible(true);
			ventana_crear_amenaza.cargar_datos();
		}

		public void desactivar_ventana_crear_amenaza() {
			ventana_crear_amenaza.setVisible(false);
		}
	
	public void activar_ventana_modificar_amenaza() {
		if (Principal.logica.get_amenaza_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna amenaza","Sin amenaza", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana modificar amenaza");
		if (ventana_modificar_amenaza == null) {
			ventana_modificar_amenaza = new Ventana_modificar_amenaza();
			manejador_modificar_amenaza = new Controlador_acciones_modificar_amenaza(ventana_modificar_amenaza);
			ventana_modificar_amenaza.establecerManejador(manejador_modificar_amenaza);
		} else {
			ventana_modificar_amenaza.toFront();
		}	
		ventana_modificar_amenaza.setVisible(true);
		ventana_modificar_amenaza.cargar_datos();
	}

	public void desactivar_ventana_modificar_amenaza() {
		ventana_modificar_amenaza.setVisible(false);
	}
	
	public void activar_ventana_eliminar_amenaza() {
		if (Principal.logica.get_amenaza_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna amenaza","Sin amenaza", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana eliminar amenaza");
		if (ventana_eliminar_amenaza == null) {
			ventana_eliminar_amenaza = new Ventana_eliminar_amenaza();
			manejador_eliminar_amenaza = new Controlador_acciones_eliminar_amenaza(ventana_eliminar_amenaza);
			ventana_eliminar_amenaza.establecerManejador(manejador_eliminar_amenaza);
		} else {
			ventana_eliminar_amenaza.toFront();
		}	
		ventana_eliminar_amenaza.setVisible(true);
		ventana_eliminar_amenaza.cargar_amenaza();
	}

	public void desactivar_ventana_eliminar_amenaza() {
		System.out.println("desactivar ventana eliminar amenaza");
		ventana_eliminar_amenaza.setVisible(false);
	}

	public void activar_ventada_listado_salvaguarda() {
		ventana_listado_salvaguarda = new Ventana_listados("salvaguarda");
		manejador_listado_salvaguarda = new Controlador_acciones_listado(ventana_listado_salvaguarda);
		ventana_listado_salvaguarda.establecerManejador(manejador_listado_salvaguarda);
	}

	public void desactivar_ventana_listado_salvaguarda() {
		ventana_listado_salvaguarda.setVisible(false);
	}
	
		
	public void activar_ventana_ver_salvaguarda() {
		if (Principal.logica.get_salvaguarda_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna salvaguarda","Sin salvaguarda", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana ver salvaguarda");
		if (ventana_ver_salvaguarda == null) {
			ventana_ver_salvaguarda = new Ventana_ver_salvaguarda();
			manejador_ver_salvaguarda = new Controlador_acciones_ver_salvaguarda(ventana_ver_salvaguarda);
			ventana_ver_salvaguarda.establecerManejador(manejador_ver_salvaguarda);
		} else {
			ventana_ver_salvaguarda.toFront();
		}	
		ventana_ver_salvaguarda.setVisible(true);
		ventana_ver_salvaguarda.cargar_salvaguarda();
	}

	public void desactivar_ventana_ver_salvaguarda() {
		System.out.println("desactivar ventana ver salvaguarda");
		ventana_ver_salvaguarda.setVisible(false);
	}
	
	public void activar_ventana_crear_salvaguarda() {
		System.out.println("activar ventana crear salvaguarda");
		if (ventana_crear_salvaguarda == null) {
			ventana_crear_salvaguarda = new Ventana_crear_salvaguarda();
			manejador_crear_salvaguarda = new Controlador_acciones_crear_salvaguarda(ventana_crear_salvaguarda);
			ventana_crear_salvaguarda.establecerManejador(manejador_crear_salvaguarda);
		} else {
			ventana_crear_salvaguarda.toFront();
		}	
		ventana_crear_salvaguarda.setVisible(true);
		ventana_crear_salvaguarda.cargar_datos();
	}

	public void desactivar_ventana_crear_salvaguarda() {
		System.out.println("desactivar ventana crear salvaguarda");
		ventana_crear_salvaguarda.setVisible(false);
	}
	
	
	public void activar_ventana_modificar_salvaguarda() {
		if (Principal.logica.get_salvaguarda_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna salvaguarda","Sin salvaguarda", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana modificar salvaguarda");
		if (ventana_modificar_salvaguarda == null) {
			ventana_modificar_salvaguarda = new Ventana_modificar_salvaguarda();
			manejador_modificar_salvaguarda = new Controlador_acciones_modificar_salvaguarda(ventana_modificar_salvaguarda);
			ventana_modificar_salvaguarda.establecerManejador(manejador_modificar_salvaguarda);
		} else {
			ventana_modificar_salvaguarda.toFront();
			ventana_modificar_salvaguarda.cargar_datos();
		}	
		ventana_modificar_salvaguarda.setVisible(true);
	}

	public void desactivar_ventana_modificar_salvaguarda() {
		System.out.println("desactivar ventana modificar salvaguarda");
		//ventana_modificar_salvaguarda.setVisible(false);
		ventana_modificar_salvaguarda.dispose();
	}
	
	public void activar_ventana_eliminar_salvaguarda() {
		if (Principal.logica.get_salvaguarda_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna salvaguarda","Sin salvaguarda", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("activar ventana eliminar salvaguarda");
		if (ventana_eliminar_salvaguarda == null) {
			ventana_eliminar_salvaguarda = new Ventana_eliminar_salvaguarda();
			manejador_eliminar_salvaguarda = new Controlador_acciones_eliminar_salvaguarda(ventana_eliminar_salvaguarda);
			ventana_eliminar_salvaguarda.establecerManejador(manejador_eliminar_salvaguarda);
		} else {
			ventana_eliminar_salvaguarda.toFront();
		}	
		ventana_eliminar_salvaguarda.setVisible(true);
		ventana_eliminar_salvaguarda.cargar_salvaguarda();
	}

	public void desactivar_ventana_eliminar_salvaguarda() {
		if (Principal.logica.get_salvaguarda_actual().getCodigo() == "") {
			JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna salvaguarda","Sin salvaguarda", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		System.out.println("desactivar ventana eliminar salvaguarda");
		ventana_eliminar_salvaguarda.setVisible(false);
	}
	
	public void activar_ventana_configuracion_bbdd() {
		System.out.println("activar ventana configuracion BBDD");
		if (ventana_configuracion_bbdd == null) {
			ventana_configuracion_bbdd = new Ventana_configuracion_bbdd();
			manejador_configuraccion_bbdd = new Controlador_acciones_configuraccion_bbdd(ventana_configuracion_bbdd);
			ventana_configuracion_bbdd.establecerManejador(manejador_configuraccion_bbdd);
		} else {
			ventana_configuracion_bbdd.toFront();
		}	
		ventana_configuracion_bbdd.setVisible(true);
		ventana_configuracion_bbdd.cargar_datos();
	}

	public void desactivar_ventana_configuracion_bbdd() {
		System.out.println("desactivar ventana configuracion BBDD");
		ventana_configuracion_bbdd.setVisible(false);
	}
	
	public void recoger_datos_principal() {
		ventana_principal.recoger_datos();
	}
	
	
	
}
