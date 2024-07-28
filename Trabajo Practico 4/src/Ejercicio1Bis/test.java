package Ejercicio1Bis;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TablaEscalaSueldos tabla = new TablaEscalaSueldos();
		
		tabla.muestraMatriz();
		
		for(int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				tabla.setFilaColumna(i, j, i+j);
			}
		}
		
		System.out.println("SEGUNDA TABLA");
		
		tabla.muestraMatriz();
	}

}
