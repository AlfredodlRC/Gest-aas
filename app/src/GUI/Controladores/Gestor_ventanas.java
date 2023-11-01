package GUI.Controladores;

import GUI.Ventanas.ventanas.Ventana_principal;
import GUI.Ventanas.ventanas.Ventana_listados;
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

public class Gestor_ventanas {

	private Ventana_principal ventana_principal;
	
	private Ventana_listados ventana_listado_activos;
	private Ventana_ver_activo ventana_ver_activo;
	private Ventana_crear_activo ventana_crear_activo;
	private Ventana_modificar_activo ventana_modificar_activo;
	private Ventana_eliminar_activo ventana_eliminar_activo;

	private Ventana_listados ventana_listado_amenaza;
	private Ventana_ver_amenaza ventana_ver_amenaza;
	private Ventana_crear_amenaza ventana_crear_amenaza;
	private Ventana_modificar_amenaza ventana_modificar_amenaza;
	private Ventana_eliminar_amenaza ventana_eliminar_amenaza;

	private Ventana_listados ventana_listado_salvaguarda;
	private Ventana_ver_salvaguarda ventana_ver_salvaguarda;
	private Ventana_crear_salvaguarda ventana_crear_salvaguarda;
	private Ventana_modificar_salvaguarda ventana_modificar_salvaguarda;
	private Ventana_eliminar_salvaguarda ventana_eliminar_salvaguarda;
	
	private Controlador_acciones_principal manejador_principal;

	private Controlador_acciones_crear_activo manejador_crear_activo;

	
	public Gestor_ventanas() {
		super();
		ventana_principal = new GUI.Ventanas.ventanas.Ventana_principal();
		manejador_principal = new GUI.Controladores.Controlador_acciones_principal(ventana_principal);
		ventana_principal.establecerManejador(manejador_principal);

	}

	public void activar_ventana_listado_activos() {
		if (ventana_listado_activos == null) {
			ventana_listado_activos = new Ventana_listados("activo");
		} else {
			ventana_listado_activos.toFront();
		}
	}
	
	public void activar_ventana_ver_activo() {
		if (ventana_ver_activo == null) {
			ventana_ver_activo = new Ventana_ver_activo();
		} else {
			ventana_ver_activo.toFront();
		}	
	}

	public void activar_ventana_crear_activo() {
		if (ventana_crear_activo == null) {
			ventana_crear_activo = new Ventana_crear_activo();
			manejador_crear_activo = new Controlador_acciones_crear_activo(ventana_crear_activo);
			ventana_crear_activo.establecerManejador(manejador_crear_activo);
		} else {
			ventana_crear_activo.toFront();
		}	
	}

	public void activar_ventana_modificar_activo() {
		if (ventana_modificar_activo == null) {
			ventana_modificar_activo = new Ventana_modificar_activo();
		} else {
			ventana_modificar_activo.toFront();
		}	
	}

	public void activar_ventana_eliminar_activo() {
		if (ventana_eliminar_activo == null) {
			ventana_eliminar_activo = new Ventana_eliminar_activo();
		} else {
			ventana_eliminar_activo.toFront();
		}	
	}
	
	public void activar_ventada_listado_amenaza() {
		if (ventana_listado_amenaza == null) {
			ventana_listado_amenaza = new Ventana_listados("amenaza");
		} else {
			ventana_listado_amenaza.toFront();
		}	
	}

	public void activar_ventana_ver_amenaza() {
		if (ventana_ver_amenaza == null) {
			ventana_ver_amenaza = new Ventana_ver_amenaza();
		} else {
			ventana_ver_amenaza.toFront();
		}
	}
	
	public void activar_ventana_crear_amenaza() {
		if (ventana_crear_amenaza == null) {
			ventana_crear_amenaza = new Ventana_crear_amenaza();
		} else {
			ventana_crear_amenaza.toFront();
		}
	}
	
	public void activar_ventana_modificar_amenaza() {
		if (ventana_modificar_amenaza == null) {
			ventana_modificar_amenaza = new Ventana_modificar_amenaza();
		} else {
			ventana_modificar_amenaza.toFront();
		}
	}
	
	public void activar_ventana_eliminar_amenaza() {
		if (ventana_eliminar_amenaza == null) {
			ventana_eliminar_amenaza = new Ventana_eliminar_amenaza();
		} else {
			ventana_eliminar_amenaza.toFront();
		}
	}

	public void activar_ventada_listado_salvaguarda() {
		if (ventana_listado_salvaguarda == null) {
			ventana_listado_salvaguarda = new Ventana_listados("salvaguarda");
		} else {
			ventana_listado_salvaguarda.toFront();
		}			
	}

	
	
	
	
	
	
	public void activar_ventana_ver_salvaguarda() {
		if (ventana_ver_salvaguarda == null) {
			ventana_ver_salvaguarda = new Ventana_ver_salvaguarda();
		} else {
			ventana_ver_salvaguarda.toFront();
		}
	}
	
	public void activar_ventana_crear_salvaguarda() {
		if (ventana_crear_salvaguarda == null) {
			ventana_crear_salvaguarda = new Ventana_crear_salvaguarda();
		} else {
			ventana_crear_salvaguarda.toFront();
		}
	}
	
	public void activar_ventana_modificar_salvaguarda() {
		if (ventana_modificar_salvaguarda == null) {
			ventana_modificar_salvaguarda = new Ventana_modificar_salvaguarda();
		} else {
			ventana_modificar_salvaguarda.toFront();
		}
	}
	
	public void activar_ventana_eliminar_salvaguarda() {
		if (ventana_eliminar_amenaza == null) {
			ventana_eliminar_amenaza = new Ventana_eliminar_amenaza();
		} else {
			ventana_eliminar_amenaza.toFront();
		}		
	}
	
}
