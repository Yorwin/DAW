
public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una clase Rectangulo con los atributos base (double) y altura (double).
		 * Define dos constructores:
		 * 
		 * - Uno que reciba base y altura. - Otro que reciba una única medida y la
		 * asigne tanto a base como a altura, para representar un cuadrado.
		 * 
		 * Desde main, crea un rectángulo de base 5.0 y altura 3.0, y un cuadrado de
		 * lado 4.0. Muestra sus dimensiones y calcula sus áreas directamente en main,
		 * sin añadir métodos a Rectangulo.
		 */

		Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
		double areaRectangulo = rectangulo.altura * rectangulo.base;

		Rectangulo cuadrado = new Rectangulo(4.0, 4.0);
		double areaCuadrado = cuadrado.altura * cuadrado.base;

		System.out.printf("Rectángulo: base %.1f - altura %.1f\n", rectangulo.base, rectangulo.altura);
		System.out.println("Area del rectángulo: " + areaRectangulo);

		System.out.printf("Rectángulo: base %.1f - altura %.1f\n", cuadrado.base, cuadrado.altura);
		System.out.println("Area del cuadro: " + areaCuadrado);
	}

}
