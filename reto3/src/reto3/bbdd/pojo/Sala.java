package reto3.bbdd.pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Sala {

	// Clave primaria
	private int codSala = 0;

	// Atributos
	private String nombreSala = null;
	
	//Relacion 1:N con Proyeccion
	private ArrayList<Proyeccion> proyecciones = null;

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public ArrayList<Proyeccion> getProyecciones() {
		return proyecciones;
	}

	public void setProyecciones(ArrayList<Proyeccion> proyecciones) {
		this.proyecciones = proyecciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codSala, nombreSala, proyecciones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return codSala == other.codSala && Objects.equals(nombreSala, other.nombreSala)
				&& Objects.equals(proyecciones, other.proyecciones);
	}

	@Override
	public String toString() {
		return "Sala [codSala=" + codSala + ", nombreSala=" + nombreSala + ", proyecciones=" + proyecciones + "]";
	}

}
