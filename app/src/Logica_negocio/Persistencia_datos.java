package Logica_negocio;

import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Criterio;
import datos.POJOS.Escala;
import datos.POJOS.Relacion_activos;
import datos.POJOS.Salvaguarda_pojo;
import datos.POJOS.Tipo_elemento;

/**
 * Clase para almacenar los datos en memoria
 */
public class Persistencia_datos {

	
	/**
	 * Lista con las escalas de valor
	 */
	private List<Escala> escala_valor;
	
	/**
	 * Lista con las escalas de impacto
	 */
	private List<Escala> escala_impacto;
	
	/**
	 * Lista con las escalas de probabilidad 
	 */
	private List<Escala> escala_probabilidad;
	
	/**
	 *  Lista con las escalas de riesgo
	 */
	private List<Escala> escala_riesgo;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_cei;
	
	/**
	 * Lista con los criterios  
	 */
	private List<Criterio> criterio_crm;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_da;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_ibl_national;
	
	/**
	 * Lista con los criterios  
	 */
	private List<Criterio> criterio_ibl_ue;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_lg;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_lpo;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_olm;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_pi;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_po;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_rto;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_si;
	
	/**
	 * Lista con los criterios 
	 */
	private List<Criterio> criterio_adm;
	
	/**
	 * Activo seleccionado 
	 */
	private Activo_pojo activo_actual;
	
	/**
	 * Amenaza seleccionada
	 */
	private Amenaza_pojo amenaza_actual;
	
	/**
	 * salvaguardas seleccionada
	 */
	private Salvaguarda_pojo salvaguarda_actual;
	
	/**
	 * Lista de activos
	 */
	private List<Activo_pojo> lista_activos;
	
	/**
	 * Lista de amenazas
	 */
	private List<Amenaza_pojo> lista_amenazas;
	
	/**
	 * Lista de salvaguardas
	 */
	private List<Salvaguarda_pojo> lista_salvaguardas;
	
	/**
	 * Lista de tipos de activos
	 */
	private List<Tipo_elemento> lista_tipo_activos;
	
	/**
	 * Lista de tipos de amenazas
	 */
	private List<Tipo_elemento> lista_tipo_amenazas;
	
	/**
	 * lista con las relaciones de activos
	 */
	private List<Relacion_activos> lista_relaciones_activos;
	
	/**
	 * Lista de tipos de salvaguardas
	 */
	private List<Tipo_elemento> lista_tipo_salvaguardas;

	/**
	 * Constructor de la clase
	 */
	public Persistencia_datos() {
		super();
		
		escala_valor = new ArrayList<Escala>();
		escala_impacto = new ArrayList<Escala>();
		escala_probabilidad = new ArrayList<Escala>();
		escala_riesgo = new ArrayList<Escala>();
		
		criterio_cei = new ArrayList<Criterio>();
		criterio_crm = new ArrayList<Criterio>();
		criterio_da = new ArrayList<Criterio>();
		criterio_ibl_national = new ArrayList<Criterio>();
		criterio_ibl_ue = new ArrayList<Criterio>();
		criterio_lg = new ArrayList<Criterio>();
		criterio_lpo = new ArrayList<Criterio>();
		criterio_olm = new ArrayList<Criterio>();
		criterio_pi = new ArrayList<Criterio>();
		criterio_po = new ArrayList<Criterio>();
		criterio_rto = new ArrayList<Criterio>();
		criterio_si = new ArrayList<Criterio>();
		criterio_adm = new ArrayList<Criterio>();
		
		activo_actual = new Activo_pojo();
		amenaza_actual = new Amenaza_pojo();
		salvaguarda_actual = new Salvaguarda_pojo();

		lista_activos = new ArrayList<Activo_pojo>();
		lista_amenazas = new ArrayList<Amenaza_pojo>();
		lista_salvaguardas = new ArrayList<Salvaguarda_pojo>();
		
		lista_tipo_activos = new ArrayList<Tipo_elemento>();
		lista_tipo_amenazas = new ArrayList<Tipo_elemento>();

		lista_relaciones_activos = new ArrayList<Relacion_activos>();
		
		lista_tipo_salvaguardas = new ArrayList<Tipo_elemento>();
		
	}

