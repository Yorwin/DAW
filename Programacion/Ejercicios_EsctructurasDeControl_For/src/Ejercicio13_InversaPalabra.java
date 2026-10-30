import java.util.Scanner;

public class Ejercicio13_InversaPalabra {

	public static void main(String[] args) {
		/*
		 * Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se
		 * introducirá la palabra programacion y se mostrará por consola la palabra
		 * noicamargorp (InversaPalabra)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica una palabra");
		String palabra = teclado.next();

		for (int i = palabra.length(); i > 0; i--) {
			System.out.printf("%s", palabra.charAt(i - 1));
		}

		teclado.close();

	}

}
