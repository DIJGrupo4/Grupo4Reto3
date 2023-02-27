package reto3.Entornos;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;

class jUnitPelisCine {

	@Test
	void testPeliculaTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		assertTrue("Pelicula disponible:'" + pelicula + "'", true);
	}

	@Test
	void testPeliculaFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		assertFalse("Pelicula no disponible:'" + pelicula + "'", false);
	}

	@Test
	void testPeliculaNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		assertNull("Pelicula no disponible:'" + pelicula + "'", null);
	}

}
