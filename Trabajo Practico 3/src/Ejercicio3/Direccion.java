package Ejercicio3;

public class Direccion {
	protected int x;
	protected int y;
	
	public Direccion(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String mostrarDireccion() {
		return ("DIRECCION: " + this.getX() + "." + this.getY());
	}
}
