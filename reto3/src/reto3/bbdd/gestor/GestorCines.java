package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.utils.DBUtils;

public class GestorCines {

	public ArrayList<Cine> obtenerTodosLosCine() {
		ArrayList<Cine> ret = null;
		String sql = "select * from t_cines";
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

				// Si es necesario, inicializamos la lista
				if (null == ret)
					ret = new ArrayList<Cine>();

				Cine cine = new Cine();

				// Sacamos las columnas del RS
				int codCine = resultSet.getInt("codCine");
				String nombre = resultSet.getString("nombre");
				String direccion = resultSet.getString("direccion");
				int salas = resultSet.getInt("salas");
			

				// Metemos los datos a Ejemplo
				cine.setCodCine(codCine);;
				cine.setNombre(nombre);
				cine.setDireccion(direccion);
				cine.setNumSalas(salas);
				

				// Lo guardamos en ret
				ret.add(cine);
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
		return ret;
	}
	
	public Cine obtenerCinePorNombre(String cineNom) {
		Cine cine = new Cine();
		String sql = "select * from t_Cines where nombre like '" + cineNom + "'";
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
				int codCine = resultSet.getInt("codCine");
				String nombre = resultSet.getString("nombre");
				String direccion = resultSet.getString("direccion");
				int salas = resultSet.getInt("salas");

				// Metemos los datos a Ejemplo
				cine.setCodCine(codCine);;
				cine.setNombre(nombre);
				cine.setDireccion(direccion);
				cine.setNumSalas(salas);
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
		return cine;
	}
	
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
				String nombre = resultSet.getString("nombre");

				// Metemos los datos a Ejemplo
				peli.setCodPelicula(codPelicula);;
				peli.setDuracion(duracion);
				peli.setGenero(genero);
				peli.setPrecio(precio);
				peli.setNombre(nombre);
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

	public Cine borrarCinePorNombre(String cineNom) {
		Cine cine = new Cine();
		cine.setNombre(cineNom);
		String sql = "delete from t_Cines where nombre like '" + cineNom + "'";
		Connection connection = null;
		Statement statement = null;

		// --------------------------------------------------------------------------------------------------
		try {
			// El Driver que vamos a usar
			Class.forName(DBUtils.DRIVER);

			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();

			statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
		}
		return cine;
	}

	public Cine modificarCine(Cine cine, String cineNom) {
		String sql = "update t_Cines set nombre='";//Acabar el update;

		Connection connection = null;
		Statement statement = null;

		// --------------------------------------------------------------------------------------------------
		try {
			// El Driver que vamos a usar
			Class.forName(DBUtils.DRIVER);

			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Vamos a lanzar la sentencia...
			statement = connection.createStatement();

			// La ejecutamos...
			statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
		}
		return cine;
	}
}
