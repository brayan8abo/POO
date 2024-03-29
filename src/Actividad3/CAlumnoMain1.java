package Actividad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CAlumnoMain1 {
//	Y en la clase CAlumnoMain1 crear los alumnos, asignaturas y profesores siguientes:
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

//		Pedro, Santana,   03/12/2001, 1234, [Java, Marcas],           [0,0]
//				María, Ruiz,      04/11/2000, 2345, [Java, Entornos, Marcas], [1,1,7]
//				Esther Rodríguez, 05/10/1999, 3456, [Marcas],                 [5]
//
//				11, Java, Manuel,     8
//				22, Marcas, Carolina, 4
//				33, Entornos, Javier, 3

//		Manuel, Santana,   01/01/1980, 4567, 1000, Informática
//		Carolina, Ruiz,    02/02/1981, 5678, 2000, Informática
//		Javier, Rodríguez, 03/03/1982, 6789, 3000, CiberSeguridad

		CProfesor profesor1 = new CProfesor("Manuel", "Santana", 1980, 01, 01, 4567, 1000, "Informático");
		CProfesor profesor2 = new CProfesor("Carolina", "Ruiz", 1981, 02, 02, 5678, 2000, "Informática");
		CProfesor profesor3 = new CProfesor("Javier", "Rodriguez", 1982, 03, 03, 6789, 3000, "CiberSeguridad");

		CAsignatura java = new CAsignatura("Java", 11, profesor1, 8);
		CAsignatura marcas = new CAsignatura("Marcas", 22, profesor2, 4);
		CAsignatura entornos = new CAsignatura("Entornos", 33, profesor3, 3);

		CAsignatura[] asignaturasPedro = new CAsignatura[2];
		asignaturasPedro[0] = java;
		asignaturasPedro[1] = marcas;

		int[] notasPedro = new int[2];
		notasPedro[0] = 0;
		notasPedro[1] = 0;

		CAlumno alumno1 = new CAlumno("Pedro", "Santana", 2001, 12, 03, 1234, asignaturasPedro, notasPedro);

		CAsignatura[] asignaturasMaria = new CAsignatura[3];

		asignaturasMaria[0] = java;
		asignaturasMaria[1] = entornos;
		asignaturasMaria[2] = marcas;

		int[] notasMaria = new int[3];
		notasMaria[0] = 1;
		notasMaria[1] = 1;
		notasMaria[2] = 7;

		CAlumno alumno2 = new CAlumno("Maria", "Ruiz", 2000, 11, 04, 2345, asignaturasMaria, notasMaria);

		CAsignatura[] asignaturasEsther = new CAsignatura[1];
		asignaturasEsther[0] = marcas;

		int[] notasEsther = new int[2];
		notasEsther[0] = 5;

		CAlumno alumno3 = new CAlumno("Esther", "Rodriguez", 1999, 10, 05, 3456, asignaturasEsther, notasEsther);

		CAlumno[] alumnos = new CAlumno[3];
		alumnos[0] = alumno1;
		alumnos[1] = alumno2;
		alumnos[2] = alumno3;

		CPersona[] personas = new CPersona[6];

		personas[0] = profesor1;
		personas[1] = profesor2;
		personas[2] = profesor3;
		personas[3] = alumno1;
		personas[4] = alumno2;
		personas[5] = alumno3;

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i] + "\n");

		}
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getPsNombre().length() <= 20) {
				System.out.println("El nombre " + alumnos[i].getPsNombre() + " es menor de 20 caracteres");
			} else {
				System.out.println("El nombre " + alumnos[i].getPsNombre() + " es mayor de 20 caracteres");
			}
			if (alumnos[i].getPsApellido1().length() <= 20) {
				System.out.println("El apellido " + alumnos[i].getPsApellido1() + " es menor de 20 caracteres");

			} else {
				System.out.println("El apellido " + alumnos[i].getPsApellido1() + " es mayor de 20 caracteres");
			}
			if (alumnos[i].getPiDni() < 10000) {
				System.out.println("El DNI " + alumnos[i].getPiDni() + " es menor de 10000");

			} else {
				System.out.println("El DNI " + alumnos[i].getPiDni() + " es mayor de 10000");
			}

			ArrayList<CAsignatura> asignatura = new ArrayList<>();

			asignatura.add(java);
			asignatura.add(marcas);
			asignatura.add(entornos);

			System.out.println("-----------------------------------------");

		}

		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].toString());

		}

	}

}
