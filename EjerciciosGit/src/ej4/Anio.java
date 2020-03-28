package ej4;

public class Anio {
	private String[] meses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private int[] cantidadDias = {0,31,59,90,120,151,181,212,243,273,304,334};
	
	public String getNombreDelMes(int numeroMes) {
		return meses[numeroMes-1];
	}
	
	public int diasTranscurridos(int numeroMes) {
		return cantidadDias[numeroMes-1];
	}

	public int diasTranscurridosTotal(int numeroMes,int numeroDia) {
		return numeroDia+ diasTranscurridos(numeroMes);
	}
	
	public String[] getMeses() {
		return meses;
	}

	public void setMeses(String[] meses) {
		this.meses = meses;
	}

	public int[] getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int[] cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	
	
	
}
