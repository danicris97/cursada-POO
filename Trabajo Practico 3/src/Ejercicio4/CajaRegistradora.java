package Ejercicio4;

import java.util.ArrayList;

public class CajaRegistradora {
	private ArrayList<Double> movimientos;
	private int id;
	
	public CajaRegistradora(int id) {
		this.movimientos = new ArrayList<Double>();
		this.id = id;
	}
	
	public int getIDCaja() {
		return this.id;
	}
	
	public void venta(double importe) {
		this.movimientos.add(importe);
	}
	
	public double totalCaja() {
		double acomulador=0;
		
		for(int i=0;i<this.movimientos.size();i++) 
			acomulador += this.movimientos.get(i);
		
		return acomulador;
	}
}
