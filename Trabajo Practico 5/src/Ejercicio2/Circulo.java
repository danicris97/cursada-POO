package Ejercicio2;

public class Circulo extends Figura{
	protected double radio;
	
	public Circulo(double radio) {
		super("",false);
		this.setRadio(radio);
	}
	
	public Circulo(double radio, String color, boolean relleno) {
		super(color,relleno);
		this.setRadio(radio);
	}
	
	public Circulo() {
		super();
		this.setRadio(0);
	}
	
	public void setRadio(double radio) {this.radio = radio;}
	public double getRadio() {return this.radio;}
	
	public double getArea() {return (Math.PI * Math.pow(radio,2));}
	public double getPerimetro() {return (2*Math.PI*radio);}
	
	public String toString() {
		return super.toString() + "\nRADIO: " + this.getRadio();
	}
}
