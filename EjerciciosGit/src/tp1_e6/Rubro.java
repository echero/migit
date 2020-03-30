package tp1_e6;

public class Rubro {
//	private int[] TOTAL_MESES1 = new int[12];
	private int TOTAL_MESES = 12;
	private String nombre;
	private double[] gastosPorMes;


	
	public Rubro(String nombre){
//		Es el constructor. Recibe el nombre o descripción del rubro. 
//		Debe inicializar el	arreglode importes.
		this.nombre = nombre;
		this.gastosPorMes = new double[12];
		this.inicializarGastos();
	}
	private void inicializarGastos(){
//		Inicializa el arreglo de importes.
		for(int p=0; p<TOTAL_MESES; p++){
			this.gastosPorMes[p] = 0;
		}
	}
	public void agregarGasto(Mes mes, double importe){
//		Acumula el importe en la posición correspondiente al mes indicado.
		this.gastosPorMes[mes.ordinal()] += importe;
	}
	public String getNombre(){
//		Devuelve el nombre del Rubro.
		return this.nombre;
	}
	public double getTotalGastos(Mes mes){
//		Devuelve el importe acumulado de gastos para el mes indicado.
		return this.gastosPorMes[mes.ordinal()];
	}
}
