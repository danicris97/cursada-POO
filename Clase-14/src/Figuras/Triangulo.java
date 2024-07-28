package Figuras;

public class Triangulo extends Figura{
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea() {
		return ((this.base * this.altura)/2);
	}
	
	public double getPerimetro() {
		return (0);
	}
}
