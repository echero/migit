package ar.edu.ort.tp5.ej3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programa p = new Programa();
		p.ingresarIstruccion(new Instruccion("Instruccion 1"));
		p.ingresarIstruccion( new Instruccion("Instruccion 2"));
		p.ingresarIstruccion( new Instruccion("Instruccion 3"));
		p.ingresarIstruccion(new Instruccion("Instruccion 4"));
		p.ingresarIstruccion(new Instruccion("Instruccion 5"));
		p.ingresarIstruccion(new Instruccion("DESHACER"));
		p.ingresarIstruccion(new Instruccion("Instruccion 6"));
		p.ingresarIstruccion(new Instruccion("Instruccion 7"));
		p.ingresarIstruccion(new Instruccion("Instruccion 8"));
		p.ingresarIstruccion(new Instruccion("DESHACER"));
		p.ingresarIstruccion(new Instruccion("Instruccion 9"));
		p.ingresarIstruccion(new Instruccion("FIN"));


	}

}
