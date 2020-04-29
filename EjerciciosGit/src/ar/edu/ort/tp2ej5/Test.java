package ar.edu.ort.tp2ej5;

import ar.edu.ort.tp2ej4.Color;
import ar.edu.ort.tp2ej4.Mueble;
import ar.edu.ort.tp2ej4.Persona;


public class Test {
	public static void main(String[] args) {
		Edificio ed = new Edificio("Montañeses",1234);
		ed.agregarDpto(4,"C");
		ed.agregarDpto(2,"B");
		Persona p1 = new Persona("Arturo", "Roman", 53);
		Persona p2 = new Persona("Mónica", "Gaztambide", 35);
		Persona p3 = new Persona("Roberto", "Alfaro", 68);
		Mueble m1 = new Mueble("Mesa", "Madera", Color.MARRON);
		Mueble m2 = new Mueble("Mesada", "Mármol", Color.ROJO);
		Mueble m3 = new Mueble("Perchero", "Metal", Color.NEGRO);
		Mueble m4 = new Mueble("Sillón", "Cuero", Color.AZUL);
		ed.agregarPersona(4,"C", p1);
		ed.agregarPersona(4,"C", p2);
		ed.agregarMueble(4, "C", m1);
		ed.agregarMueble(4, "C", m2);
		ed.agregarMueble(4, "C", m3);
		ed.agregarMueble(4, "C", m4);
		ed.agregarMueble(2, "B", m2);
		ed.agregarMueble(2, "B", m3);
		ed.agregarPersona(2, "B", p3);
		ed.mostrarDptos();
		
	}
}
