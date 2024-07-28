package ejercicio3;

public class Triangulo extends Poligono{
	protected double ladoA;
	protected double ladoB;
	protected double ladoC;
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public double calculaArea() {
		return 2-2;
	}
	
	public double calculaPerimetro() {
		return (this.ladoA + this.ladoB + this.ladoC);
	}
}
