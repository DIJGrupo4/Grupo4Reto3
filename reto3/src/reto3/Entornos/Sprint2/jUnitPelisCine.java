package reto3.Entornos.Sprint2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorPeliculas;
import reto3.bbdd.pojo.Pelicula;

class jUnitPelisCine {

	@Test
	void testPelisCineNotNull() {

		int codCine = 0;
		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		ArrayList<Pelicula> pelicula = null;
		pelicula = gestorPeliculas.obtenerPeliculaPorCine(codCine);
		assertNotNull(pelicula);
	}

	@Test
	void testPelisCineValue() {

		int codCine = 0;
		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		ArrayList<Pelicula> pelicula = null;
		pelicula = gestorPeliculas.obtenerPeliculaPorCine(codCine);
		String nombrePeli = null;
		String nombreEsperado = "F9";

		nombrePeli = pelicula.get(0).getTitulo();

		assertEquals(nombrePeli, nombreEsperado);
	}

	@Test
	void testPelisCineTamaño() {

		int codCine = 0;
		GestorPeliculas gestorPeliculas = new GestorPeliculas();
		ArrayList<Pelicula> pelicula = null;
		pelicula = gestorPeliculas.obtenerPeliculaPorCine(codCine);
		int tamañoPelicula = 0;
		int tamañoEsperado = 12;

		tamañoPelicula = pelicula.get(0).getCodPelicula();

		assertEquals(tamañoPelicula, tamañoEsperado);
	}
}
