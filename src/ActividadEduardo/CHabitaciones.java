package ActividadEduardo;

public class CHabitaciones {
	private int numeroHabitacion;
	private boolean estado;
	private int numeroCamas;

	public CHabitaciones(int numeroHabitacion, boolean estado, int numeroCamas) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.estado = estado;
		this.numeroCamas = numeroCamas;
	}

	public CHabitaciones() {
		super();
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	@Override
	public String toString() {
		return "CHabitaciones [getNumeroHabitacion()=" + getNumeroHabitacion() + ", isEstado()=" + isEstado()
				+ ", getNumeroCamas()=" + getNumeroCamas() + "]";
	}

}
