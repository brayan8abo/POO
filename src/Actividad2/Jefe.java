package Actividad2;
//Jefes: prima, getSueldo(), getPrima()
public class Jefe extends Empleado{
	private double prima;
	
	
	public Jefe(String nombre, double sueldo) {
		super(nombre, sueldo);
	
		
	}
	

	public double getPrima() {
		return prima;
	}
	public double getSueldo() {
		return super.getSueldo();
	}

}
