package ar.edu.ort.tp2ej1;

public class EMail {
	private String cuenta;
	private String dominio;

	public EMail(String email) {
		String[] arrEmail = email.split("@");
		this.cuenta = arrEmail[0];
		this.dominio = arrEmail[1];
	}

	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}

}
