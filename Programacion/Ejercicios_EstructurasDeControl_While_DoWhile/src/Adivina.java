import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		/*
		 * Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y
		 * lo guarde en una variable. El sistema irá pidiendo números al usuario hasta
		 * que coincida con el aleatorio generado (en caso de no coincidir mostrará el
		 * mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema deberá
		 * mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos"
		 * (Adivina)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Adivina el nro. aleatorio. Indica un nro. entre 0 y 20");

		int aleatorio = (int) (Math.random() * 20) + 1;
		int adivinanza;
		int intentos = 0;

		do {
			adivinanza = teclado.nextInt();

			if (adivinanza < 0 || adivinanza > 20) {
				System.out.println("No estás en el rango correcto, recuerda que el nro. debe estar entre el 0 y el 20");
			} else if (adivinanza != aleatorio) {
				System.out.println("El nro. correcto no es " + adivinanza + " Intentalo de nuevo");
			}

			intentos++;
		} while (adivinanza != aleatorio);

		System.out.println("Has adivinado el nro. " + aleatorio + " Felicidades");
		System.out.println("Solo te ha tomado " + intentos + " intentos");

		teclado.close();

	}

}
