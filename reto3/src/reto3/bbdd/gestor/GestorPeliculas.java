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

public static String[] rellenarLista(String stringcineNom) {
	
	String peliculas[] = new String[9];
	
	peliculas[0]="aaaaaaa";
	peliculas[1]="eeeeeeee";
	peliculas[2]="iiiiiii";
	
	return peliculas;
}

	public Pelicula obtenerPeliculaPorNombre(String peliNom) {
		Pelicula peli = new Pelicula();
		String sql = "select * from peliculas where nombre like '" + peliNom + "'";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		// --------------------------------------------------------------------------------------------------
		try {
			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

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
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
		return peli;
	}
}
