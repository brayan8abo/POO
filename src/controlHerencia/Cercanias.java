package controlHerencia;

import java.time.LocalDate;

public class Cercanias extends Tren {

	private boolean pbParkingHere;
	private int piNumEstaciones;

	public boolean isPbParkingHere() {
		return pbParkingHere;
	}

	public void setPbParkingHere(boolean pbParkingHere) {
		this.pbParkingHere = pbParkingHere;
	}

	public int getPiNumEstaciones() {
		return piNumEstaciones;
	}

	public void setPiNumEstaciones(int piNumEstaciones) {
		this.piNumEstaciones = piNumEstaciones;
	}

	public Cercanias(String psOrigen, String psDestino, int año, int mes, int dia, double pdTarifa,
			boolean pbParkingHere, int piNumEstaciones) {
		super(psOrigen, psDestino, año, mes, dia, pdTarifa);
		this.pbParkingHere = pbParkingHere;
		this.piNumEstaciones = piNumEstaciones;
	}

	@Override
	public double calcularPVP() {
		return getPdTarifa() * (piNumEstaciones);
	}

	@Override
	public String toString() {
		return "Cercanias [ParkingHere= " + isPbParkingHere() + ", NumEstaciones= " + getPiNumEstaciones()
				+ ", calcularPVP= " + calcularPVP() + ", Origen= " + getPsOrigen() + ",  Destino= " + getPsDestino()
				+ ",  Fecha= " + getPdFecha() + ",  Tarifa= " + getPdTarifa() + "]";
	}

}
