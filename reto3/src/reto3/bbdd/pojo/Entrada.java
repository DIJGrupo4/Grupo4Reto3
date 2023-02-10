package reto3.bbdd.pojo;

import java.util.Objects;

public class Entrada {

	// Clave primaria
	private int codEntrada = 0;

	// Atributos

	private int precio = 0;

	public int getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		this.codEntrada = codEntrada;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codEntrada, precio);
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
		return codEntrada == other.codEntrada && precio == other.precio;
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + ", precio=" + precio + "]";
	}

}
