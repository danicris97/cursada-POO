package ejercicio3;

public class Cuadrangulo extends Poligono{
	protected double ladoA;
	protected double ladoB;
	protected double ladoC;
	protected double ladoD;
	
	public Cuadrangulo(double ladoA, double ladoB, double ladoC, double ladoD) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}
	
	public double calculaArea() {
		double semiPerimetro = (this.calculaPerimetro()/2);
		return (Math.sqrt((semiPerimetro - this.ladoA)*(semiPerimetro - this.ladoB)*(semiPerimetro - this.ladoC)*(semiPerimetro - this.ladoD)));
	}
	
	public double calculaPerimetro() {
		return (this.ladoA + this.ladoB + this.ladoC + this.ladoD);
	}
}
