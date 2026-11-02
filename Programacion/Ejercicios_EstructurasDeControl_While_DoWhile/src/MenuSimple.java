import java.util.Scanner;

public class MenuSimple {

	public static void main(String[] args) {
		/*
		 * Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente
		 * formato
		 * 
		 * - Bienvenido a la aplicación del menú - 1. Opción1 - 1. Opción2 - 1. Opción3
		 * - 1. Opción4 - 1. Salir - Introduce la opción seleccionada
		 * 
		 * Una vez mostrado la última línea, el sistema esperará a que el usuario
		 * introduzca un dato. Dependiendo de la opción seleccionada aparecerá un
		 * mensaje por pantalla que ponga "La opción seleccionada es X". En el caso de
		 * meter una diferente pondrá "opción no contemplada". El programa se repetiría
		 * hasta que introduzca el 5 (MenuSimple)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.printf(
				"Bienvenido a la aplicación del menú. \n1. Opción 1 \n2. Opción 2 \n3. Opción 3 \n4. Opción 4 \n5. Salir\n");

		boolean salir = false;
		int opcionSeleccionada;

		while (!salir) {
			System.out.println("Selecciona una opción");
			opcionSeleccionada = teclado.nextInt();

			if (opcionSeleccionada <= 4 && opcionSeleccionada > 0) {
				System.out.println("La opción seleccionada es " + opcionSeleccionada);
			} else if (opcionSeleccionada == 5) {
				salir = !salir;
				System.out.println("Terminamos aplicación");
			} else {
				System.out.println("La opción que estas indicando no esta contemplada");
			}
		}

		teclado.close();
	}

}
