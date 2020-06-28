package ar.edu.ort.tp5.ej2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Partido {
	private String descripcion;
	private Equipo[] equipos;
	private Queue<Evento> eventos;
	private int [] goles;
	
	public Partido(String descripcion, Equipo local, Equipo Visitante ) {
		this.descripcion = descripcion;
		this.equipos = new Equipo[]{local, Visitante};
		this.eventos = new LinkedList<Evento>();
		this.goles = new int[] {0,0};
	}
	
	public void agregarEvento(Evento evento) {
		//si es local será 0, si no 1
		int i = evento.getEquipo().ordinal();
		Equipo equipo = equipos[i];
		Cambio cambio = esCambio(evento);
		if(cambio!=null) {
			if(!equipo.isCamisetaDisponible(cambio.getEntra()) && !equipo.isCamisetaDisponible(cambio.getSale()))
				eventos.add(evento);		
		}
		Gol gol =esGol(evento);
		if(gol!=null) {
			if(!equipo.isCamisetaDisponible(gol.getCamisetaNro())) {
				eventos.add(evento);
				this.goles[i]++;
			}
		}
		Tarjeta tarjeta = esTarjeta(evento);
		if(tarjeta!=null) {
			if(!equipo.isCamisetaDisponible(tarjeta.getCamisetaNro()))
				eventos.add(evento);
		}
		
	}

	private Gol esGol(Evento evento) {
		Gol gol=null;
		if(evento instanceof Gol)
			gol=((Gol)evento);
		return gol;
	}
		
	private Tarjeta esTarjeta(Evento evento) {
		Tarjeta tarj = null;
		if(evento instanceof Tarjeta)
			tarj = ((Tarjeta)evento);
		return tarj;
	}
	
	private Cambio esCambio(Evento evento) {
		Cambio cambio = null;
		if(evento instanceof Cambio)
			cambio = ((Cambio)evento);
		return cambio;
	}
	public void mostrarEventos() {
		Gol centinela = new Gol();
		Evento evento;
		eventos.add(centinela);
		evento = eventos.poll();
		System.out.println("Empieza el partido.");
		while(evento.getMinuto()!=-1) {
			String equipo = equipos[evento.getEquipo().ordinal()].getNombre(); 
			System.out.print(evento.getMinuto()+"', "+evento.getEquipo()+"("+equipo+"): ");
			Cambio cambio = esCambio(evento);
			if(cambio!=null) {
				System.out.println(cambio);		
			}
			Gol gol =esGol(evento);
			if(gol!=null) {
				System.out.println(gol);
				System.out.println("Resultado parcial "+goles[0]+"-"+goles[1]);
			}
			Tarjeta tarjeta = esTarjeta(evento);
			if(tarjeta!=null) {
				System.out.println(tarjeta);
			}
			eventos.add(evento);
			evento = eventos.poll();
		}
		mostrarResultado();
	}
	private void mostrarResultado(){
		System.out.println("Resultado final "+goles[0]+"-"+goles[1]);
	}
	@Override
	public String toString() {
		return "Partido [descripcion=" + descripcion + ", equipos=" + Arrays.toString(equipos) + ", eventos=" + eventos
				+ "]";
	}
	

}
