package Logica_negocio;

import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Salvaguarda_pojo;

public class Persistencia_datos {

	private List<String> escala_valor;
	private List<String> criterios;
	private Activo_pojo activo_actual;
	private Amenaza_pojo amenaza_actual;
	private Salvaguarda_pojo salvaguarda_actual;
	
	public Persistencia_datos() {
		super();
		escala_valor = new ArrayList<String>();
		criterios = new ArrayList<String>();
		activo_actual = new Activo_pojo();
		amenaza_actual = new Amenaza_pojo();
		salvaguarda_actual = new Salvaguarda_pojo();
	}
	
}
