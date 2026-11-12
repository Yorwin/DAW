
public class Ejercicio06_CalcularLaSumaYPromedioDeUnArray {

	public static void main(String[] args) {
		/*
		 * Crea un programa con un array de 8 números decimales. Recorre el array con un
		 * bucle for para calcular la suma de todos los elementos. Luego, calcula y
		 * muestra el promedio.
		 */

		double[] numeros = new double[] { 4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9 };

		double total = 0.0;

		for (double numero : numeros) {
			total += numero;
		}

		double promedio = total / numeros.length;

		System.out.println("Suma total: " + total);
		System.out.println("Promedio: " + promedio);

	}

}
