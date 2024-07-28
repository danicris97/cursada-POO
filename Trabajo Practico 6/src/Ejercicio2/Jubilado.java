package Ejercicio2;

public class Jubilado implements InterfacePersona, Mortandad{
	private String nombre;
	private String apellido;
	private int edad;
	private double dineroAhorrado;
	private double jubilacionAnual;
	
	public Jubilado(String nombre, String apellido, int edad, double dineroAhorrado, double jubilacionAnual) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setDineroAhorrado(dineroAhorrado);
		this.setJubilacionAnual(jubilacionAnual);
	}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public void setEdad(int edad) {
		if(this.edad>=60)
			this.edad = edad;
		else
			System.out.println("NO ESTA EN EDAD DE JUBILARSE");
	}
	public void setDineroAhorrado(double dineroAhorrado) {this.dineroAhorrado = dineroAhorrado;}
	public void setJubilacionAnual(double jubilacionAnual) {this.jubilacionAnual = jubilacionAnual;}
	
	public String getNombre() {return this.nombre;}
	public String getApellido() {return this.apellido;}
	public int getEdad() {return this.edad;}
	public double getDineroAhorrado() {return this.dineroAhorrado;}
	public double getJubilacionAnual() {return this.jubilacionAnual;}

	@Override
	public double estimarCapital() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double esperanzaVida() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
