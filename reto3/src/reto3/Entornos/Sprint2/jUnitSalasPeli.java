package reto3.Entornos.Sprint2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.gestor.GestorSalas;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;
import reto3.bbdd.pojo.Sala;

class jUnitSalasPeli {

	@Test
	void testSalasPeli() {

		String tituloSeleccionado = null;
		int codCine = 0;
		int codSala = 0;

		GestorProyecciones gestorProyecciones = new GestorProyecciones();
		ArrayList<Proyeccion> proyeccion = null;
		
		GestorSalas gestorSalas = new GestorSalas();
		int numSala = 0;

		proyeccion = gestorProyecciones.obtenerProyeccionesPorPelicula(tituloSeleccionado, codCine);
		numSala = gestorSalas.getNumSalaPorCodSala(codSala);

		if (null == proyeccion) {
			fail("El metodo no devuelve ninguna proyeccion");
		} else {
			assertEquals(4, proyeccion.size());

			Format formatter = new SimpleDateFormat("yyyy-MM-dd");
			String fecha = formatter.format(proyeccion.get(0).getFecha());

			assertEquals("1", numSala);
			assertEquals("2023-03-01", fecha);
		}
	}
}
