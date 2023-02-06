package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Salas;

class jUnitSala {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Salas salas = new Salas();
		assertTrue("No se puede realizar la serializacion!!!", salas instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testNombreSala() {
		Salas salas = new Salas();
		String nombreSala = "un texto";
		salas.setNombreSala(nombreSala);
		assertNotEquals("Nombre de la sala no esta accesible", nombreSala, salas.getNombreSala());
	}
	
	@Test
	public void testcodSala() {
		Salas salas = new Salas();
		int codSala = 54321;
		salas.setCodSala(codSala);
		assertNotEquals("codSala no esta accesible", codSala, salas.getCodSala());
	}

	@Test
	public void testFecha() {
		Salas salas = new Salas();
		String fecha = "un texto";
		salas.setFecha(fecha);
		assertNotEquals("Nombre no esta accesible", fecha, salas.getFecha());
	}
	
	@Test
	public void testcodPelicula() {
		Salas salas = new Salas();
		int codPelicula = 12345;
		salas.setCodPelicula(codPelicula);
		assertNotEquals("codPelicula no esta accesible", codPelicula, salas.getCodPelicula());
	}
	
	@Test
	public void testHorarioSala() {
		Salas salas = new Salas();
		int horario = 20;
		salas.setHorarioSala(horario);
		assertNotEquals("Horario de la sala no esta accesible", horario, salas.getHorarioSala());
	}

	@Test
	public void testSalasIguales() {
		Salas salas = new Salas();
		salas.setNombreSala("Numero 1");
		salas.setCodSala(54321);
		salas.setFecha("13 de noviembre de 2023");
		salas.setCodPelicula(12345);
		salas.setHorarioSala(20);
		Salas otrasalas = new Salas();
		otrasalas.setNombreSala("Numero 1");
		otrasalas.setCodSala(54321);
		otrasalas.setFecha("13 de noviembre de 2023");
		otrasalas.setCodPelicula(12345);
		otrasalas.setHorarioSala(20);

		assertEquals("los cines son iguales!!!!", salas, otrasalas);

	}

	@Test
	public void testSalasNull() {
		Salas salas = new Salas();
		salas.setNombreSala(null);
		salas.setCodSala(54321);
		salas.setFecha(null);
		salas.setCodPelicula(12345);
		salas.setHorarioSala(20);
		Salas otrasalas = new Salas();
		otrasalas.setNombreSala("Numero 1");
		otrasalas.setCodSala(54321);
		otrasalas.setFecha("13 de noviembre de 2023");
		otrasalas.setCodPelicula(12345);
		otrasalas.setHorarioSala(20);

		assertEquals("los cines no son iguales!!!!", salas, otrasalas);

	}

	@Test
	public void testSalasDiferentes() {
		Salas salas = new Salas();
		salas.setNombreSala("Yelmo");
		salas.setCodSala(54321);
		salas.setFecha("13 de noviembre de 2023");
		salas.setCodPelicula(12345);
		salas.setHorarioSala(20);
		Salas otrasalas = new Salas();
		otrasalas.setNombreSala("Yelmo");
		otrasalas.setCodSala(54321);
		otrasalas.setFecha("13 de noviembre de 2023");
		otrasalas.setCodPelicula(12345);
		otrasalas.setHorarioSala(20);

		assertEquals("los cines no son iguales!!!!", salas, otrasalas);

	}

	@Test
	public void testHashCodeNombreSala() {
		Salas salas = new Salas();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		String nombreSala = "un texto";
		salas.setNombreSala(nombreSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}
	
	@Test
	public void testHashCodeCodSala() {
		Salas salas = new Salas();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		int codSala = 54321;
		salas.setCodSala(codSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}

	@Test
	public void testHashCodeFecha() {
		Salas salas = new Salas();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		String fecha = "un texto";
		salas.setFecha(fecha);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}

	@Test
	public void testHashCodeCodPelicula() {
		Salas salas = new Salas();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		int codPelicula = 12345;
		salas.setCodPelicula(codPelicula);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}
	
	@Test
	public void testHashCodeHorarioSala() {
		Salas salas = new Salas();
		assertEquals("hasCode no encontrado!!!", 0, salas.hashCode());
		int horarioSala = 50;
		salas.setHorarioSala(horarioSala);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), salas.hashCode());
	}
}
