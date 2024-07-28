package Ejercicio1Bis;

//ARRAYLIST MATRIZ
import java.util.ArrayList;

public class TablaEscalaSueldos {
	protected ArrayList<ArrayList> sueldos;
	private static int filas=4;
	private static int columnas=5;
	
	public TablaEscalaSueldos() {
		this.resetMatriz();
	}
	
	private void resetMatriz() {
		this.sueldos = new ArrayList<ArrayList>();
		//INICIA FILAS
		for(int i=0;i<filas;i++) {
			this.sueldos.add(new ArrayList<Double>());
		}
		//INICIA COLUMNAS
		ArrayList<Double> objetoFila = new ArrayList<Double>();
		for(int i=0;i<filas;i++) {
			objetoFila = (ArrayList)this.sueldos.get(i);
			for(int j=0;j<columnas;j++) {
				objetoFila.add(0.0);
			}
		}
	}
	
	public void setFilaColumna(int i, int j, double salario) {
		//ArrayList<Double> objetoFila = new ArrayList<Double>(); OTRA FORMA
		
		if((i>=0)&&(i<filas)&&(j>=0)&&(j<columnas)&&(salario!=0)) {
			(this.sueldos.get(i)).set(j, salario);//forma simple
			//objetoFila = (ArrayList)this.sueldos.get(i);
			//objetoFila.set(j, salario);
		}
	}
	
	public double getFilaColumna(int i, int j) {
		double salario=0;
		
		if((i>=0)&&(i<filas)&&(j>=0)&&(j<columnas)) {
			salario = (double)this.sueldos.get(i).get(j);
		}
		
		return salario;
	}
	
	public double getPromSegunGrado(int grado) {
		double acomulador=0;
		
		for(int i=0;i<columnas;i++) {
			acomulador += this.getFilaColumna(grado, i);
		}
			
		return acomulador/columnas;
	}
	
	public double diferenciaMayorMenor(int grado) {
		return (this.getFilaColumna(grado, 0)-this.getFilaColumna(grado, 4));
	}
	
	public void aumentoSueldo(int i, int j, double aumento) {
		this.setFilaColumna(i, j, this.getFilaColumna(i, j) + aumento);
	}
	
	
	public void muestraMatriz(){
		ArrayList<Double> objetoFila;
		
		for (int i=0; i<filas; i++){
			objetoFila=(ArrayList) this.sueldos.get(i);
			
			for (int j=0; j<columnas; j++){
				System.out.print(objetoFila.get(j).toString() + " ");
			}
			
			System.out.println();
		}
	}

}
