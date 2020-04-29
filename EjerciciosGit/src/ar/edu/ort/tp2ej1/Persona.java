package ar.edu.ort.tp2ej1;

import java.util.ArrayList;

import ar.edu.ort.tp2ej2.Mascota;
import ar.edu.ort.tp2ej3.Hito;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> lTelefonos;
	private ArrayList<EMail> lEmails;
	private ArrayList<Mascota> lMascotas;
	private ArrayList<Hito> lHitos;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		lTelefonos = new ArrayList<NumeroTelefonico>();
		lEmails = new ArrayList<EMail>();
		lMascotas = new ArrayList<Mascota>();
		lHitos = new ArrayList<Hito>();
	}

	// composicion
	public void agregarEmail(String email) {
		EMail nuevoEmail = new EMail(email);
		lEmails.add(nuevoEmail);
	}

	// agregacion
	public void agregarTelefono(NumeroTelefonico telefono) {
		lTelefonos.add(telefono);
	}

	// composicion
	public void agregarMascota(String nombre, String tipo) {
		Mascota nuevaMascota = new Mascota(nombre, tipo);
		lMascotas.add(nuevaMascota);
	}
	
	// agregacion
	public void agregarHito(Hito hito) {
		lHitos.add(hito);
	}

	public void mostrarTodo() {
		System.out.println(apellido + ", " + nombre);
		System.out.println("Telefonos:");
		if (lTelefonos.size() <= 0) {
			System.out.println("Sin teléfonos");
		} else {
			for (NumeroTelefonico telefono : lTelefonos) {
				System.out.println(telefono.getTipo() + ": " + telefono.getValor());
			}
		}
		if (lEmails.size() <= 0) {
			System.out.println("Sin emails");
		} else {
			for (EMail eMail : lEmails) {
				System.out.println("email: " + eMail.getValor());
			}
		}

	}

	public void mostrarTodoConMascota() {
		mostrarTodo();

		System.out.println("Mascotas:");
		if (lMascotas.size() <= 0) {
			System.out.println("Sin mascotas");
		} else {

			for (Mascota mascota : lMascotas) {
				System.out.println(mascota.getValor());
			}
		}
	}
	public void mostrarTodoConHitos() {
		mostrarTodoConMascota();
		System.out.println("Hitos:");
		if(lHitos.size() <= 0) {
			System.out.println("Sin hitos");
		}else {
			for(Hito hito: lHitos) {
				System.out.println(hito.getValor());
			}
		}
	}

}
