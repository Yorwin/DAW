import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:
		 * 
		 * a) Son iguales
		 * 
		 * b) La primera es menor que la segunda *
		 * 
		 * c) Son distintas
		 * 
		 * (CompararCadenas)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe una palabra");
		String primeraPalabra = teclado.nextLine();

		System.out.println("Escribe una palabra");
		String segundaPalabra = teclado.nextLine();

		teclado.close();

		boolean sonIguales = primeraPalabra.equals(segundaPalabra);
		boolean primeraEsMenor = primeraPalabra.length() < segundaPalabra.length();
		boolean sonDistintas = !primeraPalabra.equals(segundaPalabra);

		System.out.println("Son iguales: " + sonIguales);
		System.out.println("La primera es menor que la segunda: " + primeraEsMenor);
		System.out.println("Son distintas " + sonDistintas);
	}

}
