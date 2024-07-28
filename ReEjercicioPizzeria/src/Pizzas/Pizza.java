package Pizzas;

import java.util.Random;

public class Pizza {
	protected int temperatura;
	
	public Pizza() {
		temperatura = new Random().nextInt(110)+85;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public boolean temperaturaRazonable() {
		return true;
	}
}
