package EjercicioCorralon;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<PiezaCeramica> piezas;
	private FormaDePago formaDePago;
	
	public Pedido() {
		piezas =  new ArrayList<PiezaCeramica>();
		formaDePago = null;
	}
	
	public void agregarPiezaCeramica(PiezaCeramica pieza) {
		this.piezas.add(pieza);
	}
	
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	public double calcularTotal() {
		double acomulador = 0;
		
		for(int i=0;i<this.piezas.size();i++) {
			acomulador += this.piezas.get(i).getPrecioFinal();
		}
		
		return acomulador;
	}
	
	public void pagar() {
		System.out.println("SUBTOTAL A PAGAR: $" + this.calcularTotal());
		System.out.println("TOTAL PAGADO: $"+ this.formaDePago.pagar(calcularTotal()));
	}
}
