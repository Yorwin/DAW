import java.util.Scanner;

public class Ejercicio15_ContadorOraciones {

	public static void main(String[] args) {
		/*
		 * Pedir por consola una frase. Una vez introducida. Indicar:
		 * 
		 * 1. Cuantas oraciones tiene 2. Cuantas letras tiene 3. Cuantas palabras tiene
		 * 4. Cuantas letras tiene (sin contar espacios ni símbolos de puntuación) cada
		 * oracion
		 */

		Scanner teclado = new Scanner(System.in);

		String frase = teclado.nextLine();

		int cantidadOraciones = 0;
		int cantidadLetras = frase.length();
		int cantidadSoloLetras = 0;
		int cantidadPalabras = 0;

		for (int i = 0; i < frase.length(); i++) {

			char caracter = frase.charAt(i);

			boolean esSignoDePuntuacion = caracter == '.' || caracter == ',' || caracter == '?' || caracter == '!';

			if (esSignoDePuntuacion) {
				cantidadOraciones++;
			}

			if (caracter != ' ' && !esSignoDePuntuacion) {
				cantidadSoloLetras++;
			}

			if (caracter == ' ') {
				cantidadPalabras++;
			}

		}

		System.out.printf(
				"Cantidad de caracteres: %d\nCantidad de letras: %d\nCantidad de palabras: %d\nCantidad de oraciones: %d",
				cantidadOraciones, cantidadLetras, cantidadSoloLetras, cantidadPalabras);

		teclado.close();
	}

}
