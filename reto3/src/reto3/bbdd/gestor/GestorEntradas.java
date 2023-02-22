package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

import reto3.bbdd.pojo.Entrada;
import reto3.bbdd.utils.DBUtils;

public class GestorEntradas {

	private void insertEjemplo(Entrada entradas) {

		Connection connection = null;

		Statement statement = null;

		try {
			
			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();

			String sql = "insert into t_entradas (Id, Asignatura, Nota) VALUES ('" + nota.getId() + "', '"
					+ nota.getAsignatura() + "', '" + nota.getNota() + "')";

			statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {

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
	}

	public static void agregarDatosEntrada(int fechaSeleccionada , String tituloSeleccionado, JTextField ssTextHora, JTextField ssTextPrecio, JTextField ssTextSala, String nombreCine) {

		GestorEntradas dBAccessExample = new GestorEntradas();
	
		Entrada entradas = new Entrada();
		entradas.setFecha(fechaSeleccionada);
		entradas.setTitulo(tituloSeleccionado);
		entradas.setHora(ssTextHora);
		entradas.setPrecio(ssTextPrecio);
		entradas.setNumSala(ssTextSala);
		entradas.setNombre(nombreCine);
	}

}
