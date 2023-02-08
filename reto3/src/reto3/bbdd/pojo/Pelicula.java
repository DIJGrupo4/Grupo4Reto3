package reto3.bbdd.pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {

	// Clave primaria
	private int codPelicula = 0;

	// Atributos
	private String titulo = null;
	private int duracion = 0;
	private String genero = null;
	private int precio = 0;

	//Relacion 1:N con Proyeccion
	private ArrayList<Proyeccion> proyecciones = null;

	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public ArrayList<Proyeccion> getProyecciones() {
		return proyecciones;
	}

	public void setProyecciones(ArrayList<Proyeccion> proyecciones) {
		this.proyecciones = proyecciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, duracion, genero, precio, proyecciones, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return codPelicula == other.codPelicula && duracion == other.duracion && Objects.equals(genero, other.genero)
				&& precio == other.precio && Objects.equals(proyecciones, other.proyecciones)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Pelicula [codPelicula=" + codPelicula + ", titulo=" + titulo + ", duracion=" + duracion + ", genero="
				+ genero + ", precio=" + precio + ", proyecciones=" + proyecciones + "]";
	}

	

}
