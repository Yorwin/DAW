import java.util.Scanner;

public class Ejercicio09_Sueldos {

	public static void main(String[] args) {
		/*
		 * Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.
		 * (Sueldos)
		 */

		final int cantidadSueldos = 10;

		Scanner teclado = new Scanner(System.in);

		int sumatoriaSueldos = 0;
		int mayorDe1000 = 0;

		for (int i = 0; i < cantidadSueldos; i++) {
			System.out.println("Introduce un sueldo");
			int sueldo = teclado.nextInt();
			sumatoriaSueldos += sueldo;

			if (sueldo > 1000) {
				mayorDe1000++;
			}
		}

		teclado.close();

		int media = sumatoriaSueldos / cantidadSueldos;

		System.out.println("La información de los sueldos es: ");
		System.out.println("Los sueldos suman: " + sumatoriaSueldos + "€");
		System.out.println("La media de todos los sueldos es: " + media + "€");
		System.out.println("Existen " + mayorDe1000 + " sueldos superiores a 1000€");
	}

}
