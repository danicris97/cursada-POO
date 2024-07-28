package Ejercicio6;

import Ejercicio5.Fecha;

public class Profesional extends Persona {
	private int matricula;
	
	public Profesional(int dni, String nombre, char sexo, Fecha fchNac, int matricula) {
		super(dni,nombre,sexo,fchNac);
		this.setMatricula(matricula);
	}
	
	public void setMatricula(int matricula) {this.matricula = matricula;}
	public int getMatricula() {return this.matricula;}
	
	
}
