package ar.edu.ort.tp2ej5;

import java.util.ArrayList;

import ar.edu.ort.tp2ej4.Persona;
import ar.edu.ort.tp2ej4.Mueble;
import ar.edu.ort.tp2ej4.Vivienda;

public class Edificio {
	private ArrayList<Vivienda> lViviendas;
	private String calle;
	private int altura;

	public Edificio(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
		this.lViviendas = new ArrayList<Vivienda>();
	}

	// composicion
	public void agregarDpto(int piso, String departamento) {
		if (buscarDpto(piso, departamento) < 0) {
			Vivienda dpto = new Vivienda(this.calle, this.altura, piso, departamento);
			this.lViviendas.add(dpto);
		} else {
			System.out.println("Ya existe el deparatemento");
		}
	}

	// agregacion
	public void agregarPersona(int piso, String departamento, Persona persona) {
		int i = buscarDpto(piso, departamento);
		if (i >= 0) {
			Vivienda dpto = this.lViviendas.get(i);
			dpto.agregarPersona(persona);
		} else
			noExiste(piso, departamento);
	}

	// agregacion
	public void agregarMueble(int piso, String departamento, Mueble mueble) {
		int i = buscarDpto(piso, departamento);
		if (i >= 0) {
			Vivienda dpto = this.lViviendas.get(i);
			dpto.agregarMueble(mueble);
			;
		} else
			noExiste(piso, departamento);
	}

	public void realizarMudanza(int pisoOrigen, String dptoOrigen, int pisoDest, String dptoDest) {
		int i = buscarDpto(pisoOrigen, dptoOrigen);
		int j = buscarDpto(pisoDest, dptoDest);
		if (j >= 0) {
			Vivienda destino = this.lViviendas.get(j);
			if (!estaHabitado(destino)) {
				Vivienda origen = this.lViviendas.get(i);
				ArrayList<Persona> lPersonas = deshabitar(origen);
				habitar(destino, lPersonas);
				ArrayList<Mueble> lMuebles = desamueblar(origen);
				amueblar(destino, lMuebles);
				origen.deshabitar();
				origen.desamueblar();
				System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA " + (i + 1) + " A VIVIENDA " + (j + 1));
			} else {
				System.out.println("El departamento destino esta habitado");
			}
		} else {
			//se podría agregar el dpto destino utilizando agregarDpto
		}
	}

	private int buscarDpto(int piso, String departamento) {
		Vivienda dptoAux;
		int posicion = -1;
		int i = 0;
		while (i < this.lViviendas.size() && posicion == -1) {
			dptoAux = this.lViviendas.get(i);
			if (dptoAux.getPiso() == piso && dptoAux.getDepartamento().equals(departamento)) {
				posicion = i;
			} else {
				i++;
			}
		}
		return posicion;
	}

	private boolean estaHabitado(Vivienda dpto) {
		boolean estaHabitado = false;
		if (dpto.cantPersonas() > 0)
			estaHabitado = true;
		return estaHabitado;
	}

	private ArrayList<Persona> deshabitar(Vivienda dpto) {
		ArrayList<Persona> lPersonas = dpto.getlPersonas();
		return lPersonas;
	}

	private ArrayList<Mueble> desamueblar(Vivienda dpto) {
		ArrayList<Mueble> lMuebles = dpto.getlMuebles();
		return lMuebles;
	}

	private void habitar(Vivienda dpto, ArrayList<Persona> lPersonas) {
		for (Persona persona : lPersonas) {
			dpto.agregarPersona(persona);
		}
	}

	private void amueblar(Vivienda dpto, ArrayList<Mueble> lMuebles) {
		for (Mueble mueble : lMuebles) {
			dpto.agregarMueble(mueble);
		}
	}

	private void noExiste(int piso, String departamento) {
		System.out.println("El departamento " + piso + "º ”" + departamento + "” no existe");
	}

	public void mostrarDptos() {
		if (this.lViviendas.size() <= 0) {
			System.out.println("No se cargaron departamentos");
		} else {
			int i = 1;
			for (Vivienda vivienda : lViviendas) {
				System.out.println("Vivienda " + i + ":");
				vivienda.mostrarTodo();
				System.out.println("################################");
				i++;
			}
		}
	}

}
