import java.util.Scanner;

public class Ejercicio07_numeroArmstrong {

	public static void main(String[] args) {
		/*
		 * Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos
		 * elevado a 3 coincide con dicho número. Por ejemplo, 153 = 1+125+27. Dado un
		 * número de 3 cifras determinar si es o no un número Armstrong. Se comprobará
		 * previamente que el número introducido tiene 3 dígitos. En la salida se
		 * mostrará uno de los siguientes mensajes:
		 * 
		 * 1. “El número no tiene 3 dígitos” 2. “Es un número Armstrong” 3. “No es un
		 * número Armstrong”.
		 */

		final int maximoNumeroCifras = 3;

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();

		if (String.valueOf(numero).length() == 3) {

			/*
			 * Podría hacerlo de este modo si quiere utilizar más tarde el resultado
			 * intermedio de cada división: int ultimoDigito = numero % 10; int
			 * nroDosDigitos = numero / 10; int penultimoDigito = nroDosDigitos % 10; int
			 * primerDigito = nroDosDigitos / 10;
			 */

			// Forma más corta.
			int centenas = numero / 100;
			int decenas = (numero / 10) % 10;
			int unidades = numero % 10;

			int primerNumeroElevado = (int) Math.pow(centenas, maximoNumeroCifras);
			int segundoNumeroElevado = (int) Math.pow(decenas, maximoNumeroCifras);
			int tercerNumeroElevado = (int) Math.pow(unidades, maximoNumeroCifras);

			if (numero == (primerNumeroElevado + segundoNumeroElevado + tercerNumeroElevado)) {
				System.out.println("Es un número Armstrong");
			} else {
				System.out.println("No es un número Armstrong");
			}

		} else {
			System.out.println("El número no tiene 3 dígitos");
		}

		teclado.close();
	}

}
