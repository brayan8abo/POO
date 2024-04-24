package ActividadEduardo2;

public class InstalacionesDeportivas {
	private String nombre;
	private double precioHora;
	private double gastoLuz;
	private boolean externa;
	private boolean interna;

	public InstalacionesDeportivas(String nombre, double precioHora, double gastoLuz, boolean externa,
			boolean interna) {
		super();
		this.nombre = nombre;
		this.precioHora = precioHora;
		this.gastoLuz = gastoLuz;
		this.externa = externa;
		this.interna = interna;
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

	public boolean isExterna() {
		return externa;
	}

	public void setExterna(boolean externa) {
		this.externa = externa;
	}

	public boolean isInterna() {
		return interna;
	}

	public void setInterna(boolean interna) {
		this.interna = interna;
	}

	@Override
	public String toString() {
		return "InstalacionesDeportivas [getNombre()=" + getNombre() + ", getPrecioHora()=" + getPrecioHora()
				+ ", getGastoLuz()=" + getGastoLuz() + ", isExterna()=" + isExterna() + ", isInterna()=" + isInterna()
				+ "]";
	}

}
