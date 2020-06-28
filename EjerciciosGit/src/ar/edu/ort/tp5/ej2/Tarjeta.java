package ar.edu.ort.tp5.ej2;

public class Tarjeta extends Evento{
	private ColorTarjeta tarjeta;

	public Tarjeta(int minuto, LocalVisitante equipo, int camisetaNro, ColorTarjeta tarjeta) {
		super(minuto, equipo,camisetaNro);
		this.tarjeta = tarjeta;
	}

	public ColorTarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(ColorTarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	@Override
	public String toString() {
		return "Tarjeta [tarjeta=" + tarjeta + "]";
	}

}
