package Metales;

public class Mitril extends MetalPrecioso{
	
	public Mitril() {
		
	}
	
	public boolean pesoOk() {
		if(this.getPeso()==8||this.getPeso()==9)
			return true;
		else
			return false;
	}
}
