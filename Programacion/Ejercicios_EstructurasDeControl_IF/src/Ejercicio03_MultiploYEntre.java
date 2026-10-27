import java.util.Scanner;

public class Ejercicio03_MultiploYEntre {

	public static void main(String[] args) {
		/*
		 * Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20,
		 * y también se comprobará si está o no entre -100 y 100. En la salida se
		 * mostrará uno de los siguientes menasajes:
		 * 
		 * 1. “Es múltiplo de 20 y está entre -100 y 100”. 2. “Es múltiplo de 20 y no
		 * está entre -100 y 100”. 3. “No es múltiplo de 20 y está entre -100 y 100”- 4.
		 * “No es múltiplo de 20 y no está entre -100 y 100”. - - Un número es múltiplo
		 * de otro cuando su resto es igual a 0
		 */

		final int MULTIPLO = 20;

		Scanner teclado = new Scanner(System.in);

		int valor = teclado.nextInt();

		boolean isEntreCienYMenos100 = valor >= -100 && valor <= 100;

		if (valor % MULTIPLO == 0 && isEntreCienYMenos100) {
			System.out.println("Es multiplo de " + MULTIPLO + " y está entre -100 y 100");
		} else if (valor % MULTIPLO == 0 && !isEntreCienYMenos100) {
			System.out.println("Es múltiplo de " + MULTIPLO + " y no está entre -100 y 100");
		} else if (valor % MULTIPLO != 0 && isEntreCienYMenos100) {
			System.out.println("No es múltiplo de " + MULTIPLO + " y está entre -100 y 100");
		} else {
			System.out.println("No es múltiplo de " + MULTIPLO + " y no está entre -100 y 100");
		}

		teclado.close();

	}

}
