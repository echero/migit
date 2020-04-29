package ar.edu.ort.tp2ej3;


public class Hito {
	private String fecha;
	private String descripcion;
	private String personas;
	
	public Hito(String fecha, String descripcion, String personas) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personas = personas;
	}

	public String getValor() {
		return fecha + ": " + descripcion + ". Personas involucradas: " + personas;
				
	}
	
}
