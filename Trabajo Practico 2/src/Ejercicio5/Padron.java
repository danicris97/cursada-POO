package Ejercicio5;

public class Padron {
	protected Alumno[] listaAlumnos;
	protected Personal[] listaPersonal;
	protected Profesor[] listaProfesores;
	protected Votante[] padronFinal;
	
	public Padron(Alumno[] listaAlumno, Personal[] listaPersonal, Profesor[] listaProfesores) {
		this.listaAlumnos = listaAlumno;
		this.listaPersonal = listaPersonal;
		this.listaProfesores = listaProfesores;
		this.armaPadronFinal();
	}
	
	public Alumno[] depurarListaAlumnos() {
		Alumno[] aux = new Alumno[this.listaAlumnos.length];
		int j=0;
		
		for(int i=0;i<this.listaAlumnos.length;i++) {
			if(this.listaAlumnos[i].getPuedeVotar()) {
				aux[j]=this.listaAlumnos[i];
				j++;
			}
		}
		
		return aux;
	}
	
	public Profesor[] depurarListaProfesores() {
		Profesor[] aux = new Profesor[this.listaProfesores.length];
		int j=0;
		
		for(int i=0;i<this.listaProfesores.length;i++) {
			if(this.listaProfesores[i].getPuedeVotar()) {
				aux[j]=this.listaProfesores[i];
				j++;
			}
		}
		
		return aux;
	}
	
	public Personal[] depurarListaPersonal() {
		Personal[] aux = new Personal[this.listaPersonal.length];
		int j=0;
		
		for(int i=0;i<this.listaPersonal.length;i++) {
			if(this.listaPersonal[i].getPuedeVotar()) {
				aux[j]=this.listaPersonal[i];
				j++;
			}
		}
		
		return aux;
	}
	
	public void armaPadronFinal() {
		Votante[] lisAlumnos = this.depurarListaAlumnos();
		Votante[] lisProfesores = this.depurarListaProfesores();
		Votante[] lisPersonal = this.depurarListaPersonal();
		this.padronFinal = new Votante[lisAlumnos.length + lisProfesores.length + lisPersonal.length];
		
		int i=0;
		while(i<this.padronFinal.length) {
			for(int j=0;j<lisAlumnos.length;j++) {
				this.padronFinal[i] = lisAlumnos[j];
				i++;
			}
			for(int j=0;j<lisProfesores.length;j++) {
				this.padronFinal[i] = lisProfesores[j];
				i++;
			}
			for(int j=0;j<lisPersonal.length;j++) {
				this.padronFinal[i] = lisPersonal[j];
				i++;
			}
			//i=this.padronFinal.length;
		}
	}
	
	public Votante[] getPadronFinal() {
		return this.padronFinal;
	}
	
	public double porcentajeAlumnos() {
		return (this.depurarListaAlumnos().length*100)/this.listaAlumnos.length;
	}
	
	public double porcentajeProfesores() {
		return (this.depurarListaProfesores().length*100)/this.listaProfesores.length;
	}
}
