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
	
	private LocalDate contrato;
	
	@Override
	public String toString() {
		return "Becarios [Contrato= " + getContrato() +  ", Nombre)="
				+ getNombre() + "]";
	}
	
	

}
