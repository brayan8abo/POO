package escaletaG;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Programa> programas = new ArrayList<>();

    public static void main(String[] args) {
        // Mostrar menú hasta que se seleccione la opción de salir (4)
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            switch (opcion) {
                case 1:
                    darDeAltaPrograma();
                    break;
                case 2:
                    programarPrograma();
                    break;
                case 3:
//                    visualizarEscaleta();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Dar de alta un programa");
        System.out.println("2. Programar un programa");
        System.out.println("3. Visualizar escaleta");
        System.out.println("4. Salir");
    }

    // Método para dar de alta un programa (película o documental)
    private static void darDeAltaPrograma() {
        System.out.println("\n--- Alta de programa ---");
        System.out.print("Ingrese el nombre del programa: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la duración del programa en horas: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        // Preguntar si es película o documental
        String tipo;
        do {
            System.out.print("¿Es una película (P) o un documental (D)? ");
            tipo = scanner.nextLine();
        } while (!tipo.equalsIgnoreCase("P") && !tipo.equalsIgnoreCase("D"));

        if (tipo.equalsIgnoreCase("P")) {
            // Es una película
            System.out.print("Ingrese el nombre del director: ");
            String director = scanner.nextLine();
            System.out.print("¿Es de estreno? (true/false): ");
            boolean estreno = scanner.nextBoolean();
            Pelicula pelicula = new Pelicula(nombre, director, estreno);
            programas.add(pelicula);
            System.out.println("Película creada: " + pelicula);
        } else if (tipo.equalsIgnoreCase("D")) {
            // Es un documental
            System.out.print("Ingrese el tema del documental: ");
            String tema = scanner.nextLine();
            System.out.print("¿Es redifusión? (true/false): ");
            boolean redifusion = scanner.nextBoolean();
            Documental documental = new Documental(nombre, duracion, tema, redifusion);
            programas.add(documental);
            System.out.println("Documental creado: " + documental);
        } else {
            System.out.println("Tipo de programa no válido.");
        }
    }

    // Método para programar un programa en la escaleta
    private static void programarPrograma() {
        System.out.println("\n--- Programación de programa ---");
        if (programas.isEmpty()) {
            System.out.println("No hay programas disponibles para programar.");
            return;
        }

        System.out.print("Ingrese el índice del programa a programar (0-" + (programas.size() - 1) + "): ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        if (indice >= 0 && indice < programas.size()) {
            Programa programa = programas.get(indice);
            System.out.print("¿Desea agregar el programa \"" + programa.getNombre() + "\" a la escaleta? (true/false): ");
            boolean agregar = scanner.nextBoolean();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (agregar) {
                System.out.print("Ingrese la hora de programación (0-23): ");
                int hora = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                if (hora >= 0 && hora <= 23) {
                    programa.programar(null, hora);
                    System.out.println("Programa \"" + programa.getNombre() + "\" programado exitosamente a las " + hora + " hrs.");
                } else {
                    System.out.println("Hora de programación fuera de rango.");
                }
            }
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}

    

