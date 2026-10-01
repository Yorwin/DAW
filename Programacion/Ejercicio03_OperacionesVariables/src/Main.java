import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Hágase un programa que lea dos variables enteras y obtenga las siguientes
		 * operaciones: a) Suma b) Resta c) Multiplicación d) División entera e) Resto
		 * f) División real g) Resto real (Operaciones)
		 */

		System.out.println("Este programa realizar varias operaciones matemáticas a partir de dos numeros enteros");
		System.out.println("Por favor introduzca los números solictados.");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica un primer numero para operar");
		int primerEntero;
		primerEntero = teclado.nextInt();

		System.out.println("Indica un segundo numero para operar");
		int segundoEntero;
		segundoEntero = teclado.nextInt();

		teclado.close();

		int suma = primerEntero + segundoEntero;
		int resta = primerEntero - segundoEntero;
		int multiplicacion = primerEntero * segundoEntero;
		int divisionEntera = primerEntero / segundoEntero;
		int resto = primerEntero % segundoEntero;
		double divisionReal = (double) primerEntero / segundoEntero;
		double restoReal = (double) primerEntero % segundoEntero;

		System.out.println("El valor de la suma es " + suma);
		System.out.println("El valor de la resta es " + resta);
		System.out.println("El valor de la multiplicación es " + multiplicacion);
		System.out.println("El valor de la division en enteros es " + divisionEntera);
		System.out.println("El valor del resto es " + resto);
		System.out.println("El valor de la divisón real es " + divisionReal);
		System.out.println("El valor del resto real es " + restoReal);

	}

}
