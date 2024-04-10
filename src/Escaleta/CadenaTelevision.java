package Escaleta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import controlHerencia.Tren;

public class CadenaTelevision {
	public static void main(String[] args) {

		Programa[] escaleta = new Programa[24];
		menu();

	}

	public static void menu() {
		Scanner leer = new Scanner(System.in);
		boolean menu = true;
		do {
			System.out.println("Elige una de las siguiente opciones:\n-----------------------------------");
			System.out.println(
					"1 Dar de alta a un programa.\n---------------\n2. Programar un programa.\n----------------\n3. Visualizar escaleta.\n----------------\n4. Salir.");
			int opcion = leer.nextInt();
			leer.nextLine();

			switch (opcion) {
			case 1:
				darAlta(null);
				break;

			default:
				break;
			}
		} while (!menu);

	}

	public static void darAlta(Programa[] escaleta) {
		ArrayList<String> programasNuevos = new ArrayList<>();
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Puedes dar de alta\n(1) Película\n(2) Documental");
		int opcion = leer.nextInt();
		if (opcion == 1) {
			System.out.println("¿La película es de estreno? ---  [true / false]");
			boolean isEstreno = leer.nextBoolean();
			if (isEstreno == true) {
				leer.nextLine();
				System.out.println("Ingresa el nombre de la pelicula");
				String nombre = leer.nextLine();
				System.out.println("Ingresa el director de la película");
				String director = leer.nextLine();
				
				Pelicula programaNew1 = new Pelicula(nombre,director,isEstreno);
				programasNuevos.add(programaNew1);
				
				
				
				 for (String cadenaTelevision : programasNuevos) {
					 System.out.println(cadenaTelevision);
					
				}
			

			}

		}

	}

}
