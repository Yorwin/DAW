import java.util.Scanner;

public class Ejercicio10_IncrementarODecrementar {

	public static void main(String[] args) {
		/*
		 * Se lee un número entero. Dicho número se incrementará en una unidad si es
		 * par, y se decrementará en una unidad si es impar. Se muestra por consola el
		 * nuevo valor del número.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un nro.");
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			numero++;
		} else {
			numero--;
		}

		System.out.println("El nuevo nro. es = " + numero);

		teclado.close();
	}

}
