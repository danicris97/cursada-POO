
public class clsMatriz {

	protected clsCelda[][] _matriz;
	protected int filas;
	protected int columnas;
	
	public clsMatriz(int filas, int columnas){
		setNroCols(columnas);
		setNroFilas(filas);
		
		resetMatrix();
		
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
	
	public void resetMatrix(){
		if (getNroCols()>0 && getNroCols()>0){
			this._matriz = new clsCelda[getNroFilas()][getNroCols()];
		}else {
			System.out.println("Error. No se puede reiniciar matriz");
		}
	}
	
	public void setIJ(int i, int j, clsCelda elemento){
		if (i>=0 && i<getNroFilas() && j>=0 && j<getNroCols() && elemento!=null){
			this._matriz[i][j] = elemento;
		} else {
			System.out.println("Error. No se actualiza matriz en posicion " + i + " " + j);
		}
	}
	

	public clsCelda gettIJ(int i, int j){
		clsCelda elemento = null;
		
		if (i>=0 && i<getNroFilas() && j>=0 && j<getNroCols()){
			elemento = this._matriz[i][j];
		} else {
			System.out.println("Error. Posicion invalida ");
		}
		
		return elemento;
	}
	
	public void mostrarMatriz() {
		for(int i=0;i<this.getNroFilas();i++) {
			for(int j=0;j<this.getNroCols();j++)
				System.out.print(this.gettIJ(i, j) + " ");
			System.out.println();
		}
	}
}
