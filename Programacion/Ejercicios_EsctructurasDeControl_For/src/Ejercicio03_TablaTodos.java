
public class Ejercicio03_TablaTodos {

	public static void main(String[] args) {
		/*
		 * Modificar el ejercicio anterior para calcular la tabla de multiplicar de
		 * todos los números (TablaTodos)
		 */

		System.out.println("Tablas de multiplicar");

		int maximaTabla = 10;
		int maximaMultiplicador = 10;

		for (int i = 1; i <= maximaTabla; i++) {
			System.out.printf("Tabla del %d\n", i);
			// Segundo bloque para obtener el segundo valor.
			for (int k = 0; k <= maximaMultiplicador; k++) {
				System.out.printf("%d x %d = %d \n", i, k, (i * k));
			}
			System.out.printf("Fin de la tabla \n\n");
		}
	}

}
