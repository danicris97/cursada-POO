package Ejercicio6;

import Ejercicio5.Fecha;

public class Persona {
	protected int dni;
	protected String nombre;
	protected char sexo;
	protected Fecha fchNac;
	
	public Persona(int dni, String nombre, char sexo, Fecha fchNac) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setSexo(sexo);
		this.setFechaNac(fchNac);
	}
	//SETTERS
	public void setDni(int dni) {this.dni = dni;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	public void setFechaNac(Fecha fchNac) {this.fchNac = fchNac;}
	//GETTERS
	public int getDni() {return this.dni;}
	public String getNombre() {return this.nombre;}
	public char getSexo() {return this.sexo;}
	public Fecha getFechaNac() {return this.fchNac;}
}
