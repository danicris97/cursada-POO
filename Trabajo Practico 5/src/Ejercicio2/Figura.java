package Ejercicio2;

public abstract class Figura {
	protected String color;
	protected boolean relleno;
	
	public Figura(String color, boolean relleno) {
		this.setColor(color);
		this.setRelleno(relleno);
	}
	
	public Figura() {
		this("",false);
	}
	
	public void setColor(String color) {this.color = color;}
	public void setRelleno(boolean relleno) {this.relleno = relleno;}
	
	public String getColor() {return this.color;}
	public boolean estaRelleno() {return this.relleno;}
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
	public String toString() {
		String cadena = "COLOR: " + this.getColor();
		
		if(this.estaRelleno()) 
			cadena += "\nESTA RELLENO";
		else
			cadena += "\nNO ESTA RELLENO";
		
		return cadena;
	}
	
}
