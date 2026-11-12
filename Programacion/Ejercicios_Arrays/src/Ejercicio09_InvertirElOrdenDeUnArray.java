
public class Ejercicio09_InvertirElOrdenDeUnArray {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que cree un array de 7 números. Usa un bucle for para
		 * crear un nuevo array con los elementos en orden inverso. Muestra ambos
		 * arrays: el original y el invertido.
		 */

		int[] numeros = new int[] { 2, 4, 6, 8, 10, 12, 14 };
		int[] numerosCopia = new int[numeros.length];

		int indice = 0;

		for (int i = numeros.length - 1; i >= 0; i--) {
			numerosCopia[indice] = numeros[i];
			indice++;
		}

		System.out.printf("Array original: ");
		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				System.out.printf("[" + numeros[i] + ",");
			} else if (i == numeros.length - 1) {
				System.out.printf(" " + numeros[i] + "]\n");
			} else {
				System.out.printf(" " + numeros[i] + ",");
			}
		}

		System.out.printf("Array invertido: ");
		for (int i = 0; i < numerosCopia.length; i++) {
			if (i == 0) {
				System.out.printf("[" + numerosCopia[i] + ",");
			} else if (i == numerosCopia.length - 1) {
				System.out.printf(" " + numerosCopia[i] + "]\n\n");
			} else {
				System.out.printf(" " + numerosCopia[i] + ",");
			}
		}
	}

}
