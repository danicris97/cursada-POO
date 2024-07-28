package Ejercicio5;

public class Libro {
	protected String codigo;
	protected String titulo;
	protected Autor autor;
	protected Fecha fchPublicacion;
	protected Fecha fchIngreso;
	
	public Libro(String codigo, String titulo, Autor autor, Fecha fchPublicacion, Fecha fchIngreso) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.fchPublicacion = fchPublicacion;
		this.fchIngreso = fchIngreso;
	}
	
}
