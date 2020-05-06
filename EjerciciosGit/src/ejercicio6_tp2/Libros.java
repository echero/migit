package ejercicio6_tp2;

public class Libros {
	
	private String autor;
	private String tituloLibro;
	private String editorial;
	private int stock;
	
	public Libros(String autor, String tituloLibro, String editorial, int stock) {
		this.autor = autor;
		this.tituloLibro = tituloLibro;
		this.editorial = editorial;
		this.stock = stock;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getValor(){
		return autor+", Titulo del Libro: "+tituloLibro+", Editorial: "+editorial+", Stock: "+stock;
	}

}
