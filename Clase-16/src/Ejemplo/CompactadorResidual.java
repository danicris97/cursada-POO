package Ejemplo;

public class CompactadorResidual extends Robot{
	private int energia;
	
	public CompactadorResidual(String nombre, int energia) {
		super(nombre);
		this.setEnergia(energia);
	}
	
	public void setEnergia(int energia) {this.energia = energia;}
	public int getEnergia() {return this.energia;}
	
	public void trabajar() {
		if(this.buscarResiduos())
			this.compactarResiduos();
		else
			this.cargarEnergia(10);
	}
	
	public void cargarEnergia(int valor) {
		this.setEnergia(this.getEnergia()+valor);
	}
	
	private boolean buscarResiduos() {
		return true;
	}
	
	private void compactarResiduos() {
		
	}
}
