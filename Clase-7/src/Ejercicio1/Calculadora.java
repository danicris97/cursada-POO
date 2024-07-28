package Ejercicio1;


public class Calculadora {
	protected String display;
	
	public Calculadora() {
		this.display = "BIENVENIDO A LA CALCULADORA PARA SUMAR";
	}
	
	public void sumar(double a, double b) {
		this.display = a + "+" + b + "=" + (a + b);
	}
	
	public void sumar(int a, int b, int c) {
		this.display = a + "+" + b + "+" + c + "=" + (a+b+c);
	}
	
	public void restar(double a, double b) {
		this.display = a + "+" + b + "=" + (a+b);
	}
	
	public void display() {
		System.out.println(this.display);
	}
}
