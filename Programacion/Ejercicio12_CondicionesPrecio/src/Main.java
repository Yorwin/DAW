import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase una aplicación que permita comprobar si puedo comprarme una serie de
		 * artículos. Para ello, el sistema pedirá por consola la cantidad de dinero en
		 * euros que tengo, el IVA que se aplica en este momento y el precio de dos
		 * articulos (sin IVA). El sistema indicará:
		 * 
		 * - Si puedo comprar el primer artículo solo
		 * 
		 * - Si puedo comprar el segundo artículo solo
		 * 
		 * - Si puedo comprar ámbos artículos juntos
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica la cantidad de dinero de la que dispones");
		double cantidadDinero = teclado.nextDouble();

		System.out.println("Indica el IVA aplicable a los articulos");
		double ivaAplicable = (teclado.nextDouble() / 100) + 1;

		System.out.println("Indica el precio del primer articulo");
		double primerArticulo = teclado.nextDouble() * ivaAplicable;

		System.out.println("Indica el precio del segundo articulo");
		double segundoArticulo = teclado.nextDouble() * ivaAplicable;

		teclado.close();

		// Interrogantes.

		boolean posibleComprarPrimerArt = cantidadDinero > primerArticulo;
		boolean posibleComprarSegundoArt = cantidadDinero > segundoArticulo;
		boolean posibleComprarTodo = cantidadDinero > primerArticulo + segundoArticulo;

		String primerArticuloEnunciado = posibleComprarPrimerArt ? "Se puede comprar el articulo 1"
				: "No es posible comprar el articulo 1, no hay dinero suficiente";

		String segundoArticuloEnunciado = posibleComprarSegundoArt ? "Se puede comprar el articulo 2"
				: "No es posible comprar el articulo 2, no hay dinero suficiente";

		String ambosArticulosEnunciado = posibleComprarTodo ? "Se pueden comprar los dos articulos"
				: "No es posible comprar ambos los articulos";

		System.out.println(primerArticuloEnunciado + "\n" + segundoArticuloEnunciado + "\n" + ambosArticulosEnunciado);
	}

}
