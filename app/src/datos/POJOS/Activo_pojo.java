package datos.POJOS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Activo_pojo {

	private String Tipo;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String nivel_valoracion;
	private Double valor_economico;
	private Double valor_acumulado;//Calculado
	private Double valor_repercutido;//Calculado
	private Date fecha_creacion;
	private String criterio_adm;
	private String criterio_cei;
	private String criterio_crm;
	private String criterio_da;
	private String criterio_ibl_national;
	private String criterio_ibl_ue;
	private String criterio_lg;
	private String criterio_lpo;
	private String criterio_olm;
	private String criterio_pi;
	private String criterio_po;
	private String criterio_rto;
	private String criterio_si;

	private List<Relacion_activos> lista_activos_superiores;
	private List<Relacion_activos> lista_activos_inferiores;
	//private List<String> lista_amenazas;
	//private List<String> lista_salvaguardas;

	
	public Activo_pojo() {
		super();
		Tipo = "";
		codigo = "";
		nombre = "";
		descripcion = "";
		nivel_valoracion = "";
		valor_economico = 0.0;
		valor_acumulado = 0.0;
		valor_repercutido = 0.0;
		fecha_creacion = new Date();
		criterio_adm = "";
		criterio_cei = "";
		criterio_crm = "";
		criterio_da = "";
		criterio_ibl_national = "";
		criterio_ibl_ue = "";
		criterio_lg = "";
		criterio_lpo = "";
		criterio_olm = "";
		criterio_pi = "";
		criterio_po = "";
		criterio_rto = "";
		criterio_si = "";

		lista_activos_superiores = new ArrayList<Relacion_activos>();
		lista_activos_inferiores = new ArrayList<Relacion_activos>();
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


	public String getNivel_valoracion() {
		return nivel_valoracion;
	}


	public Double getValor_economico() {
		return valor_economico;
	}


	public Double getValor_acumulado() {
		return valor_acumulado;
	}


	public Double getValor_repercutido() {
		return valor_repercutido;
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


	public void setNivel_valoracion(String nivel_valoracion) {
		this.nivel_valoracion = nivel_valoracion;
	}


	public void setValor_economico(Double valor_economico) {
		this.valor_economico = valor_economico;
	}


	public void setValor_acumulado(Double valor_acumulado) {
		this.valor_acumulado = valor_acumulado;
	}


	public void setValor_repercutido(Double valor_repercutido) {
		this.valor_repercutido = valor_repercutido;
	}


	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public String getCriterio_adm() {
		return criterio_adm;
	}


	public String getCriterio_cei() {
		return criterio_cei;
	}


	public String getCriterio_crm() {
		return criterio_crm;
	}


	public String getCriterio_da() {
		return criterio_da;
	}


	public String getCriterio_ibl_national() {
		return criterio_ibl_national;
	}


	public String getCriterio_ibl_ue() {
		return criterio_ibl_ue;
	}


	public String getCriterio_lg() {
		return criterio_lg;
	}


	public String getCriterio_lpo() {
		return criterio_lpo;
	}


	public String getCriterio_olm() {
		return criterio_olm;
	}


	public String getCriterio_pi() {
		return criterio_pi;
	}


	public String getCriterio_po() {
		return criterio_po;
	}


	public String getCriterio_rto() {
		return criterio_rto;
	}


	public String getCriterio_si() {
		return criterio_si;
	}


	public void setCriterio_adm(String criterio_adm) {
		this.criterio_adm = criterio_adm;
	}


	public void setCriterio_cei(String criterio_cei) {
		this.criterio_cei = criterio_cei;
	}


	public void setCriterio_crm(String criterio_crm) {
		this.criterio_crm = criterio_crm;
	}


	public void setCriterio_da(String criterio_da) {
		this.criterio_da = criterio_da;
	}


	public void setCriterio_ibl_national(String criterio_ibl_national) {
		this.criterio_ibl_national = criterio_ibl_national;
	}


	public void setCriterio_ibl_ue(String criterio_ibl_ue) {
		this.criterio_ibl_ue = criterio_ibl_ue;
	}


	public void setCriterio_lg(String criterio_lg) {
		this.criterio_lg = criterio_lg;
	}


	public void setCriterio_lpo(String criterio_lpo) {
		this.criterio_lpo = criterio_lpo;
	}


	public void setCriterio_olm(String criterio_olm) {
		this.criterio_olm = criterio_olm;
	}


	public void setCriterio_pi(String criterio_pi) {
		this.criterio_pi = criterio_pi;
	}


	public void setCriterio_po(String criterio_po) {
		this.criterio_po = criterio_po;
	}


	public void setCriterio_rto(String criterio_rto) {
		this.criterio_rto = criterio_rto;
	}


	public void setCriterio_si(String criterio_si) {
		this.criterio_si = criterio_si;
	}

	public List<Relacion_activos> getLista_activos_superiores() {
		return lista_activos_superiores;
	}


	public List<Relacion_activos> getLista_activos_inferiores() {
		return lista_activos_inferiores;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Tipo, codigo, descripcion, fecha_creacion, nivel_valoracion, nombre, valor_acumulado,
				valor_economico, valor_repercutido);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activo_pojo other = (Activo_pojo) obj;
		return Objects.equals(Tipo, other.Tipo) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(fecha_creacion, other.fecha_creacion)
				&& Objects.equals(nivel_valoracion, other.nivel_valoracion) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(valor_acumulado, other.valor_acumulado)
				&& Objects.equals(valor_economico, other.valor_economico)
				&& Objects.equals(valor_repercutido, other.valor_repercutido);
	}


	@Override
	public String toString() {
		String resultado;
		resultado = "(" + codigo + ") " + nombre;
		return resultado;
	}
	
	
	
}
