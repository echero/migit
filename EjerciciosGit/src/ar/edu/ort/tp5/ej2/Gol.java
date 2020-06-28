package ar.edu.ort.tp5.ej2;

public class Gol extends Evento{
	private boolean fueDePenal;

	public Gol(int minuto, LocalVisitante equipo, int camisetaNro, boolean fueDePenal) {
		super(minuto, equipo, camisetaNro);
		this.fueDePenal = fueDePenal;
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

}
