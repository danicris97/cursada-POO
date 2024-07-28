package Armas;

import Unidades.Unidad;

public class Arma {
	protected String nombre;
	protected double poder;
	
	public Arma(String nombre, double poder) {
		this.setNombre(nombre);
		this.setPoder(poder);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPoder(double poder) {
		this.poder = poder;
	}
	
	public double getPoder() {
		return this.poder;
	}
	
	public void incPoder() {
		
	}
	
	public void decPoder() {
		
	}
	
	public void atacar(Unidad enemigo) {
		
	}
}
