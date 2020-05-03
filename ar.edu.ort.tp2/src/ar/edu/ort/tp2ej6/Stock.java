package ar.edu.ort.tp2ej6;

public class Stock {
	private Libro libro;
	private int cantdidadDisponible;
	
	public Stock(Libro libro, int cantidadDisponible) {
		this.libro = libro;
		this.cantdidadDisponible = cantidadDisponible;
	}

	public Libro getLibro() {
		return this.libro;
	}
	
	public int getCantidadDisponible() {
		return this.cantdidadDisponible;
	}
	
	public boolean reservarLibro() {
		boolean resultadoReserva = false;
		if(hayStock()) {
			actualizarStock();
			resultadoReserva = true;
		}
		return resultadoReserva;
			
	}
	
	public void actualizarCantLibros(int cantidad) {
		if(cantidad>0)
			this.cantdidadDisponible+=cantidad;
	}
	
	private boolean hayStock() {
		return (this.cantdidadDisponible>0)?true:false;
		/*boolean hayStock = false;
		if(cantidad <= this.cantdidadDisponible)
			hayStock = true;
		return hayStock;*/
	}
	
	private void actualizarStock() {
		//this.cantdidadDisponible-=cantidad;
		this.cantdidadDisponible--;
	}

	@Override
	public String toString() {
		return "Stock [libro=" + libro + ", cantdidadDisponible=" + cantdidadDisponible + "]";
	}
	
}
