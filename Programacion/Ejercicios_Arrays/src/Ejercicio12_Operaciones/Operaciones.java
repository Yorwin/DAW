package Ejercicio12_Operaciones;

import java.util.Arrays;

public class Operaciones {
	private int[] numeros;

	public Operaciones() {
	}

	public Operaciones(int numero) {
		numeros = new int[numero];
	}

	// modificacion - rellenado de datos
	public void rellenarDatos() {
		for (int i = 0; i < numeros.length; i++) {
			int aleatorio;
			do {
				aleatorio = (int) (Math.random() * (numeros.length + 10));
			} while (estaNumero(aleatorio));
			numeros[i] = aleatorio;
		}
	}

	// sustituid valores -> el usuario indica un valor, en caso de estar se
	// sustituye por otro que indique el usuario
	public void cambiarNumeros(int nCambiar, int nCambio) {
		for (int i = 0; i < numeros.length; i++) {
			/*
			 * if (numeros[i] == nCambiar) { numeros[i] = nCambio; }
			 */
			numeros[i] = nCambiar == numeros[i] ? nCambio : numeros[i];
		}
	}

	// busqueda en array
	public boolean estaNumero(int numero) {
		for (int item : numeros) {
			if (item == numero)
				return true;
		}

		return false;
	}

	public void invertir() {

		int mitadPivote = numeros.length / 2;

		for (int i = 0; i < mitadPivote; i++) {
			int valorActual = numeros[i];
			int ultimaPosicion = (numeros.length - 1) - i;
			numeros[i] = numeros[ultimaPosicion];
			numeros[ultimaPosicion] = valorActual;
		}
	}

	public void ordenar() {
		Arrays.sort(numeros);
	}

	public void rotarIzq() {
		int aux = numeros[0];
		for (int i = 0; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i + 1];
		}
		numeros[numeros.length - 1] = aux;
	}

	public void rotarDer() {
		int aux = numeros[numeros.length - 1];

		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}

		numeros[0] = aux;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
}