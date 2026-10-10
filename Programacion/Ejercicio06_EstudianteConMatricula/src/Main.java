
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Estudiante con los atributos nombre (String), curso (String) y
		 * matriculado (boolean). Define dos constructores:
		 * 
		 * - Uno que reciba nombre y curso, y asigne false a matriculado. - Otro que
		 * reciba los tres datos.
		 * 
		 * Desde main, crea un estudiante con cada constructor y muestra sus atributos.
		 */

		Estudiante estudiante1 = new Estudiante("Alex", "DAM");
		Estudiante estudiante2 = new Estudiante("Sara", "DAM", true);

		System.out.printf("Estudiante 1: %s - %s - Matriculado: %b\n", estudiante1.nombre, estudiante1.curso,
				estudiante1.matriculado);
		System.out.printf("Estudiante 2: %s - %s - Matriculado: %b\n", estudiante2.nombre, estudiante2.curso,
				estudiante2.matriculado);
	}

}
