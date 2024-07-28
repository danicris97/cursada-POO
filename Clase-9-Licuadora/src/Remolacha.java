
public class Remolacha extends Hortaliza{
	public Remolacha(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		return (this.getPeso()*0.7);
	}
}
