package Ejercicio3;

import java.util.ArrayList;

public class Router {
	protected Direccion direccion;
	protected int puertos;
	private ArrayList<Red> redes;
	
	public Router(Direccion direccion, int puertos) {
		this.direccion = direccion;
		this.puertos = puertos;
		this.redes = new ArrayList<Red>();
	}
	
	public void conectar(Red red) {
		if(this.redes.size()<=puertos)
			this.redes.add(red);
		else 
			System.out.println("NO HAY PUERTOS DISPONIBLES");
	}
}
