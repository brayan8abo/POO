package retoFibonacci;

import java.util.Scanner;

public class Fibonnacci {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingresa un número que será el limite");
		int limite = leer.nextInt();
		
		System.out.println("La suma de los números con el metodo FIBONACCI, con limite de: " + "[" + limite + "]");
		
		
		for (int i = 0; i < limite; i++) {
			System.out.print(sumaFibonacci(i) + " ");
			
		}
	}

	public static int sumaFibonacci(int limite) {
		if (limite <=1) {
			return limite;
			
			
		}else {
			return sumaFibonacci(limite-1)+sumaFibonacci(limite-2);
		}
		

	}

}
