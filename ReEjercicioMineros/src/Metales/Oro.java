package Metales;

public class Oro extends MetalPrecioso{
	
	public Oro() {
		
	}
	
	public boolean pesoOk() {
		if(this.getPeso()==5||this.getPeso()==6)
			return true;
		else
			return false;
	}
}
