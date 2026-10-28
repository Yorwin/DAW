import java.util.Scanner;

public class Ejercicio02_TablaDeMultiplicar {

	public static void main(String[] args) {
		/*
		 * Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho
		 * número con el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas).
		 * (TablaDeMultiplicar)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica un nro. para obtener su tabla de multiplicar");
		int numero = teclado.nextInt();

		if (numero > 0 && numero < 10) {
			for (int i = 0; i <= 10; i++) {
				int operacion = numero * i;
				System.out.printf("%d x %d = %d \n", numero, i, operacion);
			}
		} else {
			System.out.println("El nro. indicado tiene que entras entre el 1 y el 10");
		}

		teclado.close();
	}

}
