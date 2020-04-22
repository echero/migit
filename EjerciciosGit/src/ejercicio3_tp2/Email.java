package ejercicio3_tp2;

public class Email {
	
	private String cuenta;
	private String dominio;
	
	
	public Email(String email) {
		
		String[] arrayEmail = email.split("@");
		this.cuenta = arrayEmail[0];
		this.dominio = arrayEmail[1];
	}
	
	public String getValor(){
		
		return this.cuenta+"@"+this.dominio;
		
		
	}

}
