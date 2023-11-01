package datos.POJOS;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;

public class Activo_pojo {

	private String Tipo;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String nivel_valoracion;
	private Double valor_economico;
	private Double valor_acumulado;
	private Double valor_repercutido;
	private Calendar fecha_creacion;
	private List<String> lista_activos_superiores;
	private List<String> lista_activos_inferiores;
	private List<String> lista_amenazas;
	private List<String> lista_salvaguardas;

	
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
		fecha_creacion = new GregorianCalendar();
		lista_activos_superiores = new ArrayList<String>();
		lista_activos_inferiores = new ArrayList<String>();
		lista_amenazas = new ArrayList<String>();
		lista_salvaguardas = new ArrayList<String>();
	}


	public Activo_pojo(String tipo, String codigo, String nombre, String descripcion, String nivel_valoracion,
			Double valor_economico, Double valor_acumulado, Double valor_repercutido, Calendar fecha_creacion,
			List<String> lista_activos_superiores, List<String> lista_activos_inferiores, List<String> lista_amenazas,
			List<String> lista_salvaguardas) {
		super();
		Tipo = tipo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.nivel_valoracion = nivel_valoracion;
		this.valor_economico = valor_economico;
		this.valor_acumulado = valor_acumulado;
		this.valor_repercutido = valor_repercutido;
		this.fecha_creacion = fecha_creacion;
		this.lista_activos_superiores = lista_activos_superiores;
		this.lista_activos_inferiores = lista_activos_inferiores;
		this.lista_amenazas = lista_amenazas;
		this.lista_salvaguardas = lista_salvaguardas;
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


	public Calendar getFecha_creacion() {
		return fecha_creacion;
	}


	public List<String> getLista_activos_superiores() {
		return lista_activos_superiores;
	}


	public List<String> getLista_activos_inferiores() {
		return lista_activos_inferiores;
	}


	public List<String> getLista_amenazas() {
		return lista_amenazas;
	}


	public List<String> getLista_salvaguardas() {
		return lista_salvaguardas;
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


	public void setFecha_creacion(Calendar fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public void setLista_activos_superiores(List<String> lista_activos_superiores) {
		this.lista_activos_superiores = lista_activos_superiores;
	}


	public void setLista_activos_inferiores(List<String> lista_activos_inferiores) {
		this.lista_activos_inferiores = lista_activos_inferiores;
	}


	public void setLista_amenazas(List<String> lista_amenazas) {
		this.lista_amenazas = lista_amenazas;
	}


	public void setLista_salvaguardas(List<String> lista_salvaguardas) {
		this.lista_salvaguardas = lista_salvaguardas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Tipo, codigo, descripcion, fecha_creacion, lista_activos_inferiores,
				lista_activos_superiores, lista_amenazas, lista_salvaguardas, nivel_valoracion, nombre, valor_acumulado,
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
				&& Objects.equals(lista_activos_inferiores, other.lista_activos_inferiores)
				&& Objects.equals(lista_activos_superiores, other.lista_activos_superiores)
				&& Objects.equals(lista_amenazas, other.lista_amenazas)
				&& Objects.equals(lista_salvaguardas, other.lista_salvaguardas)
				&& Objects.equals(nivel_valoracion, other.nivel_valoracion) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(valor_acumulado, other.valor_acumulado)
				&& Objects.equals(valor_economico, other.valor_economico)
				&& Objects.equals(valor_repercutido, other.valor_repercutido);
	}


	@Override
	public String toString() {
		String resultado;
		resultado =
		"Activo_pojo [Tipo=" + Tipo + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", nivel_valoracion=" + nivel_valoracion + ", valor_economico=" + valor_economico
				+ ", valor_acumulado=" + valor_acumulado + ", valor_repercutido=" + valor_repercutido
				+ ", fecha_creacion=" + fecha_creacion + ", lista_activos_superiores=" + lista_activos_superiores
				+ ", lista_activos_inferiores=" + lista_activos_inferiores + ", lista_amenazas=" + lista_amenazas
				+ ", lista_salvaguardas=" + lista_salvaguardas + "]";
		return resultado;
	}
	
	
	
}
