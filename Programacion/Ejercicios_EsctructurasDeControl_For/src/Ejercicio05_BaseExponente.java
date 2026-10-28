import java.util.Scanner;

public class Ejercicio05_BaseExponente {

	public static void main(String[] args) {
		/*
		 * Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia
		 * del primero elevado al segundo sin utilizar el método “pow”. Por ejemplo,
		 * base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares: 00 = Error y
		 * n0 = 1.(BaseExponente)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica el primer entero");
		int primerEntero = teclado.nextInt();

		System.out.println("Indica el segundo entero");
		int segundoEntero = teclado.nextInt();

		if ((primerEntero >= 0 && primerEntero <= 5) && (segundoEntero >= 0 && segundoEntero <= 5)) {

			int resultado = 1;

			for (int i = 0; i < segundoEntero; i++) {
				resultado *= primerEntero;
			}

			System.out.println(resultado);

		} else {
			System.out.println("Recuerda que tanto el primer entero como el segundo deben estar entre 0 y 5");
		}

		teclado.close();

	}

}
