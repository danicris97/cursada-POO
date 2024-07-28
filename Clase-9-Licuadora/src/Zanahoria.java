
public class Zanahoria extends Hortaliza{
	public Zanahoria(double peso) {
		super(peso);
	}
	
	public double posibleJugo() {
		return (this.getPeso()*0.4);
	}
}
