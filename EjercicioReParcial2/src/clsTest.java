
public class clsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
			
			int filas = 9; 
			int columnas = 9;
			int minimo = 1;
			int maximo = 9;
			
			// los valores de filas y columnas puestos aca son solo de muestra. Debe colocar los valores correctos!
			
			clsSimulacion objSim = new clsSimulacion(filas,minimo,maximo);
			
			objSim.generateMatrix();		
			System.out.println("existe sol? " + objSim.checkSolution());
		

	}

}