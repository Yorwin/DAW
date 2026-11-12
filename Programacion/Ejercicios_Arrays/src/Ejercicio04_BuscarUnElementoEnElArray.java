import java.util.Scanner;

public class Ejercicio04_BuscarUnElementoEnElArray {

	public static void main(String[] args) {
		/*
		 * Crea un programa con un array de 7 números. Pide al usuario un número a
		 * buscar y usa un bucle for para recorrer el array. Si el número existe,
		 * muestra su posición. Si no existe, indica que no se encontró.
		 */

		int[] numero = new int[] { 5, 12, 8, 3, 15, 9, 6 };

		System.out.println("Introduce el número a buscar: ");
		Scanner teclado = new Scanner(System.in);
		int numeroABuscar = teclado.nextInt();

		boolean nroEncontrado = false;

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == numeroABuscar) {
				nroEncontrado = true;
				System.out.println("El número " + numeroABuscar + " se encuentra en la posición " + i);
			}

			if (i == (numero.length - 1) && !nroEncontrado) {
				System.out.println("El número " + numeroABuscar + " no se encuentra en el array");
			}
		}

		teclado.close();
	}

}
