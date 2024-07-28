package EjercicioCorralon;

//VELAZQUEZ CRISTIAN DANIEL

public class Test {
	
	public static void main(String[] args) {
		Azulejo azulejo = new Azulejo(0,200,100);//10cm 10x10 = 100
		Baldosa baldosa =  new Baldosa(42,300,200);
		
		//ARMA PEDIDO
		Pedido p = new Pedido();
		p.agregarPiezaCeramica(azulejo);
		p.agregarPiezaCeramica(baldosa);
		p.setFormaDePago(new TarjetaDeCredito());
		
		p.pagar();
	}

}
