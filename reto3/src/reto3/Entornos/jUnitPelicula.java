package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;

import org.junit.Test;

import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitPelicula {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Pelicula peliculas = new Pelicula();
		assertTrue("No se puede realizar la serializacion!!!", peliculas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodPelicula() {
		Pelicula peliculas = new Pelicula();
		int codPelicula = 666;
		peliculas.setCodPelicula(codPelicula);
		assertNotEquals("codPelicula no esta accesible", codPelicula, peliculas.getCodPelicula());
	}
	
	@Test
	public void testNombre() {
		Pelicula peliculas = new Pelicula();
		String titulo = "un texto";
		peliculas.setTitulo(titulo);
		assertNotEquals("Titulo no esta accesible", titulo, peliculas.getTitulo());
	}

	@Test
	public void testDuracion() {
		Pelicula peliculas = new Pelicula();
		int duracion = 2;
		peliculas.setDuracion(duracion);
		assertNotEquals("Duracion no esta accesible", duracion, peliculas.getDuracion());
	}

	@Test
	public void testGenero() {
		Pelicula peliculas = new Pelicula();
		String genero = "un texto";
		peliculas.setGenero(genero);
		assertNotEquals("Genero no esta accesible", genero, peliculas.getGenero());
	}
	
	@Test
	public void testProyeccion() {
		Pelicula peliculas = new Pelicula();
		ArrayList<Proyeccion> proyeccion = null;
		peliculas.setProyecciones(proyeccion);
		assertNotEquals("Entradas no esta accesible", proyeccion, peliculas.getProyecciones());
	}


	@Test
	public void testPeliculaIguales() {
		Pelicula peliculas = new Pelicula();
		peliculas.setCodPelicula(666);
		peliculas.setTitulo("Ayuda");
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		Pelicula otroPeliculas = new Pelicula();
		otroPeliculas.setCodPelicula(666);
		otroPeliculas.setTitulo("Ayuda");
		otroPeliculas.setDuracion(2);
		otroPeliculas.setGenero("Comedia");
		assertEquals("los cines son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testPeliculaNull() {
		Pelicula peliculas = new Pelicula();
		peliculas.setCodPelicula(666);
		peliculas.setTitulo(null);
		peliculas.setDuracion(2);
		peliculas.setGenero(null);
		Pelicula otroPeliculas = new Pelicula();
		otroPeliculas.setCodPelicula(666);
		otroPeliculas.setTitulo("Ayuda");
		otroPeliculas.setDuracion(2);
		otroPeliculas.setGenero("Comedia");
		assertEquals("los cines no son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testPeliculaDiferentes() {
		Pelicula peliculas = new Pelicula();
		peliculas.setCodPelicula(666);
		peliculas.setTitulo("Ayuda");
		peliculas.setDuracion(2);
		peliculas.setGenero("Comedia");
		Pelicula otroPeliculas = new Pelicula();
		otroPeliculas.setCodPelicula(100);
		peliculas.setTitulo("Diablo");
		otroPeliculas.setDuracion(3);
		otroPeliculas.setGenero("Accion");
		assertEquals("los cines no son iguales!!!!", peliculas, otroPeliculas);

	}

	@Test
	public void testHashCodeCodPelicula() {
		Pelicula peliculas = new Pelicula();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		int codPelicula = 666;
		peliculas.setCodPelicula(codPelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}
	
	@Test
	public void testHashCodeTitulo() {
		Pelicula peliculas = new Pelicula();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		String titulo = "un texto";
		peliculas.setTitulo(titulo);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}
	
	@Test
	public void testHashCodeDuracion() {
		Pelicula peliculas = new Pelicula();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		int duracion = 6;
		peliculas.setDuracion(duracion);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}

	@Test
	public void testHashCodeGenero() {
		Pelicula peliculas = new Pelicula();
		assertEquals("hasCode no encontrado!!!", 0, peliculas.hashCode());
		String genero = "un texto";
		peliculas.setGenero(genero);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), peliculas.hashCode());
	}

}