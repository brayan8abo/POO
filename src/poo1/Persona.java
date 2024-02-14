package poo1;

public class Persona {
	private String  nombre;
	private String apellidos;
	private int identificacion;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param identificacion
	 */
	public Persona(String nombre, String apellidos, int identificacion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", identificacion=" + identificacion + "]";
	}
	
}
