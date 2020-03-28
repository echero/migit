package ejercicio2Javier;

//modificacion sobre tu clase..

public class Atleta {
	private int numero;
	private float tiempo;
	
	public Atleta(int numero, float tiempo) {
		this.numero = numero;
		this.tiempo = tiempo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	public float getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [numero=" + numero + ", tiempo=" + tiempo + "]";
	}
	
	
}
