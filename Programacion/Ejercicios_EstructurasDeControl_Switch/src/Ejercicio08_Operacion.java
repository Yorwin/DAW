import java.util.Scanner;

public class Ejercicio08_Operacion {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida al usuario ingresar un carácter que represente
		 * una operación matemática (+, -, *, /) y dos números. Luego, utiliza una
		 * sentencia switch para realizar la operación correspondiente y mostrar el
		 * resultado.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un carácter que representa una operación matemática. \n1- +\n2- -\n3- *\n4- /");

		char operacion = teclado.next().charAt(0);

		System.out.println("Indicanos dos nros. que usar en la operación");
		int primerNro = teclado.nextInt();
		int segundoNro = teclado.nextInt();
		int resultado = 0;
		String tipoDeOperacion = "";

		switch (operacion) {
		case '+':
			resultado = primerNro + segundoNro;
			tipoDeOperacion = "suma";
			break;
		case '-':
			resultado = primerNro - segundoNro;
			tipoDeOperacion = "resta";
			break;
		case '*':
			resultado = primerNro * segundoNro;
			tipoDeOperacion = "multiplicacion";
			break;
		case '/':
			if (primerNro == 0 || segundoNro == 0)
				resultado = 0;

			resultado = primerNro / segundoNro;
			tipoDeOperacion = "division";
			break;
		default:
			System.out.println("La operación que has indicado no es válida, recuerda que tiene que ser +,-,* o /");
		}

		if (tipoDeOperacion.length() > 0) {
			System.out.printf("La %s de %d y %d es %d", tipoDeOperacion, primerNro, segundoNro, resultado);
		}

		teclado.close();
	}

}
