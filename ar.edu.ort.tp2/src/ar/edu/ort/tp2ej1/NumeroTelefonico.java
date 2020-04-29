package ar.edu.ort.tp2ej1;

public class NumeroTelefonico {
	private int codigoDePais;
	private int caracteristica;
	private int numeroDeAbonado;
	private TipoDeLinea tipo;

	public NumeroTelefonico() {
		codigoDePais = 0;
		caracteristica = 0;
		numeroDeAbonado = 0;
	}

	public NumeroTelefonico(int codigoDePais, int caracteristica, int numeroDeAbonado, TipoDeLinea tipo) {
		this.codigoDePais = codigoDePais;
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.tipo = tipo;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
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

	public TipoDeLinea getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeLinea tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return "(+" + codigoDePais + ") " + caracteristica + "-" + numeroDeAbonado;
	}

}
