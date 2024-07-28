package ejercicio2;

public class Complejo {
	public double real;
	public double imaginario;
	
	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public Complejo sumaCompejo(Complejo b) {
		Complejo c = new Complejo(0,0);
		
		c.real = this.real + b.real;
		c.imaginario = this.imaginario + b.imaginario;
		
		return c;
	}
	
	public Complejo productoEscalarComplejo(double k) {
		Complejo c = new Complejo(0,0);
		
		c.real = k * this.real;
		c.imaginario = k * this.imaginario;
		
		return c;
	}
	
	public Complejo productoComplejo(Complejo b) {
		Complejo c = new Complejo(0,0);
		
		c.real = ((this.real*b.real) - (this.imaginario*b.imaginario));
		c.imaginario = ((this.real * b.imaginario)-(this.imaginario * b.real));
				
		return c;
	}
	
	public Complejo restaComplejo(Complejo b) {
		Complejo c = new Complejo(0,0);
		
		c.real = this.real - b.real;
		c.imaginario = this.imaginario - b.imaginario;
		
		return c;
	}
	
	public Complejo divisionComplejo(Complejo b) {
		Complejo c = new Complejo(0,0);
		
		c.real = (((this.real*b.real)+(this.imaginario*b.imaginario))/(Math.pow(b.real, 2)+(Math.pow(b.imaginario, 2))));
		c.imaginario = (((this.imaginario*b.real)-(this.real*b.imaginario))/(Math.pow(b.real, 2)+(Math.pow(b.imaginario, 2))));
		
		return c;
	}
	
	public String mostrarComplejo() {
		String cadena;
		
		if(this.imaginario>=0) {
			cadena = "(" + this.real;
			cadena += "+" + this.imaginario + "i)";
		}else {
			cadena = "(" + this.real;
			cadena += "" + this.imaginario + "i)";
		}
		
		return cadena;
	}
}
