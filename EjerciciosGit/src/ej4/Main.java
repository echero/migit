package ej4;
import java.util.Scanner;

public class Main {
	static public Scanner input= new Scanner(System.in);
	
	public static int pedirNumeroEntre(String mensaje, int min, int max) {
		int numero;
		do {
			System.out.print(mensaje);
			numero = input.nextInt();
			input.nextLine();
			} while(numero<min || numero>max);
		
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
		// TODO Apéndice de método generado automáticamente
		Anio fecha=new Anio();
		
		do {
			int mes=pedirNumeroEntre("Ingrese mes:",1,12);
			int dia=pedirNumeroEntre("Ingrese dia:",1,30);
			System.out.println("Días transcurridos: " + (fecha.diasTranscurridosTotal(mes, dia)));
			
		}while(continuar());
			
	}

}
