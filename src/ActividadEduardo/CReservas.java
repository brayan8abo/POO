package ActividadEduardo;

import java.util.Date;

public class CReservas {
	private int numeroReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numeroHabitacion;
	private int numeroPersonas;

	public CReservas(int numeroReserva, Date fechaEntrada, Date fechaSalida, int numeroHabitacion, int numeroPersonas) {
		super();
		this.numeroReserva = numeroReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numeroHabitacion = numeroHabitacion;
		this.numeroPersonas = numeroPersonas;
	}

	public CReservas() {
		super();
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	@Override
	public String toString() {
		return "CReservas [getNumeroReserva()=" + getNumeroReserva() + ", getFechaEntrada()=" + getFechaEntrada()
				+ ", getFechaSalida()=" + getFechaSalida() + ", getNumeroHabitacion()=" + getNumeroHabitacion()
				+ ", getNumeroPersonas()=" + getNumeroPersonas() + "]";
	}

}
