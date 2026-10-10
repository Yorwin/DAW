
public class Libro {
	String titulo;
	String autor;
	int paginas;

	public Libro() {
		this.titulo = "Sin titulo";
		this.autor = "Autor desconocido";
		this.paginas = 0;
	}

	public Libro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

}
