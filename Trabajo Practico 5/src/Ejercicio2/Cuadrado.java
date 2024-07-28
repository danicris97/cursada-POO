package Ejercicio2;

public class Cuadrado extends Rectangulo{
	
	public Cuadrado(String color, boolean relleno, double lado) {
		super(color,relleno,lado,lado);
	}
	
	public Cuadrado(double lado) {
		super(lado,lado);
	}
	
	public Cuadrado() {
		super();
	}
	
	public void setLado(double lado) {
		this.setBase(lado);
		this.setAltura(lado);
	}
	public double getLado() {return this.getBase();}
	
	public void setBase(double lado) {this.base = lado;}
	public void setAltura(double lado) {this.altura = lado;}
	
	public String toString() {
		String cadena = "COLOR: " + super.getColor();
		
		if(super.estaRelleno()) 
			cadena += "\nESTA RELLENO";
		else
			cadena += "\nNO ESTA RELLENO";
		
		cadena += "\nLADO: " + this.getLado();
		
		return cadena;
	}
}
