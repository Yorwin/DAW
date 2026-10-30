import java.util.Scanner;

public class Ejercicio12_CuadradoFormato {

	public static void main(String[] args) {
		/*
		 * Modificar el ejercicio anterior para dibujar un cuadrado donde las aristas
		 * exteriores tengan el caracter - y la parte inferior del cuadrado tenga el
		 * caracter +. (CuadradoFormato)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica el tamaño del lado del Cuadro");
		int lados = teclado.nextInt();

		for (int i = 0; i < lados; i++) {
			if (i > 0)
				System.out.printf("\n");

			for (int k = 0; k < lados; k++) {

				if (i == 0) {
					System.out.print("-");
				} else if (i > 0 && i != (lados - 1)) {
					if (k == 0 || k == (lados - 1))
						System.out.print("-");
					else
						System.out.print(" ");
				} else {
					System.out.print("+");
				}
			}
		}

		teclado.close();
	}

}
