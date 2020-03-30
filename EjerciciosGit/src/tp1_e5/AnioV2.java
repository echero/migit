package tp1_e5;

public class AnioV2 {
	private Integer[ ] cantDias;
	
	public AnioV2(Integer[] cantDias){
		this.cantDias = cantDias;
	}
	public int getCantDias(int numeroMes) {
		return this.cantDias[numeroMes];
	}
	public String getNombreDelMes(int numeroMes){
//		Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
//		cuestión.
		String result="";
		for(Mes miMes: Mes.values()){  // Busco que MES corresponde a la posicion de numeroMes
			if(miMes.ordinal()==numeroMes){
				result = miMes.toString(); // ENCONTRE EL MES BUSCADO !!!
			}			
		}
		return result;
	}
	public int diasTranscurridos(int numeroMes){
//		Recibe el número de mes (entre 1 y 12) y devuelve la cantidad de días transcurridos en el
//		año antes de comenzar el mes en cuestión.
		int result = 0;
		System.out.println("Desde el 1 de enero al 1 de "+getNombreDelMes(numeroMes-1));
		for(int i=numeroMes-2; i>=0; i--){
			System.out.println("Acumulo result "+result+" + "+this.getCantDias(i));
			result += this.getCantDias(i);
		}
		return result;
	}
}
