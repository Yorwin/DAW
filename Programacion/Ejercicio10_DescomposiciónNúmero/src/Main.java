import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
		 * centenas, decenas y unidades), y se obtiene el número correspondiente.
		 * (Numero)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica una decena de mil");
		int decenasDeMil = teclado.nextInt();

		System.out.println("Indica una unidad de mil");
		int unidadesDeMil = teclado.nextInt();

		System.out.println("Indica una centena");
		int centenas = teclado.nextInt();

		System.out.println("Indica una decena");
		int decenas = teclado.nextInt();

		System.out.println("Indica una unidad");
		int unidades = teclado.nextInt();

		String decenasDeMilString = String.valueOf(decenasDeMil);
		String unidadesDeMilString = String.valueOf(unidadesDeMil);
		String centenasString = String.valueOf(centenas);
		String decenasString = String.valueOf(decenas);
		String unidadesString = String.valueOf(unidades);

		System.out.println("Decenas de mil: " + decenasDeMilString);
		System.out.println("Unidades de mil: " + unidadesDeMilString);
		System.out.println("Centenas: " + centenasString);
		System.out.println("Decenas: " + decenasString);
		System.out.println("Unidades: " + unidadesString);

		String nroCompleto = String.join("", decenasDeMilString, unidadesDeMilString, centenasString, decenasString,
				unidadesString);

		System.out.println("Número introducido: " + nroCompleto);

		// Obteniendo el nro. completo por parte del usuario.

		System.out.println("Indica un nro. completo con una longitud máxima de 5 nros.");
		int nroCompletoUsuario = teclado.nextInt();

		decenasDeMil = nroCompletoUsuario / 10000;
		unidadesDeMil = (nroCompletoUsuario % 10000) / 1000;
		centenas = ((nroCompletoUsuario % 10000) % 1000) / 100;
		decenas = (((nroCompletoUsuario % 10000) % 1000) % 100) / 10;
		unidades = (((nroCompletoUsuario % 10000) % 1000) % 100) % 10;

		System.out.printf(
				"El nro. se divide en: \nDecenas de Mil: %d\nUnidades De Mil: %d \nCentenas: %d \nDecenas: %d \nUnidades: %d",
				decenasDeMil, unidadesDeMil, centenas, decenas, unidades);

		teclado.close();
	}

}
