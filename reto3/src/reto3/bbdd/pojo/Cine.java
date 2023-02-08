package reto3.bbdd.pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Cine {

	// Clave primaria
	private int codigo = 0;

	// Atributos
	private String nombre = null;
	private String direccion = null;
	private int numSalas = 0;

	//Relacion 1:N con Sala
	private ArrayList<Sala> salas = null;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codCine) {
		this.codigo = codCine;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumSalas() {
		return numSalas;
	}

	public void setNumSalas(int numSalas) {
		this.numSalas = numSalas;
	}

	public ArrayList<Sala> getSalas() {
		return salas;
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, direccion, nombre, numSalas, salas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cine other = (Cine) obj;
		return codigo == other.codigo && Objects.equals(direccion, other.direccion)
				&& Objects.equals(nombre, other.nombre) && numSalas == other.numSalas
				&& Objects.equals(salas, other.salas);
	}

	@Override
	public String toString() {
		return "Cine [codCine=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", numSalas=" + numSalas
				+ ", salas=" + salas + "]";
	}

	

}
