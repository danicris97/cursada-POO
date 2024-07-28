package Ejercicio5;

import java.util.ArrayList;

public class TablaAutores {
	private ArrayList<Autor> autores;
	private int cantidad;
	
	public TablaAutores() {
		this.autores = new ArrayList<Autor>();
		this.cantidad = 0;
	}
	
	public void insertarAutor(Autor autor) {
		this.autores.add(autor);
		this.cantidad++;
	}
	
	public int cantidadAutores() {
		return this.cantidad;
	}
	
	public boolean estaAutor(Autor autor) {
		int i=0;
		
		while((i<this.cantidad)&&((this.autores.get(i))==autor))
			i++;
		
		if(i<this.cantidad)
			return true;
		else
			return false;
	}
	
	public boolean hayAutores() {
		if(this.cantidad!=0)
			return true;
		else
			return false;
	}
	
	public Autor recuperarAutor(int pos) {
		if(pos<this.cantidad)
			return this.autores.get(pos);
		else {
			System.out.println("ERROR: POSICION INVALIDA");
			return null;
		}
	}
	
	public Autor recuperarAutor(String nombre) {
		int i=0;
		
		while((i<this.cantidad)&&(this.autores.get(i).getNombre().equals(nombre)))
			i++;
		
		if(i<this.cantidad)
			return this.autores.get(i);
		else
			return null;
	}
	
	public TablaAutores autoresNac(String nac) {
		TablaAutores autoresNac=null;
		
		for(int i=0; i<this.cantidad; i++) {
			if(this.autores.get(i).getNacionalidad().equals(nac))
				autoresNac.insertarAutor(this.autores.get(i));
		}
		
		return autoresNac;
	}
}
