
public class Pera extends Fruta{
	public Pera(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		return (this.getPeso()*0.85);
	}
}
