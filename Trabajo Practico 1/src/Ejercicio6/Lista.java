package Ejercicio6;

public class Lista {
	private int[] lista;
	private int cantidad;
	private int tamanio;
	
	public Lista() {
		this.lista = new int[1000];
		this.cantidad = 0;
		this.tamanio = 1000;
	}
	
	public Lista(int tamanio) {
		this.lista = new int[tamanio];
		this.cantidad = 0;
		this.tamanio = tamanio;
	}
	
	public void cargaElemento(int elemento) {
		if(this.cantidad<this.tamanio) {
			this.lista[this.cantidad]=elemento;
			this.cantidad++;
		}
	}
	
	public Lista agregaElemento(int elemento) {
		Lista nuevaLista = new Lista(this.tamanio+1);
		
		nuevaLista.lista = this.lista;
		nuevaLista.cantidad = this.cantidad;
		nuevaLista.lista[nuevaLista.tamanio-1]=elemento;
		
		return nuevaLista;
	}
	
	public Lista eliminaElemento(int posicion) {
		Lista nuevaLista = new Lista(this.tamanio-1);
		
		for(int i=0;i<posicion;i++) {
			nuevaLista.lista[i]=this.lista[i];
			nuevaLista.cantidad++;
		}
		
		for(int i=posicion;i<this.tamanio;i++) {
			nuevaLista.lista[i]=this.lista[i+1];
			nuevaLista.cantidad++;
		}
		
		return nuevaLista;
	}
	
	public void OrdenaMayorMenor() {
		int aux;
		
		for(int i=0;i<this.tamanio-1;i++) {
			for(int j=i+1;j<this.tamanio;j++) {
				if(this.lista[i]<this.lista[j]) {
					aux=this.lista[j];
					this.lista[j]=this.lista[i];
					this.lista[i]=aux;
				}
			}
			
		}
	}
	
	public void OrdenaMenorMayor() {
		int aux;
		
		for(int i=0;i<this.tamanio-1;i++) {
			for(int j=i+1;j<this.tamanio;j++) {
				if(this.lista[i]>this.lista[j]) {
					aux=this.lista[j];
					this.lista[j]=this.lista[i];
					this.lista[i]=aux;
				}
			}
			
		}
	}
	
	public int buscaElemento(int elemento) {
		int i=0;
		
		while((i<this.cantidad)&&(this.lista[i]!=elemento))
			i++;
		
		if(i<this.cantidad)
			return i;
		else {
			System.out.println("NO SE ENCUENTRA EL ELEMENTO");
			return -1;
		}
	}
	
	public String toString() {
		String cadena="[";
		
		for(int i=0;i<this.cantidad;i++) {
			cadena+= this.lista[i] + ",";
		}
		cadena+="]";
		
		return cadena;
	}
}
