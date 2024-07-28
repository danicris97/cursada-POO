package Cajas;

import Pizzas.Pizza;

public class Caja {
	protected Pizza pizza;
	
	public Caja(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public boolean ideal() {
		if(this.pizza.temperaturaRazonable())
			return true;
		else
			return false;
	}
}
