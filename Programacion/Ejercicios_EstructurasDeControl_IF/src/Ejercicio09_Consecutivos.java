import java.util.Scanner;

public class Ejercicio09_Consecutivos {

	public static void main(String[] args) {
		/*
		 * Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en
		 * la salida
		 * 
		 * “Son consecutivos” o “No son consecutivos”.
		 */

		Scanner teclado = new Scanner(System.in);

		int primerEntero = teclado.nextInt();
		int segundoEntero = teclado.nextInt();
		int tercerEntero = teclado.nextInt();

		if (segundoEntero - primerEntero == 1 && tercerEntero - segundoEntero == 1) {
			System.out.println("Son consecutivos");
		} else {
			System.out.println("No son consecutivos");
		}

		teclado.close();
	}

}
