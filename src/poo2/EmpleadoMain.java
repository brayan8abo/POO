package poo2;

import java.util.Arrays;

public class EmpleadoMain {
	public static void main(String[] args) {

		Empleado e1 = new Empleado("Brayan", 1800, 2000, 7, 11);
		Empleado e2 = new Empleado("Sara"); // usa el constructor predefinido con valores en clase empleado
		Empleado e3 = new Empleado("Paula");
		Jefatura j1 = new Jefatura("Jefe", 3000, 2001, 7, 11);

		Empleado[] empleados = new Empleado[4];

		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = e3;
		empleados[3] = j1;

		j1.setIncentivo(1000); // de esta forma uso directamente las cosas de la clase jefatura, ya que en el
								// array empleados solo puedo usar cosas y metodos de la clase empleados

		Jefatura jefe = (Jefatura) empleados[3];
		jefe.setIncentivo(2000);

		Empleado emp = empleados[3];

		if (j1 instanceof Jefatura) {
			System.out.println("Jefatura: " + j1);

		} else if (e1 instanceof Empleado) {
			System.out.println("Empleado: " + j1);
		}

		for (Empleado nuevoEmpleado : empleados) {
			if (nuevoEmpleado instanceof Empleado) {
				System.out.println("Empleado: " + nuevoEmpleado);

			} else if (nuevoEmpleado instanceof Jefatura) {
				System.out.println("Jefatura: " + nuevoEmpleado);
			}
//			// recorro y guardo en nuevoEmpleado e imprimo
//			System.out.println(nuevoEmpleado);

		}

		for (int i = 0; i < empleados.length; i++) { // recorro y le subo sueldo a todos el 5%
			empleados[i].subeSueldo(5);

		}
		System.out.println("--------------------------------------");
		for (Empleado trabajadores : empleados) {
			System.out.println(trabajadores);

		}
		System.out.println("--------------------------------------");

		Arrays.sort(empleados);

		for (Empleado ordenados : empleados) {
			System.out.println(ordenados);

		}
		System.out
				.println(j1.getNombre() + " toma la decisión de: " + j1.tomarDecisiones("dar más días de vacaciones"));

		System.out.println("El jefe: " + j1.getNombre() + " tiene un bonus de: " + j1.establecerBonus(500));
		System.out.println(empleados[3].getNombre() + " tiene un bonus de: " + empleados[3].establecerBonus(1000)); // me obliga a usar el orden del sort anteriormente dado.

		for (Empleado empleado : empleados) {
			System.out.println(empleado.getNombre() + " tiene un bonus de " + empleado.establecerBonus(1000));
		}
	}

}
