package Ejercicio3;

public class CirculoMovible implements Movible{
	private int radio;
	private PuntoMovible centro;
	
	public CirculoMovible(int x, int y, int xVelocidad, int yVelocidad, int radio) {
		this.setCentro(x, y, xVelocidad, yVelocidad);
		this.setRadio(radio);
	}
	
	private void setRadio(int radio) {this.radio = radio;}
	//private int getRadio() {return this.radio;}
	
	private void setCentro(int x, int y, int xVelocidad, int yVelocidad) {
		this.centro.setX(x);
		this.centro.setY(y);
		this.centro.setXVelocidad(xVelocidad);
		this.centro.setYVelocidad(yVelocidad);
	}
	
	public String toString() {
		return this.centro.toString() + "\nRADIO: " + this.radio;
	}
	
	public void moverArriba() {
		
	}
	
	public void moverAbajo() {
		
	}
	
	public void moverDerecha() {
		
	}
	
	public void moverIzquierda() {
		
	}
}
