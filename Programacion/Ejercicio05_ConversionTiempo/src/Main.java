
public class Main {

	public static void main(String[] args) {
		/*
		 * Hágase un programa que convierta segundos en horas, minutos y
		 * segundos.(Segundos)
		 * 
		 * ENTRADA/SALIDA*
		 * 
		 * Número de segundos: **24973**
		 * 
		 * Horas: 6
		 * 
		 * Minutos: 56
		 * 
		 * Segundos: 13
		 */

		final int SEGUNDOS_TOTALES = 24973;

		// Declaración constantes.

		final int SEGUNDOS_EN_HORA = 3600;
		final int MINUTOS_EN_HORA = 60;

		// Hora
		int horas = SEGUNDOS_TOTALES / SEGUNDOS_EN_HORA;

		// Minutos
		int segundosRestantes = SEGUNDOS_TOTALES % SEGUNDOS_EN_HORA;
		int minutos = segundosRestantes / MINUTOS_EN_HORA;

		// Segundos
		int segundos = segundosRestantes % MINUTOS_EN_HORA;

		System.out.println("Número de segundos: " + SEGUNDOS_TOTALES);
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);
	}

}
