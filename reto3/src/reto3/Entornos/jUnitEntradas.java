package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Entradas;

class jUnitEntradas {

	// ***** para probar la serializacion
	@Test
	public void testSerailizable() {
		Entradas entradas = new Entradas();
		assertTrue("No se puede realizar la serializacion!!!", entradas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodEntrada() {
		Entradas entradas = new Entradas();
		int codEntrada = 12345;
		entradas.setCodEntrada(codEntrada);
		assertNotEquals("codEntrada no esta accesible", codEntrada, entradas.getCodEntrada());
	}

	@Test
	public void testFechaCompra() {
		Entradas entradas = new Entradas();
		String fechaCompra = "un texto";
		entradas.setFechaCompra(fechaCompra);
		assertNotEquals("Nombre no esta accesible", fechaCompra, entradas.getFechaCompra());
	}

	@Test
	public void testNombrePelicula() {
		Entradas entradas = new Entradas();
		String nombrePelicula = "un texto";
		entradas.setNombrePelicula(nombrePelicula);
		assertNotEquals("Nombre no esta accesible", nombrePelicula, entradas.getNombrePelicula());
	}

	@Test
	public void testHora() {
		Entradas entradas = new Entradas();
		int hora = 22;
		entradas.setHora(hora);
		assertNotEquals("Nombre no esta accesible", hora, entradas.getHora());
	}
	
	@Test
	public void testNumeroSala() {
		Entradas entradas = new Entradas();
		int numeroSalas = 10;
		entradas.setNumeroSala(numeroSalas);
		assertNotEquals("Nombre no esta accesible", numeroSalas, entradas.getNumeroSala());
	}

	@Test
	public void testPrecio() {
		Entradas entradas = new Entradas();
		int precio = 12;
		entradas.setPrecio(precio);
		assertNotEquals("Nombre no esta accesible", precio, entradas.getPrecio());
	}


	@Test
	public void testCineIguales() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);

		assertEquals("Las entradas son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testCineNull() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra(null);
		entradas.setNombrePelicula(null);
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);

		assertEquals("Las entradas son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testCineDiferentes() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("18 noviembre de 2023");
		entradas.setNombrePelicula("Fast and Furious 9");
		entradas.setHora(20);
		entradas.setNumeroSala(2);
		entradas.setPrecio(15);

		assertEquals("Las entradas son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testHashCodeCodEntrada() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int codEntrada = 12345;
		entradas.setCodEntrada(codEntrada);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}

	@Test
	public void testHashCodeFechaCompra() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		String fechaCompra = "un texto";
		entradas.setFechaCompra(fechaCompra);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}

	@Test

	public void testHashCodeNombrePelicula() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		String nombrePelicula = "un texto";
		entradas.setNombrePelicula(nombrePelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}

	@Test
	public void testHashCodeHora() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int hora = 20;
		entradas.setHora(hora);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}
	
	@Test
	public void testHashCodeNumeroSala() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int numeroSala = 10;
		entradas.setNumeroSala(numeroSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}
	
	@Test
	public void testHashCodePrecio() {
		Entradas entradas = new Entradas();
		assertEquals("hasCode no encontrado!!!", 0, entradas.hashCode());
		int precio = 50;
		entradas.setPrecio(precio);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), entradas.hashCode());
	}
}
