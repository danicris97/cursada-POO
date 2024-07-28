package ejercicio3;

public class Racional{
	public int numerador;
	public int denominador;
	
	public Racional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Racional() {
		this.numerador = 0;
		this.denominador = 1;
	}
	
	public Racional sumaRacional(Racional b) {
		Racional r = new Racional();
		
		if((this.denominador + b.denominador)!=0) {
			r.numerador = (this.numerador*b.denominador) + (b.numerador*this.denominador);
			r.denominador = (this.denominador*b.denominador);
		}
		
		return r;
	}
	
	public Racional restaRacional(Racional b) {
		Racional r = new Racional();
		
		if((this.denominador - b.denominador)!=0) {
			r.numerador = (this.numerador*b.denominador) - (b.numerador*this.denominador);
			r.denominador = this.denominador*b.denominador;
		}
		
		return r;
	}
	
	public Racional productoRacional(Racional b) {
		Racional r = new Racional();
		
		if((this.denominador!=0)&&(b.denominador)!=0) {
			r.numerador = this.numerador * b.numerador;
			r.denominador = this.denominador * b.denominador;
		}
		
		return r;
	}
	
	public Racional inversa() {
		return new Racional(this.denominador,this.numerador);
	}
	
	public Racional divisionRacional(Racional b) {
		Racional r = new Racional();
		
		if((this.denominador!=0)&&(b.denominador!=0)&&(b.numerador!=0)) {
			r.productoRacional(b.inversa());
		}
		
		return r;
	}
	
	public boolean determinaMayor(Racional b) {
		
		if((this.denominador!=0)&&(b.denominador)!=0) {
			if((this.numerador/this.denominador)>(b.numerador/b.denominador))
				return true;
			else
				return false;
		}else
			return false;
	}
	
	private int mcd(){
		int a=Math.abs(this.numerador);
		int b=Math.abs(this.denominador);
		if(b==0){
			return a;
		}
		int r;
		while(b!=0){
			r=a%b;//Busca el resto 0
			a=b;//guarda el mcd posible
			b=r;//guarda el resto 
		}
	    return a;
	  }
	
	public void simplificar() {
		int dividir=mcd();
	    this.numerador/=dividir;
	    this.denominador/=dividir;
	}
	
	public String toString() {
		return (this.numerador + "/" + this.denominador);
	}
}
