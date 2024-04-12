package examen;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<FondoPrestable> fondos = new ArrayList<>();

	public static void main(String[] args) {
		Main main = new Main();
		main.menu();
	}

	public void menu() {
		int opcion;

		do {
			System.out.println("Menú:");
			System.out.println("1.- Dar de alta un FondoPrestable");
			System.out.println("2.- Prestar FondoPrestable");
			System.out.println("3.- Devolver FondoPrestable");
			System.out.println("4.- Ordenar el array según la fecha de disponibilidad");
			System.out.println("O.- Salir");
			opcion = leerEntero("Seleccione una opción: ");

			switch (opcion) {
			case 1:
				System.out.println("Dar de alta un FondoPrestable:");
				altaFondo();
				break;
			case 2:
				System.out.println("Prestar FondoPrestable:");
				prestarFondo();
				break;
			case 3:
				System.out.println("Devolver FondoPrestable:");
				devolverFondo();
				break;
			case 4:
				System.out.println("Ordenar el array según la fecha de disponibilidad:");
				ordenarPorFechaDisponibilidad();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
			}
		} while (opcion != 0);
	}

	private void altaFondo() {
		String titulo, ISBN, autor;
		LocalDate fechaPublicacion;
		int numPaginas;

		System.out.print("Ingrese el título: ");
		titulo = scanner.nextLine();
		System.out.print("Ingrese el ISBN: ");
		ISBN = scanner.nextLine();
		System.out.print("Ingrese la fecha de publicación (AAAA-MM-DD): ");
		fechaPublicacion = LocalDate.parse(scanner.nextLine());

		System.out.print("¿Es un libro? (S/N): ");
		char tipo = scanner.nextLine().charAt(0);
		if (tipo == 'S' || tipo == 's') {
			System.out.print("Ingrese el autor: ");
			autor = scanner.nextLine();
			System.out.print("Ingrese el número de páginas: ");
			numPaginas = Integer.parseInt(scanner.nextLine());
			fondos.add(new Libro(titulo, ISBN, fechaPublicacion, autor, numPaginas));
		} else {
			System.out.print("Ingrese el director: ");
			autor = scanner.nextLine();
			System.out.print("Ingrese la duración en minutos: ");
			numPaginas = Integer.parseInt(scanner.nextLine());
			fondos.add(new Video(titulo, ISBN, fechaPublicacion, autor, numPaginas));
		}

		System.out.println("Fondo agregado correctamente.");
	}

	private void prestarFondo() {
		int index = seleccionarFondo();
		if (index != -1) {
			if (fondos.get(index).prestar()) {
				System.out.println("Fondo prestado correctamente.");
			} else {
				System.out.println("El fondo no está disponible para ser prestado.");
			}
		}
	}

//	private void devolverFondo() {
//		int index = seleccionarFondo();
//		if (index != -1) {
//			if (fondos.get(index).devolver()) {
//				System.out.println("Fondo devuelto correctamente.");
//			} else {
//				System.out.println("El fondo ya está disponible.");
//			}
//		}
//	}
	

	private void devolverFondo() {
		int index = seleccionarFondo();
		if(index != 1) {
			FondoPrestable fondo = fondos.get(index);
			if(!fondo.disponible) {
				if(fondo.devolver()) {
					System.out.println("Fondo devuelto");
				}else {
					System.out.println("El fondo se encuentra disponible");
				}
			} else {
				System.out.println("El fondo no está prestado");
			}
		}
	}


	private int seleccionarFondo() {
		if (fondos.isEmpty()) {
			System.out.println("No hay fondos disponibles.");
			return -1;
		}
		System.out.println("Seleccione el fondo:");
		for (int i = 0; i < fondos.size(); i++) {
			System.out.println((i + 1) + ". " + fondos.get(i).getTitulo());
		}
		int opcion = leerEntero("Seleccione un fondo: ");
		if (opcion < 1 || opcion > fondos.size()) {
			System.out.println("Opción inválida.");
			return -1;
		}
		return opcion - 1;
	}

	private int leerEntero(String mensaje) {
		int num;
		while (true) {
			try {
				System.out.print(mensaje);
				num = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Por favor, ingrese un número válido.");
			}
		}
		return num;
	}

	private void ordenarPorFechaDisponibilidad() {
		Collections.sort(fondos, new Comparator<FondoPrestable>() {
			@Override
			public int compare(FondoPrestable f1, FondoPrestable f2) {
				if (f1.disponible && f2.disponible) {
					return 0;
				} else if (f1.disponible) {
					return -1;
				} else if (f2.disponible) {
					return 1;
				} else {
					return f1.fechaDisponibilidad.compareTo(f2.fechaDisponibilidad);
				}
			}
		});

		for (FondoPrestable fondo : fondos) {
			System.out.println(fondo);
		}
	}
}

//el metodo devolverFondo() deja que uno devuelva un libro o video aun que no esté prestado. Cambiar el código para que únicamente se pueda devolver los libros o videos que estén prestados
// hay un problema con if (!fondo.isDisponible()) no reconoce el .isDisponible()
