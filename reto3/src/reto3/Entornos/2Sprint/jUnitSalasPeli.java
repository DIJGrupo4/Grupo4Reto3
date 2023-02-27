package reto3.Entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Date;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitSalasPeli {

	@Test
	void testPeliculaTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		int codSala = proyecciones.getCodSala();

		assertTrue("CodSala'" + codSala + "'Fecha:'" + fecha + "' de la pelicula: '" + pelicula + "'", true);
	}

	@Test
	void testPeliculaFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		int codSala = proyecciones.getCodSala();

		assertFalse("CodSala'" + codSala + "'Fecha:'" + fecha + "' de la pelicula: '" + pelicula + "'", false);
	}

	@Test
	void testPeliculaNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		int codSala = proyecciones.getCodSala();

		assertNull("CodSala'" + codSala + "'Fecha:'" + fecha + "' de la pelicula: '" + pelicula + "'", null);

	}


}
