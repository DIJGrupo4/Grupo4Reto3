package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Peliculas;

class jUnitPelicula {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Peliculas peliculas = new Peliculas();
		assertTrue("No se puede realizar la serializacion!!!", peliculas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodPelicula() {
		Peliculas peliculas = new Peliculas();
		int codPelicula = 666;
		peliculas.setCodPelicula(codPelicula);
		assertNotEquals("codPelicula no esta accesible", codPelicula, peliculas.getCodPelicula());
	}

	@Test
	public void testDuracion() {
		Peliculas peliculas = new Peliculas();
		int duracion = 2;
		peliculas.setDuracion(duracion);
		assertNotEquals("Duracion no esta accesible", duracion, peliculas.getDuracion());
	}

	@Test
	public void testGenero() {
		Peliculas peliculas = new Peliculas();
		String genero = "un texto";
		peliculas.setGenero(genero);
		assertNotEquals("Nombre no esta accesible", genero, peliculas.getGenero());
	}

	@Test
	public void testPrecio() {
		Peliculas peliculas = new Peliculas();
		int precio = 15;
		peliculas.setPrecio(precio);
		assertNotEquals("Nombre no esta accesible", precio, peliculas.getPrecio());
	}
	
	@Test
	public void testNombre() {
		Peliculas peliculas = new Peliculas();
		String nombre = "un texto";
		peliculas.setNombre(nombre);
		assertNotEquals("Nombre no esta accesible", nombre, peliculas.getNombre());
	}

	@Test
	public void testCineIguales() {
		Peliculas peliculas = new Peliculas();
		peliculas.setCodPelicula(666);
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		peliculas.setPrecio(10);
		peliculas.setNombre("Ayuda");
		Peliculas otroPeliculas = new Peliculas();
		peliculas.setCodPelicula(666);
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		peliculas.setPrecio(10);
		peliculas.setNombre("Ayuda");
		assertEquals("los cines son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testCineNull() {
		Peliculas peliculas = new Peliculas();
		peliculas.setCodPelicula(666);
		peliculas.setDuracion(2);
		peliculas.setGenero(null);
		peliculas.setPrecio(10);
		peliculas.setNombre(null);
		Peliculas otroPeliculas = new Peliculas();
		peliculas.setCodPelicula(666);
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		peliculas.setPrecio(10);
		peliculas.setNombre("Ayuda");
		assertEquals("los cines no son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testCineDiferentes() {
		Peliculas peliculas = new Peliculas();
		peliculas.setCodPelicula(666);
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		peliculas.setPrecio(10);
		peliculas.setNombre("Ayuda");
		Peliculas otroPeliculas = new Peliculas();
		peliculas.setCodPelicula(100);
		peliculas.setDuracion(3);
		peliculas.setGenero("Accion");
		peliculas.setPrecio(8);
		peliculas.setNombre("Diablo");
		assertEquals("los cines no son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testHashCodeCodPelicula() {
		Peliculas peliculas = new Peliculas();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		int codPelicula = 666;
		peliculas.setCodPelicula(codPelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}
	
	@Test
	public void testHashCodeDuracion() {
		Peliculas peliculas = new Peliculas();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		int duracion = 6;
		peliculas.setDuracion(duracion);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}

	@Test
	public void testHashCodeGenero() {
		Peliculas peliculas = new Peliculas();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		String genero = "un texto";
		peliculas.setGenero(genero);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}
	
	@Test
	public void testHashCodePrecio() {
		Peliculas peliculas = new Peliculas();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		int precio = 100;
		peliculas.setPrecio(precio);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}

	@Test
	public void testHashCodeNombre() {
		Peliculas peliculas = new Peliculas();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		String nombre = "un texto";
		peliculas.setNombre(nombre);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}

}
