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

	public static boolean programar(int hora) {
		if (hora == 0 && hora <= 23) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "Documental [getTema()=" + getTema() + ", isRedifusion()=" + isRedifusion() + ", getNombre()="
				+ getNombre() + ", getDuracion()=" + getDuracion() + "]";
	}

}
