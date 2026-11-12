import java.util.Scanner;

public class Ejercicio03_RellenarArrayConInputDelUsuario {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for
		 * para pedir al usuario que introduzca 5 nombres, guardándolos en el array. Al
		 * final, muestra todos los nombres almacenados.
		 */

		String[] nombres = new String[5];

		Scanner teclado = new Scanner(System.in);
		String nombreIntroducido;

		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("Introduce el nombre %d:", i + 1);
			nombreIntroducido = teclado.next();
			nombres[i] = nombreIntroducido;
		}

		teclado.close();

		System.out.println("\nNombres introducidos:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
