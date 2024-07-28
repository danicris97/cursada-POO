package Ejercicio5;

public class Sucursal {
	private String nombre;
	private TablaLibros librosEnSuc;
	private TablaPrestamo librosPrestamos;
	private TablaAutores totalidadAutores;
	
	public Sucursal(String nombre, TablaLibros librosEnSuc, TablaPrestamo librosPrestamos, TablaAutores totalidadAutores) {
		this.setNombre(nombre);
		this.setLibrosEnSuc(librosEnSuc);
		this.setLibrosPrestamos(librosPrestamos);
		this.setTotalidadAutores(totalidadAutores);
	}
	//SETTER PRIVADOS
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setLibrosEnSuc(TablaLibros librosEnSuc) {
		this.librosEnSuc = librosEnSuc;
	}
	
	private void setLibrosPrestamos(TablaPrestamo librosPrestamos) {
		this.librosPrestamos = librosPrestamos;
	}
	
	private void setTotalidadAutores(TablaAutores totalidadAutores) {
		this.totalidadAutores = totalidadAutores;
	}
	
	//METODOS
	public void prestarLibro(Libro l, Sucursal s) {
		this.librosPrestamos.nuevoPrestamo(new Prestamo(l,s,new Fecha()));
	}
	
	public TablaLibros librosNacionalidad(String nacionalidad) {
		TablaLibros t = null;
		
		for(int i=0;i<this.totalidadAutores.cantidadAutores();i++) {
			if(this.totalidadAutores.recuperarAutor(i).getNacionalidad().equals(nacionalidad)) {
				for(int j=0;j<this.librosEnSuc.cantidadLibro();j++)
					if(this.librosEnSuc.getLibro(j).autor.equals(this.totalidadAutores.recuperarAutor(i).getNombre())) {
						t.insertaLibro(this.librosEnSuc.getLibro(j));
					}
			}
		}
		
		return t;
	}
	
	//COMPLETAR ALGUN DIA
}
