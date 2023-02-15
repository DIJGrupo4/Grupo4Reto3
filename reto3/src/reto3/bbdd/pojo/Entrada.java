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

	@Override
	public int hashCode() {
		return Objects.hash(codEntrada);
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
		return codEntrada == other.codEntrada;
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + "]";
	}

	
}
