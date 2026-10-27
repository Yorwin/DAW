import java.util.Scanner;

public class Ejercicio04_EsBisiesto {

	public static void main(String[] args) {
		/*
		 * Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En
		 * la salida se mostrará o “Es bisiesto” o “No es bisiesto”,) El algoritmo para
		 * obtener si un año es bisiesto es el siguiente: un año es bisiesto si es
		 * múltiplo de 4.
		 */

		final int valorComprobarBisiesto = 4;

		Scanner teclado = new Scanner(System.in);

		int anno = teclado.nextInt();

		if (anno % valorComprobarBisiesto == 0) {
			System.out.println("El año " + anno + " ES bisiesto");
		} else {
			System.out.println("El año " + anno + " NO es bisiesto");
		}

		teclado.close();
	}

}
