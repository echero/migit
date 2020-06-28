package ar.edu.ort.tp5.ej2;

public class Gol extends Evento{
	private boolean fueDePenal;
	private boolean fueEncontra;

	public Gol(int minuto, LocalVisitante equipo, int camisetaNro, boolean fueDePenal, boolean fueEncontra) {
		super(minuto, equipo, camisetaNro);
		this.fueDePenal = fueDePenal;
		this.fueEncontra = fueEncontra;
	}
	public Gol(int minuto) {
		super(minuto);
	}

	public boolean isFueDePenal() {
		return fueDePenal;
	}

	public void setFueDePenal(boolean fueDePenal) {
		this.fueDePenal = fueDePenal;
	}

	@Override
	public String toString() {
		return "Gol [fueDePenal=" + fueDePenal + "]";
	}
	public boolean isFueEncontra() {
		return fueEncontra;
	}
	public void setFueEncontra(boolean fueEncontra) {
		this.fueEncontra = fueEncontra;
	}

}
