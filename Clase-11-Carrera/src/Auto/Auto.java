package Auto;

import Carrera.Conductor;

public class Auto {
	private Conductor conductor;
	private Motor motor;
	private Tanque tanque;
	private double distanciaRecorrida;
	
	public Auto() {
		this.conductor = new Conductor();
		this.motor = new Motor();
		this.tanque = new Tanque();
	}
	
	public void encender() {
		this.motor.encender();
	}
	
	public void apagar() {
		this.motor.apagar();
	}
	
	public void mover() {
		
	}
	
	public double getDistanciaRecorrida() {
		return this.distanciaRecorrida;
	}
}
