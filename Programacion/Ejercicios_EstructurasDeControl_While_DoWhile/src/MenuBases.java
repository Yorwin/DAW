import java.util.Scanner;

public class MenuBases {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Bienvenido a la aplicación de cambios de base");

		boolean salir = false;

		while (!salir) {
			System.out.println("Introduce el nro. que quieres cambiar de base");
			int numeroBase = teclado.nextInt();

			while (numeroBase <= 0) {
				System.out.println("No válido, introduce otro");
				numeroBase = teclado.nextInt();
			}

			System.out.println(
					"1. Pasar a base2 \n2. Pasar a base8 \n3. Pasar a base16 \n4. Salir \n5. Selecciona la base a la que quieres pasar\n");
			int opcionSeleccionada = teclado.nextInt();

			if (opcionSeleccionada == 4) {
				break;
			}

			switch (opcionSeleccionada) {
			case 1 -> {
				int base2 = 0;
				int posicionBase2 = 1;
				int valorBase2 = numeroBase;

				do {
					int resto = valorBase2 % 2;
					base2 = base2 + (resto * posicionBase2);
					posicionBase2 = posicionBase2 * 10;
					valorBase2 = valorBase2 / 2;
				} while (valorBase2 > 0);

				System.out.println("El número " + numeroBase + " en base10 es igual que " + base2 + " en base2");
			}
			case 2 -> {
				int base8 = 0;
				int posicionBase8 = 1;
				int valorBase8 = numeroBase;

				do {
					int resto = valorBase8 % 8;
					base8 = base8 + (resto * posicionBase8);
					posicionBase8 = posicionBase8 * 10;
					valorBase8 = valorBase8 / 8;
				} while (valorBase8 > 0);

				System.out.println("El número " + numeroBase + " en base10 es igual que " + base8 + " en base8");
			}
			case 3 -> {
				String base16 = "";
				int valorBase16 = numeroBase;

				do {
					int resto = valorBase16 % 16;
					valorBase16 = valorBase16 / 16;
					String nuevoValor;

					switch (resto) {
					case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9: {
						nuevoValor = String.valueOf(resto).concat(base16);
						break;
					}
					case 10: {
						nuevoValor = "A".concat(base16);
						break;
					}
					case 11: {
						nuevoValor = "B".concat(base16);
						break;
					}
					case 12: {
						nuevoValor = "C".concat(base16);
						break;
					}
					case 13: {
						nuevoValor = "D".concat(base16);
						break;
					}
					case 14: {
						nuevoValor = "E".concat(base16);
						break;
					}
					case 15: {
						nuevoValor = "F".concat(base16);
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + resto);
					}

					base16 = nuevoValor;
				} while (valorBase16 > 0);

				System.out.println("El número " + numeroBase + " en base10 es igual que " + base16 + " en base16");
			}
			case 5 -> {
				System.out.println("Indica la base que deseas calcular");
				int baseUsuario = teclado.nextInt();

				int base = 0;
				int posicionBase = 1;
				int valorBase = numeroBase;

				do {
					int resto = valorBase % baseUsuario;
					base = base + (resto * posicionBase);
					posicionBase = posicionBase * 10;
					valorBase = valorBase / baseUsuario;
				} while (valorBase > 0);

				System.out.println(
						"El número " + numeroBase + " en base10 es igual que " + base + " en base" + baseUsuario);
			}
			default -> System.out.println("Opción no válida");
			}
		}

		teclado.close();
	}
}