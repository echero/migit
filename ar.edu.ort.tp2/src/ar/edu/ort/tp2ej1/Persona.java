package ar.edu.ort.tp2ej1;

import java.util.ArrayList;

import ar.edu.ort.tp2ej2.Mascota;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<EMail> emails;
	private ArrayList<Mascota> mascotas;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<EMail>();
		mascotas = new ArrayList<Mascota>();
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

	// composicion
	public void agregarMascota(String nombre, String tipo) {
		Mascota nuevaMascota = new Mascota(nombre, tipo);
		mascotas.add(nuevaMascota);
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

	public void mostrarTodoConMascota() {
		mostrarTodo();

		System.out.println("Mascotas:");
		if (mascotas.size() <= 0) {
			System.out.println("Sin mascotas");
		} else {

			for (Mascota mascota : mascotas) {
				System.out.println(mascota.getValor());
			}
		}
	}

}
