package escaletaG;

public class Programa {
	// Atributos
	private String nombre;
	private int duracion;

	// Constructor con 2 parámetros
	public Programa(String nombre, int duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}

	// Constructor con un parámetro (nombre)
	public Programa(String nombre) {
		this.nombre = nombre;
		this.duracion = 0; // Por defecto, duración 0
	}

	// Getter para el nombre
	public String getNombre() {
		return nombre;
	}

	// Setter para el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter para la duración
	public int getDuracion() {
		return duracion;
	}

	// Setter para la duración
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// Método toString para imprimir los detalles del programa
	@Override
	public String toString() {
		return "Programa: " + nombre + ", Duración: " + duracion + " horas";
	}

	// Método para programar el programa en una hora determinada
	public boolean programar(Programa[] escaleta, int hora) {
		// Implementación del método programar
		return false;
	}
}
