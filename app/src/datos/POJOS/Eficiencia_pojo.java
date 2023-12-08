package datos.POJOS;

/**
 * 
 */
public class Eficiencia_pojo {
	
	/**
	 * 
	 */
	private String activo;

	/**
	 * 
	 */
	private String amenaza;

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
	public Eficiencia_pojo() {
		super();
	}
	
	/**
	 * 
	 * @param activo
	 * @param amenaza
	 * @param salvaguarda
	 * @param eficiencia_valor
	 * @param eficiencia_frecuencia
	 */
	public Eficiencia_pojo(String activo, String amenaza, String salvaguarda, Double eficiencia_valor,
			Double eficiencia_frecuencia) {
		super();
		this.activo = activo;
		this.amenaza = amenaza;
		this.salvaguarda = salvaguarda;
		this.eficiencia_valor = eficiencia_valor;
		this.eficiencia_frecuencia = eficiencia_frecuencia;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getActivo() {
		return activo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getAmenaza() {
		return amenaza;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSalvaguarda() {
		return salvaguarda;
	}
	
	/**
	 * 
	 * @return
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
	public void setAmenaza(String amenaza) {
		this.amenaza = amenaza;
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
