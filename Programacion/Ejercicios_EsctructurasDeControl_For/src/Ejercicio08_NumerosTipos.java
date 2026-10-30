import java.util.Scanner;

public class Ejercicio08_NumerosTipos {

	public static void main(String[] args) {
		/*
		 * Pedir 10 números. Mostrar la media de los números positivos, la media de los
		 * números negativos y la cantidad de ceros (NumerosTipos)
		 */

		Scanner teclado = new Scanner(System.in);

		int sumatoriaPositivos = 0;
		int cantidadPositivos = 0;

		int sumatoriaNegativos = 0;
		int cantidadNegativos = 0;

		int cantidadCeros = 0;

		// Solicitar nros. al usuario.
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un nro.");
			int numero = teclado.nextInt();

			if (numero > 0) {
				sumatoriaPositivos += numero;
				cantidadPositivos++;
			} else if (numero < 0) {
				sumatoriaNegativos += numero;
				cantidadNegativos++;
			} else {
				cantidadCeros++;
			}
		}
		
		teclado.close();
		
		// Calcular Medias.
		int mediaPositivos = sumatoriaPositivos / cantidadPositivos;
		int mediaNegativos = sumatoriaNegativos / cantidadNegativos;

		System.out.println("La media de los nros. positivos es = " + mediaPositivos);
		System.out.println("La media de los nros. negativos es = " + mediaNegativos);
		System.out.println("La cantidad de ceros que se introdujo es = " + cantidadCeros);

	}

}
