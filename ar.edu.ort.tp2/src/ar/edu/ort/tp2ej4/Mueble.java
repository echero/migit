package ar.edu.ort.tp2ej4;

public class Mueble {
	private String nombre;
	private String material;
	private Color color;
	
	public Mueble(String nombre, String material, Color color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public String getValor() {
		return nombre + " de " + material + " color " + color;
	}
	
}
