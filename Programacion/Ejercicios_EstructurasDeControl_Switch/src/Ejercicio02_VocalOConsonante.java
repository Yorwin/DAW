import java.util.Scanner;

public class Ejercicio02_VocalOConsonante {

	public static void main(String[] args) {
		/*
		 * Crea un programa que permita al usuario ingresar un carácter y luego
		 * determine si es una vocal o una consonante utilizando una sentencia switch.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println(
				"Indica un carácter, si ingresas más de un carácter solo será tomada en cuenta la primera letra");
		char caracter = teclado.next().toUpperCase().charAt(0);

		switch (caracter) {
		case 'A', 'E', 'I', 'O', 'U' -> {
			System.out.println("El carácter es una vocal");
		}
		default -> {
			System.out.println("El carácter es una consonante");
		}
		}

		teclado.close();
	}

}
