package datos.POJOS;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Relacion_activos [activo_superior=" + activo_superior + ", activo_inferior=" + activo_inferior
				+ ", grado=" + grado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo_inferior, activo_superior, grado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relacion_activos other = (Relacion_activos) obj;
		return Objects.equals(activo_inferior, other.activo_inferior)
				&& Objects.equals(activo_superior, other.activo_superior) && Objects.equals(grado, other.grado);
	}
	
	
	
}
