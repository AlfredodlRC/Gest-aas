package base_datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import datos.POJOS.Activo_pojo;
import datos.POJOS.Criterio;
import datos.POJOS.Escala;
import datos.POJOS.Relacion_activos;
import datos.POJOS.Tipo_elemento;

public class CRUD_Activos {

		public CRUD_Activos() {
			super();
		}
		
		public List<Criterio> cargar_criterios() {
			List<Criterio> resultado = new ArrayList<Criterio>();
			Database base_datos = new Database();
			List<String> lista_sql = new ArrayList<String>();
			List<List<String>> criterios;
			Criterio nuevo_criterio;
			
			lista_sql.add("select 'cei' as criterio,nivel,codigo,descripcion from criterio_cei;");
			lista_sql.add("select 'crm' as criterio,nivel,codigo,descripcion from criterio_crm;");
			lista_sql.add("select 'da' as criterio,nivel,codigo,descripcion from criterio_da;");
			lista_sql.add("select 'ibl nat' as criterio,nivel,codigo,descripcion from criterio_ibl_national;");
			lista_sql.add("select 'ibl ue' as criterio,nivel,codigo,descripcion from criterio_ibl_ue;");
			lista_sql.add("select 'lg' as criterio,nivel,codigo,descripcion from criterio_lg;");
			lista_sql.add("select 'lpo' as criterio,nivel,codigo,descripcion from criterio_lpo;");
			lista_sql.add("select 'olm' as criterio,nivel,codigo,descripcion from criterio_olm;");
			lista_sql.add("select 'pi' as criterio,nivel,codigo,descripcion from criterio_pi;");
			lista_sql.add("select 'po' as criterio,nivel,codigo,descripcion from criterio_po;");
			lista_sql.add("select 'rto' as criterio,nivel,codigo,descripcion from criterio_rto;");
			lista_sql.add("select 'si' as criterio,nivel,codigo,descripcion from criterio_si;");
			lista_sql.add("select 'adm' as criterio,nivel,codigo,descripcion from criterio_adm;");
			
			for(String sql: lista_sql) {
				criterios = base_datos.realizar_lectura(sql);
				for(List<String> fila: criterios) {
					nuevo_criterio = new Criterio();
					nuevo_criterio.setTipo_criterio(fila.get(0));
					nuevo_criterio.setNivel(fila.get(1));
					nuevo_criterio.setCodigo(fila.get(2));
					nuevo_criterio.setDescripcion(fila.get(3));
					resultado.add(nuevo_criterio);
				}
			}
			
			
			return resultado;
		}

		public List<Escala> cargar_escalas() {
			
			List<Escala> resultado = new ArrayList<Escala>();

			Database base_datos = new Database();
			List<String> lista_sql = new ArrayList<String>();
			List<List<String>> escalas;
			Escala nueva_escala;

			lista_sql.add("select 'impacto' as escala,abreviadura,magnitud from escala_impacto;");
			lista_sql.add("select 'probabilidad' as escala,abreviadura,magnitud from escala_probabilidad;");
			lista_sql.add("select 'riesgo' as escala,abreviadura,magnitud from escala_riesgo;");
			lista_sql.add("select 'valor' as escala,abreviadura,magnitud from escala_valor;");
			
			for(String sql: lista_sql) {
				escalas = base_datos.realizar_lectura(sql);
				for(List<String> fila: escalas) {
					nueva_escala = new Escala();
					nueva_escala.setTipo_escala(fila.get(0));
					nueva_escala.setAbreviadura(fila.get(1));
					nueva_escala.setMagnitud(fila.get(2));
					resultado.add(nueva_escala);
				}
			}
			
			return resultado;
		}
		
