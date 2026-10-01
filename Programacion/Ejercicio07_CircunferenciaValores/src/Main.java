import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Permítase introducir el valor del radio de una circuferencia con valores
		 * entre 0 y 100. Obténgase la longitud de la circunferencia (2πr) y el área del
		 * circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el radio del circulo");
		float radio = teclado.nextFloat();

		teclado.close();

		double longitud = Math.floor((Math.PI * 2 * radio) * 100) / 100;
		double area = Math.floor(Math.PI * Math.pow(radio, 2) * 100) / 100;

		System.out.printf("Longitud de la circunferencia: %.2f\n", longitud);
		System.out.printf("Area de circulo: %.2f\n", area);
	}

}
