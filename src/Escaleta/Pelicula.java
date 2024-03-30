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

	public boolean programar(Programa[] escaleta, int hora) {
		for (int i = 0; i < escaleta.length; i++) {
			Programa prueba = new Programa("prueba");
			if (this.isEstreno == false) {
				if (escaleta[hora] != null || escaleta[hora + 1] != null) {
					System.out.println("La pelicula: " + this.getNombre()
							+ " no puede sr programada en en horario deseado, pruba en otro horario");
					return false;
				}
				if (escaleta[hora] == null && escaleta[hora + 1] == null && (hora == 21 || hora == 22 || hora == 23)) {
					if (i == 23) {
						escaleta[hora] = prueba;
						escaleta[hora].setNombre(this.getNombre());
						System.out.println("La peliciula : " + this.getNombre() + " fue programada con exito");
						return true;
					}
					if (hora != 23) {
						escaleta[hora] = prueba;
						escaleta[hora].setNombre(this.getNombre());
						System.out.println("La peliciula : " + this.getNombre() + " fue programada con exito");
						return true;
					}
					if (this.isEstreno() == true && (i != 21 || i != 22 || i != 23)) {
						System.out.println("La pelicula: " + this.getNombre()
								+ " es de ESTRENO y solo puede estar programada entre las 21hrs y 23hrs");
						return false;
					}
				}
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pelicula [getDirector()=" + getDirector() + ", isEstreno()=" + isEstreno() + ", getNombre()="
				+ getNombre() + "]";
	}

}
