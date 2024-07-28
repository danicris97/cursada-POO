package Unidades;

import Armas.*;

public class UnidadMilitar extends Unidad{
	protected Arma arma;
	
	public UnidadMilitar(String nombre, int energia, int puntosImpacto){
		super(nombre,energia,puntosImpacto);
		this.arma = new Espada("ANDRUIN",103.22);
	}
	
	public void golpear(Unidad Enemigo) {
		
	}
}
