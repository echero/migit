package ar.edu.ort.tp5.ej2;

import java.util.ArrayList;

public class Equipo {
	private ArrayList<Jugador> equipo;
	private String nombre;
	private String dt;
	
	public Equipo(String nombre, String dt) {
		this.nombre = nombre;
		this.setDt(dt);
		this.equipo = new ArrayList<Jugador>();
	}
	
	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public ArrayList<Jugador> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Jugador> equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarJugador(Jugador nuevoJugador) {
		int camiseta = nuevoJugador.getCamisetaNro();
		if(isCamisetaDisponible(camiseta))
			equipo.add(nuevoJugador);
		else
			System.out.println("Ya existe un Jugador con la camiseta número "
					+ camiseta + " en el plantel de " + getNombre());
	}

	public boolean isCamisetaDisponible(int camisetaNro) {
		// TODO Auto-generated method stub
		boolean estaDisponible=false;
		if(existeJugadorEnPlantel(camisetaNro)==null)
			estaDisponible=true;
		return estaDisponible;
	}
	
	private Jugador existeJugadorEnPlantel(int camisetaNro) {
		Jugador jugadorBuscado = null;
		Jugador jugadorAux = null;
		int i = 0;
		while(i<equipo.size()&&jugadorBuscado==null) {
			jugadorAux=equipo.get(i);
			if(jugadorAux.getCamisetaNro()==camisetaNro) {
				jugadorBuscado=jugadorAux;
			}else {
				i++;
			}
		}
		return jugadorBuscado;
	}

	@Override
	public String toString() {
		return "Equipo [equipo=" + equipo + ", nombre=" + nombre + ", dt=" + dt + "]";
	}
	

}
