package ar.edu.ort.tp5.ej3;

public class Instruccion {
	private String instruccion;

	public Instruccion(String instruccion) {
		this.instruccion = instruccion;
	}

	public String getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}

	@Override
	public String toString() {
		return "Instruccion [instruccion=" + instruccion + "]";
	}
	
	
}
