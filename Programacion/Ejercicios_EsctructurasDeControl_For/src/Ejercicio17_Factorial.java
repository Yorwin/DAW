import java.util.Scanner;

public class Ejercicio17_Factorial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indicame un nro. cuyo factorial quieras calcular");
		int numero = teclado.nextInt();

		int factorial = 1;

		teclado.close();

		System.out.println("Calculando " + numero + "!");

		for (int i = numero; i > 0; i--) {

			if (i != 1) {
				System.out.printf("%dx", i);
			} else {
				System.out.printf("%d", i);
			}

			if (numero != 1 && numero != 0) {
				factorial *= i;
			}

		}

		System.out.printf("\nF(%d) = %d", numero, factorial);
	}
}