package Logica_negocio;

import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Criterio;
import datos.POJOS.Escala;
import datos.POJOS.Salvaguarda_pojo;

public class Persistencia_datos {

	private List<Escala> escala_valor;
	private List<Escala> escala_impacto;
	private List<Escala> escala_probabilidad;
	private List<Escala> escala_riesgo;
	
	private List<Criterio> criterio_cei;
	private List<Criterio> criterio_crm;
	private List<Criterio> criterio_da;
	private List<Criterio> criterio_ibl_national;
	private List<Criterio> criterio_ibl_ue;
	private List<Criterio> criterio_lg;
	private List<Criterio> criterio_lpo;
	private List<Criterio> criterio_olm;
	private List<Criterio> criterio_pi;
	private List<Criterio> criterio_po;
	private List<Criterio> criterio_rto;
	private List<Criterio> criterio_si;
	
	private Activo_pojo activo_actual;
	private Amenaza_pojo amenaza_actual;
	private Salvaguarda_pojo salvaguarda_actual;
	
	public Persistencia_datos() {
		super();
		escala_valor = new ArrayList<Escala>();
		//criterios = new ArrayList<Criterio>();
		activo_actual = new Activo_pojo();
		amenaza_actual = new Amenaza_pojo();
		salvaguarda_actual = new Salvaguarda_pojo();
	}
	
}
