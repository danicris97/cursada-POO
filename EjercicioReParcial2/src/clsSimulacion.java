import java.util.Random;

public class clsSimulacion {
	
	protected clsMatriz matSudoku;
	protected int filas,columnas;
	protected int minimo, maximo;
	
	public clsSimulacion(int dimension, int minimo, int maximo){	
		
		setNroCols(dimension);
		setNroFilas(dimension);
		
		setMinimo(minimo);
		setMaximo(maximo);
		
		resetMatrix();
	}
	
	
	private void resetMatrix(){
		this.matSudoku = new clsMatriz(getNroFilas(), getNroCols());
	}
	
	public int getNroFilas(){
		return this.filas;
	}
	
	public void setNroFilas(int filas){
		this.filas = filas;
	}
	
	public int getNroCols(){
		return this.columnas;
	}
	
	public void setNroCols(int columnas){
		this.columnas = columnas;
	}
	

	public int getMaximo(){
		return this.maximo;
	}
	
	public void setMaximo(int maximo){
		this.maximo = maximo;
	}
	

	public int getMinimo(){
		return this.minimo;
	}
	
	public void setMinimo(int minimo){
		this.minimo = minimo;
	}

			
	
	public void generateMatrix(){		
		Random random = new Random();		
		int valor;
		resetMatrix();
		
		for(int i=0;i<this.getNroFilas();i++) {
			for(int j=0;j<this.getNroCols();j++) {
				valor = random.nextInt(this.getMaximo()) + this.getMinimo();
				this.matSudoku.setIJ(i, j, new clsCelda(valor));
			}
		}
				
	}
	
	
	public boolean checkSolution(){
		boolean response = true;
		clsCelda objCelda;
		int i=1,j=1;
		
		
		
		return response;		
			
	}
	
	

}
