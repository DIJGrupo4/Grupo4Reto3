package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import reto3.bbdd.dbUtils.DBUtils;
import reto3.bbdd.pojo.Pelicula;


public class GestorPeliculas {

	public Pelicula obtenerPeliculaPorNombre(String peliNom) {
		Pelicula peli = new Pelicula();
		String sql = "select * from t_alumnos where nombre like '" + peliNom + "'";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		// --------------------------------------------------------------------------------------------------
		try {
			// El Driver que vamos a usar
			Class.forName(DBUtils.DRIVER);

			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Vamos a lanzar la sentencia...
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			// No es posible saber cuantas cosas nos ha devuelto el resultSet.
			// Hay que ir 1 por 1 y guardandolo todo en su objeto Ejemplo correspondiente
			while (resultSet.next()) {

				// Sacamos las columnas del RS
				int codPelicula = resultSet.getInt("codPelicula");
				int duracion = resultSet.getInt("duracion");
				String genero = resultSet.getString("genero");
				int precio = resultSet.getInt("precio");
				String nombre = resultSet.getString("titulo");

				// Metemos los datos a Ejemplo
				peli.setCodPelicula(codPelicula);;
				peli.setDuracion(duracion);
				peli.setGenero(genero);
				peli.setPrecio(precio);
				peli.setTitulo(nombre);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		return peli;
	}
	
}
