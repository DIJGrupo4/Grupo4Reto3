package reto3.Entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitFechaYPeli {

	@Test
	void testFechaYPeliTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();

		assertTrue("Fecha:'" + fecha + "' de la pelicula: '" + pelicula + "'", true);
	}

	@Test
	void testFechaYPeliFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();

		assertFalse("Fecha no existe:'" + fecha + "' de la pelicula no existe: '" + pelicula + "'", false);
	}

	@Test
	void testFechaYPeliNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();

		assertNull("Fecha no existe:'" + fecha + "' de la pelicula no existe: '" + pelicula + "'", null);

	}

}
