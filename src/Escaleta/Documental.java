package Escaleta;

public class Documental extends Programa {

	private String tema;
	private boolean redifusion;

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public boolean isRedifusion() {
		return redifusion;
	}

	public void setRedifusion(boolean redifusion) {
		this.redifusion = redifusion;
	}

	public Documental(String nombre, int duracion, String tema, boolean redifusion) {
		super(nombre, duracion);
		this.tema = tema;
		this.redifusion = redifusion;
	}

	public boolean programar(Programa[] escaleta, int hora) {
		int duracionDocumental = 0;
		for (int i = 0; i < escaleta.length; duracionDocumental++) {
			Programa prueba = new Programa("Prueba");

			if (this.getTema().equalsIgnoreCase("Violencia")) {
				if (hora != 0 || hora != 1 || hora != 2 || hora != 3 || hora != 4 || hora != 5) {
					System.out.println("Esto es un documental de violencia, solo se puede emitir  de 0hrs a 5hrs");
					return false;
				}
				if (escaleta[hora + duracionDocumental] == null
						&& (hora == 0 || hora == 1 || hora == 2 || hora == 3 || hora == 4 || hora == 5)) {
					escaleta[hora + duracionDocumental] = prueba;
					escaleta[hora + duracionDocumental].setNombre(this.getNombre());

					System.out.println(
							"Pelicula: " + this.getNombre() + " fue programada a: " + (hora + duracionDocumental));
					return true;

				}

			}
			if (this.isRedifusion() == true) {
				if (hora != 10 || hora != 11 || hora != 12 || hora != 13 || hora != 14 || hora != 15 || hora != 16
						|| hora != 17 || hora != 18) {

					System.out.println(
							"Estamos con un documental de primera emisión y solo puede ser trasmitido entre las 10hrs y las 18hrs");
					return false;

				}
				if (escaleta[hora + duracionDocumental] == null && (hora == 10 || hora == 11 || hora == 12 || hora == 13
						|| hora == 14 || hora == 15 || hora == 16 || hora == 17 || hora == 18)) {
					escaleta[hora] = prueba;

					escaleta[hora + duracionDocumental].setNombre(this.getNombre());

					System.out.println(
							"Pelicula: " + this.getNombre() + " fue programada a: " + (hora + duracionDocumental));
					return true;

				}

			}

		}
		return false;

	}

	@Override
	public String toString() {
		return "Documental [getTema()=" + getTema() + ", isRedifusion()=" + isRedifusion() + ", getNombre()="
				+ getNombre() + ", getDuracion()=" + getDuracion() + "]";
	}

}
