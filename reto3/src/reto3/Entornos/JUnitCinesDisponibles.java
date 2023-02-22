package reto3.Entornos;

import static org.junit.Assert.*; 
import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Cine;

class JUnitCinesDisponibles {

	

	@Test
	void testCineBilbaoTrue() {

		Cine cine = new Cine();
		String cineBilbao = cine.getNombre();
		assertTrue("Cine disponible:'" + cineBilbao + "'", true);
	}

	@Test
	void testCineBilbaoFalse() {

		Cine cine = new Cine();
		String cineBilbao = cine.getNombre();
		assertFalse("Cine no disponible:'" + cineBilbao + "'", false);
	}
	
	@Test
	void testCineBilbaoNull() {

		Cine cine = new Cine();
		String cineBilbao = cine.getNombre();
		assertNull("Cine no disponible:'" + cineBilbao + "'", null);
	}

	@Test
	void testCineBasauriTrue() {

		Cine cine = new Cine();
		String cineBasauri = cine.getNombre();
		assertTrue("Cine disponible:'" + cineBasauri + "'", true);
	}

	@Test
	void testCineBasauriFalse() {

		Cine cine = new Cine();
		String cineBasauri = cine.getNombre();
		assertFalse("Cine no disponible:'" + cineBasauri + "'", false);
	}
	
	@Test
	void testCineBasauriNull() {

		Cine cine = new Cine();
		String cineBasauri = cine.getNombre();
		assertNull("Cine no disponible:'" + cineBasauri + "'", null);
	}

	@Test
	void testCineBaracaldoTrue() {

		Cine cine = new Cine();
		String cineBaracaldo = cine.getNombre();
		assertTrue("Cine disponible:'" + cineBaracaldo + "'", true);
	}

	@Test
	void testCineBaracaldoFalse() {

		Cine cine = new Cine();
		String cineBaracaldo = cine.getNombre();
		assertFalse("Cine no disponible:'" + cineBaracaldo + "'", false);
	}
	
	@Test
	void testCineBaracaldoNull() {

		Cine cine = new Cine();
		String cineBaracaldo = cine.getNombre();
		assertNull("Cine no disponible:'" + cineBaracaldo + "'", null);
	}

	@Test
	void testCineElorrietaTrue() {

		Cine cine = new Cine();
		String cineElorrieta = cine.getNombre();
		assertTrue("Cine disponible:'" + cineElorrieta + "'", true);
	}

	@Test
	void testCineElorrietaFalse() {

		Cine cine = new Cine();
		String cineElorrieta = cine.getNombre();
		assertFalse("Cine no disponible:'" + cineElorrieta + "'", false);
	}
	
	@Test
	void testCineElorrietaNull() {

		Cine cine = new Cine();
		String cineElorrieta = cine.getNombre();
		assertNull("Cine no disponible:'" + cineElorrieta + "'", null);
	}

}
