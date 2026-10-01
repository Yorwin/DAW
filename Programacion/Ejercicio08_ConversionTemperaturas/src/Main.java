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

		// Conversiones Celcius.
		float resultadoFarenheitCentigrados = (9 * gradosCentigradosIniciales) / 5 + 32;
		float resultadoKelvinCentigrados = gradosCentigradosIniciales + 273.15f;

		// Conversiones Faranheit.
		float resultadoCentigradosFarenheit = 5 * (gradosFarenheitIniciales - 32) / 9;
		float resultadoKelvinFarenheit = 5 * (gradosFarenheitIniciales - 32) / 9 + 273.15f;

		// Conversiones Kelvin.
		float resultadoCentigradosKelvin = gradosKelvinIniciales - 273.15f;
		float resultadoFarenheitKelvin = 9 * (gradosKelvinIniciales - 273.15f) / 5 + 32;

		System.out.printf("Grados centigrados: %.2f \n", gradosCentigradosIniciales);
		System.out.printf("Farenheit: %.2f Kelvin: %.2f \n", resultadoFarenheitCentigrados, resultadoKelvinCentigrados);

		System.out.printf("Grados Farenheit: %.2f \n", gradosFarenheitIniciales);
		System.out.printf("Centigrados: %.2f Kelvin: %.2f \n", resultadoCentigradosFarenheit, resultadoKelvinFarenheit);

		System.out.printf("Grados Kelvin: %.2f \n", gradosKelvinIniciales);
		System.out.printf("Centigrados: %.2f Farenheit: %.2f \n", resultadoCentigradosKelvin, resultadoFarenheitKelvin);

	}
}
