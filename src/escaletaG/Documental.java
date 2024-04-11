package escaletaG;

public class Documental extends Programa {
	private String tema;
	private boolean redifusion;

	public Documental(String nombre, int duracion, String tema, boolean redifusion) {
		super(nombre, duracion);
		this.tema = tema;
		this.redifusion = redifusion;
	}

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

	@Override
	public String toString() {
		return "Documental{" + "nombre='" + getNombre() + '\'' + ", duracion=" + getDuracion() + ", tema='" + tema
				+ '\'' + ", redifusion=" + redifusion + '}';
	}

	@Override
	public boolean programar(Programa[] escaleta, int hora) {
		if (tema.equalsIgnoreCase("violencia") && (hora < 23 || hora >= 5)) {
			return false; // No se puede programar un documental de tema violencia fuera del horario
							// permitido
		}

		if (!redifusion && hora < 10 && hora >= 18) {
			return false; // No se puede programar la primera emisión de un documental fuera del horario
							// permitido
		}

		// Verificar si hay espacio suficiente en la escaleta
		if (hora >= 0 && hora < escaleta.length && escaleta[hora] == null) {
			if (redifusion || (!redifusion && hora >= 10 && hora < 18)) {
				escaleta[hora] = this;
				return true;
			}
		}

		return false;
	}
}
