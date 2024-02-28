package Actividad2;

//Empleados, Becarios y Jefes
//
//Empleados (superclase): nombre, sueldo, getSueldo(), toString()
//

//
//Jefes: prima, getSueldo(), getPrima()

public class Empleados {

	private String nombre;
	private double sueldo;
	
	public Empleados(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleados [getNombre()=" + getNombre() + ", getSueldo()=" + getSueldo() + "]";
	}
	
	
	
	
	
	
}
