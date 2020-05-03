package ar.edu.ort.tp2.ej6;

public class Pedido {
	private int nroCompra;
	private String fechaCompra;
	private Libro libro;
	private Cliente cliente;
	
	public Pedido(int nroCompra, String fechaCompra, Libro libro, Cliente cliente) {
		this.nroCompra = nroCompra;
		this.fechaCompra = fechaCompra;
		this.libro = libro;
		this.cliente = cliente;
	}

	public Libro getLibro() {
		return libro;
	}

	@Override
	public String toString() {
		return "Pedido [nroCompra=" + nroCompra + ", fechaCompra=" + fechaCompra + ", libro=" + libro + ", cliente="
				+ cliente + "]";
	}
	
	
}
