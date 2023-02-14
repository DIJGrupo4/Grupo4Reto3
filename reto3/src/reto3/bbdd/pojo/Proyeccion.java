package reto3.bbdd.pojo;

import java.util.Objects;

public class Proyeccion {

	// Claves primarias
	private int codProyeccion = 0;

	// Atributos
	private int codSala = 0;
	private int codPelicula = 0;
	private int hora = 0;
	private int precio = 0;
	
	private String titulo = null;
	
	public int getCodProyeccion() {
		return codProyeccion;
	}
	public void setCodProyeccion(int codProyeccion) {
		this.codProyeccion = codProyeccion;
	}
	public int getCodSala() {
		return codSala;
	}
	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}
	public int getCodPelicula() {
		return codPelicula;
	}
	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, codProyeccion, codSala, hora, precio, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyeccion other = (Proyeccion) obj;
		return codPelicula == other.codPelicula && codProyeccion == other.codProyeccion && codSala == other.codSala
				&& hora == other.hora && precio == other.precio && Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Proyeccion [codProyeccion=" + codProyeccion + ", codSala=" + codSala + ", codPelicula=" + codPelicula
				+ ", hora=" + hora + ", precio=" + precio + ", titulo=" + titulo + "]";
	}


}