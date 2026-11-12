
public class Ejercicio07_EncontrarElNumeroMayorYMenor {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que cree un array de 6 números. Usa bucles for para
		 * encontrar el número mayor y el número menor del array, y muestra ambos
		 * resultados.
		 */

		int[] numeros = new int[] { 15, 8, 23, 4, 19, 12 };

		int mayor = 0;
		int menor = 0;

		for (int numero : numeros) {
			if (numero > mayor)
				mayor = numero;

			if (menor == 0)
				menor = numero;

			if (menor != 0 && numero < menor) {
				menor = numero;
			}
		}

		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}

}
