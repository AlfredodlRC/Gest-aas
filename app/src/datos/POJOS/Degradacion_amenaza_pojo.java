package datos.POJOS;

public class Degradacion_amenaza_pojo {

	private String activo;
	private Double degradacion_valor;
	private Double frecuencia_degradacion;
	
	public Degradacion_amenaza_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Degradacion_amenaza_pojo(String activo, Double degradacion_valor, Double frecuencia_degradacion) {
		super();
		this.activo = activo;
		this.degradacion_valor = degradacion_valor;
		this.frecuencia_degradacion = frecuencia_degradacion;
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
