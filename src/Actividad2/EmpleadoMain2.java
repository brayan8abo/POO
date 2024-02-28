package Actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoMain2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		String agregar = "no";

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
				break;
			case 3:
				System.out.println("---Estamos creando un jefe");
				System.out.println("***Ingresa el nombre del jefe***");
				nombre = leer.nextLine();
				System.out.println("--Ingresa el sueldo del jefe--");
				sueldo = leer.nextDouble();
				Jefe jefeNuevo = new Jefe(nombre, sueldo);
				empresa.add(jefeNuevo);
			default:
				break;
			}

		} while (agregar == "no");

	}

}
