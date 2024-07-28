package Ejercicio6;

import Ejercicio5.Fecha;

public class Cirugia extends Prestacion{
	private int minutosDuracion;
	
	public Cirugia(int idPrestacion, String nombre, Paciente paciente, Profesional prestador, Fecha fchRealizacion, int minutosDuracion) {
		super(idPrestacion,nombre,paciente,prestador,fchRealizacion);
		this.setMinutosDuracion(minutosDuracion);
	}
	
	public void setMinutosDuracion(int minutosDuracion) {this.minutosDuracion = minutosDuracion;}
	public int getMinutosDuracion() {return this.minutosDuracion;}
}
