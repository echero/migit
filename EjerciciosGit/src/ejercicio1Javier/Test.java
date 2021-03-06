package ejercicio1Javier;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		String cadena;
		cadena = ingresaString("Ingrese el nombre del grupo: ");
		Grupo g = new Grupo(cadena);
		do {
			
			opcion=ingreseNumero(0, 9, menu());
			switch (opcion) {
			case 1:
				System.out.println(g.getNombre());
				break;
			case 2:
				System.out.println(g.getCantidadIntegrantes());
				break;
			case 3:
				cadena = ingresaString("Ingrese el nombre del integrante: ");
				g.agregarIntegrante(cadena);
				break;
			case 4:
				int posicion;
				System.out.print("Posicion: ");
				posicion = input.nextInt();
				System.out.println(g.obtenerIntegrante(posicion));
				input.nextLine();
				break;
			case 5:
				cadena = ingresaString("Ingrese el nombre del integrante: ");
				System.out.println(g.buscarIntegrante(cadena));
				break;
			case 6:
				cadena = ingresaString("Ingrese el nombre del integrante a eliminar: ");
				System.out.println(g.removerIntegrante(cadena));
				break;
			case 7:
				g.mostrar();
				break;
			case 8:
				g.vaciar();
			break;

			default:
				break;
			}
			System.out.println("\n"+"\n");
		}while(opcion!=0);
		
		input.close();

	}
	public static String menu() {
		return    "1 - Mostrar nombre del grupo \n"
				+ "2 - Ver cantidad de integrantes \n"
				+ "3 - Agregar integrante al grupo \n"
				+ "4 - Ver integrante perteneciente a una posicion \n"
				+ "5 - Buscar integrante \n"
				+ "6 - Remover integrante por nombre \n"
				+ "7 - Ver datos del grupo \n"
				+ "8 - Remover todos los integrantes \n"
				+ "0 - Salir \n"
				+ "Ingrese opcion: ";
	}
	public static int ingreseNumero(int min, int max, String mje) {
		int valor;
		do {
			System.out.print(mje);
			valor = input.nextInt();
		}while(valor<min||valor>max);
		input.nextLine();
		return valor;
	}
	public static boolean pregunta(String mje) {
		boolean respuesta = false;
		char continua;
		do {
			System.out.println(mje);
			continua = input.nextLine().toLowerCase().charAt(0);
		}while(continua!='s' && continua!='n');
		if(continua=='s')
			respuesta = true;
		return respuesta;
	}
	public static String ingresaString(String mje) {
		String cadena;
		System.out.print(mje);
		cadena = input.nextLine();
		return cadena;
	}

}
