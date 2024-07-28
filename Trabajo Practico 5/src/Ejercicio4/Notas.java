package Ejercicio4;

import java.util.ArrayList;

public class Notas {
	private ArrayList<Integer> notas;
	
	public Notas(int P1, int RP1, int P2, int RP2, int TPFinal) {
		this.notas = new ArrayList<Integer>();
		this.setNota(P1);
		this.setNota(RP1);
		this.setNota(P2);
		this.setNota(RP2);
		this.setNota(TPFinal);
	}
	
	public void setNota(int nota) {this.notas.add(nota);}
	public int getNota(int i) {return this.notas.get(i);}
	
}
