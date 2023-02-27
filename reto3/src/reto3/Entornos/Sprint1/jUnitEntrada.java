package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Entrada;

class jUnitEntrada {

	// ***** para probar la serializacion
	@Test
	public void testSerailizable() {
		Entrada entradas = new Entrada();
		assertTrue("No se puede realizar la serializacion!!!", entradas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodEntrada() {
		Entrada entradas = new Entrada();
		int codEntrada = 12345;
		entradas.setCodEntrada(codEntrada);
		assertNotEquals("codEntrada no esta accesible", codEntrada, entradas.getCodEntrada());
	}

	@Test
	public void testPrecio() {
		Entrada entradas = new Entrada();
		int precio = 12;
		entradas.setPrecio(precio);
		assertNotEquals("Precio no esta accesible", precio, entradas.getPrecio());
	}

	@Test
	public void testEntradaIguales() {
		Entrada entradas = new Entrada();
		entradas.setCodEntrada(12345);
		entradas.setPrecio(12);
		Entrada otroEntradas = new Entrada();
		otroEntradas.setCodEntrada(12345);
		otroEntradas.setPrecio(12);

		assertEquals("Las entradas son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testEntradaDiferentes() {
		Entrada entradas = new Entrada();
		entradas.setCodEntrada(12345);
		entradas.setPrecio(12);
		Entrada otroEntradas = new Entrada();
		otroEntradas.setCodEntrada(54321);
		otroEntradas.setPrecio(15);

		assertEquals("Las entradas no son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testHashCodeCodEntrada() {
		Entrada entradas = new Entrada();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int codEntrada = 12345;
		entradas.setCodEntrada(codEntrada);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}

	@Test
	public void testHashCodePrecio() {
		Entrada entradas = new Entrada();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int precio = 50;
		entradas.setPrecio(precio);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}
}
