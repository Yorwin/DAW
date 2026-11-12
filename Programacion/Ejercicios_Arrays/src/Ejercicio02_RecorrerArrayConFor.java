
public class Ejercicio02_RecorrerArrayConFor {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que cree un array de 6 números enteros. Usa un bucle for
		 * para recorrer el array y mostrar cada número junto con su posición (índice).
		 */

		int[] numeros = new int[] { 10, 20, 30, 40, 50, 60 };

		System.out.println("Recorriendo el array: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + i + ": " + numeros[i]);
		}
	}

}
