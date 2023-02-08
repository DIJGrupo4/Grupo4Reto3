package reto3.bbdd.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Recibo implements Serializable {

	private static final long serialVersionUID = 8091926587816980311L;

	// Clave primaria
	private int codRecibo = 0;

	// Atributos
	private int precioTotal = 0;

	// Relacion 1:N con Entrada
	private ArrayList<Entrada> entradas = null;

	// Relacion N:1 con Cliente
	private Cliente cliente = null;

	public int getCodRecibo() {
		return codRecibo;
	}

	public void setCodRecibo(int codRecibo) {
		this.codRecibo = codRecibo;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, codVenta, entradas, precioTotal);
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
		return Objects.equals(cliente, other.cliente) && codVenta == other.codVenta
				&& Objects.equals(entradas, other.entradas) && precioTotal == other.precioTotal;
	}

	@Override
	public String toString() {
		return "Venta [codVenta=" + codVenta + ", precioTotal=" + precioTotal + ", entradas=" + entradas + ", cliente="
				+ cliente + "]";
	}


}
