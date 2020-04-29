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
	//composicion
	public void agregarDpto(int piso, String departamento) {
		if(buscarDpto(piso, departamento)==null) {
			Vivienda dpto = new Vivienda(this.calle, this.altura, piso, departamento);
			this.lViviendas.add(dpto);
		}
	}
	//agregacion
	public void agregarPersona(int piso, String departamento, Persona persona) {
		Vivienda dpto = buscarDpto(piso, departamento);
		if(dpto!=null) {
			dpto.agregarPersona(persona);
		}
	}
	//agregacion
	public void agregarMueble(int piso, String departamento,Mueble mueble) {
		Vivienda dpto = buscarDpto(piso, departamento);
		if(dpto!=null) {
			dpto.agregarMueble(mueble);
		}
	}
	public void realizarMudanza(int pisoOrigen, int dptoOrigen, int pisoDest, int dptoDest) {
		
	}
	private Vivienda buscarDpto(int piso, String departamento) {
		Vivienda dptoBuscado = null;
		Vivienda dptoAux;
		int i = 0;
		while(i<this.lViviendas.size() && dptoBuscado==null) {
			dptoAux = this.lViviendas.get(i);
			if(dptoAux.getPiso()==piso && dptoAux.getDepartamento().equals(departamento)) {
				dptoBuscado = dptoAux;
			}else {
				i++;
			}
		}
		return dptoBuscado;
	}
	public void mostrarDptos() {
		if(this.lViviendas.size()<=0) {
			System.out.println("No se cargaron departamentos");
		}else {
			int i = 1;
			for (Vivienda vivienda : lViviendas) {
				System.out.println("Vivienda "+ i);
				vivienda.mostrarTodo();
				i++;
			}
		}
	}

}
