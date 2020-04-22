package ejercicio3_tp2;

import java.util.ArrayList;

public class Persona {
	
	private String apellido;
	private String nombre;
	private ArrayList <NumeroTelefonico> nTelefonos;
	private ArrayList <Email> nEmail;
	private ArrayList <Mascotas> nMascotas;
	private ArrayList <Hito> nHito;
	
	
	public Persona(String apellido, String nombre) {
		
		this.apellido = apellido;
		this.nombre = nombre;
		nTelefonos = new ArrayList<NumeroTelefonico>();
		nEmail = new ArrayList<Email>();
		nMascotas = new ArrayList<Mascotas>();
		nHito = new ArrayList<Hito>();
		
	}
	
	//COMPOSICION
	public void agregarEmail(String email){
		Email mail = new Email(email);
		nEmail.add(mail);
	}
	
	//AGREGACION
	public void agregarTelefono(NumeroTelefonico numero){
		nTelefonos.add(numero);
	}
	
	//COMPOSICION
	public void agregarMascota(String nombre, String tipoMascota){
		Mascotas mascotas = new Mascotas(nombre, tipoMascota);
		nMascotas.add(mascotas);
	}
	
	//AGREGACION
	public void agregarHito(Hito hito){
		nHito.add(hito);
	}
	
	public void eliminarDatos(String letra){
		switch(letra){
		case "a": for(int i=0; i<=nTelefonos.size(); i++){
				     nTelefonos.remove(i=0);
					}
		break;
		case "b": for(int i=0; i<=nEmail.size(); i++){
					nEmail.remove(i=0);
					}
		break;
		case "c": for(int i=0; i<=nMascotas.size(); i++){
		     		nMascotas.remove(i=0);
					}
		break;
		}
	}
	
	public void utilzarHito(Hito hito, String personas){
		
		hito.setPersonasInvolucradas(personas);
		nHito.add(hito);
	}
	
	public void mostrarTodo(){
		System.out.println(this.apellido+", "+this.nombre);
		System.out.println("Telefonos:");
		if(nTelefonos.size()<=0){
			System.out.println("No tiene telefonos");
		}
		NumeroTelefonico telefono;
		for(int i=0; i<nTelefonos.size(); i++){
			telefono = nTelefonos.get(i);
			System.out.println(telefono.getTipo()+": "+telefono.getValor());
		}
		
		System.out.println("Email: ");
		if(nEmail.size()<=0){
			System.out.println("No tiene Email");
		}
		Email email;
		for(int i=0; i<nEmail.size(); i++){
			email = nEmail.get(i);
			System.out.println(email.getValor());
		}
		
		System.out.println("Mascotas: ");
		if(nMascotas.size()<=0){
			System.out.println("No tiene Mascotas");
		}
		Mascotas mascotas;
		for(int i=0; i<nMascotas.size(); i++){
			mascotas = nMascotas.get(i);
			System.out.println(mascotas.getValor());
		}
		
		System.out.println("Hitos: ");
		if(nHito.size()<=0){
			System.out.println("No tiene Hito");
		}
		Hito hitos;
		for(int i=0; i<nHito.size(); i++){
			hitos = nHito.get(i);
			System.out.println(hitos.getValor());
		}
	}
	

}
