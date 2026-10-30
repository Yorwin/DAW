import java.util.Scanner;

public class Ejercicio16_JuegoAdivinacion {

	public static void main(String[] args) {
		/*
		 * Crear un programa que permita realizar un juego de adivinación. Para ello el
		 * sistema nada más empezar generará un número aleatorio entre 1 y 30. Tras la
		 * generación de este número el usuario contará con 10 intentos para poder
		 * adivinarlo. Para lo cual se irá pidiendo un números y en el caso de aceptarlo
		 * terminará el proceso con el mensaje "Has adivinado el número en X intentos".
		 * En el caso de agotar los intentos aparecerá el menaje "Lo siento, has agotado
		 * todos los intentos”.
		 */

		final int nroIntentos = 10;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Comienza a adivinar el nro. entre el 1 y el 30 generado");
		int nroAleteatorio = (int) (Math.random() * 30) + 1;
		System.out.println(nroAleteatorio);

		int cantidadIntentos = 0;

		System.out.println("Indica tu primer intento");
		for (int i = 0; i < nroIntentos; i++) {
			int intentosJugador = teclado.nextInt();
			cantidadIntentos++;
			
			if (intentosJugador == nroAleteatorio) {
				System.out.printf("Has adivinado el número %d en %d intentos", nroAleteatorio, cantidadIntentos);
				break;
			} else if (i == 9) {
				System.out.println("Lo siento, has agotado todos los intentos");

			} else {
				System.out.println("Te has equivocado, prueba de nuevo");
			}
		}
		
		teclado.close();
	}

}
