import java.util.Scanner;

public class Ejercico05_Capicua {

	public static void main(String[] args) {
		/*
		 * Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa.
		 * Se comprobará previamente que el número introducido tiene 4 dígitos. En la
		 * salida se mostrará uno de los siguientes mensajes:
		 */

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		if (String.valueOf(numero).length() == 4) {

			int nroInvertido = 0;

			// Descomposición del número.

			int ultimaCifra = numero % 10;
			nroInvertido = obtenerNroInvertido(nroInvertido, ultimaCifra);

			int nroSinUltimaCifra = numero / 10;
			int penultimaCifra = nroSinUltimaCifra % 10;
			nroInvertido = obtenerNroInvertido(nroInvertido, penultimaCifra);

			int nroSinUltimaYPenultimaCifra = nroSinUltimaCifra / 10;
			int antePenultimaCifra = nroSinUltimaYPenultimaCifra % 10;
			nroInvertido = obtenerNroInvertido(nroInvertido, antePenultimaCifra);

			int nroConUnaCifra = nroSinUltimaYPenultimaCifra / 10;
			nroInvertido = obtenerNroInvertido(nroInvertido, nroConUnaCifra);

			if (nroInvertido == numero) {
				System.out.println("Es capicúa");
			} else {
				System.out.println("No es capicúa");
			}
		} else {
			System.out.println("El número no es de 4 digitos");
		}

		teclado.close();
	}

	public static int obtenerNroInvertido(int nroInvertido, int cifra) {
		return nroInvertido = nroInvertido * 10 + cifra;
	}
}
