package Escaleta;

import java.util.Scanner;

import controlHerencia.EstacionTrenes;

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
					"Dar de alta a un programa.\n---------------\n2. Programar un programa.\n----------------\n3. Visualizar escaleta.\n----------------\n4. Salir.");
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
		Scanner leer = new Scanner(System.in);
		System.out.println("Puedes dar de alta\n(1) Película\n(2) Documental");
		int opcion = leer.nextInt();
		if (opcion == 1) {
			System.out.println("¿La película es de estreno? ---  [true / false]");
			boolean pregunta = leer.nextBoolean();
			if (pregunta == true) {
				leer.nextLine();
				System.out.println("Ingresa el nombre de la pelicula");
				String nombre = leer.nextLine();
				System.out.println("Ingresa el director de la película");
				String director = leer.nextLine();
				Programa pelicula1 = new Pelicula(nombre, director, pregunta);
				leer.close();

			}

		}

	}

}
