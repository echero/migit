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
		//obtengo el equipo Local o visitante donde ocurrió el evento
		Equipo equipo = obtenerEquipo(equipos, evento);
		Cambio cambio = esCambio(evento);
		Jugador jugador = obtenerJugador(evento);
		if(cambio!=null) {
			Jugador entra = equipo.existeJugadorEnPlantel(cambio.getEntra());
			Jugador sale = jugador;
			procesarCambio(cambio, entra, sale);
		}
			
		Gol gol =esGol(evento);
		if(gol!=null) {
			procesarGol(gol, jugador);
			int i = obtenerLocalOVisitante(evento);
			if(!gol.isFueEncontra()) {
				this.goles[i]++;
			}else {
				if(i==0)
					this.goles[1]++;
				else
					this.goles[0]++;
			}
			
		}

		Tarjeta tarjeta = esTarjeta(evento);
		if(tarjeta!=null)
			procesarTarjeta(tarjeta, jugador);

	}
	private void procesarCambio(Cambio cambio, Jugador entra, Jugador sale) {
		if(entra!=null&&sale!=null) {
			if(entra.getCamisetaNro()!=sale.getCamisetaNro())
				eventos.add(cambio);
			else
				System.out.println("ERROR: no puede tener el mismo número de camiseta el jugador que entra y el que sale");
		}else {
			System.out.println("ERROR: Uno o los 2 jugadores involucrados en el cambio no existe en el plantel");
		}

	}
	private void procesarGol(Gol gol, Jugador goleador) {
		if(goleador!=null) {
			eventos.add(gol);
		}
	}
	
	private void procesarTarjeta(Tarjeta tarjeta, Jugador amonestado) {
		if(amonestado!=null)
			eventos.add(tarjeta);
	}
	private Equipo obtenerEquipo(Equipo[] equipos, Evento evento) {
		int i = obtenerLocalOVisitante(evento);
		Equipo equipo = equipos[i];
		return equipo;
	}
	private int obtenerLocalOVisitante(Evento evento) {
		//si es local será 0, si no 1
		int i = evento.getEquipo().ordinal();
		return i;
	}

	private Jugador obtenerJugador(Evento evento) {
		Equipo equipo = equipos[obtenerLocalOVisitante(evento)];
		int camisetaNro = evento.getCamisetaNro();
		Jugador jugador = equipo.existeJugadorEnPlantel(camisetaNro);
		return jugador;
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
		Gol centinela = new Gol(-1);
		Evento evento;
		eventos.add(centinela);
		evento = eventos.poll();
		System.out.println("============================================");
		System.out.println(descripcion);
		System.out.println("============================================");
		System.out.println(equipos[0].getNombre()+" vs "+equipos[1].getNombre());
		System.out.println("Empieza el partido.");
		while(evento.getMinuto()!=-1) {
			String entra="";
			System.out.print(evento.getMinuto()+"' ");
			Cambio cambio = esCambio(evento);
			if(cambio!=null) {
				System.out.print("Cambio: "+"sale ");
				Jugador jugador = equipos[obtenerLocalOVisitante(evento)].existeJugadorEnPlantel(cambio.getEntra());
				entra = "entra "+ jugador.getNombre()+" "+jugador.getApellido()+"("+jugador.getCamisetaNro()+"), ";
			}
			Gol gol =esGol(evento);
			if(gol!=null) {
				String penal = (gol.isFueDePenal())?" de penal: ":"";
				String encontra = (gol.isFueEncontra())?"ENCONTRA: ":": ";
				System.out.print("GOL"+ penal + encontra);
			}
			Tarjeta tarjeta = esTarjeta(evento);
			if(tarjeta!=null) {
				System.out.print("Tarjeta "+tarjeta.getTarjeta()+": ");
			}
			System.out.println(obtenerJugador(evento).getNombre()+" "+obtenerJugador(evento).getApellido()
					+"("+obtenerJugador(evento).getCamisetaNro()+"), "+entra+equipos[obtenerLocalOVisitante(evento)].getNombre()
					+"("+evento.getEquipo()+")");
			eventos.add(evento);
			evento = eventos.poll();
		}
		mostrarResultado();
	}
	private void mostrarResultado(){
		System.out.println("********************************************");
		System.out.println("Resultado final: "+goles[0]+"-"+goles[1]);
		System.out.println("********************************************");
	}

	@Override
	public String toString() {
		return "Partido [descripcion=" + descripcion + ", equipos=" + Arrays.toString(equipos) + ", eventos=" + eventos
				+ ", goles=" + Arrays.toString(goles) + "]";
	}

}
