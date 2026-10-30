import java.util.Scanner;

public class Ejercicio11_CuadradoFor {

	public static void main(String[] args) {
		/*
		 * Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el
		 * tamaño del lado y se imprimirá el cuadrado con el siguiente formato
		 * (CuadradoFor)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica el tamaño del lado del Cuadro");
		int lados = teclado.nextInt();

		for (int i = 0; i < lados; i++) {
			if (i > 0)
				System.out.printf("\n");

			for (int k = 0; k < lados; k++) {
				System.out.print("+");
			}
		}

		teclado.close();
	}

}
