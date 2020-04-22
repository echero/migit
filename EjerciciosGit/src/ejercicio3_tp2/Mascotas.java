package ejercicio3_tp2;

public class Mascotas {
	
	private String nombre;
	private String tipoAnimal;
	
	public Mascotas(String nombre, String tipoAnimal){
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
	}
	
	public String getValor(){
		return tipoAnimal+", "+nombre;
	}

}
