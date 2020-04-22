package ejercicio4_tp2;

import java.util.ArrayList;

public class Vivienda {
	
	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	private ArrayList<Personas> nPersonas;
	private ArrayList<Muebles> nMuebles;
	
	public Vivienda(String calle, int altura, int piso, String departamento){
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
		nPersonas = new ArrayList<Personas>();
		nMuebles = new ArrayList<Muebles>();
	}
	
	public void AgregarPersonas(String nombre, String apellido, int edad){
		Personas persona = new Personas(nombre, apellido, edad);
		nPersonas.add(persona);
	}
	
	public void AgregarMuebles(String nombre, String material, String color){
		Muebles mueble = new Muebles(nombre, material, color);
		nMuebles.add(mueble);
	}
	
	public void mostrarTodo(){
		
		System.out.println("Vivienda 1:");
		System.out.print("Direccion: " +this.calle+" "+this.altura+" "+this.piso+"º'"+this.departamento+"'");
		System.out.println("Personas:");
		
		if(nPersonas.size()==0){
			System.out.println("No hay personas cargadas.");
		}
		Personas persona;
		for(int i=0; i<nPersonas.size(); i++){
			persona = nPersonas.get(i);
			System.out.print("Nombre: "+persona.getValor());
			System.out.println();
		}
		System.out.println("Muebles:");
		if(nMuebles.size()==0){
			System.out.println("No hay muebles cargados");
		}
		
		Muebles mueble;
		for(int i=0; i<nMuebles.size(); i++){
			mueble = nMuebles.get(i);
			System.out.println(mueble.getValor());
		}
		
	}
	

}
