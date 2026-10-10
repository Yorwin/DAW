
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Producto con los atributos nombre (String) y precio (double).
		 * Define dos constructores:
		 * 
		 * - Uno que reciba solo el nombre y asigne un precio de 0.0. - Otro que reciba
		 * el nombre y el precio.
		 * 
		 * Desde main, crea un producto con cada constructor y muestra sus datos.
		 */

		Producto producto1 = new Producto("Cuaderno");
		Producto producto2 = new Producto("Mochila", 25.5);

		System.out.printf("Producto 1: %s - %.1f€ \n", producto1.nombre, producto1.precio);
		System.out.printf("Producto 2: %s - %.1f€ \n", producto2.nombre, producto2.precio);

	}

}
