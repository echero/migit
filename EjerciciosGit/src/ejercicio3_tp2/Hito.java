package ejercicio3_tp2;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private String personasInvolucradas;
	
	
	public Hito() {
		fecha = "";
		descripcion = "";
		personasInvolucradas = "";
	}

	public Hito(String fecha, String descripcion, String personasInvolucradas) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = personasInvolucradas;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPersonasInvolucradas() {
		return personasInvolucradas;
	}

	public void setPersonasInvolucradas(String personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}
	
	public String getValor(){
		return this.fecha + "\n" +this.descripcion + "\n" + this.personasInvolucradas;
	}
	
	

}
