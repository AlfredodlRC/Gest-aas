package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Amenaza_pojo;

public class CRUD_Amenazas {

	public CRUD_Amenazas() {
		super();
		// TODO Auto-generated constructor stub
	}
			
	public List<Amenaza_pojo> cargar_lista_amenazas() {
		List<Amenaza_pojo> resultado = new ArrayList<Amenaza_pojo>();

		Database base_datos = new Database();
		List<List<String>> activos;
		String sql;
		Amenaza_pojo amenaza;
		Date fecha = null;

		sql ="SELECT amenaza.cod,amenaza.nombre,amenaza.descripcion,amenaza.Fecha_creacion,tipo_amenaza.cod as tipo FROM amenaza JOIN tipo_amenaza ON amenaza.fk_tipo=tipo_amenaza.pk;";

		activos = base_datos.realizar_lectura(sql);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);

		for(List<String> fila: activos) {
			System.out.println(fila);
			amenaza = new Amenaza_pojo();
			amenaza.setCodigo(fila.get(0));
			amenaza.setNombre(fila.get(1));
			amenaza.setDescripcion(fila.get(2));
			amenaza.setTipo(fila.get(4));				
			try {
				fecha = formatter.parse(String.valueOf(fila.get(3)).replace("T", " "));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			amenaza.setFecha_creacion(fecha);
			resultado.add(amenaza);
		}

		return resultado;

	}

}
