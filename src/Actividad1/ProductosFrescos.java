package Actividad1;

import java.time.LocalDate;

public class ProductosFrescos extends Productos {

	private LocalDate fechaEnvasado;
	private String paisOrigen;

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public ProductosFrescos(LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductosFrescos [FechaEnvasado= " + getFechaEnvasado() + ", PaisOrigen= " + getPaisOrigen()
				+ ", FechaCaducidad= " + getFechaCaducidad() + " , NumeroLote= " + getNumeroLote() + "]";
	}

}
