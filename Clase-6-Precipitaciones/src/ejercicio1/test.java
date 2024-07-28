package ejercicio1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Precipitaciones p = new Precipitaciones();
		
		p.cargarPrecipitacionActual(123.25);//ENERO
		p.cargarPrecipitacionActual(150.55);//FEBRERO
		
		System.out.println("PROMEDIO ANUAL: " + p.calculaPromedioAnual());
	}

}
