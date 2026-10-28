import java.util.Scanner;

public class Ejercicio03_ParOImpar {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que reciba un número entero y, utilizando una
		 * sentencia switch, determine si es par o impar.
		 */

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();
		int comprobarPar = numero % 2;

		switch (comprobarPar) {
		case 0:
			System.out.println("El número " + numero + " es par");
			break;
		default:
			System.out.println("El número " + numero + " es impar");
			break;
		}

		teclado.close();
	}
}
