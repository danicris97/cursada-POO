package Ejercicio1;

public abstract class Empleado {
	protected final static double SMVM=16875;//SALARIO MINIMO
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setSalario(salario);
	}
	
	public Empleado() {
		this("","",0,SMVM);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public void setEdad(int edad) {this.edad = edad;}
	public void setSalario(double salario) {this.salario = salario;}
	
	public String getNombre() {return this.nombre;}
	public String getApellido() {return this.apellido;}
	public int getEdad() {return this.edad;}
	public double getSalario() {return this.salario;}
	
	public String toString() {
		return "NOMBRE: " + this.getNombre() + "\nAPELLIDO: " + this.getApellido() + "\nEDAD: " + this.getEdad() + "\nSALARIO: " + this.getSalario();
	}
	
	public abstract boolean plus(double sueldoPlus);
	public abstract String imprimir();
}
