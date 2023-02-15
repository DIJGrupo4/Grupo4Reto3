package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import reto3.bbdd.menu.inicio;
import reto3.bbdd.utils.DBUtils;
import reto3.bbdd.pojo.*;

public class GestorClientes {

	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;

	/*public ArrayList<Cliente> obtenerTodosLosClientes() {
		ArrayList<Cliente> ret = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			inicio inic = new inicio();

			String nombre = inic.txtNombre.getText();
			String apellido = inic.txtApellido.getText();
			String dni = inic.txtDni.getText();
			String sexo = inic.txtSexo.getText();
			String usuario = inic.txtUsuario.getText();
			String contraseña = inic.txtContraseña.getText();

			String sql = "insert into t_cliente (nombre, apellido, dni, sexo, usuario, contraseña) values ('" + nombre
					+ "','" + apellido + "'" + "'" + dni + "','" + sexo + "','" + usuario + "','" + contraseña + "')";

			st = con.createStatement();
			st.executeQuery(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (st != null)
					st.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
	}*/
}
