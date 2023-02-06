package reto3.bbdd.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Ventas implements Serializable {

	private static final long serialVersionUID = 8091926587816980311L;

	private String dni = null;
	private int costo = 0;
	private String nombrePelicula = null;
	private String fecha = null;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costo, dni, fecha, nombrePelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ventas other = (Ventas) obj;
		return costo == other.costo && Objects.equals(dni, other.dni) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(nombrePelicula, other.nombrePelicula);
	}

	@Override
	public String toString() {
		return "Ventas [dni=" + dni + ", costo=" + costo + ", nombrePelicula=" + nombrePelicula + ", fecha=" + fecha
				+ ", getDni()=" + getDni() + ", getCosto()=" + getCosto() + ", getNombrePelicula()="
				+ getNombrePelicula() + ", getFecha()=" + getFecha() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

}
