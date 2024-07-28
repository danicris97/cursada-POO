package Figuras;

public abstract class Figura {
	
	public Figura() {
		
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();
	
	public double multiplicarAreaEscalar(int k) {
		return this.getArea() * k;
	}
}
