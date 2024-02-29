package Actividad3;

import java.util.Scanner;

import poo2.Empleado;

public class CAlumnoMain1 {
//	Y en la clase CAlumnoMain1 crear los alumnos, asignaturas y profesores siguientes:
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
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
		
		CProfesor profesor1 = new CProfesor("Manuel","Santana",01,01,1980,4567,1000,"Informático");
		CProfesor profesor2 = new CProfesor("Carolina","Ruiz",02,02,1981,5678,2000,"Informática");
		CProfesor profesor3 = new CProfesor("Manuel","Santana",01,01,1980,4567,1000,"CiberSeguridad");	
		
		
		
	}

}
