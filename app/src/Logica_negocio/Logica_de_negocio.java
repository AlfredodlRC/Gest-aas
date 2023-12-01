package Logica_negocio;

import java.util.ArrayList;
import java.util.List;

import aplicacion.Principal;
import base_datos.CRUD_Amenazas;
import base_datos.CRUD_Salvaguardas;
import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Criterio;
import datos.POJOS.Escala;
import datos.POJOS.Relacion_activos;
import datos.POJOS.Salvaguarda_pojo;
import datos.POJOS.Tipo_elemento;

public class Logica_de_negocio {

	private Persistencia_datos datos_aplicacion;

	
	public Logica_de_negocio() {
		super();
		datos_aplicacion = new Persistencia_datos();
		cargar_criterios();
		cargar_escalas();
		cargar_activos();
		cargar_amenazas();
		cargar_salvaguardas();
		cargar_tipo_activo();
		cargar_relaciones_activos();
		cargar_tipo_amenazas();
		cargar_tipo_salvaguardas();
	}

	// funciones de cargar datos de la BBDD
	public void cargar_criterios() {
		
		List<Criterio> criterios = new ArrayList<Criterio>();
		
		criterios = Principal.gestor_base_datos.coger_todos_criterios();

		for(Criterio elemento: criterios) {
			switch (elemento.getTipo_criterio()) {
			case "cei":
				datos_aplicacion.getCriterio_cei().add(elemento);
				break;
			case "adm":
				datos_aplicacion.getCriterio_adm().add(elemento);
				break;
			case "crm":
				datos_aplicacion.getCriterio_crm().add(elemento);
				break;
			case "da":
				datos_aplicacion.getCriterio_da().add(elemento);
				break;
			case "ibl nat":
				datos_aplicacion.getCriterio_ibl_national().add(elemento);
				break;
			case "ibl ue":
				datos_aplicacion.getCriterio_ibl_ue().add(elemento);
				break;
			case "lg":
				datos_aplicacion.getCriterio_lg().add(elemento);
				break;
			case "lpo":
				datos_aplicacion.getCriterio_lpo().add(elemento);
				break;
			case "olm":
				datos_aplicacion.getCriterio_olm().add(elemento);
				break;
			case "pi":
				datos_aplicacion.getCriterio_pi().add(elemento);
				break;
			case "po":
				datos_aplicacion.getCriterio_po().add(elemento);
				break;
			case "rto":
				datos_aplicacion.getCriterio_rto().add(elemento);
				break;
			case "si":
				datos_aplicacion.getCriterio_si().add(elemento);
				break;
			default:
				break;
			}
		}
		
	}

	public void cargar_escalas() {
		
		List<Escala> escalas = new ArrayList<Escala>();
		
		escalas = Principal.gestor_base_datos.coger_todas_escalas();

		for(Escala elemento: escalas) {
			switch (elemento.getTipo_escala()) {
			case "impacto":
				datos_aplicacion.getEscala_impacto().add(elemento);
				break;
			case "probabilidad":
				datos_aplicacion.getEscala_probabilidad().add(elemento);
				break;
			case "riesgo":
				datos_aplicacion.getEscala_riesgo().add(elemento);
				break;
			case "valor":
				datos_aplicacion.getEscala_valor().add(elemento);
				break;
			default:
				break;
			}
		}
		
	}

	public void cargar_activos() {

		List<Activo_pojo> activos = new ArrayList<Activo_pojo>();
		
		activos = Principal.gestor_base_datos.coger_lista_activos();
		
		for(Activo_pojo elemento: activos) {
			datos_aplicacion.getLista_activos().add(elemento);
		}

	}

	public void cargar_amenazas() {

		List<Amenaza_pojo> amenazas = new ArrayList<Amenaza_pojo>();
		
		amenazas = Principal.gestor_base_datos.coger_lista_amenazas();
		
		for(Amenaza_pojo elemento: amenazas) {
			datos_aplicacion.getLista_amenazas().add(elemento);
		}
		
	}

	public void cargar_salvaguardas() {

		List<Salvaguarda_pojo> salvaguardas = new ArrayList<Salvaguarda_pojo>();
		
		salvaguardas = Principal.gestor_base_datos.coger_listas_salvaguardas();
		
		for(Salvaguarda_pojo elemento: salvaguardas) {
			datos_aplicacion.getLista_salvaguardas().add(elemento);
		}
	}
	
	public void cargar_tipo_activo() {
		
		List<Tipo_elemento> tipo_activos = new ArrayList<Tipo_elemento>();
		
		tipo_activos = Principal.gestor_base_datos.coger_lista_tipo_activos();
		
		for(Tipo_elemento elemento: tipo_activos) {
			datos_aplicacion.getLista_tipo_activos().add(elemento);
		}
	} 
	
