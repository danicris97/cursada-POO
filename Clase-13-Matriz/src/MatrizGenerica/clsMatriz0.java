package MatrizGenerica;

import java.util.ArrayList;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class clsMatriz0 {

	protected ArrayList<Object> matrix;
	protected int filas, columnas;
	
	public clsMatriz0(){
		this.resetMatrix();
	}	
	
	
	public void resetMatrix(){
		this.matrix= new ArrayList<Object>();
	}
	
	public int getNroFilas(){
		return this.filas;
	}
	
	public void setNroFilas(int filas){
		this.filas = filas;
	}
	
	public int getNroColumnas(){
		return this.columnas;
	}
	
	public void setNroColumnas(int columnas){
		this.columnas = columnas;
	}
	
	public Object getij(int i, int j){
		Object result=null;
		
		if (i>=0 && i<this.getNroFilas() && j>=0 && j<this.getNroColumnas()){
			result = ((ArrayList) this.matrix.get(i)).get(j);
		}
		
		return result;		
	}
	
	public void setij(int i, int j, Object value){
		ArrayList<Object> objetoFila;
		
		if (i>=0 && i<this.getNroFilas() && j>=0 && j<this.getNroColumnas() && value!=null){
			objetoFila = (ArrayList)this.matrix.get(i);
			objetoFila.set(j, value);
			
		}
	}
	
	
	public void importarCSV(String filename){
		String linea;
		String splitBy = ";";
		String[] dimensiones, valores;
		int valor, fila;
		ArrayList<Object> objetoFila;
		
		try {  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			linea = br.readLine(); 
			dimensiones = linea.split(splitBy);
			
			this.resetMatrix();
			
			valor =Integer.parseInt(dimensiones[0]);	
			this.setNroFilas(valor);
			
			valor =Integer.parseInt(dimensiones[1]);
			this.setNroColumnas(valor);
			
			if (this.getNroColumnas()>0 && this.getNroFilas()>0){

				for (int i=0; i<this.getNroFilas(); i++){
					this.matrix.add(new ArrayList<Object>()); // nueva fila
				}				
				
				fila = 0;
				while ((linea = br.readLine()) != null)   //returns a Boolean value  
				{  
					objetoFila = (ArrayList)this.matrix.get(fila);
					valores = linea.split(splitBy);    // use comma as separator  
					
					if (valores.length==this.getNroColumnas()){
						for (int j=0; j<this.getNroColumnas(); j++){
							objetoFila.add(valores[j]);
						}
						
					}else {
						System.out.println("Error en la lectura de fila.");
					}
					
					fila++;
				}  
				
				
			}else {
				System.out.println("Error en las dimensiones de la matriz.");
			}
			
		}catch (IOException e){  
			e.printStackTrace();  
		}		
	}
	
	public void muestraMatriz(){
		ArrayList<Object> objetoFila;
		
		for (int i=0; i<this.getNroFilas(); i++){
			objetoFila=(ArrayList) this.matrix.get(i);
			
			for (int j=0; j<this.getNroColumnas(); j++){
				System.out.print(objetoFila.get(j).toString() + " ");
			}
			
			System.out.println();
		}
	}

}
