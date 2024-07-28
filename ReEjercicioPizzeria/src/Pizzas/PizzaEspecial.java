package Pizzas;
//A 90

public class PizzaEspecial extends Pizza{
	
	public PizzaEspecial() {
		super();
	}
	
	public boolean temperaturaRazonable() {
		if(this.getTemperatura()>=90)
			return true;
		else
			return false;
	}
}
