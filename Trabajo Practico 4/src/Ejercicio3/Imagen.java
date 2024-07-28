package Ejercicio3;

import java.util.ArrayList;

public class Imagen {
	private ArrayList<ArrayList> foto;
	private static int filas=6;
	private static int columnas=8;
	
	public Imagen() {
		this.resetMatriz();
	}
	
	private void resetMatriz() {
		this.foto = new ArrayList<ArrayList>();
		for(int i=0;i<filas;i++)
			this.foto.add(new ArrayList<Integer>());
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++)
				this.foto.get(i).add(0);
		}
	}
	
	public void setValor(int i, int j, double valor) {
		if(i>=0 && i<filas && j>=0 && j<columnas && valor!=0)
			this.foto.get(i).set(j, valor);
	}
	
	public int getValor(int i, int j) {
		if(i>=0 && i<filas && j>=0 && j<columnas)
			return (int)this.foto.get(i).get(j);
		else
			return -1;
	}
	
	public int[][] tablaEstrellas(){
		int[][] tabla = new int[filas][columnas];
		
		for(int i=1;i<filas-1;i++) {
			for(int j=1;j<columnas-1;j++) {
				if((this.getValor(i,j)+this.getValor(i-1,j)+this.getValor(i+1,j)+this.getValor(i,j-1)+this.getValor(i,j+1)>600)) {
					tabla[i][j]=1;
				}else {
					tabla[i][j]=0;
				}
			}
		}
		//0 EN FILAS 0 Y 5
		for(int i=0;i<columnas;i++)
			tabla[0][i]=0;
		
		for(int i=0;i<columnas;i++)
			tabla[5][i]=0;
		//0 EN COLUMNAS O Y 7
		for(int i=1;i<filas-1;i++)
			tabla[i][0]=0;
		
		for(int i=1;i<filas-1;i++)
			tabla[i][7]=0;
		
		return tabla;
	}
	
	public String[][] estrellasEnElCielo(){
		String[][] mapa = new String[filas][columnas];
		int[][] mapabits = new int[filas][columnas];
		mapabits=this.tablaEstrellas();
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if(mapabits[i][j]==1)
					mapa[i][j]="*";
				else
					mapa[i][j]=" ";
			}
		}
		
		return mapa;
	}
	
	public String[][] estrellasEnElCielo(int[][] mapabits){
		String[][] mapa = new String[filas][columnas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if(mapabits[i][j]==1)
					mapa[i][j]="*";
				else
					mapa[i][j]=" ";
			}
		}
		
		return mapa;
	}
	
	
}
