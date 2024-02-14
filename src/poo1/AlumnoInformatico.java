package poo1;

public class AlumnoInformatico extends Informatico {
	 private String centro;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param identificacion
	 * @param especialidad
	 * @param centro
	 */
	public AlumnoInformatico(String nombre, String apellidos, int identificacion, String especialidad, String centro) {
		super(nombre, apellidos, identificacion, especialidad);
		this.centro = centro;
	}

	

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}



	@Override
	public String toString() {
		return "AlumnoInformatico [Centro = " + getCentro()  + super.toString() + "]";
	}



	
	
	
}

