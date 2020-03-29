package ejercicio5;

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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Anio fecha=new Anio();
		
		do {
			int mes=pedirNumeroEntre("Ingrese mes:",1,12);
			System.out.println("Mes: "+fecha.getNombreDelMes(mes));
			int dia=pedirNumeroEntre("Ingrese dia:",1,30);
			System.out.println("Cantidad de dias transcurrido en el año antes de empezar el mes: "+fecha.diasTranscurridos(mes));
			System.out.println("Dias transcurridos: " + (fecha.diasTranscurridosTotal(mes, dia)));
			
		}while(continuar());
			
	}

}
