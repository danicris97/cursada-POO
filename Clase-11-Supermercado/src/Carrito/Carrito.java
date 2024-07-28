package Carrito;

import Clientes.Cliente;
import Productos.Producto;

public class Carrito {
	private Cliente cliente;
	private Producto[] lista;
	private Inventario inventario;
	private ServicioDePago servPago;
	private Distribucion distribucion;
	private int indice;
	
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.lista = new Producto[100];
		this.indice = 0;
	}
	
	public void agregarProducto(Producto p) {
		this.lista[this.indice]=p;
		this.indice++;
	}
	
	private int buscar(Producto p) {
		int i=0;
		while((i<this.indice)&&(this.lista[i]!=p)) 
			i++;
		if(i<this.indice)
			return i;
		else
			return -1;
	}
	
	public void eliminarProducto(Producto p) {
		int pos = this.buscar(p);
		if(pos!=-1) {
			for(int i=pos;i<this.indice-1;i++)
				this.lista[i]=this.lista[i+1];
			this.indice--;
		}else {
			System.out.println("ERROR: 404");
		}
	}
	
	public boolean validar() {
		this.distribucion.validar(cliente);
		this.inventario.vaidar(lista);
		this.servPago.validar(cliente, 2000);
		return true;
	}
	
	public void pagar() {
		
	}
}
