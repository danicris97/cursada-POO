import Cajas.*;
import Pizzas.*;
import Robot.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.colocarPizza(new PizzaComun());
		r.colocarPizza(new PizzaEspecial());
	}

}
