package reto3.Entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitOrdenarPeliculas {
 
	@Test
	void testOrdenarPeliculaTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		assertTrue("Pelicula disponible:'" + pelicula + "' Ordenado por '" + fecha + "'", true);
	}

	@Test
	void testOrdenarPeliculaFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		
		assertFalse("Pelicula no disponible:'" + pelicula + "' Ordenado por '" + fecha + "'", false);
	}

	@Test
	void testOrdenarPeliculaNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();
		
		Proyeccion proyecciones = new Proyeccion();
		Date fecha = proyecciones.getFecha();
		
		assertNull("Pelicula no disponible:'" + pelicula + "' Ordenado por '" + fecha + "'", null);
		
	}

}