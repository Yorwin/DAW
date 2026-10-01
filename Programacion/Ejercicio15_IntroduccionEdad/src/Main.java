import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase una aplicación que permita introducir la edad de una persona (valores
		 * enteros entre 0 y 100), su nivel de estudios (valores entre 0 y 10) y sus
		 * ingresos (valores enteros entre 0 y 25000). Compruébese (mostrándose
		 * verdadero o falso) si dicha persona tiene más de 40 años, un nivel de
		 * estudios entre 5 y 8, ambos incluisives, y gana menos de 15000 €.
		 * (CondicionLogica)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzco la edad de una persona");
		int edad = teclado.nextInt();

		System.out.println("Introduzco su nivel de estudios (valores entre 0 y 10)");
		int nivelEstudios = teclado.nextInt();

		System.out.println("Introduzca sus ingresos (valores entre 0 y 25000)");
		int ingresos = teclado.nextInt();

		teclado.close();

		// Comprobaciones.

		boolean condicion = edad > 40 && (nivelEstudios >= 5 || nivelEstudios <= 8) && ingresos < 15000;
		System.out.println("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: " + condicion);

	}

}
