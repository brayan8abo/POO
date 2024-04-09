package ActividadEduardo;

public class CHotel {
	private int codigo;
	private String nombre;
	private String direccion;
	private int telefono;

	public CHotel(int codigo, String nombre, String direccion, int telefono) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public CHotel() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "CHotel [getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getDireccion()="
				+ getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}

}
