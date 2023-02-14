package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.pojo.Proyeccion;
import reto3.bbdd.utils.DBUtils;

public class GestorPeliculas {

	private static ArrayList<String> ret;

	public static ArrayList<Proyeccion> obtenerProyeccionPorCine(int i) {
		ArrayList<Proyeccion> ret = null;

		String sql = "select t_proyeccion.* from t_cine, t_sala, t_proyeccion where t_cine.codCine = t_sala.codCine "
				+ "and t_sala.codSala = t_proyeccion.codSala and t_cine.codCine = '" + i + "' ORDER BY t_proyeccion.fechaHora";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<Proyeccion>();

				Proyeccion proy = new Proyeccion();

				int codPelicula = resultSet.getInt("codProyeccion");
				String titulo = resultSet.getString("titulo");
				int hora = resultSet.getInt("hora");
				int precio = resultSet.getInt("precio");

				proy.setCodPelicula(codPelicula);
				proy.setTitulo(titulo);
				proy.setHora(hora);
				proy.setPrecio(precio);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {

			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {

			}
			;
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
			;
		}
		return ret;
	}

	public static ArrayList<String> obtenerTitulosPorProyecciones(ArrayList<Proyeccion> proyecciones) {
		ret = null;
		if(proyecciones!=null) {
			for (int i = 0; i < proyecciones.size(); i++) {
				ret.add(i, proyecciones.get(i).getTitulo());
			}
		}
		return ret;
	}

}