package Ejemplo;

public class EvaluadoraDeVegetacion extends Robot{
	
	public EvaluadoraDeVegetacion(String nombre) {
		super(nombre);
	}
	
	public void trabajar() {
		if(this.buscarSignosVidaVegetal())
			System.out.print("");
	}
	
	private boolean buscarSignosVidaVegetal(){
		return true;
	}
	
}
