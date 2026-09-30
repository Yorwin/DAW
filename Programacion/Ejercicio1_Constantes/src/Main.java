
public class Main {

	public static void main(String[] args) {

		/*
		 * Crea un programa que declare constantes locales con tu nombre completo,
		 * dirección de casa (solo calle), número del portal, piso, letra del piso,
		 * código postal, localidad, provincia y país. Muestra por consola estos datos
		 * almacenados en las constantes como si fuera la dirección para enviar una
		 * carta. (Direccion) ENTRADA/SALIDA Luis González Sanz C/ Maria de Molina nº
		 * 51, 1A 91023 Madrid España
		 */

		// Nombre Completo
		final String nombreCompleto = "Yorwin José Rosales Castellanos";

		// Direccion
		final String calle = "C/ Gran Vía";
		final int nroPortal = 24;
		final int piso = 3;
		final char letraPiso = 'B';
		final int codigoPostal = 28801;
		final String localidad = "Alcalá de Henares";
		final String provincia = "Madrid";
		final String pais = "España";

		// Salida de Datos.
		System.out.printf("%s \n", nombreCompleto);
		System.out.printf("%s nº%d, %dº%s \n", calle, nroPortal, piso, letraPiso);
		System.out.printf("%d %s, %s \n", codigoPostal, localidad, provincia);
		System.out.printf("%s", pais);
	}

}