	public void cargar_relaciones_activos() {

		List<Relacion_activos> tipo_activos = new ArrayList<Relacion_activos>();
		
		tipo_activos = Principal.gestor_base_datos.coger_lista_relaciones_activos();
		
		for(Relacion_activos elemento: tipo_activos) {
			datos_aplicacion.getLista_relaciones_activos().add(elemento);
		}
		
	}
	
	public void cargar_tipo_amenazas() {
		
		List<Tipo_elemento> tipo_amenazas = new ArrayList<Tipo_elemento>();
		
		tipo_amenazas = Principal.gestor_base_datos.coger_lista_tipo_amenazas();
		
		for(Tipo_elemento elemento: tipo_amenazas) {
			datos_aplicacion.getLista_tipo_amenazas().add(elemento);
		}
	} 

	public void cargar_tipo_salvaguardas() {
		
		List<Tipo_elemento> tipo_salvaguardas = new ArrayList<Tipo_elemento>();
		
		tipo_salvaguardas = Principal.gestor_base_datos.coger_lista_tipo_salvaguardas();
		
		for(Tipo_elemento elemento: tipo_salvaguardas) {
			datos_aplicacion.getLista_tipo_salvaguardas().add(elemento);
		}
	}

	// Funciones de entregar listas a las pantallas
	
	public List<Activo_pojo> coger_lista_datos_activos() {
		return datos_aplicacion.getLista_activos();
	}
	
	public List<Amenaza_pojo> coger_lista_datos_amenazas() {
		return datos_aplicacion.getLista_amenazas();
	}
	
	public List<Salvaguarda_pojo> coger_lista_datos_salvaguardas() {
		return datos_aplicacion.getLista_salvaguardas();
	}
	
