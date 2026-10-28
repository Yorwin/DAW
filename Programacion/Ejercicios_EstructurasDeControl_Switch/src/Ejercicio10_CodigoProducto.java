import java.util.Scanner;

public class Ejercicio10_CodigoProducto {

	public static void main(String[] args) {
		/*
		 * Crea un programa que permita al usuario ingresar un código de producto (como
		 * una cadena de caracteres) y, utilizando una sentencia switch, muestre el
		 * nombre del producto y su precio correspondiente
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica el código de un producto para obtener su información");
		System.out.printf("Código: 1A4 | Producto: Laptop ASUS VivoBook %n", 799.99);
		System.out.printf("Código: 2B1 | Producto: Ratón Logitech G203 %n", 34.95);
		System.out.printf("Código: 3C2 | Producto: Teclado mecánico Redragon %n", 59.90);
		System.out.printf("Código: 4D5 | Producto: Monitor Samsung 27 pulgadas %n", 189.99);
		System.out.printf("Código: 3D8 | Producto: Auriculares Sony WH-CH520 %n", 49.99);
		System.out.printf("Código: 7H5 | Producto: Disco SSD Kingston 1 TB %n", 84.50);

		String codigo = teclado.next();
		teclado.close();

		String producto = "";
		double precio = 0;

		switch (codigo) {
		case "1A4" -> {
			producto = "Laptop ASUS VivoBook";
			precio = 799.99;
		}
		case "2B1" -> {
			producto = "Ratón Logitech G203";
			precio = 34.95;
		}
		case "3C2" -> {
			producto = "Teclado mecánico Redragon";
			precio = 59.90;
		}
		case "4D5" -> {
			producto = "Monitor Samsung 27 pulgadas";
			precio = 189.99;
		}
		case "3D8" -> {
			producto = "Auriculares Sony WH-CH520";
			precio = 49.99;
		}
		case "7H5" -> {
			producto = "Disco SSD Kingston 1 TB";
			precio = 84.50;
		}
		default -> {
			System.out.println("El código que has indicado es inválido");
		}
		}

		if (producto.length() > 0 && precio > 0) {
			System.out.printf("Nombre del Producto: %s \nPrecio: %.2f€", producto, precio);
		}

	}

}
