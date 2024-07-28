
public class Manzana extends Fruta{
	public Manzana(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		return (this.getPeso()*0.75);
	}
}
