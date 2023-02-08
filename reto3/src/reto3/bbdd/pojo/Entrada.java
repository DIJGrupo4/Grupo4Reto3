package reto3.bbdd.pojo;


import java.util.Objects;

public class Entrada {

	// Clave primaria
	private int codEntrada = 0;

	public int getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		this.codEntrada = codEntrada;
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

	// Atributos
	private int numeroSala = 0;
	private int precio = 0;
	
	// relacion N:1 con Cliente
	private Cliente cliente = null;
	
	// relacion N:1 con Proyeccion
	private Proyeccion proyeccion = null;

	@Override
	public int hashCode() {
		return Objects.hash(cliente, codEntrada, numeroSala, precio, proyeccion);
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
				&& numeroSala == other.numeroSala && precio == other.precio
				&& Objects.equals(proyeccion, other.proyeccion);
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + ", numeroSala=" + numeroSala + ", precio=" + precio + ", cliente="
				+ cliente + ", proyeccion=" + proyeccion + "]";
	}

}
