package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;

import org.junit.Test;

import reto3.bbdd.pojo.Entrada;
import reto3.bbdd.pojo.Recibo;

class jUnitVentas {

	// ***** para probar la serializaci�n
	@Test
	public void testSerailizable() {
		Recibo recibos = new Recibo();
		assertTrue("No se puede realizar la serializacion!!!", recibos instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testcodRecibo() {
		Recibo recibos = new Recibo();
		int codRecibo = 0;
		recibos.setCodRecibo(codRecibo);
		assertNotEquals("DNI no esta accesible", codRecibo, recibos.getCodRecibo());
	}
	
	@Test
	public void testPreciTotal() {
		Recibo recibos = new Recibo();
		int precioTotal = 100;
		recibos.setPrecioTotal(precioTotal);
		assertNotEquals("Costo no esta accesible", precioTotal, recibos.getPrecioTotal());
	}
	
	@Test
	public void testEntrada() {
		Recibo recibos = new Recibo();
		ArrayList<Entrada> entradas = null;
		recibos.setEntradas(entradas);
		assertNotEquals("Entradas no esta accesible", entradas, recibos.getEntradas());
	}

	@Test
	public void testCineIguales() {
		Recibo recibos = new Recibo();
		recibos.setCodRecibo(12);
		recibos.setPrecioTotal(12);
		Recibo otrorecibos = new Recibo();
		otrorecibos.setCodRecibo(12);
		otrorecibos.setPrecioTotal(12);
		assertEquals("los cines son iguales!!!!", recibos, otrorecibos);

	}


	@Test
	public void testCineDiferentes() {
		
			Recibo recibos = new Recibo();
			recibos.setCodRecibo(12);
			recibos.setPrecioTotal(12);
			Recibo otrorecibos = new Recibo();
			otrorecibos.setCodRecibo(1222);
			otrorecibos.setPrecioTotal(122);
			assertEquals("los cines no son iguales!!!!", recibos, otrorecibos);

	}

	@Test
	public void testHashCodeCodRecibo() {
		Recibo recibos = new Recibo();
		assertEquals("hasCode no encontrado!!!", 0, recibos.hashCode());
		int codRecibo = 0;
		recibos.setCodRecibo(codRecibo);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), recibos.hashCode());
	}
	
	@Test
	public void testHashCodeCosto() {
		Recibo recibos = new Recibo();
		assertEquals("hasCode no encontrado!!!", 0, recibos.hashCode());
		int precioTotal = 666;
		recibos.setPrecioTotal(precioTotal);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), recibos.hashCode());
	}

}