package ar.edu.ort.tp2ej4;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	
	public Direccion(String calle, int altura, int piso, String departamento) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public int getPiso() {
		return piso;
	}

	public String getDepartamento() {
		return departamento;
	}


	public String getValor() {
		return calle + " " + altura + " " + piso + "º ”" + departamento + "”"; 
	}

}
