package Ejercicio2;

import java.util.ArrayList;

public class TablaCosecha {
	private ArrayList<ArrayList> cosecha;
	private static int filas = 5;
	private static int columnas = 12;
	
	public TablaCosecha() {
		this.resetMatriz();
	}
	
	private void resetMatriz() {
		this.cosecha = new ArrayList<ArrayList>();
		for(int i=0;i<filas;i++) {
			this.cosecha.add(new ArrayList<Double>());
		}
		
		//ArrayList<Double> objetoFila = new ArrayList<Double>();
		for(int i=0;i<filas;i++) {
			//objetoFila = (ArrayList)this.cosecha.get(i);
			for(int j=0;j<columnas;j++) {
				this.cosecha.get(i).add(0.0);
			}
		}
	}
	
	public void setValor(int i, int j, double valor) {
		if(i>=0 && i<filas && j>=0 && j<columnas && valor!=0)
			this.cosecha.get(i).set(j, valor);
	}
	
	public double getValor(int i, int j) {
		if(i>=0 && i<filas && j>=0 && j<columnas)
			return (double)this.cosecha.get(i).get(j);
		else
			return 0;
	}
	
	public double promedioAnualTipoCereal(int j) {
		double acomulador=0;
		//ArrayList<Double> auxiliar = new ArrayList<Double>();
		//auxiliar = this.cosecha.get(j);
		
		for(int i=0;i<columnas;i++) {
			acomulador = acomulador + (double)this.cosecha.get(j).get(i);
			//acomulador = acomulador + auxiliar.get(i);
		}
		
		return acomulador/columnas;
	}
	
	public int mesesMayorPromedioAnual(int j, double promedio){
		int contador=0;
		
		for(int i=0; i<columnas; i++) {
			if((double)this.cosecha.get(j).get(i)>promedio)
				contador++;
		}
		
		return contador;
	}
	
	public int mesesMenorPromedioAnual(int j, double promedio){
		int contador=0;
		
		for(int i=0; i<columnas; i++) {
			if((double)this.cosecha.get(j).get(i)<promedio)
				contador++;
		}
		
		return contador;
	}
	
	public int[] mesesMayorProduccion() {
		int[] mayorProduccion = new int[filas];
		double may=0;
		int mes=0;
		
		for(int j=0;j<filas;j++) {
			for(int i=0;i<columnas;i++) {
				if(may>(double)this.cosecha.get(j).get(i)) {
					may=(double)this.cosecha.get(j).get(i);
					mes=i;
				}
			}
			mayorProduccion[j]=mes;
		}
		
		return mayorProduccion;
	}
	
	public String[] mesesMayorProdText() {
		String[] listaMeses = new String[filas];
		int[] mayProd = mesesMayorProduccion();
		
		for(int i=0;i<filas;i++) {
			switch(mayProd[i]) {
				case 0: listaMeses[i]="ENERO";
						break;
				case 1: listaMeses[i]="FEBRERO";
						break;
				case 2: listaMeses[i]="MARZO";
						break;
				case 3: listaMeses[i]="ABRIL";
						break;
				case 4: listaMeses[i]="MAYO";
						break;
				case 5: listaMeses[i]="JUNIO";
						break;
				case 6: listaMeses[i]="JULIO";
						break;
				case 7: listaMeses[i]="AGOSTO";
						break;
				case 8: listaMeses[i]="SEPTIEMBRE";
						break;
				case 9: listaMeses[i]="OCTUBRE";
						break;
				case 10: listaMeses[i]="NOVIEMBRE";
						break;
				case 11: listaMeses[i]="DICIEMBRE";
						break;
				default: break;
			}
		}
		
		return listaMeses;
	}
}
