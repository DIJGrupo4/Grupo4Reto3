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
		assertNotEquals("La fecha de la compra no esta accesible", fechaCompra, entradas.getFechaCompra());
	}

	@Test
	public void testNombrePelicula() {
		Entradas entradas = new Entradas();
		String nombrePelicula = "un texto";
		entradas.setNombrePelicula(nombrePelicula);
		assertNotEquals("Nombre de la pelicula no esta accesible", nombrePelicula, entradas.getNombrePelicula());
	}

	@Test
	public void testHora() {
		Entradas entradas = new Entradas();
		int hora = 22;
		entradas.setHora(hora);
		assertNotEquals("Hora no esta accesible", hora, entradas.getHora());
	}
	
	@Test
	public void testNumeroSala() {
		Entradas entradas = new Entradas();
		int numeroSalas = 10;
		entradas.setNumeroSala(numeroSalas);
		assertNotEquals("Numero de sala no esta accesible", numeroSalas, entradas.getNumeroSala());
	}

	@Test
	public void testPrecio() {
		Entradas entradas = new Entradas();
		int precio = 12;
		entradas.setPrecio(precio);
		assertNotEquals("Precio no esta accesible", precio, entradas.getPrecio());
	}


	@Test
	public void testEntradaIguales() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		otroEntradas.setCodEntrada(12345);
		otroEntradas.setFechaCompra("14 noviembre de 2022");
		otroEntradas.setNombrePelicula("Avatar");
		otroEntradas.setHora(22);
		otroEntradas.setNumeroSala(1);
		otroEntradas.setPrecio(12);

		assertEquals("Las entradas son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testEntradaNull() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra(null);
		entradas.setNombrePelicula(null);
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		otroEntradas.setCodEntrada(12345);
		otroEntradas.setFechaCompra("14 noviembre de 2022");
		otroEntradas.setNombrePelicula("Avatar");
		otroEntradas.setHora(22);
		otroEntradas.setNumeroSala(1);
		otroEntradas.setPrecio(12);

		assertEquals("Las entradas no son iguales!!!!", entradas, otroEntradas);

	}

	@Test
	public void testEntradaDiferentes() {
		Entradas entradas = new Entradas();
		entradas.setCodEntrada(12345);
		entradas.setFechaCompra("14 noviembre de 2022");
		entradas.setNombrePelicula("Avatar");
		entradas.setHora(22);
		entradas.setNumeroSala(1);
		entradas.setPrecio(12);
		Entradas otroEntradas = new Entradas();
		otroEntradas.setCodEntrada(12345);
		otroEntradas.setFechaCompra("18 noviembre de 2023");
		otroEntradas.setNombrePelicula("Fast and Furious 9");
		otroEntradas.setHora(20);
		otroEntradas.setNumeroSala(2);
		otroEntradas.setPrecio(15);

		assertEquals("Las entradas no son iguales!!!!", entradas, otroEntradas);

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
