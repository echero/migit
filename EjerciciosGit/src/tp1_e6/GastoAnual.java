package tp1_e6;

import java.util.ArrayList;


public class GastoAnual {

	static final int TOTAL_MESES = 12;
	
	private ArrayList<Rubro> rubros; 
	
	public GastoAnual(){
//		Es el constructor, e inicializa la colección de Rubros.
		rubros = new ArrayList<Rubro>();
	}
	public void agregarGasto(Mes mes, String nombreRubro, double importe){
//		Agrega el importe gastado al rubro que corresponda y en el mes indicado. Si el
//		rubro no se encuentra registrado en la colección se lo agregará, y cuando ya
//		exista se acumulará en este el valor del gasto. Pero debe controlarse que el
//		importe ingresado sea mayor que cero.
		Rubro miRubro=null;
		miRubro=buscarRubro(nombreRubro);
		if(miRubro==null){
			//No existe en la coleccion RUBROS
			//Lo agrego a la coleccion
//			System.out.println(" NO EXISTE ");
			miRubro=obtenerRubro(nombreRubro);
		}
		if(importe>0){
			//Agrego gasto al mes correspondiente
			miRubro.agregarGasto(mes, importe);			
		}
	}
	private Rubro obtenerRubro(String nombreRubro){   
		Rubro miRubro=null;
//		Obtiene y devuelve el Rubro a partir de su nombre. Cuando éste no exista
//		deberá crearlo.
		miRubro=buscarRubro(nombreRubro); 
		if(miRubro==null){
			//NO existe en la coleccion, hay que crearlo
			Rubro nuevoRubro = new Rubro(nombreRubro);
			this.addRubro(nuevoRubro);
//			this.rubros.add(nuevoRubro);
			miRubro=nuevoRubro;
		}		
		return miRubro;
	}
	private Rubro buscarRubro(String nombreRubro){
//		Busca y devuelve un Rubro a partir de su nombre. Cuando no lo encuentre deberá volver null.
		Rubro miRubro=null;
		int pos=0;
		while(pos<rubros.size() && miRubro==null){
			if(rubros.get(pos).getNombre().equals(nombreRubro)){
				miRubro=rubros.get(pos);
			}
			pos++;
		}
		return miRubro;
	}
	private double[][] consolidadoDeGastos(){
//		Genera un arreglo bidimensional consolidando en una sola estructura todos los
//		gastos del año. La matriz debe medir 12 (la cantidad de meses del año) por la
//		cantidad de Rubros existentes, y cada celda debe contener el importe
//		acumulado para el rubro en ese mes.
		double result[][]={};
		result = new double[TOTAL_MESES][this.rubros.size()];
		for(Mes miMes: Mes.values()){
			for(int r=0; r<this.rubros.size(); r++){
				result[miMes.ordinal()][r]=this.rubros.get(r).getTotalGastos(miMes);
//				System.out.println(rubros.get(r).getNombre()+" Gastos del mes de "+miMes.toString()+" = "+this.rubros.get(r).getTotalGastos(miMes));
			}			
		}
		return result;
	}
	public double gastoAcumulado(Mes mes){
//		Devuelve el importe del gasto acumulado en el mes indicado.
		double acum=0;
//		int mesIndicado=mes.ordinal();
		for(int r=0; r<this.rubros.size(); r++){
			acum += this.rubros.get(r).getTotalGastos(mes);
		}
		return acum;
	}
	public double gastoAcumulado(String nombreRubro){
//		Devuelve el importe del gasto acumulado en el rubro indicado. Si el rubro no
//		existe deberá devolver -1.
		double acum;
		Rubro miRubro = this.buscarRubro(nombreRubro);
		if(miRubro!=null){
			acum=0;
			for(Mes miMes: Mes.values()){
				acum += miRubro.getTotalGastos(miMes);
			}
			System.out.println(" Gastos acumu del rubro "+miRubro.getNombre()+" = "+acum);
		}else{
			acum = -1;
		}
		return acum;
	}
	public void informarConsumosPorMes(){
//		Muestra los consumos por mes 
//		(discriminado por cada rubro de gasto y	acumulado).
		double acumXrubro;
		String cadena;
		System.out.println("|:.  INFORME CONSUMO POR MES y ACUMULADO  .:|");
		System.out.println("RUBRO       MES =    ENE    FEB    MAR    ABR    MAY    JUN    JUL    AGO    SEP    OCT    NOV    DIC    ACUMULADO");
		for(int r=0; r<this.rubros.size(); r++){
			cadena = rubros.get(r).getNombre()+" ................. ";
			showCadena(cadena,0,17);
			acumXrubro=0;
			for(Mes miMes: Mes.values()){
				acumXrubro+=this.rubros.get(r).getTotalGastos(miMes);
				cadena = "    "+this.rubros.get(r).getTotalGastos(miMes);
				showCadena(cadena,(cadena.length()-7),cadena.length());
			}
			cadena = "         "+Math.round(acumXrubro * 100) / 100d;
			showCadena(cadena,(cadena.length()-12),cadena.length());
			System.out.println();
		}			
	}
	public void informarPromedioMensualPorRubro(){
//		Muestra los consumos promedio por mes en cada rubro.
		double acumXrubro;
		double promMensual;
		String cadena;
		System.out.println();
		System.out.println("|:.  INFORME PROMEDIO MENSUAL POR RUBRO  .:|");
		System.out.println("RUBRO           PROMEDIO MENSUAL ");
		for(int r=0; r<this.rubros.size(); r++){
			cadena = rubros.get(r).getNombre()+" ................. ";
			showCadena(cadena,0,17);
			acumXrubro=0;
			for(Mes miMes: Mes.values()){
				acumXrubro+=this.rubros.get(r).getTotalGastos(miMes);
//				cadena = "    "+this.rubros.get(r).getTotalGastos(miMes);
//				showCadena(cadena,(cadena.length()-7),cadena.length());
			}
			promMensual = acumXrubro/TOTAL_MESES;
			cadena = "         "+Math.round(promMensual * 100) / 100d;
			showCadena(cadena,(cadena.length()-12),cadena.length());
			System.out.println();
		}			
	}
	public void informarMesMayorConsumo(){
		System.out.println();
		System.out.println("|:.  INFORME MES MAYOR CONSUMO  .:|");
//		Calcula y muestra nombre e importe acumulado del mes con mayor consumo
//		total (puede ser uno o más de uno).
		double max=-1;
		double acumMes;
		//  Busco máximo
		for(Mes miMes: Mes.values()){
			acumMes=0;
			for(int r=0; r<this.rubros.size(); r++){
				acumMes+=this.rubros.get(r).getTotalGastos(miMes);
			}
			if(acumMes>max){
				max=acumMes;	
			}
		}
		// Ya tengo máximo,  ahora muestro los que coinciden.
		for(Mes miMes: Mes.values()){
			acumMes=0;
			for(int r=0; r<this.rubros.size(); r++){
				acumMes+=this.rubros.get(r).getTotalGastos(miMes);
			}
			if(acumMes==max){
				System.out.println(miMes.toString()+" = "+acumMes);
//				max=acumMes;	
			}
		}
	}
	public void addRubro(Rubro r){
//		System.out.println(" Nuevo rubro agregado ");
		this.rubros.add(r);
	}
	private void showCadena(String cadena, int desde, int hasta){
	    System.out.print(cadena.substring(desde,hasta));
	}
}
