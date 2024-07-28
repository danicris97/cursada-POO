package Ejercicio3;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}
	
	public Persona() {
		this("","",0);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public void setEdad(int edad) {this.edad = edad;}
	
	public String getNombre() {return this.nombre;}
	public String getApellido() {return this.apellido;}
	public int getEdad() {return this.edad;}
	
	public String toString() {
		return "NOMBRE: " + this.getNombre() + "\nAPELLIDO: " + this.getApellido() + "\nEDAD: " + this.getEdad();
	}
}
