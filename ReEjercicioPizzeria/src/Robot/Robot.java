package Robot;

import Cajas.*;
import Pizzas.*;

public class Robot {
	public CintaMagnetica cajas;
	
	public Robot() {
		this.cajas = new CintaMagnetica();
	}
	
	public void colocarPizza(PizzaComun pizza) {
		if(pizza.temperaturaRazonable()) {
			this.cajas.agregarCajaPizza(new CajaGrisPrensado(pizza));
			System.out.println("LA PIZZA COMUN SE COLOCO EN UNA CAJA GRIS PRENSADA");
		}else {
			this.cajas.agregarCajaPizza(new CajaGrisCorrugado(pizza));
			System.out.println("LA PIZZA COMUN SE COLOCO EN UNA CAJA CORRUGADA");
		}
	}
	
	public void colocarPizza(PizzaEspecial pizza) {
		if(pizza.temperaturaRazonable()) {
			this.cajas.agregarCajaPizza(new CajaBlancaSolido(pizza));
			System.out.println("LA PIZZA ESPECIAL SE COLOCO EN UNA CAJA BLANCA SOLIDA");
		}else {
			this.cajas.agregarCajaPizza(new CajaBlancaReforzado(pizza));
			System.out.println("LA PIZZA ESPECIAL SE COLOCO EN UNA CAJA BLANCA REFORZADA");
		}
	}
}
