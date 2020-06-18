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
			System.out.println("No ingresó un número");
		}
		/*
		try {
			le.pedir("Ingrese un número entero");
		} catch (InputMismatchException e) {
			System.out.println("Debió ingresar un número");
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
