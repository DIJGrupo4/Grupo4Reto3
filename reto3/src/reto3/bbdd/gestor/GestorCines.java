package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.utils.DBUtils;
import reto3.bbdd.pojo.Cine;

public class GestorCines {

	public ArrayList<Cine> obtenerTodosLosCine() {
		ArrayList<Cine> ret = null;
		String sql = "select * from cine";
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
				int salas = resultSet.getInt("numSalas");

				// Metemos los datos a Ejemplo
				cine.setCodCine(codCine);
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
		String sql = "select * from Cine where nombre like '" + cineNom + "'";
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
				int codCine = resultSet.getInt("codigo");
				String nombre = resultSet.getString("nombre");
				String direccion = resultSet.getString("direccion");
				int salas = resultSet.getInt("numSalas");

				// Metemos los datos a Ejemplo
				cine.setCodCine(codCine);
				;
				cine.setNombre(nombre);
				cine.setDireccion(direccion);
				cine.setNumSalas(salas);

			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			System.out.println("codigo: " + cine.getCodCine());
			System.out.println("nombre: " + cine.getNombre());
			System.out.println("direccion: " + cine.getDireccion());
			System.out.println("numSalas: " + cine.getNumSalas());
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

}
