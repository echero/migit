package ejercicio3_tp1;

public class Competidor {
	private String nombre;
	private double tiempo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public Competidor(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Competidor() {
		this.nombre ="";
		this.tiempo=0;
	}

	@Override
	public String toString() {
		return   nombre + ", tiempo=" + tiempo ;
	}
}
