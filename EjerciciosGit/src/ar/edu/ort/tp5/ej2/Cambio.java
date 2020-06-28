package ar.edu.ort.tp5.ej2;

public class Cambio extends Evento{
	private int entra;
	
	public Cambio(int minuto, LocalVisitante equipo, int sale, int entra) {
		super(minuto, equipo,sale);
		this.entra = entra;
	}

	public int getEntra() {
		return entra;
	}

	public void setEntra(int entra) {
		this.entra = entra;
	}
		
	@Override
	public String toString() {
		return "Cambio [entra=" + entra + "]";
	}

}
