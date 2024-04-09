package controlHerencia;

import java.time.LocalDate;
import java.time.LocalTime;

public class LargoRecorrido extends Tren implements Descuento {

	private boolean pbServicioCafeteria;
	private int pdMinutosViaje;

	public boolean isPbServicioCafeteria() {
		return pbServicioCafeteria;
	}

	public void setPbServicioCafeteria(boolean pbServicioCafeteria) {
		this.pbServicioCafeteria = pbServicioCafeteria;
	}

	public int getPdMinutosViaje() {
		return pdMinutosViaje;
	}

	public void setPdMinutosViaje(int pdMinutosViaje) {
		this.pdMinutosViaje = pdMinutosViaje;
	}

	public LargoRecorrido(String psOrigen, String psDestino, int año, int mes, int dia, double pdTarifa,
			boolean pbServicioCafeteria, int pdMinutosViaje) {
		super(psOrigen, psDestino, año, mes, dia, pdTarifa);
		this.pbServicioCafeteria = pbServicioCafeteria;
		this.pdMinutosViaje = pdMinutosViaje;
	}

	@Override
	public double calcularDescuento() {
		if (getPdFecha().getMonth() <= 10 && pdMinutosViaje > 5) {
			return Descuento.descuentoBase;

		} else {
			return Descuento.descuentoBase / 2;
		}

	}

	@Override
	public double calcularPVP() {
		double descuento = calcularDescuento();
		double pvp = getPdTarifa() * (1 - descuento);
		return pvp;

	}

	@Override
	public String toString() {
		return "LargoRecorrido [ServicioCafeteria= " + isPbServicioCafeteria() + ", MinutosViaje= "
				+ getPdMinutosViaje() + ", calcularDescuento= " + calcularDescuento() + ", calcularPVP= "
				+ calcularPVP() + ", Origen= " + getPsOrigen() + ", Destino= " + getPsDestino() + ", Fecha= "
				+ getPdFecha() + ", Tarifa= " + getPdTarifa() + "]";
	}

}
