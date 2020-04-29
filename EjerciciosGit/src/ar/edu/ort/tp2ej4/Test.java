package ar.edu.ort.tp2ej4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vivienda v1 = new Vivienda("Montañeses",1234,4,"C");
		Persona p1 = new Persona("Arturo", "Roman", 53);
		Persona p2 = new Persona("Mónica", "Gaztambide", 35);
		Mueble m1 = new Mueble("Mesa", "Madera", Color.MARRON);
		Mueble m2 = new Mueble("Mesada", "Mármol", Color.ROJO);
		Mueble m3 = new Mueble("Perchero", "Metal", Color.NEGRO);
		Mueble m4 = new Mueble("Sillón", "Cuero", Color.AZUL);
		
		v1.agregarPersona(p1);
		v1.agregarPersona(p2);
		v1.agregarMueble(m1);
		v1.agregarMueble(m2);
		v1.agregarMueble(m3);
		v1.agregarMueble(m4);
		
		v1.mostrarDireccion();
		v1.mostrarPersonas();
		v1.mostrarMuebles();
	}

}
