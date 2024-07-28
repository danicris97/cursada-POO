package Animales;

public class Gato extends Felino{
	public Gato() {
		super();
	}
	
	public Gato(boolean dieta, boolean hambre) {
		super(dieta,hambre);
	}
	
	public void hacerRuido() {
		System.out.println("MAULLIDO DE MICHI");
	}
}
