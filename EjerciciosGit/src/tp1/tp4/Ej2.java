package tp1.tp4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		System.out.println("La variable \"numero\" actualmente vale " + numero + ".");
		boolean hayError = true;
		do {
			try {
				System.out.println("Ingrese un nuevo valor para \"numero\":");
				numero = input.nextInt();
				hayError = false;
			} catch (InputMismatchException e) {
				System.out.println("Error...Ingreso un valor no numerico");
				input.nextLine();
			}finally {
				System.out.println("El numero ahora vale " +numero);
			}
		}while(hayError);
		
		input.close();
	}

}
