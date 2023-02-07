package reto3.bbdd.pojo;

import java.util.Objects;

public class Entrada {

	private int codEntrada = 0;
	private String fechaCompra = null;
	private String nombrePelicula = null;
	private int hora = 0;
	private int numeroSala = 0;
	private int precio = 0;

	public int getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		this.codEntrada = codEntrada;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codEntrada, fechaCompra, hora, nombrePelicula, numeroSala, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		return codEntrada == other.codEntrada && fechaCompra == other.fechaCompra && hora == other.hora
				&& Objects.equals(nombrePelicula, other.nombrePelicula) && numeroSala == other.numeroSala
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "Entradas [codEntrada=" + codEntrada + ", fechaCompra=" + fechaCompra + ", nombrePelicula="
				+ nombrePelicula + ", hora=" + hora + ", numeroSala=" + numeroSala + ", precio=" + precio + "]";
	}

}
