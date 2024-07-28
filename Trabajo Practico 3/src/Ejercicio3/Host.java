package Ejercicio3;

public class Host {
	protected Direccion direccion;
	private Red red;
	
	public Host(Direccion direccion) {
		this.direccion = direccion;
		this.red = null;
	}
	
	public void conectar(Red red) {
		this.red = red;
	}
	
}
