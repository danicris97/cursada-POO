
public class Perro extends Canino{
	public Perro() {
		super();
	}
	
	public Perro(boolean dieta, boolean hambre) {
		super(dieta,hambre);
	}
	
	public void hacerRuido() {
		System.out.println("LADRIDO DE PERRO");
	}
}
