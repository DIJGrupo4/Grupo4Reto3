package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.pojo.Proyeccion;
import reto3.bbdd.utils.DBUtils;

public class GestorProyecciones {

	public ArrayList<Proyeccion> obtenerProyeccionPorPelicula() {
		ArrayList<Proyeccion> ret = null;

		String sql = "select t_proyeccion.fechaHora from t_proyeccion, t_pelicula where t_pelicula.codPelicula = t_proyeccion.codPelicula and t_pelicula.titulo = 'Una boda explosiva'";

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

				Proyeccion proyeccion = new Proyeccion();

				Date fechaHora = resultSet.getDate("fechaHora");
				
				proyeccion.setFechaHora(fechaHora);

				try {
					ret.add(proyeccion);
				} catch (Exception e) {

				}
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
		return ret;
	}

}
