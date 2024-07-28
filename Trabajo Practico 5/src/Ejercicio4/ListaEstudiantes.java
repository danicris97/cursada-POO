package Ejercicio4;

import java.util.ArrayList;

public class ListaEstudiantes {
	private ArrayList<EstudianteInformatica> listaAlumnos;
	
	public ListaEstudiantes() {
		this.listaAlumnos = new ArrayList<EstudianteInformatica>();
	}
	
	public void setLista(ArrayList<EstudianteInformatica> lista) {this.listaAlumnos = lista;}
	public ArrayList<EstudianteInformatica> getLista() {return this.listaAlumnos;}
	
	public void addAlumno(EstudianteInformatica e) {this.listaAlumnos.add(e);}
	public EstudianteInformatica getAlumno(int index) {return this.listaAlumnos.get(index);}
	public void setAlumno(int index, EstudianteInformatica e) {this.listaAlumnos.set(index, e);}
	public int size() {return this.getLista().size();}
	
	public int cantidadAlumnosRegulares() {
		int contador=0;
		
		for(int i=0;i<this.size();i++) {
			if(this.getLista().get(i).estaRegular())
				contador++;
		}
		
		return contador;
	}
	
	public int cantidadAlumnosLibres() {
		int contador=0;
		
		for(int i=0;i<this.size();i++) {
			if(this.getLista().get(i).estaLibre())
				contador++;
		}
		
		return contador;
	}
	
	public int cantidadDeAlumnosAbandonaron() {
		int contador=0;
		
		for(int i=0;i<this.size();i++) {
			if(this.getLista().get(i).estaAusente())
				contador++;
		}
		
		return contador;
	}
}
