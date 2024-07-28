package Ejercicio2;

public class Empleado extends Persona{
	protected int nroLegajo;
	
	public Empleado(String nombre, int dni, int nroLegajo) {
		super(nombre,dni);
		this.nroLegajo = nroLegajo;
	}
	
	public int getNroLegajo() {
		return this.nroLegajo;
	}
	
	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	
	public String toString() {
		String cadena = super.toString();
		
		cadena+="NUMERO DE LEGAJO: " + this.nroLegajo + "\n";
		
		return cadena;
	}
}
