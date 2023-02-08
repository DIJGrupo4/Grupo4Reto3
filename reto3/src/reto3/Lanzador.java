package reto3;

import reto3.bbdd.gestor.GestorCines;

public class Lanzador {

	public static void main(String[] args) {
		GestorCines gestorC = new GestorCines();
		gestorC.obtenerCinePorNombre("CineBilbao");

	}

}
