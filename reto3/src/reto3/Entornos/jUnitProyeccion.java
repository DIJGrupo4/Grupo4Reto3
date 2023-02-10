package reto3.Entornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;

import org.junit.jupiter.api.Test;

import reto3.bbdd.pojo.Proyeccion;

class jUnitProyeccion {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Proyeccion proyecciones = new Proyeccion();
		assertTrue("No se puede realizar la serializacion!!!", proyecciones instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodSala() {
		Proyeccion proyecciones = new Proyeccion();
		int codSala = 666;
		proyecciones.setCodSala(codSala);
		assertNotEquals("codPelicula no esta accesible", codSala, proyecciones.getCodSala());
	}

	@Test
	public void testcodPelicula() {
		Proyeccion proyecciones = new Proyeccion();
		int codPelicula = 666;
		proyecciones.setCodPelicula(codPelicula);
		assertNotEquals("codPelicula no esta accesible", codPelicula, proyecciones.getCodPelicula());
	}

	@Test
	public void testFecha() {
		Proyeccion proyecciones = new Proyeccion();
		int fecha = 0;
		proyecciones.setFecha(fecha);
		assertNotEquals("Titulo no esta accesible", fecha, proyecciones.getFecha());
	}

	@Test
	public void testHora() {
		Proyeccion proyecciones = new Proyeccion();
		int hora = 0;
		proyecciones.setHora(hora);
		assertNotEquals("Titulo no esta accesible", hora, proyecciones.getHora());
	}

	@Test
	public void testPeliculaIguales() {
		Proyeccion proyecciones = new Proyeccion();
		proyecciones.setCodPelicula(666);
		proyecciones.setFecha(2);
		proyecciones.setHora(2);
		Proyeccion otroProyecciones = new Proyeccion();
		otroProyecciones.setCodPelicula(666);
		otroProyecciones.setFecha(2);
		otroProyecciones.setHora(2);
		assertEquals("los cines son iguales!!!!", proyecciones, otroProyecciones);

	}

	@Test
	public void testPeliculaDiferentes() {
		Proyeccion proyecciones = new Proyeccion();
		proyecciones.setCodPelicula(666);
		proyecciones.setFecha(2);
		proyecciones.setHora(2);
		Proyeccion otroProyecciones = new Proyeccion();
		otroProyecciones.setCodPelicula(777);
		otroProyecciones.setFecha(22);
		otroProyecciones.setHora(22);
		assertEquals("los cines no son iguales!!!!", proyecciones, otroProyecciones);

	}

	@Test
	public void testHashCodeCodPelicula() {
		Proyeccion proyecciones = new Proyeccion();
		assertEquals("hasCode no encontrado!!!", 0, proyecciones.hashCode());
		int codPelicula = 666;
		proyecciones.setCodPelicula(codPelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), proyecciones.hashCode());
	}

	@Test
	public void testHashCodeFecha() {
		Proyeccion proyecciones = new Proyeccion();
		assertEquals("hasCode no encontrado!!!", 0, proyecciones.hashCode());
		int fecha = 6;
		proyecciones.setFecha(fecha);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), proyecciones.hashCode());
	}

	@Test
	public void testHashCodeHora() {
		Proyeccion proyecciones = new Proyeccion();
		assertEquals("hasCode no encontrado!!!", 0, proyecciones.hashCode());
		int hora = 6;
		proyecciones.setHora(hora);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), proyecciones.hashCode());
	}

}
