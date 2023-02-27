package reto3.Entornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Sala;

class jUnitCine {

	// ***** para probar la serializaci�n

	@Test
	public void testSerailizable() {
		Cine cine = new Cine();
		assertTrue("No se puede realizar la serializacion!!!", cine instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodCine() {
		Cine cine = new Cine();
		int codCine = 666;
		cine.setCodCine(codCine);
		assertNotEquals("codCine no esta accesible", codCine, cine.getCodCine());
	}

	@Test
	public void testNombre() {
		Cine cine = new Cine();
		String nombre = "un texto";
		cine.setNombre(nombre);
		assertNotEquals("Nombre no esta accesible", nombre, cine.getNombre());
	}

	@Test
	public void testDireccion() {
		Cine cine = new Cine();
		String direccion = "un texto";
		cine.setNombre(direccion);
		assertNotEquals("Direccion no esta accesible", direccion, cine.getNombre());
	}

	@Test
	public void testSalas() {
		Cine cine = new Cine();
		ArrayList<Sala> salas = null;
		cine.setSalas(salas);
		assertNotEquals("Numero salas no esta accesible", salas, cine.getNombre());
	}

	@Test
	public void testCineIguales() {
		Cine cine = new Cine();
		cine.setCodCine(666);
		cine.setNombre("Yelmo");
		cine.setDireccion("Calle 14");
		Cine otroCine = new Cine();
		otroCine.setCodCine(666);
		otroCine.setNombre("Yelmo");
		otroCine.setDireccion("Calle 14");

		assertEquals("los cines son iguales!!!!", cine, otroCine);

	}

	@Test
	public void testCineNull() {
		Cine cine = new Cine();
		cine.setCodCine(666);
		cine.setNombre(null);
		cine.setDireccion(null);
		Cine otroCine = new Cine();
		otroCine.setCodCine(666);
		otroCine.setNombre("Yelmo");
		otroCine.setDireccion("Calle 14");

		assertEquals("los cines no son iguales!!!!", cine, otroCine);

	}

	@Test
	public void testCineDiferentes() {
		Cine cine = new Cine();
		cine.setCodCine(666);
		cine.setNombre("Yelmo");
		cine.setDireccion("Calle 14");
		Cine otroCine = new Cine();
		otroCine.setCodCine(600);
		otroCine.setNombre("Cines");
		otroCine.setDireccion("Calle 20");

		assertEquals("los cines no son iguales!!!!", cine, otroCine);

	}

	@Test
	public void testHashCodeCodCine() {
		Cine cine = new Cine();
		assertEquals("hasCode no encontrado!!!", 0, cine.hashCode());
		int codCine = 666;
		cine.setCodCine(codCine);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cine.hashCode());
	}

	@Test
	public void testHashCodeNombre() {
		Cine cine = new Cine();
		assertEquals("hasCode no encontrado!!!", 0, cine.hashCode());
		String nombre = "un texto";
		cine.setNombre(nombre);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cine.hashCode());
	}

	@Test

	public void testHashCodeDireccion() {
		Cine cine = new Cine();
		assertEquals("hasCode no encontrado!!!", 0, cine.hashCode());
		String direccion = "un texto";
		cine.setDireccion(direccion);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cine.hashCode());
	}
}
