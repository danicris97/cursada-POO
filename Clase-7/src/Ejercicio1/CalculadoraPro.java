package Ejercicio1;

public class CalculadoraPro extends Calculadora{
	
	public CalculadoraPro() {
		super();
	}
	
	public void multiplicar(double a, double b) {
		this.display = a + "*" + b + "=" + (a*b);
	}
	
	public void dividir(double a, double b) {
		if(b!=0) 
			this.display = a + "/" + b + "=" + (a/b);
		else
			this.display = "ERROR";
	}
}