	public List<String> coger_lista_activos() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Activo_pojo elemento: datos_aplicacion.getLista_activos()) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_amenazas() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Amenaza_pojo elemento: datos_aplicacion.getLista_amenazas()) {
			System.out.println(elemento);
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_salvaguardas() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Salvaguarda_pojo elemento: datos_aplicacion.getLista_salvaguardas()) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_escala_valor() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Escala elemento: datos_aplicacion.getEscala_valor()) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_criterio(String criterio) {
		
		List<String> resultado = new ArrayList<String>();
		List<Criterio> lista_criterios = new ArrayList<Criterio>();
		switch (criterio) {
		case "pi":
			lista_criterios = datos_aplicacion.getCriterio_pi();
			break;
		case "cei":
			lista_criterios = datos_aplicacion.getCriterio_cei();
			break;
		case "crm":
			lista_criterios = datos_aplicacion.getCriterio_crm();
			break;
		case "da":
			lista_criterios = datos_aplicacion.getCriterio_da();
			break;
		case "ibl nat":
			lista_criterios = datos_aplicacion.getCriterio_ibl_national();
			break;
		case "ibl ue":
			lista_criterios = datos_aplicacion.getCriterio_ibl_ue();
			break;
		case "lg":
			lista_criterios = datos_aplicacion.getCriterio_lg();
			break;
		case "lpo":
			lista_criterios = datos_aplicacion.getCriterio_lpo();
			break;
		case "olm":
			lista_criterios = datos_aplicacion.getCriterio_olm();
			break;
		case "po":
			lista_criterios = datos_aplicacion.getCriterio_po();
			break;
		case "rto":
			lista_criterios = datos_aplicacion.getCriterio_rto();
			break;
		case "si":
			lista_criterios = datos_aplicacion.getCriterio_si();
			break;
		case "adm":
			lista_criterios = datos_aplicacion.getCriterio_adm();
			break;

		default:
			break;
		}
		
		for(Criterio elemento: lista_criterios) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_tipo_activos() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Tipo_elemento elemento: datos_aplicacion.getLista_tipo_activos()) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<Relacion_activos> coger_lista_relaciones_activos() {
		
		return datos_aplicacion.getLista_relaciones_activos();
		
	}

	public List<String> coger_lista_tipo_amenazas() {
		
		List<String> resultado = new ArrayList<String>();
		
		for(Tipo_elemento elemento: datos_aplicacion.getLista_tipo_amenazas()) {
			resultado.add(elemento.toString());
		}
		return resultado;
		
	}

	public List<String> coger_lista_tipo_salvaguardas() {
		
		List<String> resultado = new ArrayList<String>();
		for(Tipo_elemento elemento: datos_aplicacion.getLista_tipo_salvaguardas()) {
			resultado.add(elemento.toString());
		}
		
		return resultado;
		
	}



	// Entregar el activo actual
	public Activo_pojo get_activo_actual() {
		return datos_aplicacion.getActivo_actual();
	}
	
	// Establecer el activo actual desde la BBDD a partir del código
	public void set_activo_actual(String cod_nom_activo) {
		
		Activo_pojo activo = new Activo_pojo();
		String codigo = this.coger_codigo_nombre(cod_nom_activo);
		
			
		activo = Principal.gestor_base_datos.coger_activo(codigo);
		System.out.println(activo.getCodigo());
		datos_aplicacion.setActivo_actual(activo);
	}

	// Entregar la amenaza actual
	public Amenaza_pojo get_amenaza_actual() {
		return datos_aplicacion.getAmenaza_actual();
	}

	// Establecer el activo actual desde la BBDD a partir del código
	public void set_amenaza_actual(String cod_nom_amenaza) {
		
		Amenaza_pojo amenaza = new Amenaza_pojo();
		String codigo = coger_codigo_nombre(cod_nom_amenaza);
		
		amenaza = Principal.gestor_base_datos.coger_amenaza(codigo);

		datos_aplicacion.setAmenaza_actual(amenaza);
	}

	// Entregar la salvaguarda actual
	public Salvaguarda_pojo get_salvaguarda_actual() {
		return datos_aplicacion.getSalvaguarda_actual();
	}

	// Establecer la salvaguarda actual desde la BBDD a partir del código
	public void set_salvaguarda_actual(String cod_nom_salvaguarda) {
		
		Salvaguarda_pojo salvaguarda = new Salvaguarda_pojo();
		String codigo = coger_codigo_nombre(cod_nom_salvaguarda);
			
		salvaguarda = Principal.gestor_base_datos.coger_salvaguarda(codigo);

		datos_aplicacion.setSalvaguarda_actual(salvaguarda);
	}

	
	// Funcion auxiliar para coger el codigo del elemento de los combobox
	public String coger_codigo_nombre(String cadena) {
		String resultado = "";
		resultado = cadena.substring(cadena.indexOf("(")+1,cadena.indexOf(")"));
		return resultado;
	}

	// Función para eliminar el activo seleccionado tanto de la BBDD como de la persistencia del programa
	public String eliminar_activo_actual() {
		
		String resultado = "";
		String codigo;
		
		codigo = this.datos_aplicacion.getActivo_actual().getCodigo();
		
		System.out.println("Eliminado el activo:"+codigo);
		
		
		resultado = Principal.gestor_base_datos.eliminar_activo(codigo);
		
		datos_aplicacion.getLista_activos().remove(this.datos_aplicacion.getActivo_actual());
		cargar_relaciones_activos();

		Principal.gestor_ventanas.recargar_lista_activos();

		System.out.println("activo "+codigo+" eliminado con resultado:"+resultado);

		
		return resultado;
	}
	
	// Función para crear un activo
	public String crear_activo(Activo_pojo activo_nuevo) {
		String resultado = "";
		String codigo;
		
		codigo = activo_nuevo.getCodigo();
		
		System.out.println("Creando el activo:"+codigo);
		
		
		resultado = Principal.gestor_base_datos.crear_activo(activo_nuevo);
		
		datos_aplicacion.getLista_activos().add(activo_nuevo);
		cargar_relaciones_activos();
		
		Principal.gestor_ventanas.recargar_lista_activos();

		System.out.println("activo "+codigo+" creado con resultado:"+resultado);

		return resultado;
	}
	
	// Función para modificar un activo
	public String modificar_activo_actual(Activo_pojo activo_modificado,String codigo_original) {
		String resultado = "";
		String codigo;
		
		codigo = this.datos_aplicacion.getActivo_actual().getCodigo();
		
		System.out.println("Creando el activo:"+codigo);
		
		resultado = Principal.gestor_base_datos.modificar_activo(codigo_original,activo_modificado);
		
		
		for(int i=0;i<datos_aplicacion.getLista_activos().size();i++) {
			if (datos_aplicacion.getLista_activos().get(i).getCodigo() == codigo_original) {
				datos_aplicacion.getLista_activos().set(i, activo_modificado);
			}
		}
		
		Principal.gestor_ventanas.recargar_lista_activos();
		cargar_relaciones_activos();

		System.out.println("activo "+codigo+" creado con resultado:"+resultado);

	
		return resultado;
	}
	
	//Función para crear una amenaza
	public String crear_amenaza(Amenaza_pojo amenaza_nueva) {
		String resultado = "";
		String codigo;
		
		codigo = amenaza_nueva.getCodigo();
		
		System.out.println("Creando la amenaza:"+codigo);
				
		resultado = Principal.gestor_base_datos.crear_amenaza(amenaza_nueva);
		
		datos_aplicacion.getLista_amenazas().add(amenaza_nueva);
		
		System.out.println("amenaza "+codigo+" creado con resultado:"+resultado);

		return resultado;
	}

	// Función para modificar una amenaza
	public String modificar_amenaza_actual(Amenaza_pojo amenaza_modificado,String codigo_original) {
		String resultado = "";
		String codigo;
		
		codigo = this.datos_aplicacion.getActivo_actual().getCodigo();
		
		System.out.println("Creando el activo:"+codigo);
		
		resultado = Principal.gestor_base_datos.modificar_amenaza(amenaza_modificado, codigo_original);
		
		
		for(int i=0;i<datos_aplicacion.getLista_activos().size();i++) {
			if (datos_aplicacion.getLista_amenazas().get(i).getCodigo() == codigo_original) {
				datos_aplicacion.getLista_amenazas().set(i, amenaza_modificado);
			}
		}
		
		Principal.gestor_ventanas.recargar_lista_activos();

		System.out.println("amenaza "+codigo+" modificado con resultado:"+resultado);

	
		return resultado;
	}
	
	// Función para eliminar la amenaza actual
	public String eliminar_amenaza_actual() {
		String resultado = "";
		String codigo;
		CRUD_Amenazas acceso_amenazas;
		
		codigo = this.datos_aplicacion.getAmenaza_actual().getCodigo();
		
		System.out.println("Eliminado el activo:"+codigo);
		
		acceso_amenazas = new CRUD_Amenazas();
		
		resultado = acceso_amenazas.eliminar_amenaza(codigo);
		
		datos_aplicacion.getLista_amenazas().remove(this.datos_aplicacion.getAmenaza_actual());
		Principal.gestor_ventanas.recargar_lista_amenazas();

		System.out.println("amenaza "+codigo+" eliminado con resultado:"+resultado);

		
		return resultado;
	}

	//Función para crear una salvaguarda
	public String crear_salvaguarda(Salvaguarda_pojo salvaguarda_nueva) {
		String resultado = "";
		String codigo;
		CRUD_Salvaguardas acceso_salvaguardas;
		
		codigo = salvaguarda_nueva.getCodigo();
		
		System.out.println("Creando la salvaguarda:"+codigo);
		
		acceso_salvaguardas = new CRUD_Salvaguardas();
		
		resultado = acceso_salvaguardas.crear_salvaguarda(salvaguarda_nueva);
		
		datos_aplicacion.getLista_salvaguardas().add(salvaguarda_nueva);
		
		Principal.gestor_ventanas.recargar_lista_salvaguardas();

		System.out.println("salvaguarda "+codigo+" creada con resultado:"+resultado);

		return resultado;
	}

	// Función para modificar la salvaguarda actual
	public String modificar_salvaguarda_actual(String codigo_original,Salvaguarda_pojo salvaguarda_modificado) {
		String resultado = "";
		String codigo;
		CRUD_Salvaguardas acceso_salvaguardas;
		
		codigo = this.datos_aplicacion.getSalvaguarda_actual().getCodigo();
		
		System.out.println("Modificando la salvaguarda:"+codigo);
		
		acceso_salvaguardas = new CRUD_Salvaguardas();
		
		resultado = acceso_salvaguardas.modificar_salvaguarda(codigo_original,salvaguarda_modificado);
		
		
		for(int i=0;i<datos_aplicacion.getLista_salvaguardas().size();i++) {
			if (datos_aplicacion.getLista_salvaguardas().get(i).getCodigo() == codigo_original) {
				datos_aplicacion.getLista_salvaguardas().set(i, salvaguarda_modificado);
			}
		}
		
		Principal.gestor_ventanas.recargar_lista_activos();

		System.out.println("salvaguarda "+codigo+" modificado con resultado:"+resultado);
	
		return resultado;
	}
	
	// Función para eliminar la salvaguarda actual
	public String eliminar_salvaguarda_actual() {
		String resultado = "";
		String codigo;
		
		codigo = this.datos_aplicacion.getSalvaguarda_actual().getCodigo();
		
		System.out.println("Eliminado la salvaguarda:"+codigo);
		
		
		resultado = Principal.gestor_base_datos.eliminar_salvaguarda(codigo);
		
		datos_aplicacion.getLista_amenazas().remove(this.datos_aplicacion.getAmenaza_actual());
		Principal.gestor_ventanas.recargar_lista_activos();

		System.out.println("amenaza "+codigo+" eliminado con resultado:"+resultado);

		
		return resultado;
	}
	


}
