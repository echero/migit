package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner input= new Scanner(System.in);
	
	public static String pedirCadena(String mensaje) {
		String cadena;
		
		System.out.println(mensaje);
		cadena = input.nextLine();
		return cadena;
	}
	
	public static double pedirDouble(String mensaje) {
		double numero;
		do {
			System.out.println(mensaje);
			numero= input.nextDouble();
			input.nextLine();
			
		}while(numero<0);
		return numero;
	}
	
	public static boolean continuar() {
		String cadena;
		boolean opcion=false;
		do {
			System.out.println("Desea continuar(s/n): ");
			cadena= input.nextLine();
		}while(!cadena.equals("s")&&!cadena.equals("n"));
		
		if(cadena.equals("s")) {
			opcion=true;
		}
		return opcion;
	}
	
	public static void main(String[] args) {
		
		
		String nombre;
		double tiempo;
		ArrayList<Competidor> competidores= new ArrayList<>();
		
		do {
			nombre=pedirCadena("Ingrese el nombre del jugador:");
			tiempo=pedirDouble("Ingrese el tiempo:");
			Competidor competidores1=new Competidor(nombre,tiempo);
			competidores.add(competidores1);
			
		}while(continuar());
		
		
		Competencia miCarrera= new Competencia(competidores);
		
		miCarrera.calcularPrimerPuesto();
		miCarrera.calcularSegundoPuesto();
		miCarrera.calcularTercerPuesto();
		
		
		System.out.println(miCarrera.toString());

	}

}

