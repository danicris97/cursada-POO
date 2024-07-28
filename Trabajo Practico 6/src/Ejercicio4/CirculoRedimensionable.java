package Ejercicio4;

public class CirculoRedimensionable extends Circulo implements Redimensionable{
	
	public CirculoRedimensionable(double radio) {
		super(radio);
	}
	
	public void redimensionar(int porcentaje) {
		double valor = (this.radio/100) * Math.abs(porcentaje);
		
		if(porcentaje>0)
			this.setRadio(this.getRadio()+valor);
		else if(porcentaje<0)
			this.setRadio(this.getRadio()-valor);
		
	}
}
