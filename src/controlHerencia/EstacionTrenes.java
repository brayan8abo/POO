package controlHerencia;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Comparar.Objeto;

public class EstacionTrenes {
	public static void main(String[] args) {

		ArrayList<Tren> trenes = new ArrayList<>();

		Scanner leer = new Scanner(System.in);

		boolean menu = true;
		do {
			System.out.println("\n---BIENVENIDO A LA ESTACIÓN DE TRENES\n");
			System.out.println(
					"1.Dar de alta a un tren.\n2. Imprimir los trenes.\n3. Ordenar los trenes.\n4. Visualizar los trenes ordenador por fecha.\n5. Salir");
			try {
				int opcionTrenes = leer.nextInt();

				switch (opcionTrenes) {
				case 1:
					darAltaTren(trenes);
					break;
				case 2:
					System.out.println("Los trenes que tenemos actualmente son:\n ");
					for (Tren tren : trenes) {
						System.out.println(tren + "\n");
					}
				case 3:
					System.out.println("Vamos a ordenar los trenes por origen");
					ordenarPorCiudadDeOrigen(trenes);
//					for (Tren tren : trenes) {
//						System.out.println(trenes);
//
//					}
					break;
				case 4:
					ordenarPorFecha(trenes);
//					for (Tren tren : trenes) {
//						System.out.println(trenes);
//					}
				default:
					break;
				}

				if (opcionTrenes == 5) {
					menu = false;

				}
			} catch (Exception e) {
				throw new RuntimeException(e);
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
		if (opcionElegida == 2) {

			boolean isCafeteria = false;
			int cafeteria = 0;
			System.out.println("Vamos a dar de alta a un tren de largo recorrido");
			System.out.println("Indicame el origen");
			String origen = leer.nextLine();
			System.out.println("Indicame el destino");
			String destino = leer.nextLine();
			System.out.println("Dame el año del recorrido");
			int año = leer.nextInt();
			System.out.println("Dame el mes del recorrido");
			int mes = leer.nextInt();
			System.out.println("Dame el día del recorrido");
			int dia = leer.nextInt();
			System.out.println("Ahora indicame la tarifa");
			double tarifa = leer.nextDouble();
			System.out.println("El tren tiene servicio de cafeteria? [SI--NO");
			String preguntaCafeteria = leer.nextLine();

			if (preguntaCafeteria.equalsIgnoreCase("si")) {

				isCafeteria = true;
			}
			if (preguntaCafeteria.equalsIgnoreCase("no")) {
				isCafeteria = false;

			}
			leer.nextLine();
			System.out.println("Cuantos minutos dura el viaje");
			int minutosViaje = leer.nextInt();

			Tren largoRecorrido1 = new LargoRecorrido(origen, destino, año, mes, dia, tarifa, isCafeteria,
					minutosViaje);
			trenes.add(largoRecorrido1);
			for (Tren tren : trenes) {
				System.out.println(tren);

			}

			cafeteria++;
		}

		if (opcionElegida == 3) {
			System.out.println("Vamos a dar de alta a un tren TURISTICO\n Indicame el nombre del TREN");
			String nombreTren = leer.nextLine();
			System.out.println("Indicame el Origen del recorrido");
			String origen = leer.nextLine();
			System.out.println("Indicame el destino del recorrido");
			String destino = leer.nextLine();
			System.out.println("Indicame el año del recorrido");
			int año = leer.nextInt();
			System.out.println("Indicame el mes del viaje");
			int mes = leer.nextInt();
			System.out.println("Indicame el dia del viaje");
			int dia = leer.nextInt();
			System.out.println("Indicame la tarifa");
			double tarifa = leer.nextDouble();

			Tren nuevoTrenTuristico = new Turistico(origen, destino, año, mes, dia, tarifa, nombreTren);
			trenes.add(nuevoTrenTuristico);
			for (Tren tren : trenes) {
				System.out.println(tren);
			}
		}

	}

	public static void ordenarPorFecha(ArrayList<Tren> trenes) {
		Collections.sort(trenes, Comparator.comparing(Tren::getPdFecha));
		for (Tren tren : trenes) {
			System.out.println(tren);
		}
	}

	public static void ordenarPorCiudadDeOrigen(ArrayList<Tren> trenes) {
		Collections.sort(trenes, Comparator.comparing(Tren::getPsDestino));
		for (Tren tren : trenes) {
			System.out.println(tren);
		}
	}

}
