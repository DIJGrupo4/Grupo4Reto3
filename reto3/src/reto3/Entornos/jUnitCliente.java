package reto3.Entornos;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.Test;

import reto3.bbdd.pojo.Cliente;

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
	public void testCodEntrada() {
		Cliente cliente = new Cliente();
		int codEntrada = 54321;
		cliente.setCodEntrada(codEntrada);
		assertNotEquals("CodEntrada no esta accesible", codEntrada, cliente.getCodEntrada());
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
		cliente.setCodEntrada(54321);
		Cliente otroCliente = new Cliente();
		cliente.setDNI("12345678L");
		cliente.setNombre("Paul");
		cliente.setApellido("Guridi");
		cliente.setSexo("Hombre");
		cliente.setContraseña("123456");
		cliente.setNombre("Paul13");
		cliente.setCodEntrada(54321);

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
		cliente.setCodEntrada(54321);
		Cliente otroCliente = new Cliente();
		cliente.setDNI("12345678L");
		cliente.setNombre("Paul");
		cliente.setApellido("Guridi");
		cliente.setSexo("Hombre");
		cliente.setContraseña("123456");
		cliente.setNombre("Paul13");
		cliente.setCodEntrada(54321);

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
		cliente.setCodEntrada(54321);
		Cliente otroCliente = new Cliente();
		cliente.setDNI("87654321L");
		cliente.setNombre("Jon");
		cliente.setApellido("Lopez");
		cliente.setSexo("Hombre");
		cliente.setContraseña("345216");
		cliente.setNombre("JonLo");
		cliente.setCodEntrada(12345);
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
	
	@Test
	public void testHashCodeCodEntrada() {
		Cliente cliente = new Cliente();
		assertEquals("hasCode no encontrado!!!", 0, cliente.hashCode());
		int codEntrada = 50;
		cliente.setCodEntrada(codEntrada);
		assertEquals("hashCode-2 no encontrado!!!!", hashCode(), cliente.hashCode());
	}
}
