import java.util.Scanner;

public class Ejercicio08_ContarAparicionesDeUnElemento {

	public static void main(String[] args) {
		/*
		 * Crea un programa con un array de 10 palabras (pueden repetirse). Pide al
		 * usuario una palabra y usa un bucle for para contar cuántas veces aparece esa
		 * palabra en el array.
		 */

		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[] { "gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato" };

		System.out.println("Introduce la palabra a buscar");
		String palabraABuscar = teclado.next();
		teclado.close();

		int contador = 0;

		for (String palabra : palabras) {
			if (palabra.equals(palabraABuscar))
				contador++;
		}

		System.out.printf("La palabra %s aparece %d veces en el array", palabraABuscar, contador);
	}

}
