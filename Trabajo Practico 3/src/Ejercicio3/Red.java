package Ejercicio3;

import java.util.ArrayList;

public class Red {
	protected Direccion direccion;
	private ArrayList<Host> listaHost;
	private Router router;
	
	public Red(Direccion direccion) {
		this.direccion = direccion;
		this.listaHost = new ArrayList<Host>();
		this.router = null;
	}
	
	public void conectar(Host host) {
		this.listaHost.add(host);
	}
	
	public void conectar(Router router) {
		this.router = router;
	}
	
}
