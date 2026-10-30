import java.util.Scanner;

public class Ejercicio06_ParesEntreDosDados {

	public static void main(String[] args) {
		/*
		 * Mostrar todos los números pares comprendidos entre dos dados.
		 * (ParesEntreDosDados)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un nro.");
		int primerNumero = teclado.nextInt();

		System.out.println("Introduce un nro.");
		int segundoNumero = teclado.nextInt();

		teclado.close();

		int mayor = primerNumero > segundoNumero ? primerNumero : segundoNumero;
		int menor = primerNumero < segundoNumero ? primerNumero : segundoNumero;

		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("Programa terminado");
	}

}
