package reto3.Entornos;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorCines;
import reto3.bbdd.pojo.Cine;

class JUnitCinesDisponibles {

	@Test
	void testCineDisponiblesNotNull() {

		GestorCines gestorCines = new GestorCines();
		ArrayList<Cine> cine = null;
		cine = gestorCines.obtenerTodosLosCines();
		assertNotNull(cine);
	}

	@Test
	void testCineDisponiblesValue() {

		GestorCines gestorCines = new GestorCines();
		ArrayList<Cine> cine = null;
		cine = gestorCines.obtenerTodosLosCines();
		String nombreCine = null;
		String nombreEsperado = "CineBilbao";

		nombreCine = cine.get(0).getNombre();

		assertEquals(nombreCine, nombreEsperado);
	}

	@Test
	void testCineDisponiblesTamaño() {

		GestorCines gestorCines = new GestorCines();
		ArrayList<Cine> cine = null;
		cine = gestorCines.obtenerTodosLosCines();
		int tamañoCines = 0;
		int tamañoEsperado = 4;

		tamañoCines = cine.get(0).getCodCine();

		assertEquals(tamañoCines, tamañoEsperado);
	}

}
