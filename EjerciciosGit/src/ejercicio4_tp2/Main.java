package ejercicio4_tp2;

public class Main {

	public static void main(String[] args) {
		
		Vivienda viviendaUno = new Vivienda("Pringles", 1139, 4, "b");
		
		viviendaUno.AgregarPersonas("Ezequiel", "Cherone", 32);
		viviendaUno.AgregarPersonas("Javier", "Cherone", 37);
		viviendaUno.AgregarPersonas("Daniel", "Cherone", 59);
		viviendaUno.AgregarPersonas("Graciela", "Oubiña", 64);
		
		viviendaUno.AgregarMuebles("Mesa", "madera", "gris");
		viviendaUno.AgregarMuebles("Silla", "hierro", "blanca");
		
		viviendaUno.mostrarTodo();

	}

}
