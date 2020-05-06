package ejercicio6_tp2;

public class Clientes {

	private String nombreApellido;
	private int dni;
	private String email;
	private String direccionDeEnvio;
	
	public Clientes(String nombreApellido, int dni, String email, String direccionDeEnvio) {
		this.nombreApellido = nombreApellido;
		this.dni = dni;
		this.email = email;
		this.direccionDeEnvio = direccionDeEnvio;
	}
	
	public String getValor(){
		return nombreApellido+", Dni: "+dni+", Email: "+email+", Direccion de Envio: "+direccionDeEnvio;
	}

}
