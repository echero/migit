package ejercicio3_tp2;

public class NumeroTelefonico {
	
	private TipoDeLinea tipo;
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	
	
	public NumeroTelefonico() {
		caracteristica = 0;
		numeroDeAbonado = 0;
		codigoDePais = 0;
	}

	public NumeroTelefonico(int característica, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipo) {
		
		this.caracteristica = característica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipo = tipo;
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}
	
	public TipoDeLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLinea tipo) {
		this.tipo = tipo;
	}

	public String getValor(){
		return "(+"+this.codigoDePais+")"+"-"+this.caracteristica+"-"+this.numeroDeAbonado;
	}
	
	

}
