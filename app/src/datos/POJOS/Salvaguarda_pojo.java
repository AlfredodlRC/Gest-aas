package datos.POJOS;

import java.util.Date;
import java.util.Objects;

public class Salvaguarda_pojo {
	
	private String Tipo;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Date fecha_creacion;
	
	
	
	public Salvaguarda_pojo() {
		super();
		Tipo = "";
		codigo = "";
		nombre = "";
		descripcion = "";
		fecha_creacion = new Date();
	}

	public Salvaguarda_pojo(String tipo, String codigo, String nombre, String descripcion, Date fecha_creacion) {
		super();
		Tipo = tipo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_creacion = fecha_creacion;
	}

	public String getTipo() {
		return Tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Tipo, codigo, descripcion, fecha_creacion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salvaguarda_pojo other = (Salvaguarda_pojo) obj;
		return Objects.equals(Tipo, other.Tipo) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(fecha_creacion, other.fecha_creacion) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String resultado;
		resultado = "(" + codigo + ") " + nombre;
		return resultado;
	}
	
	
}
