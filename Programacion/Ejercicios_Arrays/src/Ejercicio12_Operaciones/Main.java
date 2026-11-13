package Ejercicio12_Operaciones;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Cuantos numeros tiene el array de operaciones");
			int longArray = scanner.nextInt();
			Operaciones operaciones = new Operaciones(longArray);
			// numeros = [0,0,0,0,0]
			int opcion;
			do {
				System.out.println("1. Rellenar datos");
				System.out.println("2. Cambiar datos");
				System.out.println("3. Rotar Array Izq.");
				System.out.println("4. Rotar Array Der.");
				System.out.println("5. Invertir Array");
				System.out.println("6. Ordenar Array");
				System.out.println("7. Mostrar Array");
				System.out.println("8. Salir");
				System.out.println("Indica la accion a realizar");
				opcion = scanner.nextInt();
				switch (opcion) {
				case 1 -> operaciones.rellenarDatos();
				case 2 -> {
					System.out.println("Que numero quieres buscar");
					int numeroBuscar = scanner.nextInt();
					if (operaciones.estaNumero(numeroBuscar)) {
						int numeroCambiar;
						do {
							System.out.println("Que numero lo quiees cambiar");
							numeroCambiar = scanner.nextInt();
						} while (operaciones.estaNumero(numeroCambiar));
						operaciones.cambiarNumeros(numeroBuscar, numeroCambiar);
						System.out.println(Arrays.toString(operaciones.getNumeros()));
					} else {
						System.out.println("El numero buscado no se encuentra");
					}
				}
				case 3 -> operaciones.rotarIzq();
				case 4 -> operaciones.rotarDer();
				case 5 -> operaciones.invertir();
				case 6 -> operaciones.ordenar();
				case 7 -> System.out.println(Arrays.toString(operaciones.getNumeros()));
				case 8 -> System.out.println("Saliendo del programa");
				}

			} while (opcion != 8);

			// System.out.println(operaciones.estaNumero(numeroBuscar));
		} catch (Exception e) {
			System.out.println("Error en el programa");
		}
	}
}