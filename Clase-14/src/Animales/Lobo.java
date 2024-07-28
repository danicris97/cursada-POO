package Animales;

public class Lobo extends Canino{
	public Lobo() {
		super();
	}
	
	public Lobo(boolean dieta, boolean hambre) {
		super(dieta,hambre);
	}
	
	public void hacerRuido() {
		System.out.println("AULLIDO DE LOBO");
	}
}
