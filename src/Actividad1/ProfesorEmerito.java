package Actividad1;

public class ProfesorEmerito extends Profesor {
	private int añosEmerito;

	public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
		super(nombre, edad, añosConsolidados);
		this.añosEmerito = añosEmerito;
	}

	public double obtenerSalarioBase() {
		double salarioBaseProfesor = super.obtenerSalarioBase();
		return salarioBaseProfesor + (60 * añosEmerito);
	}

	@Override
	public String toString() {
		return "ProfesorEmerito [obtenerSalarioBase()=" + obtenerSalarioBase() + ", Nombr)= " + getNombre()
				+ ", Edad= " + getEdad() + ", AñosConsolidados= " + getAñosConsolidados() + "]";
	}
	
}
