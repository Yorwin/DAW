import java.util.Scanner;

public class Ejercicio10_NotasTipos {

	public static void main(String[] args) {
		/*
		 * Introduce 6 notas, escribir la cantidad de alumnos aprobados, condicionados
		 * (=4) y suspensos. (NotasTipos)
		 */

		final int cantidadNotas = 6;

		Scanner teclado = new Scanner(System.in);

		int aprobado = 0;
		int condicionado = 0;
		int suspenso = 0;

		for (int i = 0; i < cantidadNotas; i++) {
			System.out.println("Indicame la nota de un alumno");
			int notaAlumno = teclado.nextInt();

			if (notaAlumno > 5 && notaAlumno <= 10) {
				aprobado++;
			} else if (notaAlumno == 4) {
				condicionado++;
			} else if (notaAlumno < 4) {
				suspenso++;
			} else {
				System.out.println("La nota indicada no es válida");
			}
		}

		teclado.close();

		System.out.println("Resultados de Alumnos");
		System.out.println("Alumnos aprobados = " + aprobado);
		System.out.println("Alumnos condicionados = " + condicionado);
		System.out.println("Alumnos suspensos = " + suspenso);
	}

}
