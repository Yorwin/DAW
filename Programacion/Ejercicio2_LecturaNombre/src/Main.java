import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Programa que lee el nombre completo y la edad de una persona, y muestra los
		 * datos leídos. (leerNombreEdad)
		 * 
		 * ENTRADA/SALIDA ESCRIBE TU NOMBRE COMPLETO: Ana Garrido Alonso ESCRIBE TU
		 * EDAD: 23 Te llamas Ana Garrido Alonso Tienes 23 años Pulsa enter para
		 * continuar …
		 */

		Scanner teclado = new Scanner(System.in);

		String nombre;
		int edad;

		System.out.println("ESCRIBE TU NOMBRE COMPLETO");
		nombre = teclado.nextLine();

		System.out.println("ESCRIBE TU EDAD");
		edad = teclado.nextInt();

		teclado.close();

		System.out.println("Te llamas " + nombre);
		System.out.println("Tienes " + edad + " años");
	}

}
