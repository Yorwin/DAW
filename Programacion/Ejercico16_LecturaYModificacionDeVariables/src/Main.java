import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Se lee un entero que se modifica de la siguiente manera:
		 * 
		 * a) Incrementar en 5 unidades (+=5).
		 * 
		 * b) Decrementar en 3 unidades(-=3).
		 * 
		 * c) Multiplicar por 10 (*=10)
		 * 
		 * d) Dividir por 2 (/=2)
		 * 
		 * e) Mostrar dicho entero en cada uno de los apartados anteriores.
		 * 
		 * (AsignarEntero)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un nro. entero");
		int entero = teclado.nextInt();
		teclado.close();

		System.out.println("ENTERO: " + entero);

		entero += 5;

		System.out.println("Incrementar 5 unidades: " + entero);

		entero -= 3;

		System.out.println("Decrementar 3 unidades: " + entero);

		entero *= 10;
		System.out.println("Multiplicar por 10: " + entero);

		entero /= 2;
		System.out.println("Dividir por 2: " + entero);

	}

}
