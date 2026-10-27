import java.util.Scanner;

public class Ejercicio11_AscendenteODescendente {

	public static void main(String[] args) {
		/*
		 * Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o
		 * descendentemente. Se mostrarán los valores leídos ordenados.
		 */

		Scanner teclado = new Scanner(System.in);

		int auxiliar;
		int primerEntero = teclado.nextInt();
		int segundoEntero = teclado.nextInt();
		int tercerEntero = teclado.nextInt();
		boolean asc = teclado.nextBoolean();

		if (asc) {

			// Primera comparación
			if (primerEntero > segundoEntero) {
				auxiliar = primerEntero;
				primerEntero = segundoEntero;
				segundoEntero = auxiliar;
			}

			// Segunda comparación
			if (segundoEntero > tercerEntero) {
				auxiliar = segundoEntero;
				segundoEntero = tercerEntero;
				tercerEntero = auxiliar;
			}

			// Tercera comparación
			if (primerEntero > segundoEntero) {
				auxiliar = primerEntero;
				primerEntero = segundoEntero;
				segundoEntero = auxiliar;
			}

		} else {

			// Primera comparación
			if (primerEntero < segundoEntero) {
				auxiliar = primerEntero;
				primerEntero = segundoEntero;
				segundoEntero = auxiliar;
			}

			// Segunda comparación
			if (segundoEntero < tercerEntero) {
				auxiliar = segundoEntero;
				segundoEntero = tercerEntero;
				tercerEntero = auxiliar;
			}

			// Tercera comparación
			if (primerEntero < segundoEntero) {
				auxiliar = primerEntero;
				primerEntero = segundoEntero;
				segundoEntero = auxiliar;
			}
		}

		System.out.println(primerEntero);
		System.out.println(segundoEntero);
		System.out.println(tercerEntero);

		teclado.close();
	}

}
