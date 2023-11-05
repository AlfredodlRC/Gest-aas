package base_datos;

import java.util.ArrayList;
import java.util.List;

import datos.POJOS.Criterio;
import datos.POJOS.Escala;

public class CRUD_Activos {
		private String sql ="select Nivel,codigo,descripcion from criterio_adm;";

		public CRUD_Activos() {
			super();
		}
		
		public List<Criterio> cargar_criterios() {
			List<Criterio> resultado = new ArrayList<Criterio>();
			Database base_datos = new Database();
			List<String> lista_sql = new ArrayList<String>();
			List<List<Object>> criterios;
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
			
			for(String sql: lista_sql) {
				System.out.println(sql);
				criterios = base_datos.realizar_lectura(sql);
				for(List<Object> fila: criterios) {
					nuevo_criterio = new Criterio();
					nuevo_criterio.setTipo_criterio(String.valueOf(fila.get(0)));
					nuevo_criterio.setNivel(String.valueOf(fila.get(1)));
					nuevo_criterio.setCodigo(String.valueOf(fila.get(2)));
					nuevo_criterio.setDescripcion(String.valueOf(fila.get(3)));
					resultado.add(nuevo_criterio);
				}
			}
			
			
			return resultado;
		}

		public List<Escala> cargar_escalas() {
			List<Escala> resultado = new ArrayList<Escala>();
			Database base_datos = new Database();
			List<String> lista_sql = new ArrayList<String>();
			List<List<Object>> escalas;
			Escala nueva_escala;

			lista_sql.add("select 'impacto' as escala,abreviadura,magnitud from escala_impacto;");
			lista_sql.add("select 'probabilidad' as escala,abreviadura,magnitud from escala_probabilidad;");
			lista_sql.add("select 'riesgo' as escala,abreviadura,magnitud from escala_riesgo;");
			lista_sql.add("select 'valor' as escala,abreviadura,magnitud from escala_valor;");
			
			for(String sql: lista_sql) {
				System.out.println(sql);
				escalas = base_datos.realizar_lectura(sql);
				for(List<Object> fila: escalas) {
					nueva_escala = new Escala();
					nueva_escala.setTipo_escala(String.valueOf(fila.get(0)));
					nueva_escala.setAbreviadura(String.valueOf(fila.get(1)));
					nueva_escala.setMagnitud(String.valueOf(fila.get(2)));
					resultado.add(nueva_escala);
				}
			}
			//escala = base_datos.realizar_lectura(sql);
			//System.out.println(escala);
			
			return resultado;
		}
		
		public boolean cargar_lista_activos() {
			boolean resultado = true;
			/*
			*/
			return resultado;
			
		}

}
