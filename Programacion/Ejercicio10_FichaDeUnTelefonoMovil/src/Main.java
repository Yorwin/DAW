
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Movil con los atributos marca (String), modelo (String),
		 * almacenamiento (int, en GB) y encendido (boolean). Define tres constructores:
		 * 
		 * - Uno que reciba marca y modelo, y asigne 64 GB y false a encendido. - Otro
		 * que reciba marca, modelo y almacenamiento, y asigne false a encendido. - Otro
		 * que reciba los cuatro datos.
		 * 
		 * Desde main, crea un móvil con cada constructor y muestra todos sus atributos.
		 * Usa los datos del ejemplo para comprobar qué valores asigna cada constructor.
		 */

		Movil movil1 = new Movil("Samsung", "Galaxy A15");
		Movil movil2 = new Movil("Xiaomi", "Redmi Note 13", 128);
		Movil movil3 = new Movil("Apple", "iPhone 15", 256, true);

		System.out.printf("Movil 1: %s - %s - %dGB - Encendido: %b\n", movil1.marca, movil1.modelo,
				movil1.almacenamiento, movil1.encendido);
		System.out.printf("Movil 2: %s - %s - %dGB - Encendido: %b\n", movil2.marca, movil2.modelo,
				movil2.almacenamiento, movil2.encendido);
		System.out.printf("Movil 3: %s - %s - %dGB - Encendido: %b\n", movil3.marca, movil3.modelo,
				movil3.almacenamiento, movil3.encendido);

	}

}