		public List<Activo_pojo> cargar_lista_activos() {
			List<Activo_pojo> resultado = new ArrayList<Activo_pojo>();

			Database base_datos = new Database();
			List<List<String>> activos;
			String sql;
			Activo_pojo activo;
			GregorianCalendar fecha;

			
			sql = "SELECT activo.cod,activo.nombre,activo.descripcion,activo.Fecha_creacion,tipo_activo.cod as tipo";
			sql += " FROM activo JOIN tipo_activo ON activo.fk_tipo=tipo_activo.pk;";

			activos = base_datos.realizar_lectura(sql);
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
			Date fecha_activo = new Date();

			for(List<String> fila: activos) {
				activo = new Activo_pojo();
				activo.setCodigo(fila.get(0));
				activo.setNombre(fila.get(1));
				activo.setDescripcion(fila.get(2));
				activo.setTipo(fila.get(4));				
				try {
					fecha_activo = formatter.parse(fila.get(3).replace("T", " "));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fecha = new GregorianCalendar();
				fecha.setTime(fecha_activo);
				activo.setFecha_creacion(fecha.getTime());
				resultado.add(activo);
			}

			return resultado;
			
		}
		
		public Activo_pojo cargar_activo_codigo(String codigo) {
			
			Activo_pojo resultado = new Activo_pojo();
			Database base_datos = new Database();
			List<List<String>> activos;
			String sql;
			Date fecha;

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm", Locale.ENGLISH);
			Date fecha_activo = new Date();

			sql = "SELECT activo.cod,activo.nombre,activo.descripcion,activo.Fecha_creacion,";
			sql += "tipo_activo.cod as tipo,valoracion.economica,escala_valor.magnitud as nivel_valor,";
			sql += "CONCAT('(',criterio_adm.codigo,') ',criterio_adm.descripcion) as criterio_adm,";
			sql += "CONCAT('(',criterio_cei.codigo,') ',criterio_cei.descripcion) as criterio_cei,";
			sql += "CONCAT('(',criterio_crm.codigo,') ',criterio_crm.descripcion) as criterio_crm,";
			sql += "CONCAT('(',criterio_da.codigo,') ',criterio_da.descripcion) as criterio_da,";
			sql += "CONCAT('(',criterio_ibl_national.codigo,') ',criterio_ibl_national.descripcion) as criterio_criterio_ibl_national,";
			sql += "CONCAT('(',criterio_ibl_ue.codigo,') ',criterio_ibl_ue.descripcion) as criterio_ibl_ue,";
			sql += "CONCAT('(',criterio_lg.codigo,') ',criterio_lg.descripcion) as criterio_lg,";
			sql += "CONCAT('(',criterio_lpo.codigo,') ',criterio_lpo.descripcion) as criterio_lpo,";
			sql += "CONCAT('(',criterio_olm.codigo,') ',criterio_olm.descripcion) as criterio_olm,";
			sql += "CONCAT('(',criterio_pi.codigo,') ',criterio_pi.descripcion) as criterio_pi,";
			sql += "CONCAT('(',criterio_po.codigo,') ',criterio_po.descripcion) as criterio_po,";
			sql += "CONCAT('(',criterio_rto.codigo,') ',criterio_rto.descripcion) as criterio_rto,";
			sql += "CONCAT('(',criterio_si.codigo,') ',criterio_si.descripcion) as criterio_si";
			sql += " FROM activo JOIN tipo_activo ON activo.fk_tipo=tipo_activo.pk"; 
			sql += " JOIN valoracion ON activo.pk=valoracion.fk_activo";
			sql += " JOIN escala_valor ON valoracion.fk_escala=escala_valor.PK";
			sql += " JOIN valor_criterio ON valoracion.fk_criterio=valor_criterio.pk";
			sql += " JOIN criterio_adm ON valor_criterio.fk_adm=criterio_adm.PK";
			sql += " JOIN criterio_cei ON valor_criterio.fk_adm=criterio_cei.PK";
			sql += " JOIN criterio_crm ON valor_criterio.fk_adm=criterio_crm.PK";
			sql += " JOIN criterio_da ON valor_criterio.fk_adm=criterio_da.PK";
			sql += " JOIN criterio_ibl_national ON valor_criterio.fk_adm=criterio_ibl_national.PK";
			sql += " JOIN criterio_ibl_ue ON valor_criterio.fk_adm=criterio_ibl_ue.PK";
			sql += " JOIN criterio_lg ON valor_criterio.fk_adm=criterio_lg.PK";
			sql += " JOIN criterio_lpo ON valor_criterio.fk_adm=criterio_lpo.PK";
			sql += " JOIN criterio_olm ON valor_criterio.fk_adm=criterio_olm.PK";
			sql += " JOIN criterio_pi ON valor_criterio.fk_adm=criterio_pi.PK";
			sql += " JOIN criterio_po ON valor_criterio.fk_adm=criterio_po.PK";
			sql += " JOIN criterio_rto ON valor_criterio.fk_adm=criterio_rto.PK";
			sql += " JOIN criterio_si ON valor_criterio.fk_adm=criterio_si.PK";
			sql += " WHERE activo.cod LIKE '" + codigo + "';";

			activos = base_datos.realizar_lectura(sql);
			if (activos.size() > 0) {
				resultado.setCodigo(activos.get(0).get(0));
				resultado.setNombre(activos.get(0).get(1));
				resultado.setDescripcion(activos.get(0).get(2));
				try {
					fecha_activo = formatter.parse(activos.get(0).get(3).replace("T", " "));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fecha = new Date();
				fecha.setTime(fecha_activo.getTime());
				resultado.setTipo(activos.get(0).get(4));				
				resultado.setFecha_creacion(fecha);
				resultado.setValor_economico(Double.parseDouble(activos.get(0).get(5)));
				resultado.setNivel_valoracion(activos.get(0).get(6));
				resultado.setCriterio_adm(activos.get(0).get(7));
				resultado.setCriterio_cei(activos.get(0).get(8));
				resultado.setCriterio_crm(activos.get(0).get(9));
				resultado.setCriterio_da(activos.get(0).get(10));
				resultado.setCriterio_ibl_national(activos.get(0).get(11));
				resultado.setCriterio_ibl_ue(activos.get(0).get(12));
				resultado.setCriterio_lg(activos.get(0).get(13));
				resultado.setCriterio_lpo(activos.get(0).get(14));
				resultado.setCriterio_olm(activos.get(0).get(15));
				resultado.setCriterio_pi(activos.get(0).get(16));
				resultado.setCriterio_po(activos.get(0).get(17));
				resultado.setCriterio_rto(activos.get(0).get(18));
				resultado.setCriterio_si(activos.get(0).get(19));
				
			}
			
			return resultado;
		}
		
		public String eliminar_activo(String codigo) {
			String resultado = "";
			Database base_datos = new Database();
			String sql_pk;
			String sql_valor_criterio;
			String sql_valoracion;
			String sql_dependencia;
			String sql_activo;
			boolean resultado_consulta;
			/* 
			 * Hay que eliminar de las tablas:
			 *  valor_criterio
			 *  valoracion
			 *  rel_dependencia_activos
			 *  activo
			 */
			sql_pk = "(select pk from activo where cod='"+codigo+"')";
			sql_valor_criterio = "DELETE FROM valor_criterio WHERE pk=(select fk_criterio from valoracion where fk_activo="+sql_pk+");";
			sql_valoracion = "DELETE FROM valoracion WHERE fk_activo="+sql_pk+";";
			sql_dependencia = "DELETE FROM rel_dependencia_activos WHERE fk_inferior="+sql_pk+" or fk_superior="+sql_pk+";";
			sql_activo = "DELETE FROM activo WHERE cod='"+codigo+"';";
			resultado_consulta = base_datos.realizar_eliminacion(sql_dependencia);
			resultado_consulta = base_datos.realizar_eliminacion(sql_valoracion);
			resultado_consulta = base_datos.realizar_eliminacion(sql_valor_criterio);
			resultado_consulta = base_datos.realizar_eliminacion(sql_activo);

			return resultado;
		}

		public List<Tipo_elemento> cargar_lista_tipo_activos() {
			
			List<Tipo_elemento> resultado = new ArrayList<Tipo_elemento>();

			Database base_datos = new Database();
			List<List<String>> tipo_activos;
			String sql;
			Tipo_elemento tipo_activo;

			
			sql = "select cod,nombre from tipo_activo;";
			
			tipo_activos = base_datos.realizar_lectura(sql);
			
			for(List<String> fila: tipo_activos) {
				tipo_activo = new Tipo_elemento();
				tipo_activo.setCodigo(fila.get(0));
				tipo_activo.setNombre(fila.get(1));
				resultado.add(tipo_activo);
			}
			return resultado;

		}
		
		public List<Relacion_activos> cargar_relaciones_activos() {

			List<Relacion_activos> resultado = new ArrayList<Relacion_activos>();

			Database base_datos = new Database();
			List<List<String>> relaciones_activos;
			String sql;
			Relacion_activos relacion_activos;

			
			sql = "SELECT activo_superior.cod,activo_inferior.cod,grado FROM rel_dependencia_activos"; 
			sql += " JOIN activo as activo_superior ON rel_dependencia_activos.fk_superior=activo_superior.pk";
			sql += " JOIN activo as activo_inferior ON rel_dependencia_activos.fk_inferior=activo_inferior.pk;";
			relaciones_activos = base_datos.realizar_lectura(sql);
			for(List<String> fila: relaciones_activos) {
				relacion_activos = new Relacion_activos();
				relacion_activos.setActivo_superior(fila.get(0));
				relacion_activos.setActivo_inferior(fila.get(1));
				relacion_activos.setGrado(Double.parseDouble(fila.get(2)));
				resultado.add(relacion_activos);
			}
			return resultado;

		}



		public String crear_activo(Activo_pojo activo) {
			String resultado = "";
			Database base_datos = new Database();
			String sql_pk;
			String sql_valor_criterio;
			String sql_valoracion;
			String sql_dependencia;
			String sql_activo;
			boolean resultado_creacion;
			List<List<String>> pks;
			String pk_activo;
			String pk_valoracion;
			String pk_valor_criterio;
			/* 
			 * Hay que crear en las tablas:
			 *  activo
			 *  valor_criterio
			 *  valoracion
			 *  rel_dependencia_activos
			 */
			sql_pk = "select max(pk)+1 from activo;";			
			pks = base_datos.realizar_lectura(sql_pk);
			pk_activo = pks.get(0).get(0);
			
			sql_pk = "select max(pk)+1 from valoracion;";
			pks = base_datos.realizar_lectura(sql_pk);
			pk_valoracion = pks.get(0).get(0);

			sql_pk = "select max(pk)+1 from valor_criterio;";
			pks = base_datos.realizar_lectura(sql_pk);
			pk_valor_criterio = pks.get(0).get(0);
			
			sql_activo = "INSERT INTO  activo (pk,cod,nombre,descripcion,fk_tipo,Fecha_creacion) VALUES ";
			sql_activo += "(" + pk_activo + ",'" + activo.getCodigo() + "','" + activo.getNombre() + "','" + activo.getDescripcion();
			sql_activo += "',(select pk from tipo_activo where cod='" + activo.getTipo() + "'),current_timestamp());";
			
			sql_valor_criterio = "INSERT INTO valor_criterio ";
			sql_valor_criterio += "(PK,fk_crm,fk_si,fk_pi,fk_rto,fk_lg,fk_adm,fk_olm,fk_lpo,fk_ibl_national,fk_ibl_ue,fk_cei,fk_da,fk_po)";
			sql_valor_criterio += "VALUES ("+ pk_valor_criterio + ",";
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_crm() + "')";//+ "<{fk_crm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_si() + "')";//+ "<{fk_si: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_pi() + "')";//	+ "<{fk_pi: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_rto() + "')";//	+ "<{fk_rto: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_lg() + "')";//	+ "<{fk_lg: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_adm() + "')";//	+ "<{fk_adm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_olm() + "')";//	+ "<{fk_olm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_lpo() + "')";//	+ "<{fk_lpo: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_ibl_national() + "')";//	+ "<{fk_ibl_national: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_ibl_ue() + "')";//	+ "<{fk_ibl_ue: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_cei() + "')";//	+ "<{fk_cei: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_da() + "')";//	+ "<{fk_da: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_po() + "')";//	+ "<{fk_po: }>);\r\n"
			sql_valor_criterio += ");";
			
			sql_valoracion = "INSERT INTO valoracion (PK,fecha_creacion,economica,fk_activo,fk_escala,fk_criterio)";
			sql_valoracion += "VALUES (" + pk_valoracion + ",current_timestamp()," + activo.getValor_economico() + "," + pk_activo;
			sql_valoracion += ",(select pk from escala_valor where abreviadura='"+activo.getNivel_valoracion()+"'),pk_valor_criterio>);";

			resultado_creacion = base_datos.realizar_creacion(sql_activo);
			resultado_creacion = base_datos.realizar_creacion(sql_valor_criterio);
			resultado_creacion = base_datos.realizar_creacion(sql_valoracion);
			
			for(Relacion_activos elemento: activo.getLista_activos_inferiores()) {
				sql_dependencia = "INSERT INTO rel_dependencia_activos (fk_superior,fk_inferior,grado) VALUES (" + pk_activo;
				sql_dependencia += ",(select pk from activo where cod='" + elemento.getActivo_inferior() + "')," + elemento.getGrado() + ");";
				resultado_creacion = base_datos.realizar_creacion(sql_dependencia);
			}

			for(Relacion_activos elemento: activo.getLista_activos_superiores()) {
				sql_dependencia = "INSERT INTO rel_dependencia_activos (fk_inferior,fk_superior,grado) VALUES (" + pk_activo;
				sql_dependencia += ",(select pk from activo where cod='" + elemento.getActivo_inferior() + "')," + elemento.getGrado() + ");";
				resultado_creacion = base_datos.realizar_creacion(sql_dependencia);
			}

			return resultado;
		}


		public String modificar_activo(String codigo,Activo_pojo activo) {
			String resultado = "";
			Database base_datos = new Database();
			String sql_pk;
			String sql_valor_criterio;
			String sql_valoracion;
			String sql_dependencia;
			String sql_activo;
			List<List<String>> pks;
			String pk_valoracion;
			String pk_valor_criterio;

			boolean resultado_modificacion = true;
			/* 
			 * Hay que modificar en las tablas:
			 *  rel_dependencia_activos
			 *  activo
			 * Hay que agregar en las tablas:
			 *  valor_criterio
			 *  valoracion
			 */
			sql_pk = "select max(pk)+1 from valoracion;";
			pks = base_datos.realizar_lectura(sql_pk);
			pk_valoracion = pks.get(0).get(0);
			
			sql_pk = "select max(pk)+1 from valor_criterio;";
			pks = base_datos.realizar_lectura(sql_pk);
			pk_valor_criterio = pks.get(0).get(0);
			
			sql_pk = "(select pk from activo where cod='"+codigo+"')";
			
			sql_activo = "UPDATE activo SET "
					+ "cod='" + activo.getCodigo() + "', "
					+ "nombre='" + activo.getNombre() + "', "
					+ "descripcion ='" + activo.getDescripcion() + "', "
					+ "fk_tipo = (select pk from tipo_activo where cod='" + activo.getTipo() + "') "
					+ "WHERE PK = " + sql_pk + ";";
			
			sql_valor_criterio = "INSERT INTO valor_criterio ";
			sql_valor_criterio += "(PK,fk_crm,fk_si,fk_pi,fk_rto,fk_lg,fk_adm,fk_olm,fk_lpo,fk_ibl_national,fk_ibl_ue,fk_cei,fk_da,fk_po)";
			sql_valor_criterio += "VALUES ("+ pk_valor_criterio + ",";
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_crm() + "')";//+ "<{fk_crm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_si() + "')";//+ "<{fk_si: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_pi() + "')";//	+ "<{fk_pi: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_rto() + "')";//	+ "<{fk_rto: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_lg() + "')";//	+ "<{fk_lg: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_adm() + "')";//	+ "<{fk_adm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_olm() + "')";//	+ "<{fk_olm: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_lpo() + "')";//	+ "<{fk_lpo: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_ibl_national() + "')";//	+ "<{fk_ibl_national: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_ibl_ue() + "')";//	+ "<{fk_ibl_ue: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_cei() + "')";//	+ "<{fk_cei: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_da() + "')";//	+ "<{fk_da: }>,\r\n"
			sql_valor_criterio += "(select pk from criterio_adm where codigo='" + activo.getCriterio_po() + "')";//	+ "<{fk_po: }>);\r\n"
			sql_valor_criterio += ");";
			
			sql_valoracion = "INSERT INTO valoracion (PK,fecha_creacion,economica,fk_activo,fk_escala,fk_criterio)";
			sql_valoracion += "VALUES (" + pk_valoracion + ",current_timestamp()," + activo.getValor_economico() + "," + sql_pk;
			sql_valoracion += ",(select pk from escala_valor where abreviadura='"+activo.getNivel_valoracion()+"'),pk_valor_criterio>);";

			
			//sql_dependencia = "UPDATE rel_dependencia_activos SET fk_superior = <{fk_superior: }>, fk_inferior = <{fk_inferior: }>,`grado` = <{grado: }> WHERE ;";

			resultado_modificacion = base_datos.realizar_modificacion(sql_activo);
			resultado_modificacion = base_datos.realizar_modificacion(sql_valoracion);
			resultado_modificacion = base_datos.realizar_modificacion(sql_valor_criterio);

			//resultado_modificacion = base_datos.realizar_modificacion(sql_dependencia);

			return resultado;
		}

		
}
