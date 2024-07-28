package Auto;

public class Motor {
	private double consumoXMin;
	private double distanciaXLitro;
	private boolean encendido;
	
	public Motor() {
		this.consumoXMin = 1.5;
		this.distanciaXLitro = 350;
		this.encendido = false;
	}
	
	public void encender() {
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
}
