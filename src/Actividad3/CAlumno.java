package Actividad3;

import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CPersona {
//	CAlumno: psNombre, psApellido1, pdNacimiento, piDni, paoAsignatura, paiNota;

	private String[] paoAsignatura = new String[3];
	private int [] paiNota = new int [3];
	public String[] getPaoAsignatura() {
		return paoAsignatura;
	}
	public void setPaoAsignatura(String[] paoAsignatura) {
		this.paoAsignatura = paoAsignatura;
	}
	public int[] getPaiNota() {
		return paiNota;
	}
	public void setPaiNota(int[] paiNota) {
		this.paiNota = paiNota;
	}
	
	
	public CAlumno(String psNombre, String psApellido1, int dia, int mes, int año, int piDni, String[] paoAsignatura,
			int[] paiNota) {
		super(psNombre, psApellido1, dia, mes, año, piDni);
		this.paoAsignatura = paoAsignatura;
		this.paiNota = paiNota;
	}
	@Override
	public String toString() {
		return "CAlumno [getPaoAsignatura()=" + Arrays.toString(getPaoAsignatura()) + ", getPaiNota()="
				+ Arrays.toString(getPaiNota()) + ", getPsNombre()=" + getPsNombre() + ", getPsApellido1()="
				+ getPsApellido1() + ", getPdNacimiento()=" + getPdNacimiento() + ", getPiDni()=" + getPiDni() + "]";
	}

	

	

}
