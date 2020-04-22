package ejercicio3_tp2;

public class Main {

	public static void main(String[] args) {
		
		NumeroTelefonico numero1 = new NumeroTelefonico(4, 7988696, 054, TipoDeLinea.CELULAR);
		NumeroTelefonico numero2 = new NumeroTelefonico(4, 7988696, 054, TipoDeLinea.FAX);
		NumeroTelefonico numero3 = new NumeroTelefonico(4, 7988696, 054, TipoDeLinea.FIJO);
		
		Persona p = new Persona("Cherone", "Ezequiel");
		p.agregarEmail("chero2005@hotmail.com");
		p.agregarEmail("ezequielcherone@gmail.com");
		p.agregarMascota("teito", "Perro");
		p.agregarMascota("branca", "Gato");
		p.agregarMascota("napoleon", "Perro");
		p.agregarTelefono(numero1);
		p.agregarTelefono(numero2);
		p.agregarTelefono(numero3);
		
		Hito hito1 = new Hito("22/02/2020", "Anduve en Mountain Bike por primera ves.", "Ibel Atela");
		Hito hito2 = new Hito("219/09/1987", "Nacimiento mio", "Daniel Angel Cherone, Graciela Alicia Oubiña, Javier Hernan Cherone");
		p.agregarHito(hito1);
		p.agregarHito(hito2);
		
		Persona p2 = new Persona("Pablo", "Pinto");
		p2.agregarEmail("papintix@hotmail.com");
		p2.agregarMascota("chacho", "Pajaro");
		p2.agregarTelefono(numero3);
		p2.utilzarHito(hito1, "Carlos Vives");

		p.mostrarTodo();
		System.out.println();
		p2.mostrarTodo();
		//System.out.println();
		//p.eliminarDatos("c");
		//p.mostrarTodo();

	}

}
