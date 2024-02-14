package poo1;

public class Informatico extends Persona {

	private String especialidad;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param identificacion
	 * @param especialidad
	 */
	public Informatico(String nombre, String apellidos, int identificacion, String especialidad) {
		super(nombre, apellidos, identificacion);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Informatico [NOMBRE = " + getEspecialidad() + ", Nombre = " + getNombre()
				+ ", Apellidos = " + getApellidos() + ", Identificacion = " + getIdentificacion() + "]";
	}

	
}
