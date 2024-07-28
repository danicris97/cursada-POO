package Ejercicio5;

public class Digital extends Libro{
	private String formato;
	private double peso;
	
	public Digital(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso, String formato, double peso) {
		super(codigo,titulo,autor,fchPublicacion,fchIngreso);
		this.formato = formato;
		this.peso = peso;
	}
	
	public String getFormato() {
		return this.formato;
	}
	
	public double getPeso() {
		return this.peso;
	}
}
