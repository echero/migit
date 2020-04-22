package ejercicio3_tp1;

import java.util.ArrayList;

public class Competencia {
	
	private ArrayList<Competidor> competidores;
	private ArrayList<Competidor> primerPuesto;
	private ArrayList<Competidor> segundoPuesto;
	private ArrayList<Competidor> tercerPuesto;
	
	public Competencia(ArrayList<Competidor> jugadores) {
		this.competidores = jugadores;
		this.primerPuesto = new ArrayList<Competidor>();
		this.segundoPuesto = new ArrayList<Competidor>();
		this.tercerPuesto = new ArrayList<Competidor>();
	}
	
	private double mejorTiempo() {
		double mayor=this.competidores.get(0).getTiempo();
		int i=0;
			
		for(Competidor competidor:this.competidores) {
			if(mayor>=this.competidores.get(i).getTiempo()) {
				mayor=this.competidores.get(i).getTiempo();
			}
			i++;
		}
		return mayor;
	}

	public void calcularPrimerPuesto() {
		double max= mejorTiempo();
		for(Competidor competidor:this.competidores) {
			if(competidor.getTiempo()==max) {
				this.primerPuesto.add(competidor);
			}
			
		}	
		
		for(Competidor competidor:this.primerPuesto){
			if(competidor.getTiempo()==max){
				this.competidores.remove(competidor);
			}
		}
		
	}
	
	public void calcularSegundoPuesto() {
		double max= mejorTiempo();
		for(Competidor competidor:this.competidores) {
			if(competidor.getTiempo()==max) {
				this.segundoPuesto.add(competidor);
			}
			
		}	
		
		for(Competidor competidor:this.segundoPuesto){
			if(competidor.getTiempo()==max){
				this.competidores.remove(competidor);
			}
		}
		
	}
	
	public void calcularTercerPuesto() {
		double max= mejorTiempo();
		for(Competidor competidor:this.competidores) {
			if(competidor.getTiempo()==max) {
				this.tercerPuesto.add(competidor);
			}
			
		}	
		
		for(Competidor competidor:this.tercerPuesto){
			if(competidor.getTiempo()==max){
				this.competidores.remove(competidor);
			}
		}
		
	}

	
	@Override
	public String toString() {
		return "Terna Ganadora \n"
				+ "\nPrimer Puesto: " + primerPuesto
				+ "\nSegundo Puesto: " +segundoPuesto
				+ "\nTercer Puesto: " +tercerPuesto
				+ "\n\nCompetidores fuera de la terna: " + competidores;
	}
}
