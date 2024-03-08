package controlHerencia;

import java.time.LocalDate;

public class LargoRecorrido<pdMinutosViaje> extends Tren implements Descuento {

	private boolean pbServicioCafeteria;
	private LocalDate pdMinutosViaje;

	public boolean isPbServicioCafeteria() {
		return pbServicioCafeteria;
	}

	public void setPbServicioCafeteria(boolean pbServicioCafeteria) {
		this.pbServicioCafeteria = pbServicioCafeteria;
	}

	public LocalDate getPdMinutosViaje() {
		return pdMinutosViaje;
	}

	public void setPdMinutosViaje(LocalDate pdMinutosViaje) {
		this.pdMinutosViaje = pdMinutosViaje;
	}

	public LargoRecorrido(String psOrigen, String psDestino, int año, int mes, int dia, double pdTarifa) {
		super(psOrigen, psDestino, año, mes, dia, pdTarifa);
	}

	@Override
	public double calcularDescuento() {
		if (getPdMinutosViaje().isAfter(pdMinutosViaje)) {
			
			
		}
		return descuentoBase;

	}

	@Override
	public double calcularPVP() {
		return 0;

	}

}
