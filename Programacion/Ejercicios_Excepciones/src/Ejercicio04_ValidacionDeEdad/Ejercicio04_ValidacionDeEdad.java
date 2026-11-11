package Ejercicio04_ValidacionDeEdad;

import java.util.Scanner;

public class Ejercicio04_ValidacionDeEdad {

	public static void main(String[] args) {
		/*
		 * Crea una clase EdadInvalidaException que herede de Exception. Crea un método
		 * validarEdad(int edad) que lance esta excepción si la edad es menor que 0 o
		 * mayor que 120. En el método main, pide al usuario su edad y usa try-catch
		 * para capturar y manejar la excepción personalizada.
		 */

		try (Scanner teclado = new Scanner(System.in);) {
			System.out.println("Introduce tu edad");
			int edad = teclado.nextInt();
			validarEdad(edad);
			System.out.println("Edad válida: " + edad + " años");
		} catch (EdadInvalidaException e) {
			System.err.println(e.getMessage());
		}

	}

	public static void validarEdad(int edad) throws EdadInvalidaException {
		if (edad < 0)
			throw new EdadInvalidaException("La edad no puede ser negativa");

		if (edad > 120)
			throw new EdadInvalidaException("La edad no puede ser mayor que 120");
	}

}