	/**
	 * 
	 */
	public List<Activo_pojo> getLista_activos() {
		return lista_activos;
	}

	/**
	 * 
	 */
	public List<Amenaza_pojo> getLista_amenazas() {
		return lista_amenazas;
	}

	/**
	 * 
	 */
	public List<Salvaguarda_pojo> getLista_salvaguardas() {
		return lista_salvaguardas;
	}

	/**
	 * 
	 */
	public List<Escala> getEscala_valor() {
		return escala_valor;
	}

	/**
	 * 
	 */
	public List<Escala> getEscala_impacto() {
		return escala_impacto;
	}

	/**
	 * 
	 */
	public List<Escala> getEscala_probabilidad() {
		return escala_probabilidad;
	}

	/**
	 * 
	 */
	public List<Escala> getEscala_riesgo() {
		return escala_riesgo;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_cei() {
		return criterio_cei;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_crm() {
		return criterio_crm;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_da() {
		return criterio_da;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_ibl_national() {
		return criterio_ibl_national;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_ibl_ue() {
		return criterio_ibl_ue;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_lg() {
		return criterio_lg;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_lpo() {
		return criterio_lpo;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_olm() {
		return criterio_olm;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_pi() {
		return criterio_pi;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_po() {
		return criterio_po;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_rto() {
		return criterio_rto;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_si() {
		return criterio_si;
	}

	/**
	 * 
	 */
	public List<Criterio> getCriterio_adm() {
		return criterio_adm;
	}

	/**
	 * 
	 */
	public void setCriterio_adm(List<Criterio> criterio_adm) {
		this.criterio_adm = criterio_adm;
	}

	/**
	 * 
	 */
	public Activo_pojo getActivo_actual() {
		return activo_actual;
	}

	/**
	 * 
	 */
	public void setActivo_actual(Activo_pojo activo_actual) {
		this.activo_actual = activo_actual;
	}

	/**
	 * 
	 */
	public Amenaza_pojo getAmenaza_actual() {
		return amenaza_actual;
	}

	/**
	 * 
	 */
	public void setAmenaza_actual(Amenaza_pojo amenaza_actual) {
		this.amenaza_actual = amenaza_actual;
	}

	/**
	 * 
	 */
	public Salvaguarda_pojo getSalvaguarda_actual() {
		return salvaguarda_actual;
	}

	/**
	 * 
	 */
	public void setSalvaguarda_actual(Salvaguarda_pojo salvaguarda_actual) {
		this.salvaguarda_actual = salvaguarda_actual;
	}

	/**
	 * 
	 */
	public List<Tipo_elemento> getLista_tipo_activos() {
		return lista_tipo_activos;
	}

	/**
	 * 
	 */
	public void setLista_tipo_activos(List<Tipo_elemento> lista_tipo_activos) {
		this.lista_tipo_activos = lista_tipo_activos;
	}

	/**
	 * 
	 */
	public List<Relacion_activos> getLista_relaciones_activos() {
		return lista_relaciones_activos;
	}

	/**
	 * 
	 */
	public void setLista_relaciones_activos(List<Relacion_activos> lista_relaciones_activos) {
		this.lista_relaciones_activos = lista_relaciones_activos;
	}

	/**
	 * 
	 */
	public List<Tipo_elemento> getLista_tipo_amenazas() {
		return lista_tipo_amenazas;
	}

	/**
	 * 
	 */
	public void setLista_tipo_amenazas(List<Tipo_elemento> lista_tipo_amenazas) {
		this.lista_tipo_activos = lista_tipo_amenazas;
	}

	/**
	 * 
	 */
	public List<Tipo_elemento> getLista_tipo_salvaguardas() {
		return lista_tipo_salvaguardas;
	}

	/**
	 * 
	 */
	public void setLista_tipo_salvaguardas(List<Tipo_elemento> lista_tipo_salvaguardas) {
		this.lista_tipo_salvaguardas = lista_tipo_salvaguardas;
	}


	
}
