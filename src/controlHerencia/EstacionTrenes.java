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
					" 1.Dar de alta a un tren.\n 2. Imprimir los trenes.\n 3. Ordenar los trenes.\4. Visualizar los trenes ordenador por fecha.\n 5. Salir");
			int opcionTrenes = leer.nextInt();

			switch (opcionTrenes) {
			case 1:
				System.out.println("-VAMOS A DAR DE ALTA A UN TREN-\n"
						+ " podemos crear un cercanias, un largo recorrido o un tren turistico");
				System.out.println("1. Para cercanias\n2. Para largo recorrido\n3. Para turistico");
				int opcionElegida = leer.nextInt();
				
				leer.nextLine();
				System.out.println("Dame el origen del tren");
				String origen = leer.nextLine();

				leer.nextLine();
				System.out.println("Dame el destino del tren");
				String destino = leer.nextLine();
				

				System.out.println("Dame el año del recorrido");
				int año = leer.nextInt();
				System.out.println("Dame el mes");
				int mes = leer.nextInt();
				System.out.println("Dame el día");
				int dia = leer.nextInt();
				System.out.println("Dame el valor");
				double tarifa = leer.nextDouble();

				Tren primerTren = new Cercanias(origen, destino, año, mes, dia, tarifa);
				trenes.add(primerTren);

				for (Tren tren : trenes) {
					System.out.println(tren);

				}
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
}
