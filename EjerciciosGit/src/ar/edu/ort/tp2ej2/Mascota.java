package ar.edu.ort.tp2ej2;

public class Mascota {
	String nombre;
	String animal;

	public Mascota(String nombre, String tipo) {
		this.nombre = nombre;
		this.animal = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getValor() {
		return animal + ", " + nombre;
	}

}
