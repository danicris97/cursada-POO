package ejercicio1;

public class Precipitaciones {
	private double[] listaPrecipitaciones;
	private int indiceCarga;
	
	public Precipitaciones() {
		this.listaPrecipitaciones = new double[12];
		this.indiceCarga = 0;
	}
	
	public void cargarPrecipitacionActual(double valor) {
		this.listaPrecipitaciones[this.indiceCarga]=valor;
		this.indiceCarga++;
	}
	
	public double calculaPromedioAnual() {
		double acumulador=0;
		
		for(int i=0;i<this.listaPrecipitaciones.length;i++)
			acumulador = acumulador + this.listaPrecipitaciones[i];
		
		
		return (acumulador/12);
	}
}
