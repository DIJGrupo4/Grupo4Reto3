package reto3.bbdd.menu;

import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Pelicula;

public class Menu {
	
	public void mostrarCine(Cine ejemplo) {
		System.out.println("-------------------------------------");
		System.out.println("CodCine - " + ejemplo.getCodCine());
		System.out.println("Nombre - " + ejemplo.getNombre());
		System.out.println("Direccion - " + ejemplo.getDireccion());
		System.out.println("-------------------------------------");
	};
	
	public void mostrarPelicula(Pelicula ejemplo) {
		System.out.println("-------------------------------------");
		System.out.println("Titulo - " + ejemplo.getTitulo());
		System.out.println("Duracion - " + ejemplo.getDuracion());
		System.out.println("Genero - " + ejemplo.getDuracion());
		System.out.println("-------------------------------------");
	};

}
