package Actividad1;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
	private double temperaturaRecomendada;

	public ProductoCongelado(LocalDate fechaCaducidad, int numeroLote, double temperaturaRecomendada) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	public double getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(double temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return "ProductosCongelados [TemperaturaRecomendada= " + getTemperaturaRecomendada()
				+ ", FechaCaducidad= " + getFechaCaducidad() + ", NumeroLote= " + getNumeroLote() + "]";
	}
	
	
	

}
