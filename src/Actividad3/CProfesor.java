package Actividad3;

import java.util.Date;

public class CProfesor extends CPersona {

	

//	CProfesor: psNombre, psApellido1, pdNacimiento, piDni, piSueldo, psTitulo;
//	De Tipo: y h i l f u b c s o : byte, short, int, long, float, double, boolean, char, string, object
//	De Grupo: a l : array, array-list
//	De ámbito: p w i o x : propiedad, de-trabajo, argumentos de entrada, salida, entrada-salida

	private int piSueldo;
	private String psTitulo;

	public int getPiSueldo() {
		return piSueldo;
	}

	public void setPiSueldo(int piSueldo) {
		this.piSueldo = piSueldo;
	}

	public String getPsTitulo() {
		return psTitulo;
	}

	public void setPsTitulo(String psTitulo) {
		this.psTitulo = psTitulo;
	}
	

	public CProfesor(String psNombre, String psApellido1, int dia, int mes, int año, int piDni, int piSueldo,
			String psTitulo) {
		super(psNombre, psApellido1, dia, mes, año, piDni);
		this.piSueldo = piSueldo;
		this.psTitulo = psTitulo;
	}

	@Override
	public String toString() {
		return "CProfesor [Sueldo()=" + getPiSueldo() + ", Titulo()=" + getPsTitulo() + ", Nombre()="
				+ getPsNombre() + ", Apellido1()=" + getPsApellido1() + ",Nacimiento()=" + getPdNacimiento()
				+ ", Dni()=" + getPiDni() + "]";
	}

}
