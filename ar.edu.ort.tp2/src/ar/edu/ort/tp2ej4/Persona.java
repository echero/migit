package ar.edu.ort.tp2ej4;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getValor() {
		return nombre + " " + apellido + ", Edad: " + edad;
	}
	
}
