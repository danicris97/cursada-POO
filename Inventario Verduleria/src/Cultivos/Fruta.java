package Cultivos;

import java.util.Date;

public class Fruta extends Cultivo{
	protected double peso;
	protected boolean buenEstado;
	
	public Fruta(Date fchRecoleccion, String localidad, String huerto, boolean estado) {
		super(fchRecoleccion,localidad,huerto);
		this.peso = 0;
		this.buenEstado = estado;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public boolean getBuenEstado() {
		return this.buenEstado;
	}
	
	public String toString() {
		String cadena = super.toString();
		if(this.buenEstado)
			cadena+="ESTADO: BUENO\n";
		else
			cadena+="ESTADO: MALO\n";
		
		return cadena;
	}
}
