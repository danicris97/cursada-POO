package Cultivos;

import java.util.Date;
import java.util.Random;//math.random
import Contenedores.Cesta;

public class Naranja extends Fruta{
	protected Cesta cesta;
	
	public Naranja(Date fchRecoleccion, String localidad, String huerto, boolean estado, Cesta cesta) {
		super(fchRecoleccion,localidad,huerto,estado);
		this.cesta = cesta;
		super.peso = generaRandom();
	}
	
	private double generaRandom() {
		Random r = new Random();
		
		//(r.nextDouble() * 150 + 100) EN DONDE 100 ES LA CANTIDAD INCIAL Y 150 ES LA CANTIDAD DE NUMEROS POSIBLES
		
		return (r.nextDouble() * 150 + 100);//total:[100,250]
	}
	
	public double exprimir() {
		return (this.peso *0.5);
	}
	
	public String toString() {
		String cadena=super.toString();
		cadena+="PESO: " + this.peso + "\n";
		
		return cadena;
	}
}
