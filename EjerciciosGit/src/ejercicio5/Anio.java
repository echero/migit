package ejercicio5;

public class Anio {
	
	private int[] cantidadDias = {0,31,59,90,120,151,181,212,243,273,304,334};
	
	private enum Meses { ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;}
	
	public String getNombreDelMes(int numero){
		
		String result="";
		for(Meses miMes: Meses.values()){
			if(miMes.ordinal()==numero-1){
				result = miMes.toString();
			}
		}
		return result;
	}
	
	public int diasTranscurridos(int numeroMes) {
		return cantidadDias[numeroMes-1];
	}

	public int diasTranscurridosTotal(int numeroMes,int numeroDia) {
		return numeroDia+ diasTranscurridos(numeroMes);
	}
	
	public int[] getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int[] cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

}
