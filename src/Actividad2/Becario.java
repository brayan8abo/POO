package Actividad2;

import java.util.Date;
import java.util.GregorianCalendar;

//Becarios: contrato, getContrato(), toString()
public class Becario extends Empleado {

	private Date contrato;

	public Becario(String nombre, double sueldo, int año, int mes, int dia) {
		super(nombre, sueldo);
		GregorianCalendar calendario = new GregorianCalendar(año, mes, dia); // importacion calendario gregoriano
		this.contrato = calendario.getTime();

	}

	public Date getContrato() {
		return contrato;
	}

	@Override
	public String toString() {
		return "Becarios [Nombre= " + getNombre() + " contrato" + getContrato() + "]";
	}

}
