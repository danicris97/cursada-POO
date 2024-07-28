package ejercicio3;

public class Cuadrado extends Rectangulo{
	
	public Cuadrado(double ladoA) {
		super(ladoA,ladoA);
	}
	
	public double calculaArea() {
		return (Math.pow(this.ladoA, 2));
	}
	
	public double calculaDiagonal() {
		return (this.ladoA*Math.sqrt(2));
	}
}
