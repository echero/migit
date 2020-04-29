package ar.edu.ort.tp2ej1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("Lionel", "Messi");
		NumeroTelefonico num1 = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico num2 = new NumeroTelefonico(68, 032444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico num3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);

		p.agregarEmail("lio@messi.com.ar");
		p.agregarTelefono(num1);
		p.agregarTelefono(num2);
		p.agregarTelefono(num3);

		p.mostrarTodo();


	}

}
