import java.util.Scanner;

public class Ejercicio01_DivisionPorCero {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos números y realice la división del
		 * primero entre el segundo. Usa try-catch para capturar la excepción
		 * ArithmeticException que ocurre cuando se intenta dividir por cero. Muestra un
		 * mensaje apropiado si ocurre el error.
		 */

		try (Scanner teclado = new Scanner(System.in);) {
			System.out.println("Introduce el primer número");
			int primerNumero = teclado.nextInt();

			System.out.println("Introduce el segundo número");
			int segundoNumero = teclado.nextInt();

			int resultado = primerNumero / segundoNumero;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.err.println("Error: No se puede dividir por cero");
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error inesperado");
		}

	}

}
