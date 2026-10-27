import java.util.Scanner;

public class Ejercicio13_ComprobarValidezFecha {

	public static void main(String[] args) {

		/*
		 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Sin
		 * años bisiestos.
		 */

		Scanner teclado = new Scanner(System.in);

		int dia = teclado.nextInt();
		int mes = teclado.nextInt();
		int anno = teclado.nextInt();

		int diasMes = 0;

		if (dia > 0 && mes > 0 && mes <= 12 && anno > 0) {

			if (mes == 2) {
				diasMes = 28;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				diasMes = 30;
			} else {
				diasMes = 31;
			}

			if (dia <= diasMes) {
				System.out.println("La fecha es correcta");
				System.out.printf("La fecha es %d/%d/%d%n", dia, mes, anno);
			} else {
				System.out.println("La fecha no es correcta");
			}

		} else {
			System.out.println("La fecha no es correcta");
		}

		teclado.close();
	}

}
