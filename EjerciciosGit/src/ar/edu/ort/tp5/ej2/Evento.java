package ar.edu.ort.tp5.ej2;

public abstract class Evento {
	private int minuto;
	private LocalVisitante equipo;
	private int camisetaNro;
	
	public Evento(int minuto, LocalVisitante equipo, int camisetaNro) {
		this.minuto = minuto;
		this.equipo = equipo;
		this.camisetaNro = camisetaNro;
	}
	
	public Evento(int minuto) {
		this.minuto=minuto;
	}

	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	public LocalVisitante getEquipo() {
		return equipo;
	}


	public void setEquipo(LocalVisitante equipo) {
		this.equipo = equipo;
	}


	public int getCamisetaNro() {
		return camisetaNro;
	}

	@Override
	public String toString() {
		return "Evento [minuto=" + minuto + ", equipo=" + equipo + ", camisetaNro=" + camisetaNro + "]";
	}

	
}
