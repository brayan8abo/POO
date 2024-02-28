package Actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosMain {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<Empleados> empleados = new ArrayList<>();
		
		setEmpleado(empleados);

	}
	static void setEmpleado(ArrayList<Empleados> empleados) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame el numero de empleados que quieres agregar");
		int numEmpleados = leer.nextInt();
		leer.nextLine();
		for (int i = 0; i < numEmpleados; i++) {
			System.out.println("Ingresa el nombre del empleado: " + empleados.get(i));
			String nombreEmpleado = leer.nextLine();
//			empleados.addAll(nombreEmpleado);
			
			
		}
		
		
	}

}
