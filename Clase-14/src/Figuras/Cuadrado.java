package Figuras;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.setLado(lado);
	}
	
	private void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public double getArea() {
		return (Math.pow(this.lado, 2));
	}
	
	public double getPerimetro() {
		return (this.lado*4);
	}
}
