package datos.POJOS;

/**
 * 
 */
 public class Eficiencia_amenaza_pojo {
	
	/**
	 * 
	 */
	
	 private String activo;
	/**
	 * 
	 */
	
	 private String salvaguarda;
	/**
	 * 
	 */
	
	 private Double eficiencia_valor;
	/**
	 * 
	 */
	private Double eficiencia_frecuencia;
	
	/**
	 * 
	 */
	public Eficiencia_amenaza_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Eficiencia_amenaza_pojo(String activo, String salvaguarda, Double eficiencia_valor,
			Double eficiencia_frecuencia) {
		super();
		this.activo = activo;
		this.salvaguarda = salvaguarda;
		this.eficiencia_valor = eficiencia_valor;
		this.eficiencia_frecuencia = eficiencia_frecuencia;
	}

	/**
	 * 
	 */
	public String getActivo() {
		return activo;
	}

	/**
	 * 
	 */
	public String getSalvaguarda() {
		return salvaguarda;
	}

	/**
	 * 
	 */
	public Double getEficiencia_valor() {
		return eficiencia_valor;
	}

	/**
	 * 
	 */
	public Double getEficiencia_frecuencia() {
		return eficiencia_frecuencia;
	}

	/**
	 * 
	 */
	public void setActivo(String activo) {
		this.activo = activo;
	}

	/**
	 * 
	 */
	public void setSalvaguarda(String salvaguarda) {
		this.salvaguarda = salvaguarda;
	}

	/**
	 * 
	 */
	public void setEficiencia_valor(Double eficiencia_valor) {
		this.eficiencia_valor = eficiencia_valor;
	}

	/**
	 * 
	 */
	public void setEficiencia_frecuencia(Double eficiencia_frecuencia) {
		this.eficiencia_frecuencia = eficiencia_frecuencia;
	}
	

}
