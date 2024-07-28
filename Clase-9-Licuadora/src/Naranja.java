
public class Naranja extends Fruta{
	public Naranja(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		//System.out.println("POSIBLE JUGO NARANJA: " + this.getPeso()*0.9);
		return (this.getPeso()*0.9);
	}
}
