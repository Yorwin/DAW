import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11_Bonoloto {

	// TODO -> Pedir al usuario 5 números que no sean repetidos.
	// Es decir cuantos he acertado -> Coincide valor y posición.

	public static void main(String[] args) {

		// Generar números Bono Loto.
		int[] cartonBonoloto = new int[5];

		for (int i = 0; i < cartonBonoloto.length; i++) {
			int aleatorio;

			do {
				aleatorio = (int) (Math.random() * 5) + 1;
			} while (estaNumero(cartonBonoloto, aleatorio));

			cartonBonoloto[i] = aleatorio;
		}

		// Solicitar números al usuario.
		Scanner teclado = new Scanner(System.in);

		int[] numerosIntroducidos = new int[5];
		int iteraciones = 0;

		while (iteraciones < numerosIntroducidos.length) {
			try {
				int numero = teclado.nextInt();
				if (numero > 0 && numero <= 100 && !estaNumero(numerosIntroducidos, numero)) {
					numerosIntroducidos[iteraciones] = numero;
					iteraciones++;
				} else if (estaNumero(numerosIntroducidos, numero)) {
					System.err.println("El número introducido ya aparece en la lista");
				} else {
					System.err.println("El número debe estar entre 1 y 100");
				}
			} catch (InputMismatchException e) {
				System.err.println("Recuerda que tienes que introducir un número entre el 1 al 100");
				teclado.nextLine(); // limpia el buffer para poder pedir de nuevo
			} catch (Exception e) {
				e.printStackTrace();
				teclado.nextLine();
			}
		}

		teclado.close();

		// Comprobar coincidencias.
		int cantidadCoincidencias = 0;

		for (int i = 0; i < numerosIntroducidos.length; i++) {
			if (numerosIntroducidos[i] == cartonBonoloto[i]) {
				System.out.println("El número " + numerosIntroducidos[i] + " ha coincidido en la posición " + i);
				cantidadCoincidencias++;
			}
		}

		System.out.println("Al final se han logrado " + cantidadCoincidencias + " coincidencias");

		// Resultados para debugging.
		System.out.println("Carton Bonoloto " + Arrays.toString(cartonBonoloto));
		System.out.println("Números introducidos por el usuario " + Arrays.toString(numerosIntroducidos));
	}

	public static boolean estaNumero(int[] numeros, int nro) {
		for (int item : numeros) {
			if (item == nro) {
				return true;
			}
		}

		return false;
	}

}
