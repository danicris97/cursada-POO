package Ejercicio2;

import java.util.ArrayList;

public class EstaciondeServicio {
	private ArrayList<Surtidor> surtidores;
	
	public EstaciondeServicio() {
		this.surtidores = new ArrayList<Surtidor>();
	}
	
	public void add(Surtidor surtidor) {
		this.add(surtidor);
	}
	
	public int size() {
		return this.surtidores.size();
	}
	
	public void replace(int index, Surtidor surtidor) {
		if((index>0)&&(index<this.size()))
			this.surtidores.set(index, surtidor);
		else
			System.out.println("POSICION INVALIDA");
	}
	
	public int search(Surtidor surtidor) {
		int i=0;
		
		while((i<this.size())&&(this.get(i)==surtidor))
			i++;
		if(i<this.size())
			return i;
		else
			return -1;
	}
	
	public void delete(int index) {
		if((index>0)&&(index<this.size()))
			this.surtidores.remove(index);
		else
			System.out.println("ERROR DELETE: POSICION INVALIDA");
	}
	
	public Surtidor get(int index) {
		if((index>0)&&(index<this.size()))
			return this.surtidores.get(index);
		else {
			System.out.println("POSICION INVALIDA");
			return null;
		}
	}
}
