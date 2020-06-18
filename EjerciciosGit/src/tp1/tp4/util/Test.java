package tp1.tp4.util;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int numero = 0;
		int nacimiento = 0;
		int fallecimiento=0;
		Scanner input = new Scanner(System.in);
		LectorEnteros le = new LectorEnteros(input);
		int anioActual = Year.now().getValue();
		// Completar

		try {
			numero = le.pedir();
			nacimiento = le.pedir("Ingrese fecha de naciemiento: ", 1900, anioActual);
			fallecimiento = le.pedir("Ingrese fecha de fallecimiento: ", nacimiento, anioActual); 
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("No ingres� un n�mero");
		}
		/*
		try {
			le.pedir("Ingrese un n�mero entero");
		} catch (InputMismatchException e) {
			System.out.println("Debi� ingresar un n�mero");
		}
		input.nextLine();
		try {
			RangoDeEnteros re = new RangoDeEnteros(1,10);
			le.pedir("",re);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} 
		le.pedir("Ingrese la nota del alumno",0,10);
		*/
		input.close();
	}
}
