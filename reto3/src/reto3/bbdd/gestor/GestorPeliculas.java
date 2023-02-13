package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.utils.DBUtils;

public class GestorPeliculas {

	private static ArrayList<String> ret;

	public static ArrayList<Pelicula> obtenerPeliculaPorCine(int i) {
		ArrayList<Pelicula> ret = null;

		String sql = "select * from t_pelicula, t_cine, t_sala, t_proyeccion where t_cine.codCine = t_sala.codCine "
				+ "and t_sala.codSala = t_proyeccion.codSala "
				+ "and t_proyeccion.codPelicula = t_pelicula.codPelicula and t_cine.codCine = '" + i + "'";

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
					ret = new ArrayList<Pelicula>();

				Pelicula peli = new Pelicula();

				int codPelicula = resultSet.getInt("codPelicula");
				String titulo = resultSet.getString("titulo");
				int duracion = resultSet.getInt("duracion");
				String genero = resultSet.getString("genero");

				peli.setCodPelicula(codPelicula);
				peli.setTitulo(titulo);
				peli.setDuracion(duracion);
				peli.setGenero(genero);
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

	public static ArrayList<String> obtenerTitulosPorPeliculas(ArrayList<Pelicula> peliculas) {
		ret = null;
		if(peliculas!=null) {
			for (int i = 0; i < peliculas.size(); i++) {
				ret.add(i, peliculas.get(i).getTitulo());
			}
		}
		return ret;
	}

}