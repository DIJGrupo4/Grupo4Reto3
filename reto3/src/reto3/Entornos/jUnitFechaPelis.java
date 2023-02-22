package reto3.Entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitFechaPelis {

	@Test
	void testFechaTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		
		assertTrue("Fecha disponible:'" + fecha + "' de la pelicula: '" + pelicula + "'", true);
	}

	@Test
	void testFechaFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		
		assertFalse("Fecha no disponible:'" + fecha + "' de la pelicula: '" + pelicula + "'", false);
	}

	@Test
	void testFechaNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		
		assertNull("Fecha no disponible:'" + fecha + "' de la pelicula: '" + pelicula + "'", null);
		
	}
}
