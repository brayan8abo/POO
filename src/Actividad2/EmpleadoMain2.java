package Actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoMain2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		boolean menu = true;

		ArrayList<Empleado> empresa = new ArrayList<>();

		do {
			System.out.println("Vamos a guardar los empleados\n 1. Empleado normal. \n 2. Becario. \n 3. Jefe");
			int tipoEmpleado = leer.nextInt();
			leer.nextLine();

			switch (tipoEmpleado) {
			case 1:
				System.out.println("***Estamos creando un empleado normal***");
				System.out.println("--Ingresa el nombre del empleado--");
				String nombre = leer.nextLine();
				System.out.println("--Ingresa el sueldo del empleado--");
				double sueldo = leer.nextDouble();
				Empleado nuevoEmpleado = new Empleado(nombre, sueldo);
				empresa.add(nuevoEmpleado);

				leer.nextLine();
				break;
			case 2:
				System.out.println("--Estamos creando un empleado becario--");
				System.out.println("***Ingresa el nombre del becario***");
				nombre = leer.nextLine();
				System.out.println("--Ingresa el sueldo del becario--");
				sueldo = leer.nextDouble();
				System.out.println("--Ingresa el año del contrato--");
				int añoContrato = leer.nextInt();
				System.out.println("--Ingresa el mes del contrato--");
				int mesContrato = leer.nextInt();
				System.out.println("--Ingresa el día del contrato--");
				int diaContrato = leer.nextInt();
				Becario becarioNuevo = new Becario(nombre, sueldo, añoContrato, mesContrato, diaContrato);
				empresa.add(becarioNuevo);

				leer.nextLine();
				break;
			case 3:
				System.out.println("---Estamos creando un jefe");
				System.out.println("***Ingresa el nombre del jefe***");
				nombre = leer.nextLine();
				System.out.println("--Ingresa el sueldo del jefe--");
				sueldo = leer.nextDouble();
				Jefe jefeNuevo = new Jefe(nombre, sueldo);
				empresa.add(jefeNuevo);

				leer.nextLine();
				break;

			default:
				System.out.println("La opción ingresa no es válida");
				break;
			}
			System.out.println("\n¿Deseas agregar más personas?");
			String pregunta = leer.nextLine();
			if (pregunta.equalsIgnoreCase("no")) {
				menu = false;

			}

		} while (menu);

		double sumaJefes = 0;
		double sumaEmpleados = 0;
		double sumaBecarios = 0;
		for (int i = 0; i < empresa.size(); i++) {

			if (empresa.get(i).toString().charAt(0) == 'J') {
				sumaJefes += empresa.get(i).getSueldo();

			}
			if (empresa.get(i).toString().charAt(0) == 'B') {
				sumaBecarios += empresa.get(i).getSueldo();

			}
			if (empresa.get(i).toString().charAt(0) == 'E') {
				sumaEmpleados += empresa.get(i).getSueldo();

			}

		}
		System.out.println("La suma de los sueldos de todos los [JEFES] es: \n " + sumaJefes + "\n");
		System.out.println("La suma de los sueldos de todos los [EMPLEADOS] es: \n " + sumaEmpleados + "\n");
		System.out.println("La suma de los sueldos de todos los [BECARIOS] es: \n " + sumaBecarios + "\n");

		for (int i = 0; i < empresa.size(); i++) {
			if (empresa.get(i) instanceof Jefe) {
				System.out.println(empresa.get(i));

			} else if (empresa.get(i) instanceof Empleado) {
				System.out.println(empresa.get(i));
			} else if (empresa.get(i) instanceof Becario) {
				System.out.println(empresa.get(i));
			}

		}

	}

}
