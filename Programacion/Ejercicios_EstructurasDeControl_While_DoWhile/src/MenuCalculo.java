import java.util.Scanner;

public class MenuCalculo {

	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar
		 * se mostrarán las opciones disponibles
		 * 
		 * - Bienvenido a la aplicación de calculos - Introduce operando uno: -
		 * Introduce operando dos: - 1. Sumar - 1. Restar - 1. Multiplicar - 1. Dividir
		 * - 1. Módulo - 1. Salir - Selecciona la operacion que quieres realizar.
		 * 
		 * Al seleccionar una de las opciones el sistema realizará la operación
		 * correspondiente y mostrará el resultado por pantalla de la siguiente forma
		 * "El resultado de la operación es:". Una vez terminada la operación volverá a
		 * mostrar el menú y pedir dos números nuevos. (MenuCalculo)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.printf(
				"Bienvenido a la aplicación de calculos. \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Modulo \n6. Salir\n");

		boolean salir = false;
		int opcionSeleccionada;

		while (!salir) {
			System.out.println("Selecciona una opción");
			opcionSeleccionada = teclado.nextInt();

			if (opcionSeleccionada == 6) {
				break;
			}

			System.out.println("Indica el primer operando");
			int operandoUno = teclado.nextInt();

			System.out.println("Indica el segundo operando");
			int operandoDos = teclado.nextInt();

			String operacion = "";
			int resultado = 0;

			switch (opcionSeleccionada) {
			case 1 -> {
				operacion = "Suma";
				resultado = operandoUno + operandoDos;
			}
			case 2 -> {
				operacion = "Resta";
				resultado = operandoUno - operandoDos;
			}
			case 3 -> {
				operacion = "Multiplicacion";
				resultado = operandoUno * operandoUno;
			}
			case 4 -> {
				operacion = "Division";
				resultado = operandoUno / operandoDos;
			}
			case 5 -> {
				operacion = "Modulo";
				resultado = operandoUno % operandoDos;
			}
			default -> {
				System.out.println("La opción que estas indicando no esta contemplada");
			}
			}

			if (opcionSeleccionada >= 1 && opcionSeleccionada <= 5)
				System.out.println("El resultado de " + operacion + " es igual a " + resultado);
		}

		teclado.close();

	}

}
