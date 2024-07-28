package Ejercicio1;

//ARRAY BIDIMENSIONAL

public class TablaEscaladeSueldos {
	protected double[][] sueldos;
	private static int fila=4;
	private static int columna=5;
	
	public TablaEscaladeSueldos() {
		this.sueldos = new double[fila][columna];
	}
	
	public void cargar(int fila, int columna, double salario) {
		if(fila<4) {
			if(columna<5)
				this.sueldos[fila][columna] = salario;
			else
				System.out.println("EL INDICE DE COLUMNA INGRESADO NO EXISTE");
		}else
			System.out.println("EL INDICE DE FILA INGRESADO NO EXISTE");
	}
	
	public double promSegunGrado(int grado) {
		double acomulador=0;
		
		//I = FILAS
		for(int i=0;i<5;i++) 
			acomulador += this.sueldos[grado][i];
		
		return (acomulador/5);
	}
	
	public double diferenciaMayorMenor(int grado) {
		return (this.sueldos[grado][4]-this.sueldos[grado][0]);
	}
	
	public void aumentaMonto(int fila, int columna, double aumento) {
		this.sueldos[fila][columna] += aumento;
	}
}
