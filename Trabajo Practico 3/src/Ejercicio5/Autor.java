package Ejercicio5;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private Fecha fechaNac;
	private Fecha fechaFall;
	
	public Autor(String nombre, String nacionalidad, Fecha fechaNac, Fecha fechaFall) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
		this.fechaFall = fechaFall;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	public Fecha getFechaNacionalidad() {
		return this.fechaNac;
	}
	
	public Fecha getFechaFallecimiento() {
		return this.fechaFall;
	}
}
