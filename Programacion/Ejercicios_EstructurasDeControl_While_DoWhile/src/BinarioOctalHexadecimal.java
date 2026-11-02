import java.util.Scanner;

public class BinarioOctalHexadecimal {

	public static void main(String[] args) {
		/*
		 * Introducir un entero no negativo, y convertirlo a binario, octal y
		 * hexadecimal. (BinarioOctalHexadecimal)
		 */

		// Obtener entero;
		Scanner teclado = new Scanner(System.in);

		int valor = teclado.nextInt();

		while (valor < 0) {
			System.out.println("No has introducido un valor correcto, el nro. debe ser positivo");
			System.out.println("Intentalo de nuevo");
			valor = teclado.nextInt();
		}

		// Obtener binario;

		int binario = 0;
		int posicionBinario = 1;
		int valorDesgloseBinario = valor;

		do {
			int resto = valorDesgloseBinario % 2;
			binario = binario + (resto * posicionBinario);
			posicionBinario = posicionBinario * 10;
			valorDesgloseBinario = valorDesgloseBinario / 2;
		} while (valorDesgloseBinario > 0);

		System.out.println(binario);

		// Obtener octal;

		int octal = 0;
		int posicionOctal = 1;
		int valorDesgloseOctal = valor;

		do {
			int resto = valorDesgloseOctal % 8;
			octal = octal + (resto * posicionOctal);
			posicionOctal = posicionOctal * 10;
			valorDesgloseOctal = valorDesgloseOctal / 8;
		} while (valorDesgloseOctal > 0);

		System.out.println(octal);

		// Obtener hexadecimal;

		String hexadecimal = "";
		int valorDesgloseHexadecimal = valor;

		do {
			int resto = valorDesgloseHexadecimal % 16;
			valorDesgloseHexadecimal = valorDesgloseHexadecimal / 16;
			String nuevoValor;

			switch (resto) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9: {
				nuevoValor = hexadecimal.concat(String.valueOf(resto));
				break;
			}
			case 10: {
				nuevoValor = hexadecimal.concat("A");
				break;
			}
			case 11: {
				nuevoValor = hexadecimal.concat("B");
				break;
			}
			case 12: {
				nuevoValor = hexadecimal.concat("C");
				break;
			}
			case 13: {
				nuevoValor = hexadecimal.concat("D");
				break;
			}
			case 14: {
				nuevoValor = hexadecimal.concat("E");
				break;
			}
			case 15: {
				nuevoValor = hexadecimal.concat("F");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + resto);
			}

			hexadecimal = nuevoValor;
		} while (valorDesgloseHexadecimal > 0);

		System.out.println(hexadecimal);

		teclado.close();
	}

}
