import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05_Multiples_excepciones {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos números y la operación a realizar
		 * (+, -, *, /). Usa múltiples bloques catch para manejar diferentes
		 * excepciones: ArithmeticException (división por cero), NumberFormatException
		 * (entrada no numérica) e InputMismatchException (si usas Scanner). Añade un
		 * bloque finally que siempre muestre el mensaje "Fin del programa".
		 */

		Scanner teclado = new Scanner(System.in);

		int primerNumero;
		int segundoNumero;

		try {
			System.out.println("Introduce el primer número");
			primerNumero = Integer.parseInt(teclado.nextLine().trim());

			System.out.println("Introduce el segundo número");
			segundoNumero = Integer.parseInt(teclado.nextLine().trim());

			operar(teclado, primerNumero, segundoNumero);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + "No se puede dividir por cero");
		} catch (NumberFormatException e) {
			System.err.println("Error: Debes introducir números válidos ");
		} catch (InputMismatchException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error: Ha ocurrido un error generico");
		} finally {
			teclado.close();
			System.out.println("Fin del programa");
		}

	}

	static void operar(Scanner lector, int valor1, int valor2) throws InputMismatchException, ArithmeticException {
		System.out.println("Introduce la operación (+, -, *, /)");
		String operacion = lector.nextLine().trim();

		int resultado = switch (operacion) {
		case "+" -> valor1 + valor2;
		case "-" -> valor1 - valor2;
		case "*" -> valor1 * valor2;
		case "/" -> valor1 / valor2;
		default -> throw new InputMismatchException("Debes introducir una de las siguientes operaciones +, -, *, /");
		};

		System.out.printf("Resultado: %d %s %d = %d\n", valor1, operacion, valor2, resultado);
	}

}
