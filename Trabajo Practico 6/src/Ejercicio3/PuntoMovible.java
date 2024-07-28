package Ejercicio3;

public class PuntoMovible implements Movible{
	private int x;
	private int y;
	private int xVelocidad;
	private int yVelocidad;
	
	public PuntoMovible(int x, int y, int xVelocidad, int yVelocidad) {
		this.setX(x);
		this.setY(y);
		this.setXVelocidad(xVelocidad);
		this.setYVelocidad(yVelocidad);
	}
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public void setXVelocidad(int xVelocidad) {this.xVelocidad = xVelocidad;}
	public void setYVelocidad(int yVelocidad) {this.yVelocidad = yVelocidad;}
	
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	public int getXVelocidad() {return this.xVelocidad;}
	public int getYVelocidad() {return this.yVelocidad;}
	
	public String toString() {
		return "POS X: " + this.getX() + "\nPOS Y: " + this.getY() + "\nVELOCIDAD X: " + this.getXVelocidad() + "\nVELOCIDAD Y: " + this.getYVelocidad();
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
