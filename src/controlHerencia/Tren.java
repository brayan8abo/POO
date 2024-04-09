package controlHerencia;


import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Tren implements Descuento{

	private String psOrigen;
	private String psDestino;
	private Date pdFecha;
	private double pdTarifa;

	public String getPsOrigen() {
		return psOrigen;
	}

	public void setPsOrigen(String psOrigen) {
		this.psOrigen = psOrigen;
	}

	public String getPsDestino() {
		return psDestino;
	}

	public void setPsDestino(String psDestino) {
		this.psDestino = psDestino;
	}

	public Date getPdFecha() {
		return pdFecha;
	}

	public void setPdFecha(Date pdFecha) {
		this.pdFecha = pdFecha;
	}

	public double getPdTarifa() {
		return pdTarifa;
	}

	public void setPdTarifa(double pdTarifa) {
		this.pdTarifa = pdTarifa;
	}

	public Tren(String psOrigen, String psDestino, int año, int mes, int dia, double pdTarifa) {
		super();
		this.psOrigen = psOrigen;
		this.psDestino = psDestino;
		GregorianCalendar calendario = new GregorianCalendar(año, mes, dia);
		this.pdFecha = calendario.getTime();
		this.pdTarifa = pdTarifa;
	}

	public abstract double calcularPVP();
	
	public double calcularDescuento() {
		double descuento = descuentoBase * getPdTarifa();
		return pdTarifa;
		
	}

	@Override
	public String toString() {
		return "Tren [Origen= " + getPsOrigen() + ", Destino= " + getPsDestino() + ", Fecha= " + getPdFecha()
				+ ", Tarifa= " + getPdTarifa() + "]";
	}

}
