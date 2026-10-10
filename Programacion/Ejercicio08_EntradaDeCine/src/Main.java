
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase EntradaCine con los atributos pelicula (String), sala (int) y
		 * precio (double). Define dos constructores:
		 * 
		 * - Uno que reciba solo la película y asigne la sala 1 y un precio de 7.5. -
		 * Otro que reciba los tres datos.
		 * 
		 * Desde main, crea una entrada con cada constructor, muestra sus datos y
		 * calcula el precio total de las dos entradas sumando sus precios.
		 */

		EntradaCine entrada1 = new EntradaCine("Toy Story");
		EntradaCine entrada2 = new EntradaCine("Encanto", 3, 8.5);

		System.out.printf("Entrada 1: %s - Sala %d - %.1f€\n", entrada1.pelicula, entrada1.sala, entrada1.precio);
		System.out.printf("Entrada 2: %s - Sala %d - %.1f€\n", entrada2.pelicula, entrada2.sala, entrada2.precio);
		System.out.println("Total de las entradas: " + (entrada1.precio + entrada2.precio) + "€");
	}

}
