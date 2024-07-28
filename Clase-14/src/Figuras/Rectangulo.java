package Figuras;

public class Rectangulo extends Figura{
	private double ladoA;
	private double ladoB;
	
	public Rectangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public double getLadoA() {
		return this.ladoA;
	}
	
	public double getLadoB() {
		return this.ladoB;
	}
	
	public double getArea() {
		return (this.getLadoA() * this.getLadoB());
	}
	
	public double getPerimetro() {
		return (2*(this.getLadoA() + this.getLadoB()));
	}
}
