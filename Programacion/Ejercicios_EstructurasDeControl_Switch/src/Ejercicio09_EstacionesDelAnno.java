import java.util.Scanner;

public class Ejercicio09_EstacionesDelAnno {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y
		 * muestre la estación del año correspondiente (por ejemplo, "Primavera",
		 * "Verano", "Otoño", "Invierno") utilizando una sentencia switch.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un nro. del 1 al 12 y le devolveremos la estación correspondiente");
		int mes = teclado.nextInt();

		switch (mes) {
		case 12, 1, 2 -> System.out.println("Invierno");
		case 3, 4, 5 -> System.out.println("Primavera");
		case 6, 7, 8, 9 -> System.out.println("Verano");
		case 10, 11 -> System.out.println("Otoño");
		default -> System.out.println("El nro. que has indicado no corresponde a un mes");
		}

		teclado.close();
	}

}
