package Ejercicio5;

import java.util.Calendar;

public class Caja {
	private double saldo;
	private Fecha resetExtracciones;
	private int maxExtracciones;
	
	public Caja() {
		this.saldo = 0;
		this.resetExtracciones = new Fecha();
		this.maxExtracciones = 5;
	}
	
	public void deposito(double deposito) {
		if(deposito>0)
			this.saldo += deposito;
	}
	
	public void extraccion(double monto) {
		if(this.maxExtracciones>0)
			if(monto>=this.saldo)
				this.saldo -= monto;
			else
				System.out.println("NO TIENE SALDO SUFICIENTE");
		else {
			if(resetExtracciones.getMes()<Calendar.MONTH+1) {
				this.resetMaxExrtracciones();
				this.extraccion(monto);
			}else {
				System.out.println("HA SUPERADO LA CANTIDAD MAXIMA DE EXTRACCIONES DEL MES");
			}
		}
	}
	
	public void consultaSaldo() {
		System.out.println("SALDO: %.2f" + this.saldo);
	}
	
	public double consultaSaldoDouble() {
		return this.saldo;
	}
	
	private void resetMaxExrtracciones() {
		this.maxExtracciones=5;
	}
}
