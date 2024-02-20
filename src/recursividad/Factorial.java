package recursividad;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Dame un número para calcular su factorial [ENTERO]");
		int numero = leer.nextInt();

		System.out.println(numero + "! = " + calculoFactorialRecursivo(numero));

	}

	static int calcularFactorial(int numero) {
		int resultado = 1;
		for (int i = numero; i >= 2; i--) { // multiplica el numero restando uno, entonces 5*4*3*2 para sacar el total
			resultado *= i; // voy multiplicando resultado de cada multiplicacion por cada posicion: 5*4 =
							// 20 entonces luego multiplico 20 por la posicion que seria 20*3 para que vaya
							// calculando y al final se guarda en la variable resultado

		}
		return resultado;

	}

	static int calculoFactorialRecursivo(int numero) {
		if (numero==0) {
			return 1;
			
		}else {
			int calculo = numero * calculoFactorialRecursivo(numero - 1);
			return calculo;
		}
		
		
			
		}
}
