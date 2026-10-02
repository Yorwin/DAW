import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase una aplicación que lea un entero entre 0 y 100. Compruébese
		 * (mostrándose verdadero o falso) las siguientes condiciones:
		 * 
		 * a) Es par
		 * 
		 * b) Es mayor que 50
		 * 
		 * (CompararEntero)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica un nro. entero");
		int entero = teclado.nextInt();
		teclado.close();

		boolean esPar = entero % 2 == 0;
		boolean esMayor = entero > 50;

		System.out.println("Escribe un entero entre 0 y 100: " + entero);
		System.out.println("Par: " + esPar);
		System.out.println("Mayor que 50: " + esMayor);
	}

}
