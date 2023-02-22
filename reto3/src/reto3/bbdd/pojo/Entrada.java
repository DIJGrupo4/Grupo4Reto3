package reto3.bbdd.pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Entrada {

	// Clave primaria
	private int codEntrada = 0;
	
	// Relacion 1:N con Proyeccion
	private ArrayList<Proyeccion> proyecciones = null;

	public int getCodEntrada() {
		return codEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		this.codEntrada = codEntrada;
	}

	public ArrayList<Proyeccion> getProyecciones() {
		return proyecciones;
	}

	public void setProyecciones(ArrayList<Proyeccion> proyecciones) {
		this.proyecciones = proyecciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codEntrada, proyecciones);
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
		return codEntrada == other.codEntrada && Objects.equals(proyecciones, other.proyecciones);
	}

	@Override
	public String toString() {
		return "Entrada [codEntrada=" + codEntrada + ", proyecciones=" + proyecciones + "]";
	}

}
