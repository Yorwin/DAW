
public class Jugador {
	String nombre;
	int nivel;
	int puntuacion;

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.nivel = 1;
		this.puntuacion = 0;
	}

	public Jugador(String nombre, int nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntuacion = 0;
	}

	public Jugador(String nombre, int nivel, int puntuacion) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntuacion = puntuacion;
	}

}
