import java.util.Scanner;

public class AdivinaRecord {

	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio anterior para que una vez adivinado el número el
		 * sistema muestre el siguiente mensaje: "Quieres volver a jugar (S/N)":
		 * 
		 * - En caso de introducir N la aplicación se detendrá - En caso de introducir S
		 * la aplicación empezará de nuevo (generando un aleatorio, pidiendo números
		 * hasta acertar el generado, etc...) Cuando el usuario acierte el número
		 * generado se mostrará un mensaje diciendo si ha superado el record de intentos
		 * (si ha hecho menos intentos que las veces anteriores) (AdivinaRecord)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Adivina el nro. aleatorio. Indica un nro. entre 0 y 20");

		boolean jugar = true;
		char opcion;

		int aleatorio;
		int adivinanza;
		int recordIntentos = 0;
		int ronda = 1;

		while (jugar) {

			aleatorio = (int) (Math.random() * 20) + 1;
			int intentosTurno = 0;

			do {
				adivinanza = teclado.nextInt();
				System.out.println(aleatorio);

				if (adivinanza < 0 || adivinanza > 20) {
					System.out.println(
							"No estás en el rango correcto, recuerda que el nro. debe estar entre el 0 y el 20");
				} else if (adivinanza != aleatorio) {
					System.out.println("El nro. correcto no es " + adivinanza + " Intentalo de nuevo");
				}

				intentosTurno++;
			} while (adivinanza != aleatorio);

			System.out.println("Has adivinado el nro. " + aleatorio + " Felicidades");
			System.out.println("Solo te ha tomado " + intentosTurno + " intentos");

			if (ronda == 1) {
				recordIntentos = intentosTurno;
			} else if (ronda > 1 && intentosTurno < recordIntentos) {
				System.out.println("Enhorabuena, has superado el record de intentos, tu record antes era "
						+ recordIntentos + " y ahora es " + intentosTurno);
				recordIntentos = intentosTurno;
			}

			ronda++;

			System.out.println("Quieres volver a jugar (S/N)");
			opcion = teclado.next().toUpperCase().charAt(0);

			switch (opcion) {
			case 'S' -> System.out.println("Siguiente ronda...");
			case 'N' -> jugar = !jugar;
			}
		}

		teclado.close();

	}
}
