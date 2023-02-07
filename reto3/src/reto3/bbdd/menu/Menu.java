package reto3.bbdd.menu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import reto3.bbdd.pojo.Cine;

public class Menu {
	
	public void mostrarCine(Cine ejemplo) {
		System.out.println("-------------------------------------");
		System.out.println("CodCine - " + ejemplo.getCodCine());
		System.out.println("Nombre - " + ejemplo.getNombre());
		System.out.println("Direccion - " + ejemplo.getDireccion());
		System.out.println("NumSalas - " + ejemplo.getNumSalas());
		System.out.println("-------------------------------------");
	};

}
