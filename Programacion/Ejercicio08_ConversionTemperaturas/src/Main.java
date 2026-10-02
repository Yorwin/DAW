import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Hágase una aplicación que permita realizar conversiones de temperaturas entre
		 * grados centígrados, farenheit y kelvin (los resultados se muestran
		 * redondeados a dos decimales). (Temperaturas)
		 */

		float gradosCentigradosIniciales = 15.70f;
		float gradosFarenheitIniciales = 45.32f;
		float gradosKelvinIniciales = 345.23f;

		// Constantes para las conversiones.
		final float CONVERTIR_A_KELVIN = 273.15f;

		// Conversiones Celcius.
		float resultadoFarenheitCentigrados = (9 * gradosCentigradosIniciales) / 5 + 32;
		float resultadoKelvinCentigrados = gradosCentigradosIniciales + CONVERTIR_A_KELVIN;

		// Conversiones Faranheit.
		float resultadoCentigradosFarenheit = 5 * (gradosFarenheitIniciales - 32) / 9;
		float resultadoKelvinFarenheit = resultadoCentigradosFarenheit + CONVERTIR_A_KELVIN;

		// Conversiones Kelvin.
		float resultadoCentigradosKelvin = gradosKelvinIniciales - CONVERTIR_A_KELVIN;
		float resultadoFarenheitKelvin = 9 * (gradosKelvinIniciales - CONVERTIR_A_KELVIN) / 5 + 32;

		System.out.printf("Grados centigrados: %.2f \n", gradosCentigradosIniciales);
		System.out.printf("Farenheit: %.2f Kelvin: %.2f \n", resultadoFarenheitCentigrados, resultadoKelvinCentigrados);

		System.out.printf("Grados Farenheit: %.2f \n", gradosFarenheitIniciales);
		System.out.printf("Centigrados: %.2f Kelvin: %.2f \n", resultadoCentigradosFarenheit, resultadoKelvinFarenheit);

		System.out.printf("Grados Kelvin: %.2f \n", gradosKelvinIniciales);
		System.out.printf("Centigrados: %.2f Farenheit: %.2f \n", resultadoCentigradosKelvin, resultadoFarenheitKelvin);

	}
}
