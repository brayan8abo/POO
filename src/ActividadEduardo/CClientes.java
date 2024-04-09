package ActividadEduardo;

public class CClientes {
	private int numeroCliente;
	private String nombreCliente;
	private int telefono;
	public CClientes(int numeroCliente, String nombreCliente, int telefono) {
		super();
		this.numeroCliente = numeroCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
	}
	public CClientes() {
		super();
	}
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "CClientes [getNumeroCliente()=" + getNumeroCliente() + ", getNombreCliente()=" + getNombreCliente()
				+ ", getTelefono()=" + getTelefono() + "]";
	}

}
