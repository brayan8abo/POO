package Actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosMain {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<Empleados> empleados = new ArrayList<>();
		
		boolean pregunta = true;
		
		while (pregunta) {
			System.out.println("Que tipo de empleados quieres ingresar");
			String tipoEmpleado = leer.nextLine().toLowerCase();			
			if (tipoEmpleado == "empleado") {
				System.out.println("Dame el nombre del empleado");
				String nombreEmpleado = leer.nextLine();
				
				
			}
		
		}
		
		

	}

}
