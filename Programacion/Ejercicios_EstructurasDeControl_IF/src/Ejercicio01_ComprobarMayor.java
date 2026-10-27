import java.util.Scanner;

public class Ejercicio01_ComprobarMayor {

	public static void main(String[] args) {
		/*
		 * Hágase un programa que lea dos enteros y compruebe si el primero es o no
		 * mayor que el segundo. En la salida se mostrará “El primero es mayor que el
		 * segundo” o “El primero no es mayor que el segundo”.
		 */

		System.out.println("Este programa quiere comprobar si el primer número es o no mayor que el segundo");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer número");
		int primerNumero = teclado.nextInt();

		System.out.println("Introduce el segundo número");
		int segundoNumero = teclado.nextInt();

		if (primerNumero > segundoNumero) {
			System.out.println("El primero es mayor que el segundo");
		} else {
			System.out.println("El primero no es mayor que el segundo");
		}

		teclado.close();
	}

}
