package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import datos.POJOS.Amenaza_pojo;
import datos.POJOS.Salvaguarda_pojo;

public class CRUD_Salvaguardas {

	public CRUD_Salvaguardas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Salvaguarda_pojo> cargar_lista_salvaguardas() {
		
		List<Salvaguarda_pojo> resultado = new ArrayList<Salvaguarda_pojo>();

		Database base_datos = new Database();
		List<List<String>> activos;
		String sql;
		Salvaguarda_pojo salvaguarda;


		sql ="SELECT salvaguarda.cod,salvaguarda.nombre,salvaguarda.descripcion,salvaguarda.Fecha_creacion,tipo_salvaguarda.cod as tipo FROM salvaguarda JOIN tipo_salvaguarda ON salvaguarda.fk_tipo=tipo_salvaguarda.pk;";

		activos = base_datos.realizar_lectura(sql);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
		Date fecha = new Date();

		for(List<String> fila: activos) {
			System.out.println(fila);
			salvaguarda = new Salvaguarda_pojo();
			salvaguarda.setCodigo(fila.get(0));
			salvaguarda.setNombre(fila.get(1));
			salvaguarda.setDescripcion(fila.get(2));
			salvaguarda.setTipo(fila.get(4));				
			try {
				fecha = formatter.parse(fila.get(3).replace("T", " "));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			salvaguarda.setFecha_creacion(fecha);
			resultado.add(salvaguarda);
		}

		return resultado;

	}

}
