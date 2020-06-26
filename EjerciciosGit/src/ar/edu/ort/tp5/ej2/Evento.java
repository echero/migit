package ar.edu.ort.tp5.ej2;

public abstract class Evento {
	private int minuto;
	private LocalVisitante equipo;
	
	public Evento(int minuto, LocalVisitante equipo) {
		this.minuto = minuto;
		this.equipo = equipo;
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

	@Override
	public String toString() {
		return "Evento [minuto=" + minuto + ", equipo=" + equipo + "]";
	}
	
	
}
