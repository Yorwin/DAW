import java.util.Scanner;

public class Ejercicio07_Calificacion {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y
		 * muestre un mensaje de calificación utilizando una sentencia switch (por
		 * ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).
		 */

		System.out.println("Indica la nota de tu último exámen, recuerda que las califaciones van del 1 al 5");
		Scanner teclado = new Scanner(System.in);

		int nota = teclado.nextInt();

		switch (nota) {
		case 1 -> {
			System.out.println("Suspenso");
		}
		case 2 -> {
			System.out.println("Aprobado");
		}
		case 3 -> {
			System.out.println("Notable");
		}
		case 4 -> {
			System.out.println("Sobresaliente");
		}
		case 5 -> {
			System.out.println("Excelente");
		}
		default -> {
			System.out.println("El nro. que has indicado no es una nota valida");
		}
		}

		teclado.close();
	}

}
