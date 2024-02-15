package poo2;

import java.util.Iterator;

public class EmpleadoMain {
	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Brayan", 1800, 2000, 7, 11);
		Empleado e2 = new Empleado("Sara");
		Empleado e3 = new Empleado("Paula");
		
		
		

		Empleado[] empleados = new Empleado[3];

		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = e3;

		for (Empleado nuevoEmpleado : empleados) { //recorro y guardo en nuevoEmpleado e imprimo
			System.out.println(nuevoEmpleado);

		}

		for (int i = 0; i < empleados.length; i++) { //recorro y le subo sueldo a todos el 5%
			empleados[i].subeSueldo(5);

		}
		System.out.println("--------------------------------------");
		for (Empleado empleado2 : empleados) {
			System.out.println(empleado2);

		}

	}

}
