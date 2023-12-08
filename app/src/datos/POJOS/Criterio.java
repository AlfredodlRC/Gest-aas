package datos.POJOS;


/**
 * 
 */
public class Criterio {

	/**
	 * 
	 */
	private String nivel;

	/**
	 * 
	 */
	private String codigo;

	/**
	 * 
	 */
	private String descripcion;

	/**
	 * 
	 */
	private String tipo_criterio;

	/**
	 * 
	 */
	public Criterio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public String getNivel() {
		return nivel;
	}

	/**
	 * 
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * 
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * 
	 */
	public String getTipo_criterio() {
		return tipo_criterio;
	}

	/**
	 * 
	 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/**
	 * 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 */
	public void setTipo_criterio(String tipo_criterio) {
		this.tipo_criterio = tipo_criterio;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String resultado;
		resultado = "(" + codigo + ") " + descripcion;
		return resultado;
	}
}
