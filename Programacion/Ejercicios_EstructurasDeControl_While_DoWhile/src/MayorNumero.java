
public class MayorNumero {

	public static void main(String[] args) {
		/*
		 * Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El
		 * programa mostrará cada uno de los datos generados y obtendrá el mayor de los
		 * números generados. (MayorNumero)
		 */

		int aleatorio = (int) (Math.random() * 100) + 1;
		int mayor = 1;

		while (aleatorio != 0) {
			System.out.println(aleatorio);

			if (aleatorio > mayor) {
				mayor = aleatorio;
			}

			aleatorio = (int) (Math.random() * 101);
		}

		System.out.println("El numero más grande es " + mayor);

	}

}
