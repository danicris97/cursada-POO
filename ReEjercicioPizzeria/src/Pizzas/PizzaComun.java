package Pizzas;
//A 95

public class PizzaComun extends Pizza{
	
	public PizzaComun() {
		super();
	}
	
	public boolean temperaturaRazonable() {
		if(this.getTemperatura()>=95)
			return true;
		else
			return false;
	}
}
