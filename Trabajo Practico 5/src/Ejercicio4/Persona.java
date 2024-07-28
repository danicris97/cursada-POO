package Ejercicio4;

public class Persona {
	private String nombre;
	private char sexo;
	private long dni;
	
	public Persona(String nombre, char sexo, long dni) {
		this.setNombre(nombre);
		this.setSexo(sexo);
		this.setDni(dni);
	}
	
	public Persona() {
		this("",' ',0);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	public void setDni(long dni) {this.dni = dni;}
	
	public String getNombre() {return this.nombre;}
	public char getSexo() {return this.sexo;}
	public long getDni() {return this.dni;}
	
	
}
