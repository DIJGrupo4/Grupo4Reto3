package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import reto3.bbdd.pojo.Proyeccion;
import reto3.bbdd.pojo.Sala;
import reto3.bbdd.utils.DBUtils;

public class GestorProyecciones {

	public ArrayList<Proyeccion> obtenerProyeccionesPorPelicula(String tituloSeleccionado, int codCine) {
		ArrayList<Proyeccion> ret = null;

		String sql = "select t_proyeccion.* from t_cine, t_sala, t_proyeccion, t_pelicula where "
				+ "t_cine.codCine = t_sala.codCine " + "and t_sala.codSala = t_proyeccion.codSala "
				+ "and t_proyeccion.codPelicula = t_pelicula.codPelicula and t_cine.codCine = '" + codCine + "'"
				+ "and t_pelicula.titulo = '" + tituloSeleccionado + "' ORDER BY t_proyeccion.fecha, t_proyeccion.hora";

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

				Date fecha = resultSet.getDate("fecha");
				Time hora = resultSet.getTime("hora");
				Float precio = resultSet.getFloat("precio");
				int codSala = resultSet.getInt("codSala");

				proyeccion.setFecha(fecha);
				proyeccion.setHora(hora);
				proyeccion.setPrecio(precio);
				proyeccion.setCodSala(codSala);

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

	public int getCodProyeccionPorSala(String nombreCine, String tituloSeleccionado, Date fechaSeleccionada,
			Time horaSeleccionada, int numSalaSeleccionada, Float precioSeleccionado) {
		Proyeccion proyecciones = new Proyeccion();
		int ret = 0;
		String sql = "select t_proyeccion.codProyeccion from t_cine, t_sala, t_proyeccion, t_pelicula where t_cine.codCine = t_sala.codCine "
				+ "and t_sala.codSala = t_proyeccion.codSala and t_proyeccion.codPelicula = t_pelicula.codPelicula and t_cine.nombre = '"
				+ nombreCine + "' and t_pelicula.titulo = '" + tituloSeleccionado + "' and t_proyeccion.fecha = '"
				+ fechaSeleccionada + "'and t_proyeccion.hora = '" + horaSeleccionada + "' and t_sala.numSala = '"
				+ numSalaSeleccionada + "' and t_proyeccion.precio = '" + precioSeleccionado + "'";

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

				int codProyeccion = resultSet.getInt("codProyeccion");

				proyecciones.setCodProyeccion(codProyeccion);

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
			}
		}
		ret = proyecciones.getCodProyeccion();
		return ret;
	}
}
