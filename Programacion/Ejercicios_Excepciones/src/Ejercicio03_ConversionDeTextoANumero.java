import java.util.Scanner;

public class Ejercicio03_ConversionDeTextoANumero {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario que introduzca un número como texto y lo
		 * convierta a entero usando Integer.parseInt(). Usa try-catch para capturar la
		 * excepción NumberFormatException si el usuario introduce algo que no es un
		 * número válido. El programa debe seguir pidiendo un número hasta que el
		 * usuario introduzca uno válido.
		 */

		Scanner teclado = new Scanner(System.in);

		boolean valorCorrecto = false;
		String numeroIntroducido;

		do {
			try {
				System.out.println("Introduce un número");
				numeroIntroducido = teclado.next();
				int numero = Integer.parseInt(numeroIntroducido);
				System.out.println("Has introducido el número: " + numero);
				valorCorrecto = true;
				teclado.close();
			} catch (NumberFormatException e) {
				System.err.println("Error: Eso no es un número válido. Inténtalo de nuevo.");
			} catch (Exception e) {
				System.err.println("Error: Error generico");
			}
		} while (!valorCorrecto);

	}

}
