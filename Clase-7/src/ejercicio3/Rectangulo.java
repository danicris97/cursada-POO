package ejercicio3;

public class Rectangulo extends Cuadrangulo {
	
	public Rectangulo(double ladoA, double ladoB) {
		super(ladoA, ladoB, ladoA, ladoB);
	}
	
	public double calculaArea() {
		return (this.ladoA*this.ladoB);
	}
	
	public double calculaDiagonal() {
		return (Math.sqrt(Math.pow(this.ladoA,2) + Math.pow(this.ladoB,2)));
	}
}
