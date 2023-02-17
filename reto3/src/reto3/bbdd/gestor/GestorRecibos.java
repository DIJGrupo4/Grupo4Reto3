package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.pojo.Recibo;
import reto3.bbdd.utils.DBUtils;

public class GestorRecibos {

		public ArrayList<Recibo> carrito() {
			ArrayList<Recibo> ret = null;

			// La conexion con BBDD
			Connection connection = null;

			// Vamos a lanzar una sentencia SQL contra la BBDD
			Statement statement = null;
			
			ResultSet resultSet = null;

			try {
				// El Driver que vamos a usar
				Class.forName(DBUtils.DRIVER);

				// Abrimos la conexion con BBDD
				connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

				// Vamos a lanzar la sentencia...
				statement = connection.createStatement();

				// Montamos la SQL
				String sql = "select titulo, numSala, fecha, hora, precio from t_pelicula, t_sala, t_proyeccion"
						+ "where t_proyeccion.codPelicula = t_pelicula.codPelicula and t_proyeccion.codSala = t_proyeccion.codSala";

				// La ejecutamos...
				resultSet = statement.executeQuery(sql);

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

			return ret;
		}
}
