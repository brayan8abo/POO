package poo2;

public class Jefatura extends Empleado implements Jefes {

	private double incentivo;

	public Jefatura(String nombre, double sueldo, int año, int mes, int dia) {
		super(nombre, sueldo, año, mes, dia);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {
		double sueldoJefe = super.getSueldo(); // super por que no sabe de cual clase usar el get, en este caso con el
												// (super.) usa la clase padre que seria empleado
		return sueldoJefe + incentivo;

	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " Sueldo: " + getSueldo() + " Fecha alta: " + getAltaContrato();
	}

	@Override
	public String tomarDecisiones(String decision) {

		return "El jefe toma la decisión de " + decision;
	}

	@Override
	public double establecerBonus(double gratificacion) {
		double prima = 2000;

		return Trabajadores.bonusBase + gratificacion + prima;
	}

}
