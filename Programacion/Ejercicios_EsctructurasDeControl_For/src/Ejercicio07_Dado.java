import java.util.Scanner;

public class Ejercicio07_Dado {

	public static void main(String[] args) {
		/*
		 * Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se
		 * lanza el dado (de no ser positivo, se establecerá a 100) y se mostrará el
		 * resumen de los lanzamientos. Se mostraán cuantas veces ha salido cada número.
		 * (Dado)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nro. de lanzamientos que quieres que realice el dado.");
		int nroLanzamientos = teclado.nextInt();

		teclado.close();

		if (nroLanzamientos <= 0)
			nroLanzamientos = 100;

		int vecesUno = 0;
		int vecesDos = 0;
		int vecesTres = 0;
		int vecesCuatro = 0;
		int vecesCinco = 0;
		int vecesSeis = 0;

		// Manejo lanzamientos
		for (int i = 0; i < nroLanzamientos; i++) {
			int resultadoLanzamiento = lanzamientoDado();

			if (resultadoLanzamiento == 1) {
				vecesUno++;
			} else if (resultadoLanzamiento == 2) {
				vecesDos++;
			} else if (resultadoLanzamiento == 3) {
				vecesTres++;
			} else if (resultadoLanzamiento == 4) {
				vecesCuatro++;
			} else if (resultadoLanzamiento == 5) {
				vecesCinco++;
			} else if (resultadoLanzamiento == 6) {
				vecesSeis++;
			}

		}

		System.out.printf(
				"Resumen de lanzamientos: \nEl 1 salio: %d veces\nEl 2 salio: %d veces\nEl 3 salio: %d veces\nEl 4 salio: %d veces\nEl 5 salio: %d veces\nEl 6 salio: %d veces\n",
				vecesUno, vecesDos, vecesTres, vecesCuatro, vecesCinco, vecesSeis);
		System.out.println("En total hubieron " + nroLanzamientos + " lanzamientos");
	}

	public static int lanzamientoDado() {
		return (int) (Math.random() * 6) + 1;
	}

}
