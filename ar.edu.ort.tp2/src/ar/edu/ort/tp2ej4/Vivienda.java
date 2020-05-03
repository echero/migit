package ar.edu.ort.tp2ej4;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> lPersonas;
	private ArrayList<Mueble> lMuebles;

	public Vivienda(String calle, int altura, int piso, String departamento) {
		super();
		setDireccion(calle, altura, piso, departamento);
		this.lPersonas = new ArrayList<Persona>();
		this.lMuebles = new ArrayList<Mueble>();
	}

	public int getPiso() {
		return this.direccion.getPiso();
	}

	public String getDepartamento() {
		return this.direccion.getDepartamento();
	}

	public ArrayList<Persona> getlPersonas() {
		return lPersonas;
	}

	public ArrayList<Mueble> getlMuebles() {
		return lMuebles;
	}

	// Composicion
	private void setDireccion(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
	}

	// Agregacion
	public void agregarPersona(Persona persona) {
		lPersonas.add(persona);
	}

	// Agregacion
	public void agregarMueble(Mueble mueble) {
		this.lMuebles.add(mueble);
	}

	public void mostrarDireccion() {
		System.out.println("Direccion: " + direccion.getValor());
	}

	public void deshabitar() {
		this.lMuebles.clear();
	}

	public void desamueblar() {
		this.lPersonas.clear();
	}

	public int cantPersonas() {
		return this.lPersonas.size();
	}

	public void mostrarPersonas() {
		System.out.println("Personas: ");
		if (lPersonas.size() > 0) {
			for (Persona persona : lPersonas) {
				System.out.println("Nombre: " + persona.getValor());
			}
		}
	}

	public void mostrarMuebles() {
		System.out.println("Muebles: ");
		if (lMuebles.size() > 0) {
			for (Mueble mueble : lMuebles) {
				System.out.println(mueble.getValor());
			}
		}
	}

	public void mostrarTodo() {
		mostrarDireccion();
		mostrarPersonas();
		mostrarMuebles();
	}

}
