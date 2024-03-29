package Actividad3;

import java.util.Date;
import java.util.GregorianCalendar;

public class CPersona<Persona> implements Comparable {
//	psNombre, psApellido1, pdNacimiento, piDni,
//	De Tipo: y h i l f u b c s o : byte, short, int, long, float, double, boolean, char, string, object
//	De Grupo: a l : array, array-list
//	De ámbito: p w i o x : propiedad, de-trabajo, argumentos de entrada, salida, entrada-salida
	private String psNombre;
	private String psApellido1;
	private Date pdNacimiento;
	private int piDni;

	public String getPsNombre() {
		return psNombre;
	}

	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}

	public String getPsApellido1() {
		return psApellido1;
	}

	public void setPsApellido1(String psApellido1) {
		this.psApellido1 = psApellido1;
	}

	public Date getPdNacimiento() {
		return pdNacimiento;
	}

	public void setPdNacimiento(Date pdNacimiento) {
		this.pdNacimiento = pdNacimiento;
	}

	public int getPiDni() {
		return piDni;
	}

	public void setPiDni(int piDni) {
		this.piDni = piDni;
	}

	public CPersona(String psNombre, String psApellido1, int año, int mes, int dia, int piDni) {
		super();
		this.psNombre = psNombre;
		this.psApellido1 = psApellido1;
		GregorianCalendar calendario = new GregorianCalendar(año, mes, dia); // importacion calendario gregoriano
		this.pdNacimiento = calendario.getTime();
		this.piDni = piDni;
	}

	@Override
	public String toString() {
		return "[Nombre]: " + getPsNombre() + " [Apellido]: " + getPsApellido1() + " [Nacimiento]: " + getPdNacimiento()
				+ " [Dni]: " + getPiDni();
	}

	@Override
	public int compareTo(Object o) {
		CPersona grupoPersonas = (CPersona) o;
		if (this.pdNacimiento.after(grupoPersonas.pdNacimiento)) {
			return 1;

		}
		if (this.pdNacimiento.before(grupoPersonas.pdNacimiento)) {
			return -1;

		}
		return 1;
	}

}
