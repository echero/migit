package tp1.tp4.util;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "No puede estar vacio el campo ingresado";
	private static final String MENSAJE_ERROR_RANGO_NULL = "El rango no debe ser null.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_ERROR_CARGA = "Error en la carga! ";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private static final String MASCARA_MENSAJE_CARGA_ENTERO = "%s:";
	private static final String MASCARA_MENSAJE_RANGO = "%s(entre %d y %d):";
	private static final String MASCARA_MENSAJE_RANGO_CON_FIN = "%s (entre %d y %d, %d para abandonar la carga):";

	private Scanner scanner;


	public LectorEnteros(Scanner scanner) {
		//Completar
		if (scanner== null){
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}
	
	private int cargar(String mensaje) {
		System.out.printf(MASCARA_MENSAJE_CARGA_ENTERO, mensaje);
		int numero = Integer.parseInt(scanner.nextLine());
		return numero;
	}

	public int pedir(String mensaje) {
		int num = 0;
		boolean ok = false;

		// Completar
		System.out.println(mensaje);
		num = scanner.nextInt();
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) {
		int num = 0;
		// Completar
		if (rangoValido == null)
			throw new NullPointerException(MENSAJE_ERROR_RANGO_NULL);
		if ( mensaje.equals("") )
			throw new NullPointerException();
		do {
			num = pedir(mensaje);
		}while((num<rangoValido.getLimiteInferior() || num>rangoValido.getLimiteSuperior()) && num!=-1);

		return num;
	}

	public int pedir(String mensaje, int limiteA, int limiteB)  {
		// Completar
		int num = 0;
		RangoDeEnteros rv = new RangoDeEnteros(limiteA, limiteB);
		num = pedir(String.format(MASCARA_MENSAJE_RANGO,mensaje,rv.getLimiteInferior(),rv.getLimiteSuperior()),rv);
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rango, int valorFinCarga) {
		int num = 0;
		// Completar
		num = pedir(mensaje, rango);
		if( num == valorFinCarga )
			//System.out.println("La edad es: " +(rango.getLimiteSuperior()-rango.getLimiteInferior()));
			System.out.println("La persona aun vive");
			
		return num;
	}
// OPCIONALES 
	public int pedir() {
		int num = 0;
		// Completar
		num = cargar(MENSAJE_CARGA_ENTERO);
		return num;
	}
	public int pedir(String mensaje, int limiteA, int limiteB, int valorFinCarga) {
		// Completar
		int num = 0;
		RangoDeEnteros re = new RangoDeEnteros(limiteA,limiteB);
		num = pedir(mensaje,re,valorFinCarga);
		return num;
	}

	/*public int pedir(String mensaje, RangoDeEnteros rango, int valorFinCarga) {
		int num = 0;
		// Completar
		return num;
	}*/
}
