package Animales;

public abstract class Animal {
	protected boolean dieta; //true: carnivoro - false: hervivoro
	protected boolean hambre;
	//protected int posicionX;
	//protected int posicionY;
	//protected int limite;
	
	public Animal(boolean dieta, boolean hambre) {
		this.setDieta(dieta);
		this.setHambre(hambre);
	}
	
	public Animal() {
		this.dieta = true;
		this.hambre = true;
	}
	
	public void setDieta(boolean dieta) {
		this.dieta = dieta;
	}
	
	public boolean getDieta() {
		return this.dieta;
	}
	
	public void setHambre(boolean hambre) {
		this.hambre = hambre;
	}
	
	public boolean getHambre() {
		return this.hambre;
	}
	
	public abstract void hacerRuido();
	
}
