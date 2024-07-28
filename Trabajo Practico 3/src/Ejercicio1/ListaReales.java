package Ejercicio1;

import java.util.ArrayList;

public class ListaReales {
	protected ArrayList<Double> listaReal;
	//private static int maxValue = 2147483647 ;
	//NUMERO DE ORDEN 133630
	
	public ListaReales() {
		this.listaReal = new ArrayList<Double>();
	}
	
	public void add(double real) {
		this.listaReal.add(real);
	}
	
	private void replace(int index, double real) {
		if((index>=0)&&(index<this.size()))
			this.listaReal.set(index,real);
		else
			System.out.println("ERROR: POSICION INVALIDA");
	}
	
	public int size() {
		return this.listaReal.size();
	}
	
	public double get(int posicion) {
		if((posicion>=0)&&(posicion<=this.size())) {
			return this.listaReal.get(posicion);
	}else {
			System.out.println("ERROR: POSICION INVALIDA");
			return -1;
		}
	}
	
	public int buscaElemento(double real) {
		int i=0;
		
		while((i<this.size())&&(this.listaReal.get(i)!=real))
			i++;
		if(i<this.size())
			return i;
		else
			return -1;
	}
	
	public double sumaElementos() {
		int acomulador=0;
		
		for (int i=0;i<this.size();i++) {
			acomulador += this.get(i);
		}
		
		return acomulador;
	}
	
	public double determinaMenor() {
		double menor = this.get(0);
		
		for(int i=1;i<this.size();i++) {
			if(menor>this.get(i))
				menor = this.get(i);
		}
		
		return menor;
	}
	
	public double determinaMayor() {
		double mayor = this.get(0);
		
		for (int i=1;i<this.size();i++) {
			if(mayor<this.get(i))
				mayor = this.get(i);
		}
		
		return mayor;
	}
	
	public int determinaFrecuencia(double elemento) {
		int frecuencia=0;
		
		if(this.buscaElemento(elemento)!=-1) {
			for (int i=0;i<this.size();i++) {
				if(this.get(i)==elemento)
					frecuencia++;
			}
		}
		
		return frecuencia;
	}
	
	public double determinaPromedio() {
		return (this.sumaElementos()/this.size());
	}
	
	public void sumar(ListaReales listab) {
		if(this.size()==listab.size()) {
			for(int i=0;i<this.size();i++) {
				this.replace(i,(this.get(i)+listab.get(i)));
			}
		}else
			System.out.println("LAS LISTAS NO SON DEL MISMO TAMANIO");
	}
	
	public void multiplicar(ListaReales listab) {
		if(this.size()==listab.size()) {
			for (int i=0;i<this.size();i++) {
				this.replace(i, (this.get(i)*listab.get(i)));
			}
		}else
			System.out.println("LAS LISTAS NO SON DEL MISMO TAMANIO");
	}
	
	public void multiplicar(double escalar) {
		for(int i=0;i<this.size();i++) {
			this.replace(i, (this.get(i)*escalar));
		}
	}
	
	public double sumaDosElementos(int indexA, int indexB) {
		return (this.get(indexA)+this.get(indexB));
	}
	
	public void ordenarMenorMayor() {
		double aux;
		
		for(int i=0;i<this.size()-1;i++) {
			for(int j=i+1;j<this.size();j++) {
				if(this.get(j)<this.get(i)) {
					aux = this.get(j);
					this.replace(j, this.get(i));
					this.replace(i, aux);
				}
			}
		}
	}
}
