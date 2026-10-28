import java.util.Scanner;

public class Ejercicio06_SeleccionarOpciones {

	public static void main(String[] args) {
		/*
		 * Crea un programa que permita al usuario ingresar un número del 1 al 4 y
		 * muestre un mensaje diferente para cada número utilizando una sentencia switch
		 * (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.printf(
				"Tienes 4 opciones para seleccionar \n1.- Opción 1 \n2.- Opción 2 \n3.- Opción 3 \n4.- Opción 4 \n");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1 -> {
			System.out.println("Opción 1 seleccionada");
		}
		case 2 -> {
			System.out.println("Opción 2 seleccionada");
		}
		case 3 -> {
			System.out.println("Opción 3 seleccionada");
		}
		case 4 -> {
			System.out.println("Opción 4 seleccionada");
		}
		default -> {
			System.out.println("El nro. indica no corresponde a ninguna opción disponible");
		}
		}

		teclado.close();
	}

}
