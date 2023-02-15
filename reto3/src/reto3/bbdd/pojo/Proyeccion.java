package reto3.bbdd.pojo;

import java.util.Objects;

public class Proyeccion {

	// Claves primarias
	private int codProyeccion = 0;

	// Atributos
	private int codSala = 0;
	private int codPelicula = 0;
	private int fechaHora = 0;

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

	public int getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(int fechaHora) {
		this.fechaHora = fechaHora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, codProyeccion, codSala, fechaHora);
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
				&& fechaHora == other.fechaHora;
	}

	@Override
	public String toString() {
		return "Proyeccion [codProyeccion=" + codProyeccion + ", codSala=" + codSala + ", codPelicula=" + codPelicula
				+ ", fechaHora=" + fechaHora + "]";
	}

}