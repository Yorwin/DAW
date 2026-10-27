import java.util.Scanner;

public class Ejercicio08_OrdenarEnteros {

	public static void main(String[] args) {
		/*
		 * Leer tres enteros y mostrarlos ordenados.
		 */

		Scanner teclado = new Scanner(System.in);

		int auxiliar;

		int primerEntero = teclado.nextInt();
		int segundoEntero = teclado.nextInt();
		int tercerEntero = teclado.nextInt();

		if (segundoEntero < primerEntero) {
			auxiliar = primerEntero;
			primerEntero = segundoEntero;
			segundoEntero = auxiliar;
		}

		if (tercerEntero < segundoEntero) {
			auxiliar = segundoEntero;
			segundoEntero = tercerEntero;
			tercerEntero = auxiliar;
		}

		System.out.println(primerEntero);
		System.out.println(segundoEntero);
		System.out.println(tercerEntero);

		teclado.close();

	}

}
