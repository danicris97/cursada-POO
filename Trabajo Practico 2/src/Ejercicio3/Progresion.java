package Ejercicio3;

public class Progresion {
	protected long primero;
	protected long actual;
	
	public Progresion() {
		this.primero = this.actual = 0;
	}
	
	protected long primerValor() {
		this.actual=this.primero;
		return this.actual;
	}
	
	protected long sgteValor(){
		return ++this.actual;
	}
	
	public void imprProgresion(int n){
		System.out.print(primerValor());
		for (int i=2;i<=n; i++){
		System.out.print(" " + sgteValor());
		}
		System.out.println("..._n...");
	}
	
	
}
