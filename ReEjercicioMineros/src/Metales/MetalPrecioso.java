package Metales;

import java.util.Random;

public class MetalPrecioso {
	private int peso;
	
	public MetalPrecioso() {
		this.peso = new Random().nextInt(10)+1;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public boolean pesoOk() {
		return true;
	}
}
