package ar.edu.ort.tp5.ej2;

public class Gol extends Evento{
	private boolean fueDePenal;
	private int camisetaNro;

	public Gol(int minuto, LocalVisitante equipo, int camisetaNro, boolean fueDePenal) {
		super(minuto, equipo);
		this.camisetaNro = camisetaNro;
		this.fueDePenal = fueDePenal;
	}
	public Gol() {
		super(-1, LocalVisitante.LOCAL);
		this.camisetaNro = -1;
	}

	public boolean isFueDePenal() {
		return fueDePenal;
	}

	public void setFueDePenal(boolean fueDePenal) {
		this.fueDePenal = fueDePenal;
	}

	public int getCamisetaNro() {
		return camisetaNro;
	}

	public void setCamisetaNro(int camisetaNro) {
		this.camisetaNro = camisetaNro;
	}

	@Override
	public String toString() {
		return "Gol [fueDePenal=" + fueDePenal + ", camisetaNro=" + camisetaNro + "]";
	}
	
	
}
