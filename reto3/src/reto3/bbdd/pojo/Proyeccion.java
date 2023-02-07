package reto3.bbdd.pojo;

import java.util.Objects;

public class Proyeccion {

	// Claves primarias
	private int codSala = 0;
	private int codPelicula = 0;

	// Atributos
	private int fecha = 0;
	private int hora = 0;

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

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, codSala, fecha, hora);
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
		return codPelicula == other.codPelicula && codSala == other.codSala && fecha == other.fecha
				&& hora == other.hora;
	}

	@Override
	public String toString() {
		return "Proyeccion [codSala=" + codSala + ", codPelicula=" + codPelicula + ", fecha=" + fecha + ", hora=" + hora
				+ "]";
	}

}