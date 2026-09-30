import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Permítase introducir el valor con IVA de una compra con dos decimales (la
		 * compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de
		 * dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin
		 * IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.
		 * (Compra)
		 * 
		 * ENTRADA/SALIDA*
		 * 
		 * Valor de la compra (entre 0.00 y 500.00):**298,45**
		 * 
		 * IVA (entre 0 y 25%):**12**
		 * 
		 * Compra: 266.47
		 * 
		 * IVA: 31.98
		 * 
		 * ======
		 * 
		 * 298.45
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor indica el costo de tu compra con IVA");
		float compraConIVA = teclado.nextFloat();

		System.out
				.println("Cuál fue el porcentaje de IVA que te han cobrado (Recuerda el minimo es 0% y el máximo 25%)");
		int porcentajeIVA = teclado.nextInt();
		float ivaOperacion = porcentajeIVA / 100.0f;

		float compraSinIva;
		float ivaTotal;

		if (compraConIVA < 500 && compraConIVA > 0 && porcentajeIVA >= 0 && porcentajeIVA <= 25) {
			compraSinIva = compraConIVA / (ivaOperacion + 1);
			ivaTotal = compraConIVA - compraSinIva;

			System.out.printf("Valor de la compra (entre 0.00 y 500.00): %.2f€ \n", compraConIVA);
			System.out.println("IVA (entre 0 y 25%): " + porcentajeIVA + "%");
			System.out.println("Compra: " + (Math.floor(compraSinIva * 100) / 100) + "€");
			System.out.println("IVA: " + (Math.floor(ivaTotal * 100) / 100) + "€");
			System.out.println("============");
			System.out.printf("%.2f€", compraConIVA);
		} else {
			System.out.println("No has indicado los valores correctamente, ejecuta la App nuevamente");
		}

	}

}
