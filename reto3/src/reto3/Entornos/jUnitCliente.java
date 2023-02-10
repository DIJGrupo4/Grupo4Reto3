package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;
import java.util.ArrayList;

import org.junit.Test;

import reto3.bbdd.pojo.Cliente;
import reto3.bbdd.pojo.Entrada;
import reto3.bbdd.pojo.Recibo;

class jUnitCliente {

	// ***** para probar la serializaci�n
	@Test
	public void testSeralizable() {
		Cliente cliente = new Cliente();
		assertTrue("No se puede realizar la serializacion!!!", cliente instanceof Serializable);
	}

	// ************* probar getter & Setters

	@Test
	public void testDNI() {
		Cliente cliente = new Cliente();
		String DNI = "un texto";
		cliente.setDNI(DNI);
		assertNotEquals("DNI no esta accesible", DNI, cliente.getDNI());
	}

	@Test
	public void testNombre() {
		Cliente cliente = new Cliente();
		String nombre = "un texto";
		cliente.setNombre(nombre);
		assertNotEquals("Nombre no esta accesible", nombre, cliente.getNombre());
	}

	@Test
	public void testApellido() {
		Cliente cliente = new Cliente();
		String apellido = "un texto";
		cliente.setApellido(apellido);
		assertNotEquals("Apellido no esta accesible", apellido, cliente.getApellido());
	}

	@Test
	public void testSexo() {
		Cliente cliente = new Cliente();
		String sexo = "un texto";
		cliente.setSexo(sexo);
		assertNotEquals("Sexo no esta accesible", sexo, cliente.getSexo());
	}

	@Test
	public void testContraseña() {
		Cliente cliente = new Cliente();
		String contraseña = "un texto";
		cliente.setContraseña(contraseña);
		assertNotEquals("Contraseña no esta accesible", contraseña, cliente.getContraseña());
	}

	@Test
	public void testUsuario() {
		Cliente cliente = new Cliente();
		String usuario = "un texto";
		cliente.setUsuario(usuario);
		assertNotEquals("Usuario no esta accesible", usuario, cliente.getUsuario());
	}

	@Test
	public void testEntrada() {
		Cliente cliente = new Cliente();
		ArrayList<Entrada> entradas = null;
		cliente.setEntradas(entradas);
		assertNotEquals("Entradas no esta accesible", entradas, cliente.getEntradas());
	}

	@Test
	public void testRecibo() {
		Cliente cliente = new Cliente();
		ArrayList<Recibo> recibos = null;
		cliente.setRecibos(recibos);
		assertNotEquals("Recibos no esta accesible", recibos, cliente.getRecibos());
	}

	@Test
	public void testClienteIguales() {
		Cliente cliente = new Cliente();
		cliente.setDNI("12345678L");
		cliente.setNombre("Paul");
		cliente.setApellido("Guridi");
		cliente.setSexo("Hombre");
		cliente.setContraseña("123456");
		cliente.setNombre("Paul13");
		Cliente otroCliente = new Cliente();
		otroCliente.setDNI("12345678L");
		otroCliente.setNombre("Paul");
		otroCliente.setApellido("Guridi");
		otroCliente.setSexo("Hombre");
		otroCliente.setContraseña("123456");
		otroCliente.setNombre("Paul13");

		assertEquals("los clientes son iguales!!!!", cliente, otroCliente);

	}

	@Test
	public void testClienteNull() {
		Cliente cliente = new Cliente();
		cliente.setDNI(null);
		cliente.setNombre(null);
		cliente.setApellido(null);
		cliente.setSexo(null);
		cliente.setContraseña(null);
		cliente.setNombre(null);
		Cliente otroCliente = new Cliente();
		otroCliente.setDNI("12345678L");
		otroCliente.setNombre("Paul");
		otroCliente.setApellido("Guridi");
		otroCliente.setSexo("Hombre");
		otroCliente.setContraseña("123456");
		otroCliente.setNombre("Paul13");

		assertEquals("los cines no son iguales!!!!", cliente, otroCliente);

	}

	@Test
	public void testClienteDiferentes() {
		Cliente cliente = new Cliente();
		cliente.setDNI("12345678L");
		cliente.setNombre("Paul");
		cliente.setApellido("Guridi");
		cliente.setSexo("Hombre");
		cliente.setContraseña("123456");
		cliente.setNombre("Paul13");
		Cliente otroCliente = new Cliente();
		otroCliente.setDNI("87654321L");
		otroCliente.setNombre("Jon");
		otroCliente.setApellido("Lopez");
		otroCliente.setSexo("Hombre");
		otroCliente.setContraseña("345216");
		otroCliente.setNombre("JonLo");
		assertEquals("los clientes no son iguales!!!!", cliente, otroCliente);

	}

	@Test
	public void testHashCodeDNI() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String DNI = "un texto";
		cliente.setDNI(DNI);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

	@Test
	public void testHashCodeNombre() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String nombre = "un texto";
		cliente.setNombre(nombre);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

	@Test
	public void testHashCodeApellido() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String apellido = "un texto";
		cliente.setApellido(apellido);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

	@Test
	public void testHashCodeSexo() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String sexo = "un texto";
		cliente.setSexo(sexo);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

	@Test
	public void testHashCodeContraseña() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String contraseña = "un texto";
		cliente.setContraseña(contraseña);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

	@Test
	public void testHashCodeUsuario() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		String usuario = "un texto";
		cliente.setUsuario(usuario);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}

}
