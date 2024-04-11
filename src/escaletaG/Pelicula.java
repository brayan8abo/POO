package escaletaG;

public class Pelicula extends Programa {
	// Atributos adicionales de la clase Pelicula
	private String director;
	private boolean estreno;

	// Constructor con 3 parámetros
	public Pelicula(String nombre, String director, boolean estreno) {
		// Llamar al constructor de la clase base (Programa) con el nombre y duración
		// por defecto
		super(nombre);
		this.director = director;
		this.estreno = estreno;
	}

	// Getter para el director
	public String getDirector() {
		return director;
	}

	// Setter para el director
	public void setDirector(String director) {
		this.director = director;
	}

	// Getter para el estado de estreno
	public boolean isEstreno() {
		return estreno;
	}

	// Setter para el estado de estreno
	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	// Método toString para imprimir los detalles de la película
	@Override
	public String toString() {
		return super.toString() + ", Director: " + director + ", Estreno: " + (estreno ? "Sí" : "No");
	}

	// Método para programar la película en una hora determinada
	@Override
	public boolean programar(Programa[] escaleta, int hora) {
		// Implementación del método programar
		return false;
	}
}