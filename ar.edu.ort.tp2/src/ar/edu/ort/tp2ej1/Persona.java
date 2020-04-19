package ar.edu.ort.tp2ej1;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<EMail> emails;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<EMail>();
	}

	// composicion
	public void agregarEmail(String email) {
		EMail nuevoEmail = new EMail(email);
		emails.add(nuevoEmail);
	}

	// agregacion
	public void agregarTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTodo() {
		System.out.println(apellido + ", " + nombre);
		System.out.println("Telefonos:");
		if (telefonos.size() <= 0) {
			System.out.println("Sin teléfonos");
		} else {
			for (NumeroTelefonico telefono : telefonos) {
				System.out.println(telefono.getTipo() + ": " + telefono.getValor());
			}
		}
		if (emails.size() <= 0) {
			System.out.println("Sin emails");
		} else {
			for (EMail eMail : emails) {
				System.out.println("email: " + eMail.getValor());
			}
		}
	}

}
