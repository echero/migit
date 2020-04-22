package ejercicio4_tp2;

public class Personas {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Personas(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getValor(){
		return nombre +" " +apellido+", Edad: "+edad; 
	}

}
