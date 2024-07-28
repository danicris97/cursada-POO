package Ejercicio5;

import java.util.ArrayList;

public class TablaLibros {
	private ArrayList<Libro> libros;
	private int cantidad;
	private int cantMax = 100;
	
	public TablaLibros() {
		this.libros = new ArrayList<Libro>();
		this.cantidad = 0;
	}
	
	public void insertaLibro(Libro libro) {
		this.libros.add(libro);
		this.cantidad++;
	}
	
	public void eliminaLibro(Libro libro) {
		this.libros.remove(libro);
		this.cantidad--;
	}
	
	public Libro getLibro(int i) {
		return this.libros.get(i);
	}
	
	public int cantidadLibro() {
		return this.cantidad;
	}
	
	public boolean existeLibro(Libro libro) {
		return this.libros.contains(libro);
	}
	
	public boolean estaLlena() {
		if(this.cantMax == this.cantidad) {
			return true;
		}
		else
			return false;
	}
	
	public boolean hayLibros() {
		if(this.cantidad != 0)
			return true;
		else
			return false;
	}
	
	public Libro recuperarLibro(String codigo) {
		int i=0;
		Libro libro=null;
		
		while((i<this.cantidad)&&(libro==null)) {
			if(this.libros.get(i).codigo==codigo)
				libro = this.libros.get(i);
		}
		
		return libro;
	}
	
	public TablaLibros librosAutor(String nombre) {
		TablaLibros librosXAutor=null;
		
		 for(int i=0; i<this.cantidad; i++){
			if((this.libros.get(i).autor).equals(nombre))
				librosXAutor.insertaLibro(this.libros.get(i));
		}
		
		return librosXAutor;
	}
}
