import java.util.Scanner;

public class Ejercicio14_MostrarDiaSiguiente {

	public static void main(String[] args) {
		/*
		 * Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
		 * siguiente. suponer que todos los meses tienen 30 días excepto febrero que
		 * tiene 28.
		 */

		final int mesesEnUnAnno = 12;

		Scanner teclado = new Scanner(System.in);

		int dia = teclado.nextInt();
		int mes = teclado.nextInt();
		int anno = teclado.nextInt();

		int diasMes;

		if (dia > 0 && mes > 0 && mes <= 12 && anno > 0) {
			if (mes == 2) {
				diasMes = 28;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				diasMes = 30;
			} else {
				diasMes = 31;
			}

			dia++;

			if (dia <= diasMes) {
				System.out.printf("La fecha del día siguiente es %d/%d/%d%n", dia, mes, anno);
			} else {
				dia = 1;
				mes++;

				if (mes > mesesEnUnAnno) {
					mes = 1;
					anno++;
				}

				System.out.printf("La fecha del día siguiente es es %d/%d/%d%n", dia, mes, anno);
			}

		} else {
			System.out.println("La fecha no es correcta");
		}

		teclado.close();

	}

}
