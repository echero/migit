package ar.edu.ort.tp2ej3;

import ar.edu.ort.tp2ej1.NumeroTelefonico;
import ar.edu.ort.tp2ej1.Persona;
import ar.edu.ort.tp2ej1.TipoDeLinea;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Lionel", "Messi");
		NumeroTelefonico num1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico num2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico num3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);

		p.agregarEmail("lio@messi.com.ar");
		p.agregarTelefono(num1);
		p.agregarTelefono(num2);
		p.agregarTelefono(num3);
		p.agregarMascota("Pluto", "Perro");
		p.agregarMascota("Felix", "Gato");
		p.agregarMascota("Bugs", "Conejo");
		
		Hito h1 = new Hito("16/11/2007", "Nacimiento primer hijo","Mateo, Antonella, abuelos");
		Hito h2 = new Hito("Junio 2014", "Mundial de Brasil", "Alejandro Sabella,Jugadores");
		Persona p2 = new Persona("Alejandro", "Sabella");
		p.agregarHito(h1);
		p.agregarHito(h2);
		p2.agregarHito(h2);
		
		p.mostrarTodoConHitos();
		p2.mostrarTodoConHitos();

	}

}
