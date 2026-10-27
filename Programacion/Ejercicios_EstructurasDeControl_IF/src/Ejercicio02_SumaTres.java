import java.util.Scanner;

public class Ejercicio02_SumaTres {

	public static void main(String[] args) {
		/*
		 * Hágase un programa que lea tres enteros positivos, y compruebe si alguno es
		 * suma de los otros dos. En la salida se mostrará “Ninguno es suma de los otros
		 * dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y
		 * 6).
		 */

		Scanner teclado = new Scanner(System.in);

		int primerEntero = teclado.nextInt();
		int segundoEntero = teclado.nextInt();
		int tercerEntero = teclado.nextInt();

		if (primerEntero == (segundoEntero + tercerEntero)) {
			System.out.printf("%d = %d + %d", primerEntero, segundoEntero, tercerEntero);
		} else if (segundoEntero == (primerEntero + tercerEntero)) {
			System.out.printf("%d = %d + %d", segundoEntero, primerEntero, tercerEntero);
		} else if (tercerEntero == (primerEntero + segundoEntero)) {
			System.out.printf("%d = %d + %d", tercerEntero, primerEntero, segundoEntero);
		} else {
			System.out.println("Ninguno es suma de los otros dos");
		}
		
		teclado.close();
	}
}
