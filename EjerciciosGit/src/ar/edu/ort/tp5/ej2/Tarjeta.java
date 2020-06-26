package ar.edu.ort.tp5.ej2;

public class Tarjeta extends Evento{
	private ColorTarjeta tarjeta;
	private int camisetaNro;

	public Tarjeta(int minuto, LocalVisitante equipo, int camisetaNro, ColorTarjeta tarjeta) {
		super(minuto, equipo);
		this.camisetaNro = camisetaNro;
		this.tarjeta = tarjeta;
	}

	public int getCamisetaNro() {
		return camisetaNro;
	}

	public void setCamisetaNro(int camisetaNro) {
		this.camisetaNro = camisetaNro;
	}

	public ColorTarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(ColorTarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Tarjeta [" + tarjeta + ", camisetaNro=" + camisetaNro + "]";
	}
	
}
