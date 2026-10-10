
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Persona con los atributos nombre (String) y edad (int). Define
		 * un constructor que reciba ambos datos. Desde main, crea un objeto con el
		 * nombre Ana y la edad 20, y muestra sus atributos.
		 */

		Persona persona = new Persona("Ana", 20);
		System.out.printf("Nombre: %s\nEdad: %d", persona.nombre, persona.edad);
	}

}
