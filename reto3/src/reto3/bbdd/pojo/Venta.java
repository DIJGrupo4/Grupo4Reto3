package reto3.bbdd.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Venta implements Serializable {

	private static final long serialVersionUID = 8091926587816980311L;

	// Clave primaria
	private int codVenta = 0;
	
	// Atributos
	private String dni = null;
	private int precioTotal = 0;
	private String fecha = null;
	
	//Relacion 1:N con Entrada
	private ArrayList<Entrada> entradas = null;

	public int getCodVenta() {
		return codVenta;
	}

	public void setCodVenta(int codVenta) {
		this.codVenta = codVenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codVenta, dni, entradas, fecha, precioTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return codVenta == other.codVenta && Objects.equals(dni, other.dni) && Objects.equals(entradas, other.entradas)
				&& Objects.equals(fecha, other.fecha) && precioTotal == other.precioTotal;
	}

	@Override
	public String toString() {
		return "Venta [codVenta=" + codVenta + ", dni=" + dni + ", precioTotal=" + precioTotal + ", fecha=" + fecha
				+ ", entradas=" + entradas + "]";
	}

}
