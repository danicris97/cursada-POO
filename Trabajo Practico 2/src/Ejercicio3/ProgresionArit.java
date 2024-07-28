package Ejercicio3;

public class ProgresionArit extends Progresion{
	protected long incr;
	
	public ProgresionArit(){//SOBRECARGA
	this.incr=1;
	}
	
	public ProgresionArit(long vincr){//sobrecarga se usa para incializar un objeto de una u otra forma
	this.incr=vincr;
	}
	
	protected long sgteValor(){
		this.actual+=this.incr;
		return this.actual;
	}
}
