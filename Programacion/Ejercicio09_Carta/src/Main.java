import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase una aplicación que permita introducir el número de bebidas y
		 * bocadillos comprados (valores entre 0 y 20). Además se podrá introducir el
		 * precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo
		 * (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de
		 * alumnos que realizaron la compra (valor entre 0 y 10). Se mostrará el total
		 * de la compra (con el subtotal de las bebidas y de los bocadillos) y la
		 * cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)
		 * 
		 * ENTRADA/SALIDA*
		 * 
		 * Número de bebidas (entre 0 y 20): **3**
		 * 
		 * Número de bocadillos (entre 0 y 20): **5**
		 * 
		 * Precio de cada bebida (entre 0,00 y 3,00): **1,20**
		 * 
		 * Precio de cada bocadillo (entre 0,00 y 3,00): **2,05**
		 * 
		 * Número de alumnos (entre 1 y 10): **5**
		 */

		Scanner teclado = new Scanner(System.in);

		// Bebidas.
		System.out.println("Introduce el nro. de bebidas (valores entre 0 y 20).");
		int nroBebidas = teclado.nextInt();

		System.out.println("Introduce el precio de cada bebida (valor entre 0.00 € y 3.00 €)");
		float precioBebida = teclado.nextFloat();

		// Bocadillos.
		System.out.println("Introduce el nro. de bocadillos");
		int nroBocadillos = teclado.nextInt();

		System.out.println("Introduce el precio de cada bocadillo (valor entre 0.00€ y 5.00€)");
		float precioBocadillo = teclado.nextFloat();

		// Nro. Alumnos.
		System.out.println("Indica el nro. de alumnos que se repatirán la factura final");
		int nroAlumnos = teclado.nextInt();

		teclado.close();

		// Calculos factura.
		float totalBebidas = nroBebidas * precioBebida;
		float totalBocadillos = nroBocadillos * precioBocadillo;
		float totalDefinitivo = totalBebidas + totalBocadillos;
		float costePorAlumno = totalDefinitivo / nroAlumnos;

		System.out.println("Número de bebidas (entre 0 y 20): " + nroBebidas);
		System.out.println("Número de bocadillos (entre 0 y 20): " + nroBocadillos);
		System.out.println("Precio de cada bebida (entre 0,00 y 3,00): " + precioBebida);
		System.out.println("Precio de cada bocadillo (entre 0,00 y 3,00): " + precioBocadillo);
		System.out.println("Número de alumnos (entre 1 y 10): " + nroAlumnos);

		System.out.printf("%-10s %-10s %-10s %-10s\n", "ARTICULO", "CANTIDAD", "PRECIO", "COSTE");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "==========", "========", "======", "=====");
		System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", "Bebida", nroBebidas, precioBebida, totalBebidas);
		System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", "Bocadillo", nroBocadillos, precioBocadillo,
				totalBocadillos);
		System.out.printf("%39s", "=====\n");
		System.out.printf("%-10s %27.2f\n", "Total", totalDefinitivo);
		System.out.printf("%-10s %21.2f", "Coste por Alumno", costePorAlumno);

	}

}
