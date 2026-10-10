
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Jugador con los atributos nombre (String), nivel (int) y
		 * puntuacion (int). Define tres constructores:
		 * 
		 * - Uno que reciba solo el nombre y asigne nivel 1 y puntuación 0. - Otro que
		 * reciba nombre y nivel, y asigne puntuación 0. - Otro que reciba los tres
		 * datos.
		 * 
		 * Desde main, crea un jugador con cada constructor y muestra sus atributos.
		 * Después, suma 50 puntos al primer jugador accediendo a su atributo desde
		 * main. Muestra las puntuaciones de los tres para comprobar que solo ha
		 * cambiado la del primero.
		 */

		Jugador jugador1 = new Jugador("Alex");
		Jugador jugador2 = new Jugador("Dani", 3);
		Jugador jugador3 = new Jugador("Cris", 5, 200);

		System.out.printf("Jugador %d: %s - Nivel %d - Puntuación %d\n", 1, jugador1.nombre, jugador1.nivel,
				jugador1.puntuacion);
		System.out.printf("Jugador %d: %s - Nivel %d - Puntuación %d\n", 2, jugador2.nombre, jugador2.nivel,
				jugador2.puntuacion);
		System.out.printf("Jugador %d: %s - Nivel %d - Puntuación %d\n", 3, jugador3.nombre, jugador3.nivel,
				jugador3.puntuacion);

		jugador1.puntuacion += 50;

		System.out.println("\nPuntuaciones después del cambio");
		System.out.printf("%s: %d\n", jugador1.nombre, jugador1.puntuacion);
		System.out.printf("%s: %d\n", jugador2.nombre, jugador2.puntuacion);
		System.out.printf("%s: %d\n", jugador3.nombre, jugador3.puntuacion);

	}
}
