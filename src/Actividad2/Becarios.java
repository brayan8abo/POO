package Actividad2;

import java.time.LocalDate;

//Becarios: contrato, getContrato(), toString()
public class Becarios extends Empleados{
	
	public Becarios(String nombre, double sueldo) {
		super(nombre, sueldo);
		
	}
	public LocalDate getContrato() {
		return contrato;
	}
	public int getContrato2() {
		return contrato2;
	}
	private LocalDate contrato;
	private int contrato2;
	@Override
	public String toString() {
		return "Becarios [Contrato= " + getContrato() + ", Contrato2)= " + getContrato2() + ", Nombre)="
				+ getNombre() + "]";
	}
	
	

}
