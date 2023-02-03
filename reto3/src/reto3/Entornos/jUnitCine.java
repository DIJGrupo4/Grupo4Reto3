package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Cine;

class jUnitCine {

		//***** para probar la serializaci�n	
		@Test
		public void testSerailizable() {
			Cine cine= new Cine();
			assertTrue("No se puede realizar la serializacion!!!", cine instanceof Serializable);
		}
		
		//************* probar getter & Setters
		
		@Test
		public void testcodCine() {
			Cine cine= new Cine();
			int codCine = 666;
			cine.setCodCine(codCine);
			assertNotEquals("codCine no esta accesible", codCine, cine.getCodCine());
		}
		
		@Test
		public void testNombre() {
			Cine cine= new Cine();
			String nombre= "un texto";
			cine.setNombre(nombre);
			assertNotEquals("Nombre no est� accesible", nombre, cine.getNombre());
		}
		
		@Test
		public void testDireccion() {
			Cine cine= new Cine();
			String direccion= "un texto";
			cine.setNombre(direccion);
			assertNotEquals("Nombre no est� accesible", direccion, cine.getNombre());
		}
		
		@Test
		public void testNumSalas() {
			Cine cine= new Cine();
			int numSalas= 500;
			cine.setNumSalas(numSalas);
			assertNotEquals("Nombre no est� accesible", numSalas, cine.getNombre());
		}
		

		@Test
		public void testHashCode() {
		Cine cine= new Cine();
		assertEquals("hasCode no encontrado!!!",0, cine.hashCode());
		int codCine = 666;
		cine.setCodCine(codCine);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(),cine.hashCode());
		}
}
