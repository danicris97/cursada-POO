package Ejercicio2;

public class clsPrecipitaciones {
	private double[] listaPrecipitaciones;
	private int indiceCarga;
	private int cantidadCargada;
	
	public clsPrecipitaciones() {
		this.listaPrecipitaciones = new double[12];
		this.indiceCarga = 0;
		this.cantidadCargada = 0;
	}
	
	public void cargarPrecipitacionActual(double valor) {
		this.listaPrecipitaciones[this.indiceCarga]=valor;
		this.indiceCarga++;
		if(this.cantidadCargada<12)
			this.cantidadCargada++;
	}
	
	public double calculaPromedioAnual() {
		double acumulador=0;
		
		for(int i=0;i<this.listaPrecipitaciones.length;i++)
			acumulador = acumulador + this.listaPrecipitaciones[i];
		
		
		return (acumulador/12);
	}
	
	public void cargarPrecipitacionMes(double valor, int mes) {
		this.listaPrecipitaciones[mes] = valor;
		if(this.cantidadCargada<12)
			this.cantidadCargada++;
	}
	
	public double calcularPromedioActual() {
		double acumulador=0;
		
		for(int i=0;i<this.listaPrecipitaciones.length;i++) 
			acumulador=acumulador+this.listaPrecipitaciones[i];
	
		
		return (acumulador/this.cantidadCargada);
	}
	
	public double[] listaDesvios() {
		double[] listaDesvios = new double[this.cantidadCargada];
		int indice=0;
		
		for(int i=0;i<this.listaPrecipitaciones.length;i++) {
			if(this.listaPrecipitaciones[i]!=0) {
				listaDesvios[indice]=(this.listaPrecipitaciones[i]-this.calcularPromedioActual());
				indice++;
			}
		}
		
		for (int i=0;i<listaDesvios.length;i++) {
			if(listaDesvios[i]==0)
				listaDesvios[i]=(-this.calcularPromedioActual());
		}
		
		return listaDesvios;
	}

}
