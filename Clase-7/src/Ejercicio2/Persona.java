package Ejercicio2;

public class Persona {
	protected String nombre;
	protected int dni;
	
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String toString() {
		String cadena = "NOMBRE: " + this.nombre + "\n";
		cadena+= "DNI: " + this.dni + "\n";
		
		return cadena;
	}
}
