package controlHerencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EstacionTrenes {
	public static void main(String[] args) {

		ArrayList<Tren> trenes = new ArrayList<>();

		Scanner leer = new Scanner(System.in);

		boolean menu = true;
		do {
			System.out.println("---BIENVENIDO A LA ESTACIÓN DE TRENES\n");
			System.out.println(
					" 1.Dar de alta a un tren.\n 2. Imprimir los trenes.\n3. Ordenar los trenes.\4. Visualizar los trenes ordenador por fecha.\n5. Salir");
			int opcionTrenes = leer.nextInt();

			switch (opcionTrenes) {
			case 1:
				darAltaTren(trenes);
				break;
			case 2:
				
				System.out.println("Los trenes que tenemos actualmente son: ");
				for (Tren tren : trenes) {
					System.out.println(tren);

				}

			default:
				break;
			}

			if (opcionTrenes == 5) {
				menu = false;

			}
		} while (menu);

		System.out.println("\n---¡HASTA LUEGO!---");

	}

	public static void darAltaTren(ArrayList<Tren> trenes) {
		Scanner leer = new Scanner(System.in);
		boolean isParking;
		int contador = 0;
		System.out.println("-VAMOS A DAR DE ALTA A UN TREN-\n"
				+ " podemos crear un cercanias, un largo recorrido o un tren turistico");
		System.out.println("1. Para cercanias\n2. Para largo recorrido\n3. Para turistico");
		int opcionElegida = leer.nextInt();
		leer.nextLine();

		if (opcionElegida == 1) {

			System.out.println("Dame el origen del tren");
			String origen = leer.nextLine();
			System.out.println("Dame el destino del tren");
			String destino = leer.nextLine();
			System.out.println("Dame el año del recorrido");
			int año = leer.nextInt();
			System.out.println("Dame el mes del recorrido");
			int mes = leer.nextInt();
			System.out.println("Dame el día del recorrido");
			int dia = leer.nextInt();
			System.out.println("Dame el valor");
			double tarifa = leer.nextDouble();
			leer.nextLine();
			System.out.println("La estación tiene parkin? [SI--NO]");

			String preguntaParking = leer.nextLine();

			if (preguntaParking.equalsIgnoreCase("si")) {
				isParking = true;
			} else {
				isParking = false;
			}
			System.out.println("Cuantas paradas tiene el recorrido");
			int numParadas = leer.nextInt();

			Tren nuevoTren = new Cercanias(origen, destino, año, mes, dia, tarifa, isParking, numParadas);
			trenes.add(nuevoTren);

			for (Tren RECORRE : trenes) {
				System.out.println(RECORRE);
				
			}
			contador++;
		}

	}

	{
	}
}
