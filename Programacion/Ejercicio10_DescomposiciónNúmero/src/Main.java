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

		teclado.close();

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

	}

}
