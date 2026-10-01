import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a
		 * 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula
		 * el coste de la consumición, mostrando primero el coste de las bebidas y de
		 * los bocadillos. (Bar)
		 * 
		 * ENTRADA/SALIDA Número de bebidas: 3 Número de bocadillos: 5 Coste de las
		 * bebidas: 3.75 Coste de los bocadillos: 10.25 Coste consumición: 14.0
		 */

		final float COSTE_BEBIDAS = 1.25f;
		final float COSTE_BOCADILLOS = 2.05f;

		// Camarero
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuántas bebidas desean consumir?");
		int cantidadBebidas = teclado.nextInt();

		System.out.println("Cuántos bocadillos desean consumir");
		int cantidadBocadillos = teclado.nextInt();
		
		teclado.close();
		
		// Calculo Factura Final.

		float precioFinalBebidas = cantidadBebidas * COSTE_BEBIDAS;
		float precioFinalBocadillos = cantidadBocadillos * COSTE_BOCADILLOS;
		float totalFactura = precioFinalBebidas + precioFinalBocadillos;

		System.out.println("Número de bebidas: " + cantidadBebidas);
		System.out.println("Número de bocadillos: " + cantidadBocadillos);
		System.out.printf("Coste de las bebidas: %.2f€ \n", precioFinalBebidas);
		System.out.printf("Coste de los bocadillos: %.2f€ \n", precioFinalBocadillos);
		System.out.printf("Coste consumición: %.2f€ \n", totalFactura);

	}

}
