package Actividad1;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {
	
	private int codigoSupervisionAlimentaria;
	
	

	//

	public ProductosRefrigerados(LocalDate fechaCaducidad, int numeroLote, int codigoSupervisionAlimentaria) {
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
