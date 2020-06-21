package tp1.tp4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		// Completar
		try {
			System.out.println("El numero vale: " + numero);
			System.out.println("Ingrese un numero: ");
			numero = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error...Ingreso un valor no numerico");
		}finally {
			System.out.println("El numero ahora vale " + numero);
		}
		input.close();
	}

}
