package Ejercicio3;

import java.util.ArrayList;
import java.util.Calendar;

public class ListadoJugadores {
	private ArrayList<Jugador> listado;
	
	public ListadoJugadores() {
		this.listado = new ArrayList<Jugador>();
	}
	
	public void agregarJugador(Jugador jugador) {this.listado.add(jugador);}
	
	public void imprimirListado() {
		for(int i=0;i<this.listado.size();i++)
			System.out.println(this.listado.get(i).toString());
	}
	
	public double importeTotalNominaJugadores(Calendar hasta) {
		double acomulador=0;
		
		for(int i=0;i<this.listado.size();i++) 
			acomulador += this.listado.get(i).importeNomina(hasta);
		
		return acomulador;
	}
}
