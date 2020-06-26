package ar.edu.ort.tp5.ej2;

public class Cambio extends Evento{
	private int sale;
	private int entra;
	
	public Cambio(int minuto, LocalVisitante equipo, int sale, int entra) {
		super(minuto, equipo);
		if(sale!=entra) {
			this.sale = sale;
			this.entra = entra;
		}
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getEntra() {
		return entra;
	}

	public void setEntra(int entra) {
		this.entra = entra;
	}

	@Override
	public String toString() {
		return "Cambio [sale=" + sale + ", entra=" + entra + "]";
	}
	
	
}
