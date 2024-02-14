package poo1;

public class ProfesorInformatico  extends Informatico{
	
	private String asigantura;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param identificacion
	 * @param especialidad
	 * @param asigantura
	 */
	public ProfesorInformatico(String nombre, String apellidos, int identificacion, String especialidad,
			String asigantura) {
		super(nombre, apellidos, identificacion, especialidad);
		this.asigantura = asigantura;
	}

	public String getAsigantura() {
		return asigantura;
	}

	public void setAsigantura(String asigantura) {
		this.asigantura = asigantura;
	}

	@Override
	public String toString() {
		return "ProfesorInformatico [Asigantura = " + getAsigantura() +  super.toString() + "]";
	}

	
	

}
