package datos.POJOS;

public class Tipo_elemento {

	private String codigo;
	private String nombre;
	
	public Tipo_elemento() {
		super();
	}

	public Tipo_elemento(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "(" + codigo + ") " + nombre;
	}
	
	
}
