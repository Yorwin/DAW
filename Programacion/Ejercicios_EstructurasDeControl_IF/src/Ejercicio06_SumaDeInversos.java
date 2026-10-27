import java.util.Scanner;

public class Ejercicio06_SumaDeInversos {

	public static void main(String[] args) {
		/*
		 * Introducir tres enteros entre -100 y 100. De cumplir los tres números la
		 * condición del rango, se obtendrá la suma de sus inversos (1/número ). En el
		 * caso de no estar alguno de los numeros en el rango se mostrará el mensaje
		 * “Alguno de los números no está entre -100 y 100”. No se sumará el inverso de
		 * aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y
		 * 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		int primerNumeroEntero = teclado.nextInt();

		System.out.println("Introduce el segundo numero");
		int segundoNumeroEntero = teclado.nextInt();

		System.out.println("Introduce el tercer numero");
		int tercerNumeroEntero = teclado.nextInt();

		if (comprobacionRango(primerNumeroEntero) && comprobacionRango(segundoNumeroEntero)
				&& comprobacionRango(tercerNumeroEntero)) {

			double resultado = 0.0;

			double inversoPrimerNumero = obtenerInverso(primerNumeroEntero);
			double inversoSegundoNumero = obtenerInverso(segundoNumeroEntero);
			double inversoTercerNumero = obtenerInverso(tercerNumeroEntero);

			if (inversoPrimerNumero != 0)
				resultado += inversoPrimerNumero;

			if (inversoSegundoNumero != 0)
				resultado += inversoSegundoNumero;

			if (inversoTercerNumero != 0) {
				resultado += inversoTercerNumero;
			}

			System.out.printf("(1/%d = %.2f) + (1/%d = %.2f) + (1/%d = %.2f) = %.5f", primerNumeroEntero,
					inversoPrimerNumero, segundoNumeroEntero, inversoSegundoNumero, tercerNumeroEntero,
					inversoTercerNumero, resultado);

		} else {
			System.out.println("Alguno de los números no está entre -100 y 100");
		}

		teclado.close();
	}

	public static boolean comprobacionRango(int numero) {
		return numero >= -100 && numero <= 100;
	}

	public static double obtenerInverso(int numero) {
		if (numero == 0) {
			return 0.0;
		}

		return (double) 1 / numero;
	}
}
