package ar.edu.ort.tp5.ej3;

import java.util.Stack;

public class Programa {
	Stack<Instruccion> instrucciones;

	public Programa() {
		this.instrucciones = new Stack<Instruccion>();;
	}
	public void ingresarIstruccion(Instruccion inst) {
		if(!inst.getInstruccion().equals("FIN")) {
			if(!inst.getInstruccion().equals("DESHACER")) {
				instrucciones.push(inst);
			}else {
				if(!instrucciones.isEmpty()) {
					instrucciones.pop();
				}
			}
		}else {
			mostrarInstrucciones();
		}
	}
	private void mostrarInstrucciones() {
		Stack<Instruccion> aux = new Stack<Instruccion>();
		while (!instrucciones.isEmpty()) {
			aux.push(instrucciones.pop());
		}
		while(!aux.isEmpty()) {
			Instruccion i = aux.pop();
			System.out.println(i);
			instrucciones.push(i);
		}
	}	
	
}
