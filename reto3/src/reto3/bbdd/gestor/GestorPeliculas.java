package reto3.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import reto3.bbdd.menu.Menu;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.utils.DBUtils;

public class GestorPeliculas {

	public static String[] rellenarListaCine1(String stringcineNom) {
		
		String peliculas[] = new String[3];
		
		peliculas[0]="a";
		peliculas[1]="b";
		peliculas[2]="c";
		
		return peliculas;
	}
	
	public static String[] rellenarListaCine2(String stringcineNom) {
		
		String peliculas[] = new String[3];
		
		peliculas[0]="d";
		peliculas[1]="e";
		peliculas[2]="f";
		
		return peliculas;
	}

	public static String[] rellenarListaCine3(String stringcineNom) {
		
		String peliculas[] = new String[3];
		
		peliculas[0]="g";
		peliculas[1]="h";
		peliculas[2]="i";
		
		return peliculas;
	}
	
	public static String[] rellenarListaCine4(String stringcineNom) {
		
		String peliculas[] = new String[3];
		
		peliculas[0]="j";
		peliculas[1]="k";
		peliculas[2]="l";
		
		return peliculas;
	}
	
	private ArrayList<Pelicula> obtenerPeliculaPorCine1() {
		ArrayList<Pelicula> ret = null;

		String sql = "select * from t_pelicula";

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
					ret = new <Pelicula>ArrayList();

				Pelicula peli = new Pelicula();

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
			;
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
		return ret;
	}
	

	public static void buscarNotasALumnoAsig() {

		 GestorPeliculas dBAccessExample = new GestorPeliculas();
		ArrayList<Pelicula> peli = dBAccessExample.obtenerPeliculaPorCine1();

		Menu menu = new Menu();
		for (int i = 0; i < peli.size(); i++) {
			menu.mostrarPelicula(peli.get(i));
		}
	}
}
