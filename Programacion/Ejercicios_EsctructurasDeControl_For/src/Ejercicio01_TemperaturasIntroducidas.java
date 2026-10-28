import java.util.Scanner;

public class Ejercicio01_TemperaturasIntroducidas {

	public static void main(String[] args) {
		/*
		 * Se leerá el número de temperaturas a introducir (de ser 0 o negativo se
		 * establecerá a 10). Obténgase la media con dos decimales de las temperaturas
		 * introducidas por consola. (TemperaturasIntroducidas)
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Que cantidad de temperaturas quieres indicar?");
		int cantidadDeTemperaturas = teclado.nextInt();

		if (cantidadDeTemperaturas <= 0) {
			cantidadDeTemperaturas = 10;
		}

		int totalTemperaturas = 0;

		for (int i = 0; i < cantidadDeTemperaturas; i++) {
			System.out.println("Indica la temperatura - " + (i + 1));
			int temperatura = teclado.nextInt();
			totalTemperaturas += temperatura;
		}

		teclado.close();

		// Obtener media.

		double mediaAritmeticaTemperaturas = (double) totalTemperaturas / cantidadDeTemperaturas;
		System.out.println(mediaAritmeticaTemperaturas);
	}

}
