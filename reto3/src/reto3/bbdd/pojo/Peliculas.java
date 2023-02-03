package reto3.bbdd.pojo;

import java.util.Objects;

public class Peliculas {

	private int codPelicula = 0;
	private int duracion = 0;
	private String genero = null;
	private int precio = 0;
	private String nombre = null;

	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, duracion, genero, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		return codPelicula == other.codPelicula && duracion == other.duracion && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre) && precio == other.precio;
	}

	@Override
	public String toString() {
		return "Peliculas [codPelicula=" + codPelicula + ", duracion=" + duracion + ", genero=" + genero + ", precio="
				+ precio + ", nombre=" + nombre + "]";
	}

}
