package Escaleta;

public class Programa {

	private String nombre;
	private int duracion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Programa(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public Programa(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static boolean programar(int hora) {
		if (hora == 0 && hora <=23) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "Programa [getNombre()=" + getNombre() + ", getDuracion()=" + getDuracion() + "]";
	}

}
