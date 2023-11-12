package datos.POJOS;

public class Relacion_activos {

	private String activo_superior;
	private String activo_inferior;
	private Double grado;
	
	public Relacion_activos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Relacion_activos(String activo_superior, String activo_inferior, Double grado) {
		super();
		this.activo_superior = activo_superior;
		this.activo_inferior = activo_inferior;
		this.grado = grado;
	}
	
	public String getActivo_superior() {
		return activo_superior;
	}
	
	public String getActivo_inferior() {
		return activo_inferior;
	}
	
	public Double getGrado() {
		return grado;
	}
	
	public void setActivo_superior(String activo_superior) {
		this.activo_superior = activo_superior;
	}
	
	public void setActivo_inferior(String activo_inferior) {
		this.activo_inferior = activo_inferior;
	}
	
	public void setGrado(Double grado) {
		this.grado = grado;
	}
	
	
	
}
