package Actividad2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmpleadosMain {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		ArrayList<Empleado> empresa = new ArrayList<>();

		boolean isEmpleado = true;

		do {
			System.out.println("Vamos a guardar un nuevo empleado");
			System.out.println("Marca 1 para [sí] o 2 para [no]");
			int pregunta = leer.nextInt();
			leer.nextLine();

			if (pregunta == 1) {
				System.out.println("Podemos guardar: EMPLEADO NORMAL, BECARIO O JEFE, cual vas a guardar?");
				String tipo = leer.nextLine().toLowerCase();

				if (tipo.equalsIgnoreCase("empleado")) {

					System.out.println("Dame el nombre del empleado: ");
					String nombre = leer.nextLine();
					System.out.println("Dame el sueldo del empleado");
					double sueldo = leer.nextDouble();

					Empleado nuevoEmpleado = new Empleado(nombre, sueldo);
					empresa.add(nuevoEmpleado);
					for (int i = 0; i < empresa.size(); i++) {
						System.out.println(empresa.get(i));

					}

				}

				if (tipo.equalsIgnoreCase("becarios")) {
					System.out.println("Dame el nombre del becario");
					String nombre = leer.nextLine();

				}

			} else {
				System.out.println("Hasta luego");
			}

		} while (!true);

	}

}
