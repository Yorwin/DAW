import java.util.Scanner;

public class Ejercicio04_TablasEnRango {

	public static void main(String[] args) {
		/*
		 * Modificar el ejercicio anterior para calcular la tabla de multiplicar de los
		 * números comprendidos en un rango de números pedidos. Por ejemplo, las tablas
		 * de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)
		 */

		Scanner teclado = new Scanner(System.in);

		int maximoMultiplicador = 10;

		System.out.println("Indica desde que tabla quieres empezar");
		int principioRango = teclado.nextInt();

		System.out.println("En que tabla quieres terminar");
		int finalRango = teclado.nextInt();

		if (principioRango < finalRango) {
			for (int i = principioRango; i <= finalRango; i++) {

				System.out.println("Tabla del " + i);

				// Configuración multiplicadores.
				for (int k = 0; k <= maximoMultiplicador; k++) {
					int operacion = i * k;
					System.out.printf("%d x %d = %d\n", i, k, operacion);
				}

				System.out.printf("Fin de la tabla \n\n");
			}
		} else {
			System.out.println("El rango que has introducido no es valido");
		}

		teclado.close();
	}

}
