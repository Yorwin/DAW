
public class Main {

	public static void main(String[] args) {

		/*
		 * Crea una clase Libro con los atributos titulo (String), autor (String) y
		 * paginas (int). Define dos constructores:
		 * 
		 * - Uno sin parámetros, que asigne "Sin título", "Autor desconocido" y 0
		 * páginas. - Otro que reciba los tres datos.
		 * 
		 * Desde main, crea un libro con cada constructor y muestra sus atributos.
		 */

		Libro libro1 = new Libro();
		Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);

		System.out.printf("Libro 1: %s - %s - %d páginas \n", libro1.titulo, libro1.autor, libro1.paginas);
		System.out.printf("Libro 2: %s - %s - %d páginas \n", libro2.titulo, libro2.autor, libro2.paginas);

	}

}
