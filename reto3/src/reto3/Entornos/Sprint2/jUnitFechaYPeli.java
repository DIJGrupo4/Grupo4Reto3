package reto3.Entornos.Sprint2;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Time;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorCines;
import reto3.bbdd.gestor.GestorPeliculas;
import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitFechaYPeli {

	@Test
	void testProyeccionPorPeliYFecha() {

		int codCine = 0;
		String tituloSeleccionado = null;

		GestorCines gestorCines = new GestorCines();
		ArrayList<Cine> cine = null;
		cine = gestorCines.obtenerTodosLosCines();

		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		ArrayList<Pelicula> pelicula = null;
		pelicula = gestorPeliculas.obtenerPeliculaPorCine(codCine);

		GestorProyecciones gestorProyecciones = new GestorProyecciones();
		ArrayList<Proyeccion> proyeccion = null;
		proyeccion = gestorProyecciones.obtenerProyeccionesPorPelicula(tituloSeleccionado, codCine);
		boolean estaOrdenado = true;

		for (int i = 1; i < proyeccion.size(); i++) {
			Time hora = proyeccion.get(i).getHora();
		}
		
		assertNull(proyeccion);
		assertTrue(estaOrdenado);
	}
}
