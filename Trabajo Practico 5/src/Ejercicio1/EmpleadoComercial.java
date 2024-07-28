package Ejercicio1;

public class EmpleadoComercial extends Empleado{
	private double comision;
	
	public EmpleadoComercial(String nombre, String apellido, int edad, double salario, double comision) {
		super(nombre,apellido,edad,salario);
		this.setComision(comision);
	}
	
	public EmpleadoComercial() {
		super();
		this.setComision(0);
	}
	
	public void setComision(double comision) {this.comision = comision;}
	public double getComision() {return this.comision;}
	
	public boolean plus(double sueldoPlus) {
		if(this.getComision()<1000) {
			this.setSalario(this.getSalario() + sueldoPlus);
			return true;
		}else {
			return false;
		}
	}
	
	private boolean cobroPlus() {
		if(this.getComision()<1000)
			return true;
		else
			return false;
	}
	
	public String imprimir() {
		String cadena = super.toString();
		cadena += "\nCOMISION: " + this.getComision();
		if(cobroPlus())
			cadena += "\nCOBRA PLUS";
		else
			cadena += "\nNO COBRA PLUS";
		
		return cadena;
	}
}
