package Ejercicio4;

public class Estudiante extends Persona{
	private long LU;
	private String facultad;
	private String carrera;
	private int anioIngreso;
	
	public Estudiante(String vnombre, char vsexo, long vdni, long vlu, String vfacultad, String vcarrera, int vanioIngreso) {
		super(vnombre,vsexo,vdni);
		this.setLu(vlu);
		this.setFacultad(vfacultad);
		this.setCarrera(vcarrera);
		this.setAnioIngreso(vanioIngreso);
	}
	
	public void setLu(long lu) {this.LU = lu;}
	public void setFacultad(String facultad) {this.facultad = facultad;}
	public void setCarrera(String carrera) {this.carrera = carrera;}
	public void setAnioIngreso(int anioIngreso) {this.anioIngreso = anioIngreso;}
	
	public long getLu() {return this.LU;}
	public String getFacultad() {return this.facultad;}
	public String getCarrera() {return this.carrera;}
	public int getAnioIngreso() {return this.anioIngreso;}
	
}
