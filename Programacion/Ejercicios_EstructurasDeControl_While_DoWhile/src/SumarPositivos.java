import java.util.Scanner;

public class SumarPositivos {

	public static void main(String[] args) {
		/*
		 * Leer números enteros hasta introducir un 0. El programa obtendrá la suma de
		 * todos los números positivos. (SumarPositivos)
		 */

		Scanner teclado = new Scanner(System.in);

		int valor;
		int total = 0;

		do {
			System.out.println("Indicame un nro. para sumarlo sí es positivo");
			valor = teclado.nextInt();

			if (valor > 0) {
				total += valor;
			}

		} while (valor != 0);

		System.out.println("El total de positivos sumados es " + total);

		teclado.close();
	}

}
