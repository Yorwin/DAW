
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
		final String NOMBRE_COMPLETO = "Yorwin José Rosales Castellanos";

		// Direccion
		final String CALLE = "C/ Gran Vía";
		final int NROPORTAL = 24;
		final int PISO = 3;
		final char LETRA_PISO = 'B';
		final int CODIGO_POSTAL = 28801;
		final String LOCALIDAD = "Alcalá de Henares";
		final String PROVINCIA = "Madrid";
		final String PAIS = "España";

		// Salida de Datos.
		System.out.printf("%s \n", NOMBRE_COMPLETO);
		System.out.printf("%s nº%d, %dº%s \n", CALLE, NROPORTAL, PISO, LETRA_PISO);
		System.out.printf("%d %s, %s \n", CODIGO_POSTAL, LOCALIDAD, PROVINCIA);
		System.out.printf("%s", PAIS);
	}

}
