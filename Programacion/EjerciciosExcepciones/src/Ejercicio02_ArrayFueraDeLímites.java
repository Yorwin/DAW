import java.util.Scanner;

public class Ejercicio02_ArrayFueraDeLímites {

	public static void main(String[] args) {
		/*
		 * Crea un programa que defina un array de 5 elementos con números enteros. Pide
		 * al usuario una posición del array y muestra el elemento en esa posición. Usa
		 * try-catch para capturar la excepción ArrayIndexOutOfBoundsException si el
		 * usuario introduce un índice inválido.
		 */

		int[] listaNumeros = new int[] { 10, 20, 30, 40, 50 };

		try (Scanner teclado = new Scanner(System.in);) {
			System.out.println("Introduce la posición (0 - 4)");
			int opcionSeleccionada = teclado.nextInt();

			if (opcionSeleccionada > listaNumeros.length - 1) {
				throw new ArrayIndexOutOfBoundsException("Posición fuera de los límites del array");
			}

			System.out.printf("Elemento en posición %d: %d", opcionSeleccionada, listaNumeros[opcionSeleccionada]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error genérico");
			e.printStackTrace();
		}

	}

}
