package Actividad2;
//Jefes: prima, getSueldo(), getPrima()
public class Jefes extends Empleados{
	private double prima;
	
	
	public Jefes(String nombre, double sueldo) {
		super(nombre, sueldo);
		
	}
	

	public double getPrima() {
		return prima;
	}
	public double getSueldo() {
		return super.getSueldo();
	}

}
