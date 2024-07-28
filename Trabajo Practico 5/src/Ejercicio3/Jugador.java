package Ejercicio3;

import java.util.Calendar;

public abstract class Jugador extends Persona{
	private String idJugador;
	protected Calendar fchInicio;
	
	public Jugador(String nombre, String apellido, int edad, String idJugador, Calendar fchInicio) {
		super(nombre,apellido,edad);
		this.setIdJugador(idJugador);
		this.fchInicio = fchInicio;
	}
	
	public Jugador() {
		this("","",0,"",null);
	}
	
	public void setIdJugador(String idJugador) {this.idJugador = idJugador;}
	public String getIdJugador() {return this.idJugador;}
	
	public abstract double importeNomina(Calendar hasta);
	
	public String toString() {
		return super.toString() + "\nID JUGADOR: " + this.getIdJugador() + "\nFECHA DE INICIO: " + this.fchInicio;
	}
}
