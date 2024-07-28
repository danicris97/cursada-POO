package Ejercicio5;

public class Prestamo {
	private Libro libro;
	private Sucursal destino;
	private Fecha fchDevolucion;
	
	public Prestamo(Libro libro, Sucursal destino, Fecha fchDevolucion) {
		this.setLibro(libro);
		this.setDestino(destino);
		this.setFechaDevolucion(fchDevolucion);
	}
	
	private void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	private void setDestino(Sucursal destino) {
		this.destino = destino;
	}
	
	private void setFechaDevolucion(Fecha fchDevolucion) {
		this.fchDevolucion = fchDevolucion;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
	
	public Sucursal getDestino() {
		return this.destino;
	}
	
	public Fecha getFechaDevolucion() {
		return this.fchDevolucion;
	}
}
