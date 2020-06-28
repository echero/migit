package ar.edu.ort.tp5.ej2;

public class JugarPartido {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creando los equipos");
		Equipo river = new Equipo("River Plate", "Marcelo Gallardo");
		Equipo boca = new Equipo("Boca Juniors", "Guillermo Barros");
		
				
		System.out.println("Cargando jugadores a los equipos");
		river.agregarJugador(new Jugador("Franco", "Armani", 1));
		river.agregarJugador(new Jugador("Germán ", "Lux", 14));
		river.agregarJugador(new Jugador("Jonatan", "Maidana", 2));
		river.agregarJugador(new Jugador("Gonzalo", "Montiel", 29));
		river.agregarJugador(new Jugador("Horacio Javier", "Pinola", 22));
		river.agregarJugador(new Jugador("Leonardo", "Ponzio", 23));
		river.agregarJugador(new Jugador("Milton", "Casco", 20));
		river.agregarJugador(new Jugador("Javier", "PINOLA", 22));
		river.agregarJugador(new Jugador("Ignacio", "Fernandez", 26));
		river.agregarJugador(new Jugador("Enzo", "Pérez", 24));
		river.agregarJugador(new Jugador("Exequiel", "Palacios", 15));
		river.agregarJugador(new Jugador("Gonzalo", "Martinez", 10));
		river.agregarJugador(new Jugador("Lucas", "Pratto", 27));
		river.agregarJugador(new Jugador("Lucas", "Martínez Quarta", 28));
		river.agregarJugador(new Jugador("Camilo", "Mayada", 18));
		river.agregarJugador(new Jugador("Julián", "Alvarez", 9));
		river.agregarJugador(new Jugador("Bruno", "Zuculini", 5));
		river.agregarJugador(new Jugador("Rodrigo", "Mora", 7));
		river.agregarJugador(new Jugador("Juan", "Quintero", 8));
		
		boca.agregarJugador(new Jugador("Esteban", "Andrada", 1));
		boca.agregarJugador(new Jugador("Lucas ", "Olaza", 20));
		boca.agregarJugador(new Jugador("Carlos", "Izquierdoz", 21));
		boca.agregarJugador(new Jugador("Lisandro", "Magallán", 6));
		boca.agregarJugador(new Jugador("Wilmar", "Barrios", 16));
		boca.agregarJugador(new Jugador("Nahitan", "Nández", 15));
		boca.agregarJugador(new Jugador("Pablo", "Pérez", 8));
		boca.agregarJugador(new Jugador("Darío", "Benedetto", 18));
		boca.agregarJugador(new Jugador("Sebastián", "Villa", 22));
		boca.agregarJugador(new Jugador("Cristian", "Pavón", 7));
		boca.agregarJugador(new Jugador("Leonardo", "Jara", 29));
		boca.agregarJugador(new Jugador("Fernando", "Gago", 5));
		boca.agregarJugador(new Jugador("Carlos", "Tevez", 23));
		boca.agregarJugador(new Jugador("Ramón", "Ábila", 17));
		boca.agregarJugador(new Jugador("Paolo", "Goltz", 2));
		boca.agregarJugador(new Jugador("Mauro", "Zárate", 9));
		boca.agregarJugador(new Jugador("Agustín", "Rossi", 12));
		boca.agregarJugador(new Jugador("Julio", "Buffarini", 24));
		
		Partido p = new Partido("Final de copa Libertadores 2018", river, boca);
		Tarjeta t1 = new Tarjeta(26, LocalVisitante.LOCAL, 23, ColorTarjeta.AMARILLA);
		Tarjeta t2 = new Tarjeta(42, LocalVisitante.VISITANTE, 8, ColorTarjeta.AMARILLA);
		Gol g1 = new Gol(43, LocalVisitante.VISITANTE, 18, false,false);
		Cambio c1 = new Cambio(57, LocalVisitante.LOCAL, 23, 8);
		Cambio c2 = new Cambio(61, LocalVisitante.VISITANTE, 18, 17);
		Gol g2 = new Gol(67, LocalVisitante.LOCAL, 27, false,false);
		Cambio c3 = new Cambio(57, LocalVisitante.LOCAL, 29, 18);
		Tarjeta t3 = new Tarjeta(80, LocalVisitante.LOCAL, 26, ColorTarjeta.AMARILLA);
		Tarjeta t4 = new Tarjeta(82, LocalVisitante.LOCAL, 2, ColorTarjeta.AMARILLA);
		Tarjeta t5 = new Tarjeta(86, LocalVisitante.VISITANTE, 16, ColorTarjeta.AMARILLA);
		Cambio c4 = new Cambio(88, LocalVisitante.VISITANTE, 8, 5);
		Gol g3 = new Gol(89, LocalVisitante.LOCAL, 17, true, false);
		Gol g4 = new Gol(90, LocalVisitante.LOCAL, 17, false, true);
		p.agregarEvento(t1);
		p.agregarEvento(t2);
		p.agregarEvento(g1);
		p.agregarEvento(c1);
		p.agregarEvento(c2);
		p.agregarEvento(g2);
		p.agregarEvento(c3);
		p.agregarEvento(t3);
		p.agregarEvento(t4);
		p.agregarEvento(t5);
		p.agregarEvento(c4);
		p.agregarEvento(g3);
		p.agregarEvento(g4);
		p.mostrarEventos();

	}

}
