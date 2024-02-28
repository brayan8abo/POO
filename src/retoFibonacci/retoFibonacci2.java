package retoFibonacci;

import java.util.Scanner;

public class retoFibonacci2 {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println("Ingresa un límite para las iteraciones");
		int limite = leer.nextInt();
		System.out.println("El numero ingresado es " + limite + " y su suma es: ");
		
		
		for (int i = 0; i < limite; i++) {
			System.out.print(sumaFibonacci(i)+ " ");
			
		}
	}

	public static int sumaFibonacci(int numero) {
		if (numero <= 1) {
			return numero;

		} else {
			return sumaFibonacci(numero - 2) + sumaFibonacci(numero - 1);
		}

	}

}
