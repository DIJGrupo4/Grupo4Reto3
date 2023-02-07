package reto3.bbdd.pojo;

import java.util.Objects;

public class Entrada {

	// Clave primaria
	private int codEntrada = 0;

	// Atributos
	private String fechaCompra = null;
	private int codPelicula = 0;
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

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codEntrada, codPelicula, fechaCompra, hora, numeroSala, precio);
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
		return codEntrada == other.codEntrada && codPelicula == other.codPelicula
				&& Objects.equals(fechaCompra, other.fechaCompra) && hora == other.hora
				&& numeroSala == other.numeroSala && precio == other.precio;
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + ", fechaCompra=" + fechaCompra + ", codPelicula=" + codPelicula
				+ ", hora=" + hora + ", numeroSala=" + numeroSala + ", precio=" + precio + "]";
	}

}
