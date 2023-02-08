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
	
	// relacion N:1 con Cliente
	private Cliente cliente = null;
	
	// relacion N:1 con Proyeccion
	private Proyeccion proyeccion = null;

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Proyeccion getProyeccion() {
		return proyeccion;
	}

	public void setProyeccion(Proyeccion proyeccion) {
		this.proyeccion = proyeccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, codEntrada, codPelicula, fechaCompra, hora, numeroSala, precio, proyeccion);
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
		return Objects.equals(cliente, other.cliente) && codEntrada == other.codEntrada
				&& codPelicula == other.codPelicula && Objects.equals(fechaCompra, other.fechaCompra)
				&& hora == other.hora && numeroSala == other.numeroSala && precio == other.precio
				&& Objects.equals(proyeccion, other.proyeccion);
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + ", fechaCompra=" + fechaCompra + ", codPelicula=" + codPelicula
				+ ", hora=" + hora + ", numeroSala=" + numeroSala + ", precio=" + precio + ", cliente=" + cliente
				+ ", proyeccion=" + proyeccion + "]";
	}

	
	
	
}
