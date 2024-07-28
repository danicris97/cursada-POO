package Figuras;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(this.radio, 2));
	}
	
	public double getPerimetro() {
		return (2 * Math.PI * this.radio);
	}
}
