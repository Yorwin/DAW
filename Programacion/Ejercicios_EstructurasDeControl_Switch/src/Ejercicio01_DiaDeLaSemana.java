import java.util.Scanner;

public class Ejercicio01_DiaDeLaSemana {

	public static void main(String[] args) {
		/*
		 * Escribe un programa en Java que solicite al usuario ingresar un número del 1
		 * al 7 y muestre el día de la semana correspondiente utilizando una sentencia
		 * switch.
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indica un nro. que correspònda a un día de la semana");
		int numero = teclado.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El número que has indicado no corresponde a ningún día de la semana");
		}
		
		teclado.close();
		
	}

}
