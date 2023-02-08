package reto3.bbdd.pojo;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {

	// Clave primaria
	private int codCliente = 0;

	// Atributos
	private String DNI = null;
	private String nombre = null;
	private String apellido = null;
	private char sexo = '*';
	private String usuario = null;
	private String contraseña = null;
	
	//Relacion 1:N con Entrada
	private ArrayList<Recibo> recibos = null;
	
	//Relacion 1:N con Venta
	private ArrayList<Venta> ventas = null;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, apellido, codCliente, contraseña, entradas, nombre, sexo, usuario, ventas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(apellido, other.apellido)
				&& codCliente == other.codCliente && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(entradas, other.entradas) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(usuario, other.usuario)
				&& Objects.equals(ventas, other.ventas);
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", sexo=" + sexo + ", usuario=" + usuario + ", contraseña=" + contraseña + ", entradas=" + entradas
				+ ", ventas=" + ventas + "]";
	}

}
