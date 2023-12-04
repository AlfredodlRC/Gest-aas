package datos.POJOS;

public class Database_pojo {

	private String host;
	private String puerto;
	private String base_datos;
	private String usuario;
	private String contrasenya;
	
	public Database_pojo() {
		super();
		host = "localhost";
		puerto = "3306";
		base_datos = "gestor_activos_amenazas_salvaguardas";
		usuario = "root";
		contrasenya = "Alfredo";
	}

	public String getHost() {
		return host;
	}

	public String getBase_datos() {
		return base_datos;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setBase_datos(String base_datos) {
		this.base_datos = base_datos;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	
	
	
}
