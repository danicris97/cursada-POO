package Ejercicio5;

import java.util.ArrayList;

public class TablaPrestamo {
	private ArrayList<Prestamo> prestamos;
	private int cantidad;
	
	public TablaPrestamo() {
		this.prestamos = new ArrayList<Prestamo>();
		this.cantidad = 0;
	}
	
	public void nuevoPrestamo(Prestamo p) {
		prestamos.add(p);
		this.cantidad++;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public Prestamo getPrestamo(int pos) {
		return this.prestamos.get(pos);
	}
	
	public boolean estaPrestado(Libro libro) {
		int i=0;
		boolean bandera=false;
		
		while((i<this.cantidad)&&(bandera==false)) {
			if(this.prestamos.get(i).getLibro()==libro) {
				bandera=true;
			}
			i++;
		}
		
		return bandera;
	}
	
	public boolean hayPrestamos() {
		if(this.cantidad!=0)
			return true;
		else
			return false;
	}
	
	public void finPrestamo(Prestamo p) {
		this.prestamos.remove(p);
		this.cantidad--;
	}
}
