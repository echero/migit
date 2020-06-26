package ar.edu.ort.tp5.ej2;

public class Jugador {
	private String nombre;
	private String apellido;
	private int camisetaNro;
	
	public Jugador(String nombre, String apellido, int camisetaNro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.camisetaNro = camisetaNro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCamisetaNro() {
		return camisetaNro;
	}

	public void setCamisetaNro(int camisetaNro) {
		this.camisetaNro = camisetaNro;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", camisetaNro=" + camisetaNro + "]";
	}
	
	
}
