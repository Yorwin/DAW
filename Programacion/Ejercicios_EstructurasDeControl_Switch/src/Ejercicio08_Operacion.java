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
		int resultado;

		switch (operacion) {
		case '+':
			resultado = primerNro + segundoNro;
			System.out.printf("La suma de %d y %d es %d", primerNro, segundoNro, resultado);
			break;
		case '-':
			resultado = primerNro - segundoNro;
			System.out.printf("La resta de %d y %d es %d", primerNro, segundoNro, resultado);
			break;
		case '*':
			resultado = primerNro * segundoNro;
			System.out.printf("La multiplicación de %d y %d es %d", primerNro, segundoNro, resultado);
			break;
		case '/':
			resultado = primerNro / segundoNro;
			System.out.printf("La división de %d y %d es %d", primerNro, segundoNro, resultado);
			break;
		default:
			System.out.println("La operación que has indicado no es válida, recuerda que tiene que ser +,-,* o /");
		}

		teclado.close();
	}

}
