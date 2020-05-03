package ar.edu.ort.tp2.ej6;

public class Cliente {
	private String nombreApellido;
	private int dni;
	private String email;
	private String direccionEnvio;
	
	public Cliente(String nombreApellido, int dni, String email, String direccionEnvio) {
		super();
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		this.email = email;
		this.direccionEnvio = direccionEnvio;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public int getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	@Override
	public String toString() {
		return "Cliente [nombreApellido=" + nombreApellido + ", dni=" + dni + ", email=" + email + ", direccionEnvio="
				+ direccionEnvio + "]";
	}
	
	

}
