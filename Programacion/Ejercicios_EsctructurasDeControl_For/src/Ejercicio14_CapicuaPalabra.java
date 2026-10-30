import java.util.Scanner;

public class Ejercicio14_CapicuaPalabra {

	public static void main(String[] args) {
		/*
		 * Pedir una palabra por teclado y comprobar si es o no palindromo. Una palabra
		 * es palíndromo cuando se lee igual de izquierda a derecha que de derecha a
		 * izquierda. Por ejemplo ana, oro, radar. Para poder hacer la comprobación no
		 * se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica una palabra para comprobar si es palindromo");
		String palabra = teclado.next().toLowerCase();
		int letrasCoinciden = 0;

		for (int i = 0; i < palabra.length(); i++) {

			char letra = palabra.charAt(i);

			int indiceInverso = (palabra.length() - 1) - i;
			char comparacion = palabra.charAt(indiceInverso);

			if (comparacion == letra) {
				letrasCoinciden++;
			}

		}

		teclado.close();

		if (palabra.length() == letrasCoinciden) {
			System.out.println("La palabra " + palabra + " es palindromo");
		} else {
			System.out.println("Esta palabra no es palindromo");
		}
	}

}
