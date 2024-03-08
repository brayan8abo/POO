package controlHerencia;

import java.time.LocalDate;

public class Turistico extends Tren implements Descuento {

	private String psNombreTuristico;

	public String getPsNombreTuristico() {
		return psNombreTuristico;
	}

	public void setPsNombreTuristico(String psNombreTuristico) {
		this.psNombreTuristico = psNombreTuristico;
	}

	public Turistico(String psOrigen, String psDestino, int año, int mes, int dia, double pdTarifa,
			String psNombreTuristico) {
		super(psOrigen, psDestino, año, mes, dia, pdTarifa);
		this.psNombreTuristico = psNombreTuristico;
	}

	@Override
	public double calcularDescuento() {
		
		
		
		return 0;
	}

	@Override
	public double calcularPVP() {

		return 0;
	}

}
