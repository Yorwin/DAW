import java.util.Scanner;

public class Ejercicio10_SistemaDeCalificacionesConArrays {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa que pida al usuario cuántos estudiantes hay en una
		 * clase. Crea un array para almacenar sus calificaciones (0-10). Usa un bucle
		 * while para rellenar el array con las notas. Luego, usa un bucle for para:
		 * 
		 * 1. Mostrar todas las calificaciones 2. Calcular el promedio de la clase 3.
		 * Contar cuántos estudiantes aprobaron (nota ≥ 5) 4. Encontrar la nota más alta
		 * y la más baja
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuántos estudiantes hay?");
		int cantidadEstudiantes = teclado.nextInt();

		double[] notaEstudiantes = new double[cantidadEstudiantes];

		int nroNota = 1;

		while (nroNota <= notaEstudiantes.length) {
			System.out.println("Introduce la nota del estudiante " + nroNota + ":");
			notaEstudiantes[nroNota - 1] = teclado.nextDouble();
			nroNota++;
		}

		teclado.close();

		double sumaCalificaciones = 0.0, notaAlta = 0.0, notaBaja = 0.0;
		int estudiantesAprobados = 0;

		// Calificaciones.
		System.out.printf("Calificaciones: ");

		for (int i = 0; i < notaEstudiantes.length; i++) {

			// Suma Calificaciones.
			sumaCalificaciones += notaEstudiantes[i];

			// Aprobados.
			// if (notaEstudiantes[i] >= 5)
			// estudiantesAprobados++;

			// Con operador ternario.
			estudiantesAprobados = notaEstudiantes[i] >= 5 ? ++estudiantesAprobados : estudiantesAprobados;

			// Nota Alta.
			// if (notaEstudiantes[i] > notaAlta)
			// notaAlta = notaEstudiantes[i];
			notaAlta = notaEstudiantes[i] > notaAlta ? notaEstudiantes[i] : notaAlta;

			/*
			 * Alternativas. - (double) Math.max(); -
			 * Arrays.stream(array).max().getAsDouble;
			 */

			// Nota baja.

			// if (notaBaja == 0)
			// notaBaja = notaEstudiantes[i];
			notaBaja = notaBaja == 0 ? notaEstudiantes[i] : notaBaja;

			// if (notaEstudiantes[i] < notaBaja)
			// notaBaja = notaEstudiantes[i];
			notaBaja = notaEstudiantes[i] < notaBaja ? notaEstudiantes[i] : notaBaja;

			if (i == 0) {
				System.out.printf("[" + notaEstudiantes[i] + ",");
			} else if (i == notaEstudiantes.length - 1) {
				System.out.printf(" " + notaEstudiantes[i] + "]\n");
			} else {
				System.out.printf(" " + notaEstudiantes[i] + ",");
			}

		}

		double promedio = sumaCalificaciones / notaEstudiantes.length;
		// double promedio = Arrays.stream(notaEstudiantes).average().getAsDouble();

		System.out.println("Promedio de la clase: " + promedio);
		System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
		System.out.println("Nota más alta: " + notaAlta);
		System.out.println("Nota más baja: " + notaBaja);
	}

}
