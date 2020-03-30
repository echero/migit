package tp1_e6;


public class Main {
	public static void main(String[] args) {
		GastoAnual anio20 = new GastoAnual();
		
		Mes miMes;
		miMes = Mes.ENERO;
		anio20.agregarGasto(miMes,"Arandelas", 115.11);
		miMes = Mes.FEBRERO;
		anio20.agregarGasto(miMes,"Arandelas", 5.11);
		miMes = Mes.MARZO;
		anio20.agregarGasto(miMes,"Arandelas", 35.11);
		
		miMes = Mes.ENERO;
		anio20.agregarGasto(miMes,"Bolsillos", 1.11);
		miMes = Mes.FEBRERO;
		anio20.agregarGasto(miMes,"Bolsillos", 2.22);
		miMes = Mes.MARZO;
		anio20.agregarGasto(miMes,"Bolsillos", 3.33);
		miMes = Mes.ABRIL;
		anio20.agregarGasto(miMes,"Bolsillos", 4.44);
		miMes = Mes.MAYO;
		anio20.agregarGasto(miMes,"Bolsillos", 5.55);
		miMes = Mes.JUNIO;
		anio20.agregarGasto(miMes,"Bolsillos", 6.66);
		
		miMes = Mes.JULIO;
		anio20.agregarGasto(miMes,"Tornillos", 15.10);
				
		miMes = Mes.AGOSTO;
		anio20.agregarGasto(miMes,"Parlantes", 30.22);

		miMes = Mes.SEPTIEMBRE;
		anio20.agregarGasto(miMes,"Mantenimiento", 45.30);

		miMes = Mes.OCTUBRE;
		anio20.agregarGasto(miMes,"Impuestos", 99.45);
		
		anio20.informarConsumosPorMes();
		System.out.println();
		anio20.informarPromedioMensualPorRubro();
		anio20.informarMesMayorConsumo();
	}
}