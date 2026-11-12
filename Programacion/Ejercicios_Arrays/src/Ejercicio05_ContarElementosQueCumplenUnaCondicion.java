
public class Ejercicio05_ContarElementosQueCumplenUnaCondicion {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que defina un array de 10 números enteros. Usa un bucle
		 * for para contar cuántos números son mayores que 50 y muestra el resultado.
		 */

		int[] numeros = new int[] { 23, 67, 45, 89, 12, 56, 78, 34, 90, 43 };

		int contador = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 50)
				contador++;
		}

		System.out.println("Cantidad de números mayores que 50: " + contador);
	}

}
