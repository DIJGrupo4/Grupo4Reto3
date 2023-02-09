package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Recibo;

class jUnitVentas {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Ventas ventas = new Ventas();
		assertTrue("No se puede realizar la serializacion!!!", ventas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testDNI() {
		Ventas ventas = new Ventas();
		String DNI = "un texto";
		ventas.setDni(DNI);
		assertNotEquals("DNI no esta accesible", DNI, ventas.getDni());
	}
	
	@Test
	public void testCosto() {
		Ventas ventas = new Ventas();
		int costo = 100;
		ventas.setCosto(costo);
		assertNotEquals("Costo no esta accesible", costo, ventas.getCosto());
	}

	@Test
	public void testNombrePelicula() {
		Ventas ventas = new Ventas();
		String nombrePelicula = "un texto";
		ventas.setNombrePelicula(nombrePelicula);
		assertNotEquals("Nombre de la pelicula no esta accesible", nombrePelicula, ventas.getNombrePelicula());
	}
	
	@Test
	public void testFecha() {
		Ventas ventas = new Ventas();
		String fecha = "un texto";
		ventas.setFecha(fecha);
		assertNotEquals("Fecha no esta accesible", fecha, ventas.getFecha());
	}


	@Test
	public void testCineIguales() {
		Ventas ventas = new Ventas();
		ventas.setDni("12345678L");
		ventas.setCosto(12);
		ventas.setNombrePelicula("Diablo");
		ventas.setFecha("16 de noviembre de 2022");
		Ventas otraventas = new Ventas();
		otraventas.setDni("12345678L");
		otraventas.setCosto(12);
		otraventas.setNombrePelicula("Diablo");
		otraventas.setFecha("16 de noviembre de 2022");

		assertEquals("los cines son iguales!!!!", ventas, otraventas);

	}

	@Test
	public void testCineNull() {
		Ventas ventas = new Ventas();
		ventas.setDni(null);
		ventas.setCosto(12);
		ventas.setNombrePelicula(null);
		ventas.setFecha(null);
		Ventas otraventas = new Ventas();
		otraventas.setDni("12345678L");
		otraventas.setCosto(12);
		otraventas.setNombrePelicula("Diablo");
		otraventas.setFecha("16 de noviembre de 2022");

		assertEquals("los cines no son iguales!!!!", ventas, otraventas);

	}

	@Test
	public void testCineDiferentes() {
		Ventas ventas = new Ventas();
		ventas.setDni("12345678L");
		ventas.setCosto(12);
		ventas.setNombrePelicula("Diablo");
		ventas.setFecha("16 de noviembre de 2022");
		Ventas otraventas = new Ventas();
		otraventas.setDni("87654321L");
		otraventas.setCosto(12);
		otraventas.setNombrePelicula("Rapido y furiosos");
		otraventas.setFecha("19 de noviembre de 2022");

		assertEquals("los cines no son iguales!!!!", ventas, otraventas);

	}

	@Test
	public void testHashCodeDNI() {
		Ventas ventas = new Ventas();
		assertEquals("hasCode no encontrado!!!", 0, ventas.hashCode());
		String DNI = "un texto";
		ventas.setDni(DNI);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), ventas.hashCode());
	}
	
	@Test
	public void testHashCodeCosto() {
		Ventas ventas = new Ventas();
		assertEquals("hasCode no encontrado!!!", 0, ventas.hashCode());
		int costo = 666;
		ventas.setCosto(costo);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), ventas.hashCode());
	}

	@Test

	public void testHashCodeNombrePelicula() {
		Ventas ventas = new Ventas();
		assertEquals("hasCode no encontrado!!!", 0, ventas.hashCode());
		String nombrePelicula = "un texto";
		ventas.setNombrePelicula(nombrePelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), ventas.hashCode());
	}
	
	@Test

	public void testHashCodeFecha() {
		Ventas ventas = new Ventas();
		assertEquals("hasCode no encontrado!!!", 0, ventas.hashCode());
		String fecha = "un texto";
		ventas.setFecha(fecha);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), ventas.hashCode());
	}

}
