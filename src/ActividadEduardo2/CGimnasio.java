package ActividadEduardo2;

public class CGimnasio extends InstalacionesDeportivas {
	private String nombre;
	private double precioHora;
	private double gastoLuz;

	@Override
	public String toString() {
		return "CGimnasio [getNombre()=" + getNombre() + ", getPrecioHora()=" + getPrecioHora() + ", getGastoLuz()="
				+ getGastoLuz() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	public double getGastoLuz() {
		return gastoLuz;
	}

	public void setGastoLuz(double gastoLuz) {
		this.gastoLuz = gastoLuz;
	}

	public CGimnasio(String nombre, double precioHora, double gastoLuz) {
		super(nombre, precioHora, gastoLuz);
	}

	public CGimnasio(String nombre, double precioHora, double gastoLuz, String nombre2, double precioHora2,
			double gastoLuz2) {
		super(nombre, precioHora, gastoLuz);
		nombre = nombre2;
		precioHora = precioHora2;
		gastoLuz = gastoLuz2;
	}

}
