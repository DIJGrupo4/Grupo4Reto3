package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;

import org.junit.Test;

import reto3.bbdd.pojo.Proyeccion;
import reto3.bbdd.pojo.Sala;

class jUnitSala {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Sala salas = new Sala();
		assertTrue("No se puede realizar la serializacion!!!", salas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodSala() {
		Sala salas = new Sala();
		int codSala = 54321;
		salas.setCodSala(codSala);
		assertNotEquals("codSala no esta accesible", codSala, salas.getCodSala());
	}

	@Test
	public void testNumSala() {
		Sala salas = new Sala();
		int numSala = 1;
		salas.setNumSala(numSala);
		assertNotEquals("codPelicula no esta accesible", numSala, salas.getNumSala());
	}

	@Test
	public void testProyeccion() {
		Sala salas = new Sala();
		ArrayList<Proyeccion> proyecdion = null;
		salas.setProyecciones(proyecdion);
		assertNotEquals("Entradas no esta accesible", proyecdion, salas.getProyecciones());
	}

	@Test
	public void testSalasIguales() {
		Sala salas = new Sala();
		salas.setCodSala(54321);
		salas.setNumSala(12345);
		Sala otrasalas = new Sala();
		otrasalas.setCodSala(54321);
		otrasalas.setNumSala(12345);

		assertEquals("los cines son iguales!!!!", salas, otrasalas);

	}

	@Test
	public void testSalasDiferentes() {
		Sala salas = new Sala();
		salas.setCodSala(54321);
		salas.setNumSala(12345);
		Sala otrasalas = new Sala();
		otrasalas.setCodSala(54321);
		otrasalas.setNumSala(12345);

		assertEquals("los cines no son iguales!!!!", salas, otrasalas);

	}

	@Test
	public void testHashCodeCodSala() {
		Sala salas = new Sala();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		int codSala = 54321;
		salas.setCodSala(codSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}


	@Test
	public void testHashCodeNumSala() {
		Sala salas = new Sala();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		int numSala = 12345;
		salas.setNumSala(numSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}

}
