package datos.POJOS;

public class Degradacion_pojo {

	private String amenaza;
	private String activo;
	private Double degradacion_valor;
	private Double frecuencia_degradacion;
	
	public Degradacion_pojo() {
		super();
		
	}

	public Degradacion_pojo(String amenaza, String activo, Double degradacion_valor,Double frecuencia_degradacion) {
		super();
		this.amenaza = amenaza;
		this.activo = activo;
		this.degradacion_valor = degradacion_valor;
		this.frecuencia_degradacion = frecuencia_degradacion;
	}

	public String getAmenaza() {
		return amenaza;
	}

	public String getActivo() {
		return activo;
	}

	public Double getDegradacion_valor() {
		return degradacion_valor;
	}

	public Double getFrecuencia_degradacion() {
		return frecuencia_degradacion;
	}

	public void setAmenaza(String amenaza) {
		this.amenaza = amenaza;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public void setDegradacion_valor(Double degradacion_valor) {
		this.degradacion_valor = degradacion_valor;
	}

	public void setFrecuencia_degradacion(Double frecuencia_degradacion) {
		this.frecuencia_degradacion = frecuencia_degradacion;
	}


}
