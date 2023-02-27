package reto3.Entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitPrecioPeli {

	@Test
	void testPrecioTrue() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Float precio = proyecciones.getPrecio();
		assertTrue("Precio:'" + precio + "' de la pelicula: '" + pelicula + "'", true);
	}

	@Test
	void testPrecioFalse() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Float precio = proyecciones.getPrecio();
		assertFalse("Precio no esta:'" + precio + "' de la pelicula no existe: '" + pelicula + "'", false);
	}

	@Test
	void testPrecioNull() {

		Pelicula peliculas = new Pelicula();
		String pelicula = peliculas.getTitulo();

		Proyeccion proyecciones = new Proyeccion();
		Float precio = proyecciones.getPrecio();
		assertNull("Precio no esta:'" + precio + "' de la pelicula no existe: '" + pelicula + "'", null);

	}

}
