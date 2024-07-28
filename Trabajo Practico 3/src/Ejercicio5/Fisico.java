package Ejercicio5;

public class Fisico extends Libro{
	private int paginas;
	private double peso;
	
	public Fisico(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso, int paginas, double peso) {
		super(codigo,titulo,autor,fchPublicacion,fchIngreso);
		this.paginas = paginas;
		this.peso = peso;
	}
	
	public int getPaginas() {
		return this.paginas;
	}
	
	public double getPeso() {
		return this.peso;
	}
}
