package reto3.Entornos;

import reto3.bbdd.pojo.Cine;

import java.io.Serializable;

import org.junit.Test;

public class jUnitCine {

	
	//***** para probar si el constructor funciona
	@Test
	public void testAccesoUsuarioConstructor() throws Exception {
		AccesoUsuario accesoUsuario= AccesoUsuario.class.getConstructor().newInstance();
		assertNotNull("El Usuario no puede ser creado !!!", accesoUsuario);
	}

	//***** para probar la serializaci�n	
	@Test
	public void testSerailizable() {
		AccesoUsuario accesoUsuario= new AccesoUsuario();
		assertTrue("No se puede realizar la serializaci�n!!!", accesoUsuario instanceof Serializable);
	}
	
	//************* probar getter & Setters
	
	@Test
	public void testId() {
		AccesoUsuario accesoUsuario = new AccesoUsuario();
		Long id=(long) 99999991;
		accesoUsuario.setId(id);
		assertNotEquals("Id no est� accesible", id, accesoUsuario.getId());
	}
	
	@Test
	public void testNombre() {
		AccesoUsuario accesoUsuario = new AccesoUsuario();
		String name= "un texto";
		accesoUsuario.setNombre(name);
		assertNotEquals("Nombre no est� accesible", name, accesoUsuario.getNombre());
	}
	
	@Test
	public void testUsuarioExiste() {
		AccesoUsuario accesoUsuario= new AccesoUsuario();
		accesoUsuario.setId((long) 1234);
		accesoUsuario.setNombre("Zipi");
		AccesoUsuario otroUsuario= new AccesoUsuario();
		otroUsuario.setId((long) 1234);
		otroUsuario.setNombre("Zipi");
		
		assertEquals("usuarios no son iguales!!!!", accesoUsuario, otroUsuario);	
		
	}

	@Test
	public void testUsuarioNoExiste() {
		AccesoUsuario accesoUsuario= new AccesoUsuario();
		accesoUsuario.setId((long) 1234);
		accesoUsuario.setNombre("Zipi");
		
		AccesoUsuario otroUsuario= new AccesoUsuario();
		otroUsuario.setId((long) 1234);
		otroUsuario.setNombre("Zipi");
		
		assertNotEquals("usuarios son iguales!!!!", accesoUsuario, otroUsuario);	
		
		//*******
		//otroUsuario.setId((long) 1234);
		//otroUsuario.setNombre("Zipi");
		
		//assertNotEquals("usuarios son iguales!!!!", accesoUsuario, otroUsuario);	
		
	}

	@Test
	public void testHashCode() {
	AccesoUsuario accesoUsuario=new AccesoUsuario();
	assertEquals("hasCode no encontrado!!!",0, accesoUsuario.hashCode());
	Long id=(long) 1234;
	accesoUsuario.setId(id);
	assertEquals("hashCode-2 no encontrado!!!!", id.hashCode(),accesoUsuario.hashCode());
	}

}
