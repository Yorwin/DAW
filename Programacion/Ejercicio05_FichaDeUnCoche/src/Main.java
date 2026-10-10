
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Coche con los atributos marca (String), modelo (String) y anio
		 * (int). Define tres constructores:
		 * 
		 * - Uno sin parámetros, que asigne "Sin marca", "Sin modelo" y 2000. - Otro que
		 * reciba marca y modelo, y asigne 2026 como año. - Otro que reciba los tres
		 * datos.
		 * 
		 * Desde main, crea un coche con cada constructor y muestra sus atributos.
		 */

		Coche coche1 = new Coche();
		Coche coche2 = new Coche("Toyota", "Corolla");
		Coche coche3 = new Coche("Seat", "Ibiza", 2020);

		System.out.printf("Coche 1: %s - %s - %d \n", coche1.marca, coche1.modelo, coche1.anio);
		System.out.printf("Coche 2: %s - %s - %d \n", coche2.marca, coche2.modelo, coche2.anio);
		System.out.printf("Coche 3: %s - %s - %d \n", coche3.marca, coche3.modelo, coche3.anio);

	}

}
