package Ejercicio2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clsPrecipitaciones p = new clsPrecipitaciones();
		
		p.cargarPrecipitacionActual(123.25);//ENERO
		p.cargarPrecipitacionActual(150.55);//FEBRERO
		
		System.out.println("PROMEDIO ANUAL: " + p.calculaPromedioAnual());
		System.out.println("CALCULAR PROMEDIO ACTUAL: " + p.calcularPromedioActual());
		
		p.cargarPrecipitacionMes(150.3, 11);
		System.out.println("PROMEDIO ANUAL: " + p.calculaPromedioAnual());
		System.out.println("CALCULAR PROMEDIO ACTUAL: " + p.calcularPromedioActual());
		
		double[] lista = new double[3];
		lista = p.listaDesvios();
		
		for(int i=0;i<lista.length;i++) {
			System.out.println("DESVIO: " + lista[i]);
		}
	}

}
