package Actividad3;

import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CPersona {
//	CAlumno: psNombre, psApellido1, pdNacimiento, piDni, paoAsignatura, paiNota;

	private CAsignatura[] paoAsignatura = new CAsignatura[3];
	private int[] paiNota = new int[3];

	public CAsignatura[] getPaoAsignatura() {
		return paoAsignatura;
	}

	public void setPaoAsignatura(CAsignatura[] paoAsignatura) {
		this.paoAsignatura = paoAsignatura;
	}

	public int[] getPaiNota() {
		return paiNota;
	}

	public void setPaiNota(int[] paiNota) {
		this.paiNota = paiNota;
	}

	public CAlumno(String psNombre, String psApellido1, int dia, int mes, int año, int piDni,
			CAsignatura[] paoAsignatura, int[] paiNota) {
		super(psNombre, psApellido1, dia, mes, año, piDni);
		this.paoAsignatura = paoAsignatura;
		this.paiNota = paiNota;
	}

	@Override
	public String toString() {
		StringBuilder alumnoSBuilder = new StringBuilder();
		alumnoSBuilder.append("CAlumno: [Nombre]").append(getPsNombre()).append(",[Apellido]").append(getPsApellido1())
				.append(",[Fecha Nacimiento]").append(super.getPdNacimiento()).append(",[DNI").append(getPiDni())
				.append(",[Asignturas]").append(getPaoAsignatura()).append(",[Notas]").append(getPaiNota());

		alumnoSBuilder.append(paiNota).append(Arrays.toString(getPaiNota()));

		return alumnoSBuilder.toString();
	}

//	
//	@Override
//	public String toString() {
//		return "CAlumno [getPaoAsignatura()=" + Arrays.toString(getPaoAsignatura()) + ", getPaiNota()="
//				+ Arrays.toString(getPaiNota()) + ", getPsNombre()=" + getPsNombre() + ", getPsApellido1()="
//				+ getPsApellido1() + ", getPdNacimiento()=" + getPdNacimiento() + ", getPiDni()=" + getPiDni() + "]";
//	}

}
