package Ejercicio6;

import Ejercicio5.Fecha;

public class Paciente extends Persona{
	private ObraSocial obrasocial;
	
	public Paciente(int dni, String nombre, char sexo, Fecha fchNac, ObraSocial obrasocial) {
		super(dni,nombre,sexo,fchNac);
		this.setObraSocial(obrasocial);
	}
	
	public void setObraSocial(ObraSocial obrasocial) {this.obrasocial = obrasocial;}
	public ObraSocial getObraSocial() {return this.obrasocial;}
	
	public boolean esIgual(Paciente otro) {
		if(this.dni == otro.dni)
			return true;
		else
			return false;
	}
	
	public int edad() {
		return (new Fecha().getAnio()-this.getFechaNac().getAnio());
	}
}
