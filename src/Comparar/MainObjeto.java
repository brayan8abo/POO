package apuntes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainObjeto {

	public static void main(String[] args) {
        // Crear un ArrayList de objetos
		 // Crear una lista de objetos
        ArrayList<Objeto> objetos = new ArrayList<>();
        objetos.add(new Objeto("B", 3, LocalDate.of(2022, 3, 15), "Ciudad C"));
        objetos.add(new Objeto("A", 2, LocalDate.of(2023, 5, 20), "Ciudad A"));
        objetos.add(new Objeto("C", 1, LocalDate.of(2021, 12, 5), "Ciudad B"));


        // Ordenar por nombre
        ordenarPorNombre(objetos);
        System.out.println("Ordenado por nombre:");
        for (Objeto objeto : objetos) {
            System.out.println(objeto);
        }

        // Ordenar por número
        ordenarPorNumero(objetos);
        System.out.println("\nOrdenado por número:");
        for (Objeto objeto : objetos) {
            System.out.println(objeto);
        }
        ordenarPorFecha(objetos);
        System.out.println("\nOrdenado por fecha:");
        for (Objeto objeto : objetos) {
            System.out.println(objeto);
        }

        // Ordenar por fecha
        // Supongamos que Objeto tiene un atributo LocalDate llamado fecha
        // Aquí podrías agregar objetos con fechas y ordenarlos por fecha
        // ordenarPorFecha(objetos);
    }

    // Método para ordenar por nombre
    public static void ordenarPorNombre(ArrayList<Objeto> objetos) {
        Collections.sort(objetos, Comparator.comparing(Objeto::getNombre));
    }

    // Método para ordenar por número
    public static void ordenarPorNumero(ArrayList<Objeto> objetos) {
        Collections.sort(objetos, Comparator.comparingInt(Objeto::getNumero));
    }

    // Método para ordenar por fecha
     public static void ordenarPorFecha(ArrayList<Objeto> objetos) {
        Collections.sort(objetos, Comparator.comparing(Objeto::getFecha));
     }
     //Método para ordenar por ciudad de origen
     public static void ordenarPorCiudadDeOrigen(ArrayList<Objeto> objetos) {
         Collections.sort(objetos, Comparator.comparing(Objeto::getCiudadDeOrigen));
     }
     public static void ordenadorPorNombre2(ArrayList<Objeto> paco) {
    	 
    	 Collections.sort(paco, Comparator.comparing(Objeto::getNombre));
     }
     

}
