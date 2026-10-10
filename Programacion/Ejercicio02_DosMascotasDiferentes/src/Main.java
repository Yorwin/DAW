
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Mascota con los atributos nombre (String), especie (String) y
		 * edad (int). Define un constructor que reciba los tres datos. Desde main, crea
		 * dos objetos distintos y muestra sus datos para comprobar que cada mascota
		 * tiene sus propios valores.
		 */

		Mascota mascota1 = new Mascota("Luna", "Gato", 3);
		Mascota mascota2 = new Mascota("Toby", "Perro", 5);

		System.out.printf("Mascota 1: %s - %s - %d años\n", mascota1.nombre, mascota1.especie, mascota1.edad);
		System.out.printf("Mascota 2: %s - %s - %d años\n", mascota2.nombre, mascota2.especie, mascota2.edad);
	}

}
