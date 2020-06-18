package tp1.tp4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero = 0;
		// Completar
		try {
			System.out.println("El numero vale: " + numero);
			System.out.println("Ingrese un número: ");
			numero = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Ingreso un valor no numérico");
		}finally {
			System.out.println("El numero ahora vale " + numero);
		}
		input.close();
	}

}
