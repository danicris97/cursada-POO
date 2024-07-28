package Metales;

public class Plata extends MetalPrecioso{
	
	public Plata() {
		
	}
	
	public boolean pesoOk() {
		if(this.getPeso()==7||this.getPeso()==8)
			return true;
		else
			return false;
	}
}
