import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose
		 * verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:
		 * 
		 * a) El primero es par y el segundo impar
		 * 
		 * b) El primero es superior al doble del segundo e inferior a 8
		 * 
		 * c) Son iguales o la diferencia entre el primero y el segundo es menor que 2
		 * 
		 * (CompararEnteros)
		 */

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe un número entre 0 y 9:");
		int primerNumero = teclado.nextInt();

		System.out.println("Escribe un número entre 0 y 9");
		int segundoNumero = teclado.nextInt();

		teclado.close();

		boolean primeroParSegundoImpar = primerNumero % 2 == 0 && segundoNumero % 2 != 0;
		System.out.println("El primero es par y el segundo impar: " + primeroParSegundoImpar);

		boolean primeroSuperiorDobleSegundo = primerNumero > segundoNumero * 2;
		boolean primeroInferiorAOcho = primerNumero < 8;
		boolean inferiorAOchoYSuperiorDoble = primeroSuperiorDobleSegundo && primeroInferiorAOcho;
		System.out
				.println("El primero es superior al doble del segundo e inferior a 8: " + inferiorAOchoYSuperiorDoble);

		boolean sonIguales = primerNumero == segundoNumero;
		boolean diferenciaMenorQueDos = Math.abs(primerNumero - segundoNumero) <= 2;
		boolean igualODiferencia = sonIguales || diferenciaMenorQueDos;

		System.out.println(
				"Son iguales o la diferencia entre el primero y el segundo es menor que 2: " + igualODiferencia);
	}

}
