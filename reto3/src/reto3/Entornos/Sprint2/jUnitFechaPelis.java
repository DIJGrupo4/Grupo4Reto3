package reto3.Entornos.Sprint2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.pojo.Proyeccion;

class jUnitFechaPelis {

	@Test
	void testFechasDeUnaPeli() {
		
		String tituloSeleccionado = null;
		int codCine = 0;
		
		GestorProyecciones gestorProyecciones = new GestorProyecciones();
		ArrayList<Proyeccion> proyeccion = null;
		
		proyeccion = gestorProyecciones.obtenerProyeccionesPorPelicula(tituloSeleccionado, codCine);

		if (null == proyeccion) {
			fail("El metodo no devuelve ninguna proyeccion");
		} else {
			assertEquals(4, proyeccion.size());
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd");
			String fecha = formatter.format(proyeccion.get(0).getFecha());
			
			assertEquals("2023-03-01", fecha);
		}
	}
}
