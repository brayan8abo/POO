package Actividad1;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	
	private int codigoSupervisionAlimentaria;
	
	

	//

	public ProductoRefrigerado(LocalDate fechaCaducidad, int numeroLote, int codigoSupervisionAlimentaria) {
		super(fechaCaducidad, numeroLote);
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}

	public int getCodigoSupervisionAlimentaria() {
		return codigoSupervisionAlimentaria;
	}

	public void setCodigoSupervisionAlimentaria(int codigoSupervisionAlimentaria) {
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}

	@Override
	public String toString() {
		return "ProductosRefrigerados [CodigoSupervisionAlimentaria= " + getCodigoSupervisionAlimentaria()
				+ ", FechaCaducidad= " + getFechaCaducidad() + ", NumeroLote= " + getNumeroLote() + "]";
	}

	

}
