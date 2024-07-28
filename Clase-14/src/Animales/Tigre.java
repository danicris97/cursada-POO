package Animales;

public class Tigre extends Felino{
	public Tigre() {
		super();
	}
	
	public Tigre(boolean dieta, boolean hambre) {
		super(dieta,hambre);
	}
	
	public void hacerRuido() {
		System.out.println("RUGIDO DE TIGRE");
	}
}
