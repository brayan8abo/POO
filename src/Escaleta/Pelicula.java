package Escaleta;

public class Pelicula extends Programa {

	private String director;
	private boolean isEstreno;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public boolean isEstreno() {
		return isEstreno;
	}

	public void setEstreno(boolean isEstreno) {
		this.isEstreno = isEstreno;
	}

	public Pelicula(String nombre, String director, boolean isEstreno) {
		super(nombre);
		this.director = director;
		this.isEstreno = isEstreno;
	}

	public static boolean programar(int hora) {
		if (hora == 0 && hora <= 23) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pelicula [getDirector()=" + getDirector() + ", isEstreno()=" + isEstreno() + ", getNombre()="
				+ getNombre() +  "]";
	}

}
