package Ejemplo;

public class Coordenada {
	private int x;
	private int y;
	
	public Coordenada(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	
}
