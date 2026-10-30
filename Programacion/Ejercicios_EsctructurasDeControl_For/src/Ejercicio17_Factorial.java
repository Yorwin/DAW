import java.util.Scanner;

public class Ejercicio17_Factorial {

	public static void main(String[] args) {
		/*
		 * Calcular el factorial de un número entre 0 y 20. El factorial de un número se
		 * define del siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1
		 * siendo n>1. (Factorial)
		 */

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();
		int factorial = numero;
		teclado.close();

		for (int i = numero - 1; i > 0; i--) {
			if (numero == 1 || numero == 0) {
				factorial = 1;
			}

			factorial *= i;
		}

		System.out.printf("F(%d) = %d", numero, factorial);
	}

}
