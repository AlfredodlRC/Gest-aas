package Logica_negocio;

import java.util.ArrayList;
import java.util.List;

import base_datos.CRUD_Activos;
import datos.POJOS.Criterio;
import datos.POJOS.Escala;

public class Logica_de_negocio {

	Persistencia_datos datos_aplicacion;

	
	public Logica_de_negocio() {
		super();
		datos_aplicacion = new Persistencia_datos();
		cargar_criterios();
		cargar_escalas();
		cargar_activos();
		cargar_amenazas();
		cargar_salvaguardas();
	}

	public void cargar_criterios() {
		
		CRUD_Activos acceso_activos;
		List<Criterio> criterios = new ArrayList<Criterio>();

		
		acceso_activos = new CRUD_Activos();
		
		criterios = acceso_activos.cargar_criterios();

		
		System.out.println(criterios.get(0).getTipo_criterio());
		
	}

	public void cargar_escalas() {
		
		CRUD_Activos acceso_activos;
		List<Escala> escalas = new ArrayList<Escala>();
		
		acceso_activos = new CRUD_Activos();
		
		escalas = acceso_activos.cargar_escalas();
		
		System.out.println(escalas.get(0).getTipo_escala());
		
	}

	public void cargar_activos() {
		/*
		select cod,nombre,descripcion from activo;
		select cod,nombre,descripcion from amenaza;
		select cod,nombre,descripcion from salvaguarda;
		*/

	}

	public void cargar_amenazas() {
		
	}

	public void cargar_salvaguardas() {
		
	}

}
