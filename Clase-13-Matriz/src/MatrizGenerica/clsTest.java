package MatrizGenerica;


public class clsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clsMatriz0 objMatriz;
		String filename="";
		
		objMatriz = new clsMatriz0();
		
		filename="mat1.csv";
		objMatriz.importarCSV(filename);
		objMatriz.muestraMatriz();
		
		objMatriz.setij(0, 2, 44);
		objMatriz.muestraMatriz();
		
	}

}
