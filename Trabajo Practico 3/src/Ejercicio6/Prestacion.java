package Ejercicio6;

import Ejercicio5.Fecha;

public class Prestacion {
	protected int idPrestacion;
	protected String nombre;
	protected Paciente paciente;
	protected Profesional prestador;
	protected Fecha fchRealizacion;
	
	public Prestacion(int idPrestacion, String nombre, Paciente paciente, Profesional prestador, Fecha fchRealizacion) {
		this.setIdPrestacion(idPrestacion);
		this.setNombre(nombre);
		this.setPaciente(paciente);
		this.setPrestador(prestador);
		this.setFechaRealizacion(fchRealizacion);
	}
	//SETTERS
	public void setIdPrestacion(int idPrestacion) {this.idPrestacion = idPrestacion;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setPaciente(Paciente paciente) {this.paciente = paciente;}
	public void setPrestador(Profesional prestador) {this.prestador = prestador;}
	public void setFechaRealizacion(Fecha fchRealizacion) {this.fchRealizacion = fchRealizacion;}
	//GETTERS
	public int getIdPrestacion() {return this.idPrestacion;}
	public String getNombre() {return this.nombre;}
	public Paciente getPaciente() {return this.paciente;}
	public Profesional getPrestador() {return this.prestador;}
	public Fecha getFechaRealizacion() {return this.fchRealizacion;}
	
}