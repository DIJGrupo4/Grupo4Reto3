package reto3.Entornos.Sprint2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

class jUnitPrecioPeli {

	@Test
	void testPrecioPeli() {

		String tituloSeleccionado = null;
		int codCine = 0;

		GestorProyecciones gestorProyecciones = new GestorProyecciones();
		ArrayList<Proyeccion> proyeccion = null;

		proyeccion = gestorProyecciones.obtenerProyeccionesPorPelicula(tituloSeleccionado, codCine);

		if (null == proyeccion) {
			fail("El metodo no devuelve ninguna proyeccion");
		} else {
			assertEquals(4, proyeccion.size());

			float precio = proyeccion.get(0).getPrecio();

			assertEquals("5", precio);

		}
	}

}
