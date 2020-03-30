package tp1_e5;

public class Main {

	public static void main(String[] args) {
		
//		¿Cambiaría algo si en vez de usar un Array de Strings para los nombres de los meses
//		usáramos un enumerado?
//		Creá una nueva versión de la clase Anio llamada AnioV2 que use el enum
//		Mes (interno pero público) para enumerar a los doce meses del año, y modificá lo que
//		creas conveniente.
		Integer[] cantDias = {0,31,59,90,120,151,181,212,243,273,304,334};  // guardo el result para evitar cuentas
		
		AnioV2 anio20 = new AnioV2(cantDias);
		Mes miMes = Mes.JUNIO;
		int numDia = 13;
		
		System.out.println("el numero del mes "+Mes.JUNIO+" corresponde al mes de : "+miMes.toString());
		System.out.println(" - Hay "+anio20.getCantDias(miMes.ordinal())+" días desde comienzo de año hasta el 1 de "+miMes.toString());
		System.out.println("Desde el 1 de enero al "+numDia+" de "+miMes.toString()+" hay "+(anio20.getCantDias(miMes.ordinal())+numDia));
	}
}