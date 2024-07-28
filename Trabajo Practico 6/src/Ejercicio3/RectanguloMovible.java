package Ejercicio3;

public class RectanguloMovible implements Movible{
	private PuntoMovible supIzq;
	private PuntoMovible infDer;
	
	public RectanguloMovible(int x1, int y1, int x2, int y2, int xVelocidad, int yVelocidad) {
		this.setSupIzq(x1, y1, xVelocidad, yVelocidad);
		this.setInfDer(x2, y2, xVelocidad, yVelocidad);
	}
	
	private void setSupIzq(int x1, int y1, int xVelocidad, int yVelocidad) {
		this.supIzq.setX(x1);
		this.supIzq.setY(y1);
		this.supIzq.setXVelocidad(xVelocidad);
		this.supIzq.setYVelocidad(yVelocidad);
	}
	
	private void setInfDer(int x2, int y2, int xVelocidad, int yVelocidad) {
		this.infDer.setX(x2);
		this.infDer.setY(y2);
		this.infDer.setXVelocidad(xVelocidad);
		this.infDer.setYVelocidad(yVelocidad);
	}
	
	public String toString() {
		return this.supIzq.toString() + this.infDer.toString();
	}
	
	public void moverAbajo() {
		
	}
	
	public void moverArriba() {
		
	}
	
	public void moverDerecha() {
		
	}
	
	public void moverIzquierda() {
		
	}
	
}
