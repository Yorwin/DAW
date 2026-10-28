import java.util.Scanner;

public class Ejercicio04_DíasMes {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que solicite al usuario ingresar un mes (como un número
		 * del 1 al 12) y muestre la cantidad de días que tiene ese mes, considerando
		 * años no bisiestos.
		 */

		final int totalMeses = 12;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica un número que corresponda a un mes");
		int mes = teclado.nextInt();

		int diasMes = 0;

		if (mes <= totalMeses && mes > 0) {

			switch (mes) {
			case 2 -> {
				diasMes = 28;
			}
			case 4, 6, 9, 11 -> {
				diasMes = 30;
			}
			default -> {
				diasMes = 31;
			}
			}

			System.out.println("El mes que has indicado: " + mes);
			System.out.println("Este mes tiene: " + diasMes + " días");
		} else {
			System.out.println("El nro. que has indicado no corresponde a un mes del año");
		}

		teclado.close();
	}

}
