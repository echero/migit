package ar.edu.ort.tp2ej6;

public class Libro {
	private String Autor;
	private String titulo;
	private String editorial;
	
	public Libro(String autor, String titulo, String editorial) {
		Autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	public String getAutor() {
		return Autor;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Libro [Autor=" + Autor + ", titulo=" + titulo + ", editorial=" + editorial + "]";
	}
	
	

}
