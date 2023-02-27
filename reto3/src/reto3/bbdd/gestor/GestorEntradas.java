package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JTextField;

import reto3.bbdd.pojo.Entrada;
import reto3.bbdd.pojo.Sala;
import reto3.bbdd.utils.DBUtils;

public class GestorEntradas {

	public ArrayList<Entrada> insertEjemplo(int codProyeccion) {

		int codRecibo = 1;
		Connection connection = null;

		Statement statement = null;

		try {
			
			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.createStatement();

			String sql = "insert into t_entrada (CodProyeccion, CodRecibo) VALUES ('" + codProyeccion + "','" + codRecibo + "')";

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
		return null;
	}

	public static void agregarDatosEntrada(int codProyeccion, int codRecibo) {

		GestorEntradas dBAccessExample = new GestorEntradas();
	
		Entrada entradas = new Entrada();
		entradas.setCodProyeccion(codProyeccion);
		entradas.setCodRecibo(codRecibo);
		
		dBAccessExample.insertEjemplo(codProyeccion);
	}

}
