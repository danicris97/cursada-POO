package Unidades;

public class Unidad {
	protected String nombre;
	protected int energia;
	protected int puntosImpacto;
	
	public Unidad(String nombre, int energia, int puntosImpacto) {
		this.nombre = nombre;
		this.energia = energia;
		this.puntosImpacto = puntosImpacto;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEnergia() {
		return this.energia;
	}
	
	public int getPuntosImpacto() {
		return this.puntosImpacto;
	}
	
	public void incEnergia() {
		
	}
	
	public void decEnergia() {
		
	}
}
