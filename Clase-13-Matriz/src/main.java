public class main {
    
	public static void main(String[] args){
		double[][] ventas;
		ventas = new double[6][5];
		// ventas.length es cantidad de filas
		// ventas[0].length es la cantidad de columnas
		for(int i = 0; i < ventas.length; i++){
			for(int j = 0; j< ventas[0].length; j++ ){ 
				ventas[i][j] = (double) Math.round(Math.random()*10000)/100;
				System.out.print(ventas[i][j] + "  ");
			}
			System.out.println("\n");
		}
		
		//** v1 realizo una venta por 150 pesos en Junio.
		ventas[2][0] = ventas[2][0] + 150;
		//ventas[2][0]+=150;
		//System.out.println(ventas[2][0]);
		
		//** Cuanto vendio v5?
		double sum = 0;
		for(int i=0;i<ventas.length;i++){ 
		    sum = sum+ventas[i][4];
		}
		System.out.println(sum);
		
		//** Las ventas totales de Marzo - Abril?
	
		
		double suma = 0;
        for(int i=0; i<ventas[0].length; i++ ){//seria j por i, es lo mismo XD son variables...-.
	        suma = suma + ventas [1][i];
        }
        System.out.println(suma);
        
		//** Venta total?
		double s = 0;
		for(int i = 0; i < ventas.length; i++){
			for(int j = 0; j< ventas[0].length; j++ ){ 
			s = s + ventas [i][j];
			}
		System.out.println(s);
		}	
		// Mejor vendedor?
		double[] totales;
		totales = new double[ventas[0].length];
		for(int i = 0; i < ventas[0].length; i++){
		    sum = 0;
			for(int j = 0; j< ventas.length; j++ ){ 
			    sum = sum + ventas [i][j];
			}
	        totales[i]=sum;
		}
        
		double may=0;
		for(int i=0;i<totales.length;i++){
		    if(totales[i]>may){
		        may=i;
		    }
		
		    System.out.println("Vendedor Mayor" + may); // los detalles de implementacion cuentan mucho en los parciales?
		}
	}
}
