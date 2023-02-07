package reto3.bbdd.pojo;

import java.util.Objects;

public class Sala {

	private String nombreSala = null;
	private int codSala = 0;
	private String fecha = null;
	private int codPelicula = 0;
	private int horarioSala = 0;

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}

	public int getHorarioSala() {
		return horarioSala;
	}

	public void setHorarioSala(int horarioSala) {
		this.horarioSala = horarioSala;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPelicula, codSala, fecha, horarioSala, nombreSala);
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
		return codPelicula == other.codPelicula && codSala == other.codSala && fecha == other.fecha
				&& horarioSala == other.horarioSala && Objects.equals(nombreSala, other.nombreSala);
	}

	@Override
	public String toString() {
		return "Salas [nombreSala=" + nombreSala + ", codSala=" + codSala + ", fecha=" + fecha + ", codPelicula="
				+ codPelicula + ", horarioSala=" + horarioSala + "]";
	}

}
