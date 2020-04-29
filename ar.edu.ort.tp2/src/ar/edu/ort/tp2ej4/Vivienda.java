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

	//Composicion
	private void setDireccion(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
	}

	//Agregacion
	public void agregarPersona(Persona persona) {
		lPersonas.add(persona);
	}

	//Agregacion
	public void agregarMueble(Mueble muebles) {
		this.lMuebles.add(muebles);
	}
	
	public void mostrarDireccion() {
		System.out.println("Direccion: " + direccion.getValor());
	}
	
	public void mostrarPersonas() {
		System.out.println("Personas: ");
		if(lPersonas.size()>0) {
			for (Persona persona : lPersonas) {
				System.out.println("Nombre: " + persona.getValor());
			}
		}
	}
	public void mostrarMuebles() {
		System.out.println("Muebles: ");
		if(lPersonas.size()>0) {
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
