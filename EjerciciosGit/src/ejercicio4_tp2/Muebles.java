package ejercicio4_tp2;

public class Muebles {
	
	private String nombre;
	private String material;
	private String color;
	
	public Muebles(String nombre, String material, String color){
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public String getValor(){
		return nombre + " de " +material+ " color "+color;
	}

}
