package ActividadEduardo2;

public class CPiscina extends InstalacionesDeportivas {
	private String nombre;
	private double precioHora;
	private double gastoLuz;

	public CPiscina(String nombre, double precioHora, double gastoLuz) {
		super();
		this.nombre = nombre;
		this.precioHora = precioHora;
		this.gastoLuz = gastoLuz;
	}

	public CPiscina() {
		super();
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

	@Override
	public String toString() {
		return "CPiscina [getNombre()=" + getNombre() + ", getPrecioHora()=" + getPrecioHora() + ", getGastoLuz()="
				+ getGastoLuz() + "]";
	}

}
