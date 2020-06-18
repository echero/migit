package tp1.tp4;
import java.util.Scanner;

public class Ej3 {
	public static int pedirNumeroEntero() {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		boolean ok = false;
		while (!ok) {
			try {
				System.out.println("Ingrese numero:");
				numero = Integer.parseInt(input.nextLine());
				ok=true;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Hubo un error en la carga del numero: "+ e.getMessage());
			}
		}
		input.close();
		return numero;
	}
	
	public static void main(String[] args) {
		int numero = 0;
		numero = pedirNumeroEntero();
		System.out.println("El numero ingresado fue " + numero + ".");
	}



}
