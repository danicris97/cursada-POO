package Ejercicio4;

public class Circulo implements ObjetoGeometrico{
	protected double radio;
	
	public Circulo(double radio) {
		this.setRadio(radio);
	}
	
	public void setRadio(double radio) {this.radio = radio;}
	public double getRadio() {return this.radio;}
	
	public double getArea() {return Math.PI * Math.pow(radio, 2);}
	
	public double getPerimetro() {return 2 * Math.PI * radio;}
}
