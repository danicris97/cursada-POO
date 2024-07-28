package Ejercicio2;

public class Rectangulo extends Figura{
	protected double base;
	protected double altura;
	
	public Rectangulo(String color, boolean relleno, double base, double altura) {
		super(color,relleno);
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public Rectangulo(double base, double altura) {
		super();
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public Rectangulo() {
		super();
		this.setBase(0);
		this.setAltura(0);
	}
	
	public void setBase(double base) {this.base = base;}
	public void setAltura(double altura) {this.altura = altura;}
	
	public double getBase() {return this.base;}
	public double getAltura() {return this.altura;}
	
	public double getArea() {return (this.getBase() * this.getAltura());}
	public double getPerimetro() {return (Math.sqrt(Math.pow(this.getAltura(),2)+ Math.pow(this.getBase(),2)));}
	
	public String toString() {
		return super.toString() + "\nBASE: " + this.getBase() + "\nALTURA: " + this.getAltura();
	}
	
}
