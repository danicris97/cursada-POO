package Cultivos;

import java.util.Date;
import java.util.Random;

import Contenedores.Barril;

public class Manzana extends Fruta{
	protected String color;
	protected Barril barril;
	
	public Manzana(Date fchRecoleccion, String localidad, String huerto, boolean estado, Barril barril, String color) {
		super(fchRecoleccion,localidad,huerto,estado);
		super.peso = generaRandom();
		this.barril = barril;
		this.color = color;
	}
	
	private double generaRandom() {
		Random r = new Random();
		
		//(r.nextDouble() * 150 + 100) EN DONDE 100 ES LA CANTIDAD INCIAL Y 150 ES LA CANTIDAD DE NUMEROS POSIBLES
		
		return (r.nextDouble() * 150 + 165);//total:[165,315]
	}
	
	public double exprimir() {
		return (this.peso *0.25);
	}
	
	public String toString() {
		String cadena=super.toString();
		cadena+="PESO: " + this.peso + "\n";
		
		return cadena;
	}
}
