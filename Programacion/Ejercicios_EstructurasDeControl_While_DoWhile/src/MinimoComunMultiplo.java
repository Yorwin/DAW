import java.util.Scanner;

public class MinimoComunMultiplo {

	public static void main(String[] args) {
		/*
		 * Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener
		 * el mcm se tomará uno de los valores introducidos y se irá multiplicando por
		 * 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo del otro número, que
		 * sería el valor buscado. (MinimoComunMultiplo)
		 */

		Scanner teclado = new Scanner(System.in);

		// Obtener valores correctos.

		int primerValor;
		int segundoValor;

		boolean primerValorCorrecto;
		boolean segundoValorCorrecto;

		int resultadoMultiplicacion;

		// Obtener valor por teclado según el rango.

		do {
			System.out.println("Introduce el primer valor");
			primerValor = teclado.nextInt();

			System.out.println("Introduce el segundo valor");
			segundoValor = teclado.nextInt();

			primerValorCorrecto = primerValor <= 100 && primerValor > 0;
			segundoValorCorrecto = segundoValor <= 100 && segundoValor > 0;

			if (!primerValorCorrecto || !segundoValorCorrecto) {
				System.out.println(
						"Recuerda que el rango del número que ingresas tiene que estar compredido entre el 0 y el 100");
			}

		} while (!primerValorCorrecto || !segundoValorCorrecto);

		teclado.close();
		System.out.println("Números correctos ingresados");

		// Obtener el múltiplo.

		int multiplicador = 1;

		do {
			resultadoMultiplicacion = primerValor * multiplicador;
			multiplicador++;
		} while (resultadoMultiplicacion % segundoValor != 0);

		System.out.println("El minimo comun multiplo de " + primerValor + " y " + segundoValor + " es: "
				+ resultadoMultiplicacion);

	}

}
