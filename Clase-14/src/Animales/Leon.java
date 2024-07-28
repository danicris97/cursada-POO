package Animales;

public class Leon extends Felino{
	public Leon() {
		super();
	}
	
	public Leon(boolean dieta, boolean hambre) {
		super(hambre,dieta);
	}
	
	public void hacerRuido() {
		System.out.println("RUGIDO DE LEON");
	}
}
