
public class Tomate extends Fruta{
	public Tomate(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		return (this.getPeso()*0.8);
	}
}
